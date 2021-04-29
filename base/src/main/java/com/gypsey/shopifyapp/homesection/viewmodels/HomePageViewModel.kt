  package com.gypsey.shopifyapp.homesection.viewmodels

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.util.Base64
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.Storefront
import com.shopify.graphql.support.Error
import com.shopify.graphql.support.ID
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.basesection.models.CommanModel
import com.gypsey.shopifyapp.databinding.*
import com.gypsey.shopifyapp.dependecyinjection.Body
import com.gypsey.shopifyapp.dependecyinjection.InnerData
import com.gypsey.shopifyapp.homesection.activities.HomePage
import com.gypsey.shopifyapp.homesection.adapters.*
import com.gypsey.shopifyapp.homesection.models.CategoryCircle
import com.gypsey.shopifyapp.homesection.models.ProductSlider
import com.gypsey.shopifyapp.homesection.models.StandAloneBanner
import com.gypsey.shopifyapp.network_transaction.CustomResponse
import com.gypsey.shopifyapp.network_transaction.doGraphQLQueryGraph
import com.gypsey.shopifyapp.network_transaction.doRetrofitCall
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.searchsection.activities.AutoSearch
import com.gypsey.shopifyapp.shopifyqueries.Query
import com.gypsey.shopifyapp.utils.*
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import me.jessyan.retrofiturlmanager.RetrofitUrlManager
import org.json.JSONArray
import org.json.JSONObject
import java.net.URL
import java.nio.charset.Charset
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import kotlin.collections.ArrayList

class HomePageViewModel(var repository: Repository) : ViewModel() {
    var presentmentCurrency: String? = null
    val message = MutableLiveData<String>()
    private val disposables = CompositeDisposable()
    val homepagedata = MutableLiveData<HashMap<String, View>>()
    private val TAG = "HomePageViewModel"

    @Inject
    lateinit var homeadapter: ProductSliderListAdapter

    @Inject
    lateinit var gridtwo: ProductSliderListAdapter

    @Inject
    lateinit var productListAdapter: ProductListSliderAdapter

    @Inject
    lateinit var adapter: CollectionGridAdapter

    @Inject
    lateinit var slideradapter: CollectionSliderAdapter

    @Inject
    lateinit var gridAdapter: ProductSliderGridAdapter
    lateinit var context: HomePage
    fun getHomePageData(): MutableLiveData<HashMap<String, View>> {
        return homepagedata
    }

    fun getToastMessage(): MutableLiveData<String> {
        return message;
    }

    private fun setPresentmentCurrencyForModel() {
        try {
            val runnable = Runnable {
                if (repository.localData[0].currencycode == null) {
                    presentmentCurrency = "nopresentmentcurrency"

                } else {
                    presentmentCurrency = repository.localData[0].currencycode
                }
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    //******************************************* Ulimate Special Offers ***************************************************************************************//
     fun getCustomerTags(){
        if (repository.isLogin){
            var customer_id=""
            customer_id = AESEnDecryption().getBase64Decode(repository.allUserData[0].customer_id.toString()).toString()
            Log.d("Customer_id",""+customer_id);
            doRetrofitCall(repository.getCustomerTags(Urls((MyApplication.context))!!.mid,customer_id,"tags"),disposables,customResponse = object : CustomResponse {
                override fun onSuccessRetrofit(result: JsonElement) {
                    Log.d("Customer_id",""+result);
                    try{
                        var obj = JSONObject(result.toString())
                        if (obj.getBoolean("success")){
                            Urls.TAGS = obj.getJSONObject("data").getString("tags")
                        }
                    }catch (e : Exception){
                        e.printStackTrace()
                    }

                    Log.d("tags",""+Urls.TAGS);

                }

                override fun onErrorRetrofit(error: Throwable) {
                    Log.d("Customer_id",""+error);
                }
            }, context = context)
        }
    }

    //******************************************* Ulimate Special Offers ***************************************************************************************//

    //***************************************************************NEW hompage changes*************************************************//
    internal fun connectFirebaseForHomePageData(context: HomePage, homepage: LinearLayoutCompat) {
        try {
            setPresentmentCurrencyForModel()
            this.context = context
            (context.application as MyApplication).mageNativeAppComponent!!.doHomePageModelInjection(this)
            MyApplication.dataBaseReference.child("homepage_component").addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val downloadlink = dataSnapshot.getValue(String::class.java)!!
                    Log.i("MageNative", "DownloadLink " + downloadlink)
                    if (homepage.childCount > 0) {
                        homepage.removeAllViews()
                        homepage.invalidate()
                    }
                    dowloadJson(downloadlink)
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Log.i("DBConnectionError", "" + databaseError.details)
                    Log.i("DBConnectionError", "" + databaseError.message)
                    Log.i("DBConnectionError", "" + databaseError.code)
                } 
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun dowloadJson(downloadlink: String) {
        GlobalScope.launch(Dispatchers.Main) {
            var result = async(Dispatchers.IO) {
                URL(downloadlink).readText()
            }
            parseResponse(result.await())
        }
    }

    private fun parseResponse(apiResponse: String) {
        try {
            var obj = JSONObject(apiResponse)
            var names: JSONArray = obj.getJSONObject("sort_order").names()!!
            for (data in 0..names.length() - 1) {
                var part = names[data].toString().split("_")
                var key: String = names[data].toString().replace(part.get(part.size - 1), "")
                Log.d(TAG, "parseResponse: " + key)
                when (key) {
                    "top-bar_", "top-bar-without-slider_" -> {
                        topbar(obj.getJSONObject(names[data].toString()))
                    }
                    "category-circle_" -> {
                        createCategoryCircle(obj.getJSONObject(names[data].toString()))
                    }
                    "banner-slider_" -> {
                        createBannerSlider(obj.getJSONObject(names[data].toString()))
                    }
                    "product-list-slider_" -> {
                        createProductSlider(obj.getJSONObject(names[data].toString()))
                    }
                    "category-square_" -> {
                        createCategorySquare(obj.getJSONObject(names[data].toString()))
                    }
                    "collection-grid-layout_" -> {
                        createCollectionGrid(obj.getJSONObject(names[data].toString()))
                    }
                    "standalone-banner_" -> {
                        createStandAloneBanner(obj.getJSONObject(names[data].toString()))
                    }
                    "three-product-hv-layout_" -> {
                        createHvLayout(obj.getJSONObject(names[data].toString()))
                    }
                    "fixed-customisable-layout_" -> {
                        createFixedCustomisableLayout(obj.getJSONObject(names[data].toString()))
                    }
                    "collection-list-slider_" -> {
                        createCollectionListSlider(obj.getJSONObject(names[data].toString()))
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun topbar(jsonObject: JSONObject) {
        try {
            var binding: MTopbarBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_topbar, null, false)
            context.setSearchOption(jsonObject.getString("search_position"), jsonObject.getString("search_placeholder"))
            context.setWishList(jsonObject.getString("wishlist"))
            if (jsonObject.has("logo_image_url")) {
                context.setLogoImage(jsonObject.getString("logo_image_url"))
            }
            binding.root.setBackgroundColor(Color.parseColor(JSONObject(jsonObject.getString("panel_background_color")).getString("color")))
            context.setPanelBackgroundColor(JSONObject(jsonObject.getString("panel_background_color")).getString("color"))
            context.setIconColors(
                    JSONObject(jsonObject.getString("count_color")).getString("color"),
                    JSONObject(jsonObject.getString("count_textcolor")).getString("color"),
                    JSONObject(jsonObject.getString("icon_color")).getString("color")
            )
            when (jsonObject.getString("search_position")) {
                "middle-width-search" -> {
                    context.setSearchOptions(
                            JSONObject(jsonObject.getString("search_background_color")).getString("color"),
                            JSONObject(jsonObject.getString("search_text_color")).getString("color"),
                            JSONObject(jsonObject.getString("search_border_color")).getString("color")
                    )
                }
                "full-width-search" -> {
                    binding.fullsearch.visibility = View.VISIBLE
                    binding.fullsearch.text = jsonObject.getString("search_placeholder")
                    binding.fullsearch.setOnClickListener {
                        val searchpage = Intent(context, AutoSearch::class.java)
                        context.startActivity(searchpage)
                    }
                    var draw: GradientDrawable = binding.fullsearch.background as GradientDrawable
                    draw.setColor(Color.parseColor(JSONObject(jsonObject.getString("search_background_color")).getString("color")))
                    binding.fullsearch.setTextColor(Color.parseColor(JSONObject(jsonObject.getString("search_text_color")).getString("color")))
                    binding.fullsearch.setHintTextColor(Color.parseColor(JSONObject(jsonObject.getString("search_text_color")).getString("color")))
                    draw.setStroke(5, Color.parseColor(JSONObject(jsonObject.getString("search_border_color")).getString("color")));
                }
            }
            if (jsonObject.has("item_banner") && jsonObject.getString("item_banner").equals("1")) {
                var common = CommanModel()
                var adp = HomePageBanner(context.supportFragmentManager, context, jsonObject.getJSONArray("items"))
                binding!!.bannerss.adapter = adp
                adp.notifyDataSetChanged()

                binding.bannersection.backgroundTintList = ColorStateList.valueOf(Color.parseColor(JSONObject(jsonObject.getString("panel_background_color")).getString("color")))
                binding!!.bannerss.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                    override fun onPageScrollStateChanged(state: Int) {

                    }

                    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                    }

                    override fun onPageSelected(position: Int) {
                        common.imageurl = jsonObject.getJSONArray("items").getJSONObject(position).getString("image_url")
                    }

                })
                binding.bannersection.backgroundTintList = ColorStateList.valueOf(Color.parseColor(JSONObject(jsonObject.getString("panel_background_color")).getString("color")))
                if (jsonObject.getString("shape").equals("square")) {
                    binding.card.radius = 0f
                    binding.card.cardElevation = 0f
                }
                if (jsonObject.getString("item_dots").equals("1")) {
                    var background = JSONObject(jsonObject.getString("active_dot_color"))
                    var strokebackground = JSONObject(jsonObject.getString("inactive_dot_color"))
                    binding!!.indicators.setDotIndicatorColor(Color.parseColor(background.getString("color")))
                    binding!!.indicators.setStrokeDotsIndicatorColor(Color.parseColor(strokebackground.getString("color")))
                    binding!!.indicators.setViewPager(binding!!.bannerss)
                }
                common.imageurl = jsonObject.getJSONArray("items").getJSONObject(0).getString("image_url")
                binding.commondata = common
                binding.bannersection.visibility = View.VISIBLE
                binding.backImage.visibility = View.VISIBLE
                binding.overlay.visibility = View.VISIBLE
            }
            homepagedata.setValue(hashMapOf("top-bar_" to binding.root))
        }
        catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun createFixedCustomisableLayout(jsonObject: JSONObject) {
        try {
            var binding: MFixedcustomisableBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_fixedcustomisable, null, false)
            var productSlider = ProductSlider()
            Log.d("product_value",""+jsonObject.getJSONArray("items").getJSONObject(0).getJSONArray("product_value"))
            updateDataInRecylerView(binding.productdata, jsonObject.getJSONArray("items").getJSONObject(0).getJSONArray("product_value"), " ", jsonObject)
            // updateDataInRecylerView(binding.productdata, jsonObject.getJSONArray("items").getJSONObject(0).getJSONArray("product_value"), "152927698980", jsonObject)
            var header_background_color = JSONObject(jsonObject.getString("header_background_color"))
            var panel_background_color = JSONObject(jsonObject.getString("panel_background_color"))
            binding.panelbackgroundcolor.setBackgroundColor(Color.parseColor(panel_background_color.getString("color")))
            binding.headerback.setBackgroundColor(Color.parseColor(header_background_color.getString("color")))
            if (jsonObject.getString("header").equals("1")) {
                productSlider.headertextvisibility = View.VISIBLE
                productSlider.headertext = jsonObject.getString("header_title_text")
                var header_title_color = JSONObject(jsonObject.getString("header_title_color"))
                binding.headertext.setTextColor(Color.parseColor(header_title_color.getString("color")))
                binding.headertext.textSize = 20f
                val face: Typeface
                when (jsonObject.getString("header_title_font_weight")) {
                    "bold" -> {
                        face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                    }
                    else -> {
                        face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                    }
                }
                binding.headertext.setTypeface(face)
                if (jsonObject.getString("item_header_font_style").equals("italic")) {
                    binding.headertext.setTypeface(binding.headertext.getTypeface(), Typeface.ITALIC);
                }
                if (jsonObject.getString("header_subtitle").equals("1")) {
                    productSlider.subheadertextvisibity = View.VISIBLE
                    productSlider.subheadertext = jsonObject.getString("header_subtitle_text")
                    var header_subtitle_color = JSONObject(jsonObject.getString("header_subtitle_color"))
                    binding.subheadertext.setTextColor(Color.parseColor(header_subtitle_color.getString("color")))
                    val face: Typeface
                    when (jsonObject.getString("header_subtitle_font_weight")) {
                        "bold" -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                        }
                        else -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                        }
                    }
                    binding.subheadertext.setTypeface(face)
                    if (jsonObject.getString("header_subtitle_title_font_style").equals("italic")) {
                        binding.subheadertext.setTypeface(binding.subheadertext.getTypeface(), Typeface.ITALIC);
                    }
                } else {
                    productSlider.subheadertextvisibity = View.GONE
                }
                if (jsonObject.getString("header_deal").equals("1")) {
                    productSlider.timericon = View.VISIBLE
                    var header_deal_color = JSONObject(jsonObject.getString("header_deal_color"))
                    binding.timer.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    binding.timerMessage.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    binding.timericon.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    productSlider.timertextmessage = jsonObject.getString("item_deal_message")
                    var DATE_FORMAT = "MM/dd/yyyy HH:mm:ss";
                    var sdf = SimpleDateFormat(DATE_FORMAT);
                    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
                    var item_deal_start_date = sdf.format(Date())
                    Log.i("MageNative", "item_deal_start_date " + item_deal_start_date)
                    var item_deal_end_date = jsonObject.getString("item_deal_end_date")
                    Log.i("MageNative", "item_deal_end_date " + item_deal_end_date)
                    var startdate: Date?
                    var enddate: Date?
                    try {
                        startdate = sdf.parse(item_deal_start_date)
                        enddate = sdf.parse(item_deal_end_date)
                        var oldLong = startdate.getTime()
                        var NewLong = enddate.getTime()
                        var diff = NewLong - oldLong
                        Log.i("MageNative", "Long" + diff)
                        if (diff > 0) {
                            // var counter = MyCount(diff, 1000, productSlider, jsonObject.getString("item_deal_format"))
                            var counter = MyCount(diff, 1000, productSlider, ":");
                            counter.start()
                        } else {
                            productSlider.timericon = View.GONE
                        }
                    } catch (ex: ParseException) {
                        ex.printStackTrace();
                    }
                } else {
                    productSlider.timericon = View.GONE
                }
                if (jsonObject.getString("header_action").equals("1")) {
                    productSlider.actiontextvisibity = View.VISIBLE
                    productSlider.action_id = getcategoryID(jsonObject.getJSONArray("items").getJSONObject(0).getString("link_value"))
                    productSlider.actiontext = jsonObject.getString("header_action_text")
                    var header_action_color = JSONObject(jsonObject.getString("header_action_color"))
                    var header_action_background_color = JSONObject(jsonObject.getString("header_action_background_color"))
                    binding.actiontext.setBackgroundColor(Color.parseColor(header_action_background_color.getString("color")))
                    binding.actiontext.setTextColor(Color.parseColor(header_action_color.getString("color")))
                    val face: Typeface
                    when (jsonObject.getString("header_action_font_weight")) {
                        "bold" -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                        }
                        else -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                        }
                    }
                    binding.actiontext.setTypeface(face)
                    if (jsonObject.getString("header_action_title_font_style").equals("italic")) {
                        binding.actiontext.setTypeface(binding.actiontext.getTypeface(), Typeface.ITALIC);
                    }

                } else {
                    productSlider.actiontextvisibity = View.GONE
                }
            } else {
                productSlider.headertextvisibility = View.GONE
            }
            binding.productslider = productSlider
            homepagedata.setValue(hashMapOf("fixed-customisable-layout_" to binding.root))
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun createCollectionListSlider(jsonObject: JSONObject) {
        try {
            var binding: MCollectionsliderBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_collectionslider, null, false)
            var productSlider = ProductSlider()
            var header_background_color = JSONObject(jsonObject.getString("header_background_color"))
            var panel_background_color = JSONObject(jsonObject.getString("panel_background_color"))
            var header_title_color = JSONObject(jsonObject.getString("header_title_color"))
            var header_subtitle_color = JSONObject(jsonObject.getString("header_subtitle_color"))
            binding.panelbackgroundcolor.setBackgroundColor(Color.parseColor(panel_background_color.getString("color")))
            binding.headerback.setBackgroundColor(Color.parseColor(header_background_color.getString("color")))
            if (jsonObject.getString("header").equals("1")) {
                productSlider.headertextvisibility = View.VISIBLE
                productSlider.headertext = jsonObject.getString("header_title_text")
                binding.headertext.setTextColor(Color.parseColor(header_title_color.getString("color")))
                binding.headertext.textSize = 20f
                val face: Typeface
                when (jsonObject.getString("header_title_font_weight")) {
                    "bold" -> {
                        face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                    }
                    else -> {
                        face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                    }
                }
                binding.headertext.setTypeface(face)
                if (jsonObject.getString("header_title_font_style").equals("italic")) {
                    binding.headertext.setTypeface(binding.headertext.getTypeface(), Typeface.ITALIC);
                }
                if (jsonObject.getString("header_subtitle").equals("1")) {
                    productSlider.subheadertextvisibity = View.VISIBLE
                    productSlider.subheadertext = jsonObject.getString("header_subtitle_text")
                    binding.subheadertext.setTextColor(Color.parseColor(header_subtitle_color.getString("color")))
                    val face: Typeface
                    when (jsonObject.getString("header_subtitle_font_weight")) {
                        "bold" -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                        }
                        else -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                        }
                    }
                    binding.subheadertext.setTypeface(face)
                    if (jsonObject.getString("header_subtitle_font_style").equals("italic")) {
                        binding.subheadertext.setTypeface(binding.subheadertext.getTypeface(), Typeface.ITALIC);
                    }
                } else {
                    productSlider.subheadertextvisibity = View.GONE
                }
            } else {
                productSlider.headertextvisibility = View.GONE
            }
            context.setLayout(binding!!.productdata, "horizontal")
            slideradapter = CollectionSliderAdapter()
            slideradapter!!.setData(jsonObject!!.getJSONArray("items"), context, jsonObject!!)
            binding!!.productdata.adapter = slideradapter
            slideradapter!!.notifyDataSetChanged()
            binding.productslider = productSlider
            homepagedata.setValue(hashMapOf("collection-list-slider_" to binding.root))
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun createHvLayout(jsonObject: JSONObject) {
        try {
            var binding: MProductHvLayoutBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_product_hv_layout, null, false)
            var productSlider = ProductSlider()
            var header_background_color = JSONObject(jsonObject.getString("header_background_color"))
            var panel_background_color = JSONObject(jsonObject.getString("panel_background_color"))
            var header_title_color = JSONObject(jsonObject.getString("header_title_color"))
            var header_action_color = JSONObject(jsonObject.getString("header_action_color"))
            var header_action_background_color = JSONObject(jsonObject.getString("header_action_background_color"))
            var header_subtitle_color = JSONObject(jsonObject.getString("header_subtitle_color"))
            var header_deal_color = JSONObject(jsonObject.getString("header_deal_color"))
            binding.panelbackgroundcolor.setBackgroundColor(Color.parseColor(panel_background_color.getString("color")))
            binding.headerback.setBackgroundColor(Color.parseColor(header_background_color.getString("color")))
            if (jsonObject.getString("header").equals("1")) {
                productSlider.headertextvisibility = View.VISIBLE
                binding.headertext.textSize = 20f
                productSlider.headertext = jsonObject.getString("header_title_text")
                binding.headertext.setTextColor(Color.parseColor(header_title_color.getString("color")))
                val face: Typeface
                when (jsonObject.getString("header_title_font_weight")) {
                    "bold" -> {
                        face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                    }
                    else -> {
                        face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                    }
                }
                binding.headertext.setTypeface(face)
                if (jsonObject.getString("header_title_font_style").equals("italic")) {
                    binding.headertext.setTypeface(binding.headertext.getTypeface(), Typeface.ITALIC);
                }
                if (jsonObject.getString("header_subtitle").equals("1")) {
                    productSlider.subheadertextvisibity = View.VISIBLE
                    productSlider.subheadertext = jsonObject.getString("header_subtitle_text")
                    binding.subheadertext.setTextColor(Color.parseColor(header_subtitle_color.getString("color")))
                    val face: Typeface
                    when (jsonObject.getString("header_subtitle_font_weight")) {
                        "bold" -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                        }
                        else -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                        }
                    }
                    binding.subheadertext.setTypeface(face)
                    if (jsonObject.getString("header_subtitle_font_style").equals("italic")) {
                        binding.subheadertext.setTypeface(binding.subheadertext.getTypeface(), Typeface.ITALIC);
                    }
                } else {
                    productSlider.subheadertextvisibity = View.GONE
                }
                if (jsonObject.getString("header_deal").equals("1")) {
                    productSlider.timericon = View.VISIBLE
                    binding.timer.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    binding.timerMessage.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    binding.timericon.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    productSlider.timertextmessage = jsonObject.getString("item_deal_message")
                    var DATE_FORMAT = "MM/dd/yyyy HH:mm:ss"
                    var sdf = SimpleDateFormat(DATE_FORMAT)
                    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
                    var item_deal_start_date = sdf.format(Date())
                    Log.i("MageNative", "item_deal_start_date " + item_deal_start_date)
                    var item_deal_end_date = jsonObject.getString("item_deal_end_date")
                    Log.i("MageNative", "item_deal_end_date " + item_deal_end_date)
                    var startdate: Date?
                    var enddate: Date?
                    try {
                        startdate = sdf.parse(item_deal_start_date)
                        enddate = sdf.parse(item_deal_end_date)
                        var oldLong = startdate.getTime()
                        var NewLong = enddate.getTime()
                        var diff = NewLong - oldLong
                        Log.i("MageNative", "Long" + diff)
                        if (diff > 0) {
                            //var counter = MyCount(diff, 1000, productSlider, jsonObject.getString("item_deal_format"))
                            var counter = MyCount(diff, 1000, productSlider, ":");
                            counter.start()
                        } else {
                            productSlider.timericon = View.GONE
                        }
                    } catch (ex: ParseException) {
                        ex.printStackTrace();
                    }
                } else {
                    productSlider.timericon = View.GONE
                }
                if (jsonObject.getString("header_action").equals("1")) {
                    productSlider.actiontextvisibity = View.VISIBLE
                    //productSlider.action_id = getcategoryID(jsonObject.getString("item_link_action_value"))
                    productSlider.actiontext = jsonObject.getString("header_action_text")
                    binding.actiontext.setBackgroundColor(Color.parseColor(header_action_background_color.getString("color")))
                    binding.actiontext.setTextColor(Color.parseColor(header_action_color.getString("color")))
                    val face: Typeface
                    when (jsonObject.getString("header_action_font_weight")) {
                        "bold" -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                        }
                        else -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                        }
                    }
                    binding.actiontext.setTypeface(face)
                    if (jsonObject.getString("header_action_font_style").equals("italic")) {
                        binding.actiontext.setTypeface(binding.actiontext.getTypeface(), Typeface.ITALIC);
                    }

                } else {
                    productSlider.actiontextvisibity = View.GONE
                }
            } else {
                productSlider.headertextvisibility = View.GONE
            }

            /**************first hv***************************/
            productSlider.hvimageone = jsonObject.getJSONArray("items").getJSONObject(0).getString("image_url")
            // productSlider.hvimageone="https://images.unsplash.com/photo-1580748141549-71748dbe0bdc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80"
            productSlider.hvnameone = jsonObject.getJSONArray("items").getJSONObject(0).getString("title")
            productSlider.hvtypeone = jsonObject.getJSONArray("items").getJSONObject(0).getString("link_type")
            productSlider.hvvalueone = jsonObject.getJSONArray("items").getJSONObject(0).getString("link_value")
            /**************second hv***************************/
            productSlider.hvimagetwo = jsonObject.getJSONArray("items").getJSONObject(1).getString("image_url")
            //productSlider.hvimagetwo="https://images.unsplash.com/photo-1570589107939-54ebe3183842?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=719&q=80"
            productSlider.hvnametwo = jsonObject.getJSONArray("items").getJSONObject(1).getString("title")
            productSlider.hvtypetwo = jsonObject.getJSONArray("items").getJSONObject(1).getString("link_type")
            productSlider.hvvaluetwo = jsonObject.getJSONArray("items").getJSONObject(1).getString("link_value")
            /**************third hv***************************/
            productSlider.hvimagethree = jsonObject.getJSONArray("items").getJSONObject(2).getString("image_url")
            //productSlider.hvimagethree="https://images.unsplash.com/photo-1570589107939-54ebe3183842?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=719&q=80"
            productSlider.hvnamethree = jsonObject.getJSONArray("items").getJSONObject(2).getString("title")
            productSlider.hvtypethree = jsonObject.getJSONArray("items").getJSONObject(2).getString("link_type")
            productSlider.hvvaluethree = jsonObject.getJSONArray("items").getJSONObject(2).getString("link_value")
            when (jsonObject.getString("item_text_alignment")) {
                "left" -> {
                    productSlider.textaligment = Gravity.START
                }
                "right" -> {
                    productSlider.textaligment = Gravity.END
                }
            }
            if (jsonObject.getString("item_shape").equals("rounded")) {
                binding.firsthvsection.cardElevation = 8f
                binding.firsthvsection.radius = 10f
                binding.secondhvcard.cardElevation = 8f
                binding.secondhvcard.radius = 10f
                binding.thirdhvcard.cardElevation = 8f
                binding.thirdhvcard.radius = 10f
            }
            if (jsonObject.getString("item_border").equals("1")) {
                var background = JSONObject(jsonObject.getString("item_border_color"))
                binding.firsthvsection.setCardBackgroundColor(Color.parseColor(background.getString("color")))
                binding.secondhvcard.setCardBackgroundColor(Color.parseColor(background.getString("color")))
                binding.thirdhvcard.setCardBackgroundColor(Color.parseColor(background.getString("color")))
                binding.hvimagOne.setPadding(8, 8, 8, 8)
                binding.hvimagtwo.setPadding(8, 8, 8, 8)
                binding.hvimagthree.setPadding(8, 8, 8, 8)
            }
            val face: Typeface
            when (jsonObject.getString("item_title_font_weight")) {
                "bold" -> {
                    face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                }
                else -> {
                    face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                }
            }
            binding.hvnameone.setTypeface(face)
            binding.hvnametwo.setTypeface(face)
            binding.hvnamethree.setTypeface(face)
            if (jsonObject.getString("item_title_font_style").equals("italic")) {
                binding.hvnameone.setTypeface(binding.hvnameone.getTypeface(), Typeface.ITALIC);
                binding.hvnametwo.setTypeface(binding.hvnametwo.getTypeface(), Typeface.ITALIC);
                binding.hvnamethree.setTypeface(binding.hvnamethree.getTypeface(), Typeface.ITALIC);
            }
            binding.productslider = productSlider
            homepagedata.setValue(hashMapOf("three-product-hv-layout_" to binding.root))
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun createStandAloneBanner(jsonObject: JSONObject) {
        var binding: MStandlonebannerBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_standlonebanner, null, false)
        var stand = StandAloneBanner()
        stand.image = jsonObject.getString("banner_url")
        Handler(Looper.getMainLooper()).post {
            when (jsonObject.getString("item_button_position")) {
                "no-btn" -> {
                    binding.sectionOne.visibility = View.GONE
                    binding.sectionTwo.visibility = View.GONE
                    stand.bannerlink = jsonObject.getString("banner_link_value")
                    stand.bannertype = jsonObject.getString("banner_link_type")
                }
                "bottom" -> {
                    var buttononeparams = (binding.sectionOne.layoutParams as ConstraintLayout.LayoutParams)
                    var buttontwoparams = (binding.sectionTwo.layoutParams as ConstraintLayout.LayoutParams)
                    buttononeparams.topToTop = ConstraintSet.GONE
                    buttontwoparams.topToTop = ConstraintSet.GONE
                }
            }
            if (binding.sectionOne.visibility == View.VISIBLE) {
                binding.image.setOnClickListener(null)
                when (jsonObject.getString("item_text_alignment")) {
                    "left" -> {
                        binding.buttonOne.gravity = Gravity.START
                        binding.buttonTwo.gravity = Gravity.START
                    }
                    "right" -> {
                        binding.buttonOne.gravity = Gravity.END
                        binding.buttonTwo.gravity = Gravity.END
                    }
                }
                if (jsonObject.has("first_button_text")) {
                    stand.text_one = jsonObject.getString("first_button_text")
                    stand.text_two = jsonObject.getString("second_button_text")
                }
                var background = JSONObject(jsonObject.getString("button_background_color"))
                var button_border_color = JSONObject(jsonObject.getString("button_border_color"))
                var button_text_color = JSONObject(jsonObject.getString("button_text_color"))
                binding.buttonOne.setBackgroundColor(Color.parseColor(background.getString("color")))
                binding.buttonTwo.setBackgroundColor(Color.parseColor(background.getString("color")))
                binding.borderOne.setBackgroundColor(Color.parseColor(button_border_color.getString("color")))
                binding.borderTwo.setBackgroundColor(Color.parseColor(button_border_color.getString("color")))
                binding.buttonOne.setTextColor(Color.parseColor(button_text_color.getString("color")))
                binding.buttonTwo.setTextColor(Color.parseColor(button_text_color.getString("color")))
                if (jsonObject.getString("item_font_weight").equals("bold")) {
                    val face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                    binding.buttonOne.setTypeface(face)
                    binding.buttonTwo.setTypeface(face)
                }
                if (jsonObject.getString("item_font_style").equals("italic")) {
                    binding.buttonOne.setTypeface(binding.buttonOne.getTypeface(), Typeface.ITALIC);
                    binding.buttonTwo.setTypeface(binding.buttonTwo.getTypeface(), Typeface.ITALIC);
                }
                if (jsonObject.has("banner_link_value")) {
                    stand.bannerlink = jsonObject.getString("banner_link_value")
                }
                stand.buttononetype = jsonObject.getString("first_button_link_type")
                stand.buttononelink = jsonObject.getString("first_button_link_value")
                stand.buttontwotype = jsonObject.getString("second_button_link_type")
                stand.buttontwolink = jsonObject.getString("second_button_link_value")
            }
        }
        binding.stand = stand
        homepagedata.setValue(hashMapOf("standalone-banner_" to binding.root))
    }

    private fun createCollectionGrid(jsonObject: JSONObject) {
        val binding: MCollectionlgridBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_collectionlgrid, null, false)
        context.setLayout(binding!!.categorylist, "3grid")
        try {
            repository.getJSonArray(JsonParser().parse(jsonObject!!.getString("items")).asJsonArray)
                    .subscribeOn(Schedulers.io())
                    .filter { x -> x.asJsonObject.get("link_type").asString.isNotEmpty() }
                    .toList()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<List<JsonElement>> {
                        override fun onSubscribe(d: Disposable) {

                        }

                        override fun onSuccess(list: List<JsonElement>) {
                            adapter = CollectionGridAdapter()
                            adapter!!.setData(list, context, jsonObject!!)
                            binding!!.categorylist.adapter = adapter
                        }

                        override fun onError(e: Throwable) {
                            e.printStackTrace()
                        }
                    })
        } catch (e: Exception) {
            e.printStackTrace()
        }
        var background = JSONObject(jsonObject.getString("panel_background_color"))
        binding.categorylist.setBackgroundColor(Color.parseColor(background.getString("color")))
        homepagedata.setValue(hashMapOf("collection-grid-layout_" to binding.root))
    }

    private fun createCategorySquare(jsonObject: JSONObject) {
        var binding: MCategorySquareBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_category_square, null, false)
        var category = CategoryCircle()
        binding.category = category
        when (jsonObject.getString("item_shape")) {
            "square" -> {
                binding.cardOne.cardElevation = 0f
                binding.cardOne.radius = 0f
                binding.cardTwo.cardElevation = 0f
                binding.cardTwo.radius = 0f
                binding.cardThree.cardElevation = 0f
                binding.cardThree.radius = 0f
                binding.cardFour.cardElevation = 0f
                binding.cardFour.radius = 0f
                binding.cardFive.cardElevation = 0f
                binding.cardFive.radius = 0f
            }
        }
        var background = JSONObject(jsonObject.getString("panel_background_color"))
        binding.root.setBackgroundColor(Color.parseColor(background.getString("color")))
        if (jsonObject.getString("item_title").equals("1")) {
            category.cat_text_one = jsonObject.getJSONArray("items").getJSONObject(0).getString("title")
            category.cat_text_two = jsonObject.getJSONArray("items").getJSONObject(1).getString("title")
            category.cat_text_three = jsonObject.getJSONArray("items").getJSONObject(2).getString("title")
            category.cat_text_four = jsonObject.getJSONArray("items").getJSONObject(3).getString("title")
            category.cat_text_five = jsonObject.getJSONArray("items").getJSONObject(4).getString("title")
            var item_color = JSONObject(jsonObject.getString("item_title_color"))
            binding.catTextOne.setTextColor(Color.parseColor(item_color.getString("color")))
            binding.catTextTwo.setTextColor(Color.parseColor(item_color.getString("color")))
            binding.catTextThree.setTextColor(Color.parseColor(item_color.getString("color")))
            binding.catTextFour.setTextColor(Color.parseColor(item_color.getString("color")))
            binding.catTextFive.setTextColor(Color.parseColor(item_color.getString("color")))
            if (jsonObject.getString("item_font_weight").equals("bold")) {
                val face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                binding.catTextOne.setTypeface(face)
                binding.catTextTwo.setTypeface(face)
                binding.catTextThree.setTypeface(face)
                binding.catTextFour.setTypeface(face)
                binding.catTextFive.setTypeface(face)
            } else {
                val face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                binding.catTextOne.setTypeface(face)
                binding.catTextTwo.setTypeface(face)
                binding.catTextThree.setTypeface(face)
                binding.catTextFour.setTypeface(face)
                binding.catTextFive.setTypeface(face)
            }
            if (jsonObject.getString("item_font_style").equals("italic")) {
                binding.catTextOne.setTypeface(binding.catTextOne.getTypeface(), Typeface.ITALIC);
                binding.catTextTwo.setTypeface(binding.catTextTwo.getTypeface(), Typeface.ITALIC);
                binding.catTextThree.setTypeface(binding.catTextThree.getTypeface(), Typeface.ITALIC);
                binding.catTextFour.setTypeface(binding.catTextFour.getTypeface(), Typeface.ITALIC);
                binding.catTextFive.setTypeface(binding.catTextFive.getTypeface(), Typeface.ITALIC);
            }
        }
        if (jsonObject.getString("item_border").equals("1")) {
            Handler(Looper.getMainLooper()).post {
                var background = JSONObject(jsonObject.getString("item_border_color"))
                binding.cardOne.setCardBackgroundColor(Color.parseColor(background.getString("color")))
                binding.cardTwo.setCardBackgroundColor(Color.parseColor(background.getString("color")))
                binding.cardThree.setCardBackgroundColor(Color.parseColor(background.getString("color")))
                binding.cardFour.setCardBackgroundColor(Color.parseColor(background.getString("color")))
                binding.cardFive.setCardBackgroundColor(Color.parseColor(background.getString("color")))
                binding.cardOne.setContentPadding(2, 2, 2, 2)
                binding.cardTwo.setContentPadding(2, 2, 2, 2)
                binding.cardThree.setContentPadding(2, 2, 2, 2)
                binding.cardFour.setContentPadding(2, 2, 2, 2)
                binding.cardFive.setContentPadding(2, 2, 2, 2)
            }
        }
        category.cat_image_one = jsonObject.getJSONArray("items").getJSONObject(0).getString("image_url")
        category.cat_value_one = jsonObject.getJSONArray("items").getJSONObject(0).getString("link_value")
        category.cat_link_one = jsonObject.getJSONArray("items").getJSONObject(0).getString("link_type")
        category.cat_image_two = jsonObject.getJSONArray("items").getJSONObject(1).getString("image_url")
        category.cat_value_two = jsonObject.getJSONArray("items").getJSONObject(1).getString("link_value")
        category.cat_link_two = jsonObject.getJSONArray("items").getJSONObject(1).getString("link_type")
        category.cat_image_three = jsonObject.getJSONArray("items").getJSONObject(2).getString("image_url")
        category.cat_value_three = jsonObject.getJSONArray("items").getJSONObject(2).getString("link_value")
        category.cat_link_three = jsonObject.getJSONArray("items").getJSONObject(2).getString("link_type")
        category.cat_image_four = jsonObject.getJSONArray("items").getJSONObject(3).getString("image_url")
        category.cat_value_four = jsonObject.getJSONArray("items").getJSONObject(3).getString("link_value")
        category.cat_link_four = jsonObject.getJSONArray("items").getJSONObject(3).getString("link_type")
        category.cat_image_five = jsonObject.getJSONArray("items").getJSONObject(4).getString("image_url")
        if (jsonObject.getJSONArray("items").getJSONObject(4).has("link_value")) {
            category.cat_value_five = jsonObject.getJSONArray("items").getJSONObject(4).getString("link_value")
        } else {
            category.cat_value_five = "list_collection"
        }
        category.cat_link_five = jsonObject.getJSONArray("items").getJSONObject(4).getString("link_type")
        homepagedata.setValue(hashMapOf("category-square_" to binding.root))
    }

    private fun createProductSlider(jsonObject: JSONObject) {
        try {
            val binding: MProductSliderBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_product_slider, null, false)
            var productSlider = ProductSlider()
            Log.d(TAG, "createProductSlider: " + jsonObject.getJSONArray("item_value"))
            updateDataInRecylerView(binding.productdata, jsonObject.getJSONArray("item_value"), " ", jsonObject)
            var header_title_color = JSONObject(jsonObject.getString("header_title_color"))
            var header_action_color = JSONObject(jsonObject.getString("header_action_color"))
            var header_action_background_color = JSONObject(jsonObject.getString("header_action_background_color"))
            var header_subtitle_color = JSONObject(jsonObject.getString("header_subtitle_color"))
            var header_deal_color = JSONObject(jsonObject.getString("header_deal_color"))
            var header_background_color = JSONObject(jsonObject.getString("header_background_color"))
            var panel_background_color = JSONObject(jsonObject.getString("panel_background_color"))
            binding.panelbackgroundcolor.setBackgroundColor(Color.parseColor(panel_background_color.getString("color")))
            binding.headerback.setBackgroundColor(Color.parseColor(header_background_color.getString("color")))
            if (jsonObject.getString("header").equals("1")) {
                productSlider.headertextvisibility = View.VISIBLE
                productSlider.headertext = jsonObject.getString("header_title_text")
                binding.headertext.setTextColor(Color.parseColor(header_title_color.getString("color")))
                val face: Typeface
                when (jsonObject.getString("item_header_font_weight")) {
                    "bold" -> {
                        face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                    }
                    else -> {
                        face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                    }

                }
                binding.headertext.setTypeface(face)
                if (jsonObject.getString("item_header_font_style").equals("italic")) {
                    binding.headertext.setTypeface(binding.headertext.getTypeface(), Typeface.ITALIC);
                }
                if (jsonObject.getString("header_action").equals("1")) {
                    productSlider.actiontextvisibity = View.VISIBLE
                    productSlider.action_id = getcategoryID(jsonObject.getString("item_link_action_value"))
                    productSlider.actiontext = jsonObject.getString("header_action_text")
                    binding.headertext.textSize = 20f
                    binding.actiontext.setBackgroundColor(Color.parseColor(header_action_background_color.getString("color")))
                    binding.actiontext.setTextColor(Color.parseColor(header_action_color.getString("color")))
                    val face: Typeface
                    when (jsonObject.getString("header_action_font_weight")) {
                        "bold" -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                        }
                        else -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                        }
                    }
                    binding.actiontext.setTypeface(face)
                    if (jsonObject.getString("header_action_font_style").equals("italic")) {
                        binding.actiontext.setTypeface(binding.actiontext.getTypeface(), Typeface.ITALIC);
                    }

                } else {
                    productSlider.actiontextvisibity = View.GONE
                }
                if (jsonObject.getString("header_subtitle").equals("1")) {
                    productSlider.subheadertextvisibity = View.VISIBLE
                    productSlider.subheadertext = jsonObject.getString("header_subtitle_text")
                    binding.subheadertext.setTextColor(Color.parseColor(header_subtitle_color.getString("color")))
                    val face: Typeface
                    when (jsonObject.getString("header_subtitle_font_weight")) {
                        "bold" -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                        }
                        else -> {
                            face = Typeface.createFromAsset(context.assets, "fonts/normal.ttf");
                        }

                    }
                    binding.subheadertext.setTypeface(face)
                    if (jsonObject.getString("header_subtitle_title_font_style").equals("italic")) {
                        binding.subheadertext.setTypeface(binding.subheadertext.getTypeface(), Typeface.ITALIC);
                    }
                } else {
                    productSlider.subheadertextvisibity = View.GONE
                }
                if (jsonObject.getString("header_deal").equals("1")) {
                    productSlider.timericon = View.VISIBLE
                    binding.timer.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    binding.timerMessage.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    binding.timericon.setTextColor(Color.parseColor(header_deal_color.getString("color")))
                    productSlider.timertextmessage = jsonObject.getString("item_deal_message")
                    var DATE_FORMAT = "MM/dd/yyyy HH:mm:ss"
                    var sdf = SimpleDateFormat(DATE_FORMAT)
                    sdf.setTimeZone(TimeZone.getTimeZone("UTC"))
                    var item_deal_start_date = sdf.format(Date())
                    Log.i("MageNative", "item_deal_start_date " + item_deal_start_date)
                    var item_deal_end_date = jsonObject.getString("item_deal_end_date")
                    Log.i("MageNative", "item_deal_end_date " + item_deal_end_date)
                    var startdate: Date?
                    var enddate: Date?
                    try {
                        startdate = sdf.parse(item_deal_start_date)
                        enddate = sdf.parse(item_deal_end_date)
                        var oldLong = startdate.getTime()
                        var NewLong = enddate.getTime()
                        var diff = NewLong - oldLong
                        Log.i("MageNative", "Long" + diff)
                        if (diff > 0) {
                            //var counter = MyCount(diff, 1000, productSlider, jsonObject.getString("item_deal_format"))
                            var counter = MyCount(diff, 1000, productSlider, ":");
                            counter.start()
                        } else {
                            productSlider.timericon = View.GONE
                        }
                    } catch (ex: ParseException) {
                        ex.printStackTrace();
                    }
                } else {
                    productSlider.timericon = View.GONE
                }
            } else {
                productSlider.headertextvisibility = View.GONE
            }
            binding.productslider = productSlider
            homepagedata.setValue(hashMapOf("product-list-slider_" to binding.root))
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun updateDataInRecylerView(productdata: RecyclerView?, jsonArray: JSONArray, cat_id: String, jsonObject: JSONObject) {
        try {
            val edges = mutableListOf<Storefront.Product>()
            var product_ids = ArrayList<ID>()
            for (i in 0..jsonArray.length() - 1) {
                Log.d(TAG, "updateDataInRecylerView: " + ID(getProductID(jsonArray.getString(i))))
                product_ids.add(ID(getProductID(jsonArray.getString(i))))
            }
            getProductsById(product_ids, productdata, jsonArray, jsonObject, edges)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    fun getProductsById(id: ArrayList<ID>, productdata: RecyclerView?, jsonArray: JSONArray, jsonObject: JSONObject, edges: MutableList<Storefront.Product>) {
        try {
//            var call = repository.graphClient.queryGraph(Query.getAllProductsByID(id))
//            call.enqueue { result: GraphCallResult<Storefront.QueryRoot> ->
//                GlobalScope.launch(Dispatchers.Main) {
//                    if (result is GraphCallResult.Success<*>) {
//                        consumeResponse(GraphQLResponse.success(result as GraphCallResult.Success<*>), productdata, jsonArray, jsonObject, edges)
//                    } else {
//                        consumeResponse(GraphQLResponse.error(result as GraphCallResult.Failure), productdata, jsonArray, jsonObject, edges)
//                    }
//                }
//            }
            doGraphQLQueryGraph(repository, Query.getAllProductsByID(id), customResponse = object : CustomResponse {
                override fun onSuccessQuery(result: GraphCallResult<Storefront.QueryRoot>) {
                    if (result is GraphCallResult.Success<*>) {
                        consumeResponse(GraphQLResponse.success(result as GraphCallResult.Success<*>), productdata, jsonArray, jsonObject, edges)
                    } else {
                        consumeResponse(GraphQLResponse.error(result as GraphCallResult.Failure), productdata, jsonArray, jsonObject, edges)
                    }
                }
            }, context = context)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun getProductID(id: String?): String? {
        var cat_id: String? = null
        try {
            val data = Base64.encode(("gid://shopify/Product/" + id!!).toByteArray(), Base64.DEFAULT)
            cat_id = String(data, Charset.defaultCharset()).trim { it <= ' ' }
            Log.i("MageNatyive", "ProductSliderID :$id " + cat_id)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return cat_id
    }

    private fun getcategoryID(id: String?): String? {
        var cat_id: String? = null
        try {
            val data = Base64.encode("gid://shopify/Collection/$id".toByteArray(), Base64.DEFAULT)
            cat_id = String(data, Charset.defaultCharset()).trim { it <= ' ' }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return cat_id
    }

    private fun consumeResponse(reponse: GraphQLResponse, productdata: RecyclerView?, jsonArray: JSONArray, jsonObject: JSONObject, edges: MutableList<Storefront.Product>) {
        when (reponse.status) {
            Status.SUCCESS -> {
                val result = (reponse.data as GraphCallResult.Success<Storefront.QueryRoot>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                    Log.i("MageNatyive", "ERROR" + errormessage.toString())
                    message.setValue(errormessage.toString())
                } else {
                    try {
                        for (i in 0..result.data!!.nodes.size - 1) {
                            if (result.data!!.nodes[i] != null) {
                                edges.add(result?.data?.nodes?.get(i)!! as Storefront.Product)
                            }
                        }
                        //if (edges.size == jsonArray.length()) {
                        filterProduct(edges, productdata, jsonArray, jsonObject)
                        //}
                    } catch (e: Exception) {
                        e.printStackTrace()
                        when (context!!.getPackageName()) {
                            "com.gypsey.shopifyapp" -> {
                                Toast.makeText(context, "Please Provide Visibility to Products and Collections", Toast.LENGTH_LONG).show()
                            }
                        }
                    }
                }
            }
            Status.ERROR -> {
                Log.i("MageNatyive", "ERROR-1" + reponse.error!!.error.message)
                message.setValue(reponse.error!!.error.message)
            }
        }
    }

    private fun filterProduct(list: List<Storefront.Product>, productdata: RecyclerView?, jsonArray: JSONArray, jsonObject: JSONObject) {
        try {
            repository.getProductListSlider(list)
                    .subscribeOn(Schedulers.io())
                    .filter { x -> x.availableForSale }
                    .toList()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<List<Storefront.Product>> {
                        override fun onSubscribe(d: Disposable) {

                        }

                        override fun onSuccess(list: List<Storefront.Product>) {
                            when (jsonObject.getString("type")) {
                                "fixed-customisable-layout" -> {
                                    if (jsonObject.getString("item_layout_type").equals("list")) {
                                        productListAdapter = ProductListSliderAdapter()
                                        productListAdapter!!.presentmentcurrency = presentmentCurrency
                                        context.setLayout(productdata!!, "vertical")
                                        productListAdapter!!.setData(list, context, jsonObject)
                                        productdata!!.adapter = productListAdapter
                                    } else {
                                        when (jsonObject.getString("item_in_a_row")) {
                                            "2" -> {
                                                gridtwo = ProductSliderListAdapter()
                                                gridtwo!!.presentmentcurrency = presentmentCurrency
                                                context.setLayout(productdata!!, "grid")
                                                gridtwo!!.setData(list, context, jsonObject, repository)
                                                productdata!!.adapter = gridtwo
                                            }
                                            "3" -> {
                                                gridAdapter = ProductSliderGridAdapter()
                                                gridAdapter!!.presentmentcurrency = presentmentCurrency
                                                context.setLayout(productdata!!, "customisablegrid")
                                                gridAdapter!!.setData(list, context, jsonObject)
                                                productdata!!.adapter = gridAdapter
                                            }
                                        }
                                    }
                                }
                                else -> {
                                    Log.i("MageNatyive", "Data" + list.size)
                                    homeadapter = ProductSliderListAdapter()
                                    homeadapter!!.presentmentcurrency = presentmentCurrency
                                    context.setLayout(productdata!!, "horizontal")
                                    homeadapter!!.setData(list, context, jsonObject, repository)
                                    productdata!!.adapter = homeadapter
                                }
                            }
                        }

                        override fun onError(e: Throwable) {
                            e.printStackTrace()
                        }
                    })
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun checkProduct(jsonArray: JSONArray, productedge: Storefront.ProductEdge): Boolean {
        var flag: Boolean = false
        try {
            for (data in 0..jsonArray.length() - 1) {
                val data = Base64.encode(("gid://shopify/Product/" + jsonArray[data]).toByteArray(), Base64.DEFAULT)
                val id = String(data, Charset.defaultCharset()).trim { it <= ' ' }
                if (id.equals(productedge.node.id.toString())) {
                    flag = true
                    break
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return flag
    }

    private fun createBannerSlider(jsonObject: JSONObject) {
        try {
            var binding: MBannerSliderBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_banner_slider, null, false)
            binding!!.banners.adapter = HomePageBanner(context.supportFragmentManager, context, jsonObject.getJSONArray("items"))
            if (jsonObject.getString("item_dots").equals("1")) {
                binding!!.indicator.visibility = View.VISIBLE
                var background = JSONObject(jsonObject.getString("active_dot_color"))
                var strokebackground = JSONObject(jsonObject.getString("inactive_dot_color"))
                binding!!.indicator.setDotIndicatorColor(Color.parseColor(background.getString("color")))
                binding!!.indicator.setStrokeDotsIndicatorColor(Color.parseColor(strokebackground.getString("color")))
                binding!!.indicator.setViewPager(binding!!.banners)
            }
            homepagedata.setValue(hashMapOf("banner-slider_" to binding.root))
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun createCategoryCircle(jsonObject: JSONObject) {
        var binding: MCategoryCircleBinding = DataBindingUtil.inflate(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater, R.layout.m_category_circle, null, false)
        var category = CategoryCircle()
        binding.category = category
        var background = JSONObject(jsonObject.getString("panel_background_color"))

        binding.root.setBackgroundColor(Color.parseColor(background.getString("color")))
        if (jsonObject.getString("item_title").equals("1")) {
            category.cat_text_one = jsonObject.getJSONArray("items").getJSONObject(0).getString("title")
            category.cat_text_two = jsonObject.getJSONArray("items").getJSONObject(1).getString("title")
            category.cat_text_three = jsonObject.getJSONArray("items").getJSONObject(2).getString("title")
            category.cat_text_four = jsonObject.getJSONArray("items").getJSONObject(3).getString("title")
            category.cat_text_five = jsonObject.getJSONArray("items").getJSONObject(4).getString("title")
            var item_color = JSONObject(jsonObject.getString("item_title_color"))
            binding.catTextOne.setTextColor(Color.parseColor(item_color.getString("color")))
            binding.catTextTwo.setTextColor(Color.parseColor(item_color.getString("color")))
            binding.catTextThree.setTextColor(Color.parseColor(item_color.getString("color")))
            binding.catTextFour.setTextColor(Color.parseColor(item_color.getString("color")))
            binding.catTextFive.setTextColor(Color.parseColor(item_color.getString("color")))
            if (jsonObject.getString("item_font_weight").equals("bold")) {
                val face = Typeface.createFromAsset(context.assets, "fonts/bold.ttf");
                binding.catTextOne.setTypeface(face)
                binding.catTextTwo.setTypeface(face)
                binding.catTextThree.setTypeface(face)
                binding.catTextFour.setTypeface(face)
                binding.catTextFive.setTypeface(face)
            }
            if (jsonObject.getString("item_font_style").equals("italic")) {
                binding.catTextOne.setTypeface(binding.catTextOne.getTypeface(), Typeface.ITALIC);
                binding.catTextTwo.setTypeface(binding.catTextTwo.getTypeface(), Typeface.ITALIC);
                binding.catTextThree.setTypeface(binding.catTextThree.getTypeface(), Typeface.ITALIC);
                binding.catTextFour.setTypeface(binding.catTextFour.getTypeface(), Typeface.ITALIC);
                binding.catTextFive.setTypeface(binding.catTextFive.getTypeface(), Typeface.ITALIC);
            }
        }
        if (jsonObject.getString("item_border").equals("1")) {
            var item_border_color = JSONObject(jsonObject.getString("item_border_color"))
            binding.imageOne.tag = item_border_color.getString("color")
            binding.imageTwo.tag = item_border_color.getString("color")
            binding.imageThree.tag = item_border_color.getString("color")
            binding.imageFour.tag = item_border_color.getString("color")
            binding.imageFive.tag = item_border_color.getString("color")
        } else {
            binding.imageOne.tag = background.getString("color")
            binding.imageTwo.tag = background.getString("color")
            binding.imageThree.tag = background.getString("color")
            binding.imageFour.tag = background.getString("color")
            binding.imageFive.tag = background.getString("color")
        }
        category.cat_image_one = jsonObject.getJSONArray("items").getJSONObject(0).getString("image_url")
        category.cat_value_one = jsonObject.getJSONArray("items").getJSONObject(0).getString("link_value")
        category.cat_link_one = jsonObject.getJSONArray("items").getJSONObject(0).getString("link_type")
        category.cat_image_two = jsonObject.getJSONArray("items").getJSONObject(1).getString("image_url")
        category.cat_value_two = jsonObject.getJSONArray("items").getJSONObject(1).getString("link_value")
        category.cat_link_two = jsonObject.getJSONArray("items").getJSONObject(1).getString("link_type")
        category.cat_image_three = jsonObject.getJSONArray("items").getJSONObject(2).getString("image_url")
        category.cat_value_three = jsonObject.getJSONArray("items").getJSONObject(2).getString("link_value")
        category.cat_link_three = jsonObject.getJSONArray("items").getJSONObject(2).getString("link_type")
        category.cat_image_four = jsonObject.getJSONArray("items").getJSONObject(3).getString("image_url")
        category.cat_value_four = jsonObject.getJSONArray("items").getJSONObject(3).getString("link_value")
        category.cat_link_four = jsonObject.getJSONArray("items").getJSONObject(3).getString("link_type")
        category.cat_image_five = jsonObject.getJSONArray("items").getJSONObject(4).getString("image_url")
        if (jsonObject.getJSONArray("items").getJSONObject(4).has("link_value")) {
            category.cat_value_five = jsonObject.getJSONArray("items").getJSONObject(4).getString("link_value")
        } else {
            category.cat_value_five = "list_collection"
        }
        category.cat_link_five = jsonObject.getJSONArray("items").getJSONObject(4).getString("link_type")
        homepagedata.setValue(hashMapOf("category-circle_" to binding.root))
    }

    class MyCount : CountDownTimer {
        var productSlider: ProductSlider
        var format: String

        constructor(millisInFuture: Long, countDownInterval: Long, productSlider: ProductSlider, format: String) : super(millisInFuture, countDownInterval) {
            this.productSlider = productSlider
            this.format = format
        }

        override fun onFinish() {
            productSlider.timericon = View.GONE
        }

        override fun onTick(millisUntilFinished: Long) {
            var millis = millisUntilFinished;
            var hms = " " + (TimeUnit.MILLISECONDS.toDays(millis)) + " Day $format " + (TimeUnit.MILLISECONDS.toHours(millis) - TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(millis))) + " H $format " + (TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis))) + " M $format " + (TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))) + " S"
            productSlider.timertext = hms
        }
    }

    private val api = MutableLiveData<ApiResponse>()
    private val bestapi = MutableLiveData<ApiResponse>()
    fun getApiResponse(): MutableLiveData<ApiResponse> {
        getRecommendations("trending", api)
        return api
    }

    fun getBestApiResponse(): MutableLiveData<ApiResponse> {
        getRecommendations("bestsellers", bestapi)
        return bestapi
    }

    fun getRecommendations(recommendationType: String, api: MutableLiveData<ApiResponse>) {
        RetrofitUrlManager.getInstance().putDomain("douban", Urls.PERSONALISED);
        try {
            var query = InnerData()
            query.id = recommendationType
            query.maxRecommendations = 12
            query.recommendationType = recommendationType
            var body = Body()
            body.queries = mutableListOf(query)
            doRetrofitCall(repository.getRecommendation(body), disposables, customResponse = object : CustomResponse {
                override fun onSuccessRetrofit(result: JsonElement) {
                    api.setValue(ApiResponse.success(result))
                }

                override fun onErrorRetrofit(error: Throwable) {
                    api.setValue(ApiResponse.error(error))
                }
            }, context = context)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onCleared() {
        disposables.clear()
    }
}
