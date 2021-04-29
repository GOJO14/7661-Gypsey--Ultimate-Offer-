package com.gypsey.shopifyapp.productsection.activities

import android.content.Intent
import android.graphics.Paint
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.JsonElement
import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.Storefront
import com.shopify.graphql.support.Error
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.basesection.activities.BaseActivity
import com.gypsey.shopifyapp.basesection.models.ListData
import com.gypsey.shopifyapp.basesection.viewmodels.SplashViewModel.Companion.featuresModel
import com.gypsey.shopifyapp.cartsection.activities.CartList
import com.gypsey.shopifyapp.databinding.MProductviewBinding
import com.gypsey.shopifyapp.personalised.adapters.PersonalisedAdapter
import com.gypsey.shopifyapp.personalised.viewmodels.PersonalisedViewModel
import com.gypsey.shopifyapp.productsection.adapters.ImagSlider
import com.gypsey.shopifyapp.productsection.adapters.VariantAdapter
import com.gypsey.shopifyapp.productsection.viewmodels.ProductViewModel
import com.gypsey.shopifyapp.utils.*
import org.json.JSONObject
import java.math.BigDecimal
import javax.inject.Inject

class ProductView : BaseActivity() {
    private var binding: MProductviewBinding? = null

    @Inject
    lateinit var factory: ViewModelFactory
    private var model: ProductViewModel? = null
    private var variantlist: RecyclerView? = null

    @Inject
    lateinit var adapter: VariantAdapter
    private var data: ListData? = null
    private var personamodel: PersonalisedViewModel? = null

    @Inject
    lateinit var personalisedadapter: PersonalisedAdapter
    private val cartCount: Int
        get() {
            Log.i("MageNative", "Cart Count : " + model!!.cartCount)
            return model!!.cartCount

         }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Constant.previous = null
        Constant.current = null
        val group = findViewById<ViewGroup>(R.id.container)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.m_productview, group, true)

        binding?.features = featuresModel
        showBackButton()
        showTittle(" ")
        variantlist = setLayout(binding!!.productvariant, "horizontal")
        (application as MyApplication).mageNativeAppComponent!!.doProductViewInjection(this)
        model = ViewModelProvider(this, factory).get(ProductViewModel::class.java)
        model!!.context = this
        personamodel = ViewModelProvider(this, factory).get(PersonalisedViewModel::class.java)

        if (intent.getStringExtra("handle") != null) {
            model!!.handle = intent.getStringExtra("handle")
        }
        if (intent.getStringExtra("ID") != null) {
            model!!.id = intent.getStringExtra("ID")
        }
        data = ListData()

        model!!.getProductOffers(data!!)
        model!!.getProductOffersResponse().observe(this, Observer<ApiResponse> {this.consumeproductTagsResponse(it) })

        if (model!!.setPresentmentCurrencyForModel()) {
            model!!.filteredlist.observe(this, Observer<List<Storefront.ProductVariantEdge>> { this.filterResponse(it) })
            if (featuresModel.ai_product_reccomendaton) {
                model!!.getApiResponse().observe(this, Observer<ApiResponse> { this.consumeResponse(it) })
            }
            if (intent.getSerializableExtra("product") != null) {
                setProductData(intent.getSerializableExtra("product") as Storefront.Product)
            } else {
                model!!.Response().observe(this, Observer<GraphQLResponse> { this.consumeResponse(it) })
            }
        }
    }

    private fun consumeproductTagsResponse(reponse: ApiResponse) {
        Log.d("consumeproductTag",""+reponse.data)
        when (reponse.status) {
            Status.SUCCESS -> setDiscountData(reponse.data!!)
                Status.ERROR -> {
                    reponse.error!!.printStackTrace()
                    Toast.makeText(this, resources.getString(R.string.errorString), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setDiscountData(data: JsonElement) {
        val jsondata = JSONObject(data.toString())
        if (jsondata.getJSONObject("data").getJSONArray("actions").length()>0){
            var message = jsondata.getJSONObject("data").getJSONArray("actions").getJSONObject(0).getString("message")
            binding!!.discount.setText(message)
            binding!!.discount.visibility = View.VISIBLE

        }else{
            binding!!.discount.visibility = View.GONE
        }
    }

    private fun filterResponse(list: List<Storefront.ProductVariantEdge>) {
        adapter!!.setData(list, model, data)
        variantlist!!.adapter = adapter
        adapter!!.notifyDataSetChanged()
        if (list.size > 1) {
            binding!!.variantheading.visibility = View.VISIBLE
        } else {
            binding!!.variantheading.visibility = View.GONE
        }
    }

    private fun consumeResponse(reponse: GraphQLResponse) {
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
                    Toast.makeText(this, "" + errormessage, Toast.LENGTH_SHORT).show()
                } else {
                    var productedge: Storefront.Product? = null
                    if (!model!!.handle.isEmpty()) {
                        productedge = result.data!!.productByHandle
                    }
                    if (!model!!.id.isEmpty()) {
                        productedge = result.data!!.node as Storefront.Product
                    }
                    // a.previewImage
                    Log.i("MageNative", "Product_id" + productedge!!.id.toString())
                    setProductData(productedge)
                }
            }
            Status.ERROR -> Toast.makeText(this, reponse.error!!.error.message, Toast.LENGTH_SHORT).show()
            else -> {
            }
        }
    }

    private fun consumeResponse(reponse: ApiResponse) {
        when (reponse.status) {
            Status.SUCCESS -> setPersonalisedData(reponse.data!!)
            Status.ERROR -> {
                reponse.error!!.printStackTrace()
                Toast.makeText(this, resources.getString(R.string.errorString), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setPersonalisedData(data: JsonElement) {
        try {
            val jsondata = JSONObject(data.toString())
            if (jsondata.has("query1")) {
                binding!!.personalisedsection.visibility = View.VISIBLE
                setLayout(binding!!.personalised, "horizontal")
                personamodel!!.setPersonalisedData(jsondata.getJSONObject("query1").getJSONArray("products"), personalisedadapter, model!!.presentmentCurrency!!, binding!!.personalised)
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun setProductData(productedge: Storefront.Product?) {
        try {
            loop@ for (i in 0..productedge!!.media.edges.size - 1) {
                var a: String = productedge!!.media.edges.get(i).node.graphQlTypeName
                if (a.equals("Model3d")) {
                    var d = productedge!!.media.edges.get(i).node as Storefront.Model3d
                    for (j in 0..d.sources.size - 1) {
                        if (d.sources.get(j).url.contains(".glb")) {
                            data!!.arimage = d.sources.get(j).url
                            if (featuresModel.ardumented_reality) {
                                binding!!.aricon.visibility = View.VISIBLE
                            } else {
                                binding!!.aricon.visibility = View.GONE
                            }
                            break@loop
                        }
                    }
                }

            }
            if (Constant.ispersonalisedEnable) {
                model!!.getRecommendations(productedge!!.id.toString())
            }
            val variant = productedge!!.variants.edges[0].node
            val slider = ImagSlider(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
            slider.setData(productedge.images.edges)
            data!!.product = productedge
            binding!!.images.adapter = slider
            binding!!.indicator.setViewPager(binding!!.images)
            data!!.textdata = productedge.title
            Log.i("here", productedge.descriptionHtml)
            /* data!!.descriptionhmtl = Html.fromHtml(productedge.description)*/
            /*Html.fromHtml(productedge.descriptionHtml)*/
            /*
            * Testing Code for images in HTML
            * */
            /* data!!.descriptionhmtl = Html.fromHtml(productedge.descriptionHtml, object : Html.ImageGetter {
                 override fun getDrawable(source: String): Drawable? {

                     Log.i("here",source)
                     *//*val bmp: Drawable? = Drawable.createFromPath(source)
                    bmp?.setBounds(0, 0, bmp.getIntrinsicWidth(), bmp.getIntrinsicHeight())
                    return bmp*//*
                    val d = LevelListDrawable()
                    val empty = resources.getDrawable(R.mipmap.ic_launcher)
                    d.addLevel(0, 0, empty)
                    d.setBounds(0, 0, empty.intrinsicWidth, empty.intrinsicHeight)

                    LoadImage().execute(source, d)

                    return d
                }
            }, null)*/
            binding?.description?.loadData(productedge.descriptionHtml, "text/html", "utf-8")
            if (model?.isInwishList(model?.id!!)!!) {
                data!!.addtowish = resources.getString(R.string.alreadyinwish)
            } else {
                data!!.addtowish = resources.getString(R.string.addtowish)
            }

            if (model!!.presentmentCurrency == "nopresentmentcurrency") {
                data!!.regularprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
                if (variant.compareAtPriceV2 != null) {
                    val special = java.lang.Double.valueOf(variant.compareAtPriceV2.amount)
                    val regular = java.lang.Double.valueOf(variant.priceV2.amount)
                    if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                        data!!.regularprice = CurrencyFormatter.setsymbol(variant.compareAtPriceV2.amount, variant.compareAtPriceV2.currencyCode.toString())
                        data!!.specialprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
                        data!!.offertext = getDiscount(special, regular).toString() + "%off"

                    } else {
                        data!!.regularprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
                        data!!.specialprice = CurrencyFormatter.setsymbol(variant.compareAtPriceV2.amount, variant.compareAtPriceV2.currencyCode.toString())
                        data!!.offertext = getDiscount(regular, special).toString() + "%off"
                    }
                    data!!.isStrike = true
                    binding!!.regularprice.paintFlags = binding!!.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                    binding!!.specialprice.visibility = View.VISIBLE
                    binding!!.offertext.visibility = View.VISIBLE
                    binding!!.offertext.setTextColor(resources.getColor(R.color.green))
                } else {
                    data!!.isStrike = false
                    binding!!.specialprice.visibility = View.GONE
                    binding!!.offertext.visibility = View.GONE
                    binding!!.regularprice.paintFlags = binding!!.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
                }
            } else {
                val edge = getEdge(variant.presentmentPrices.edges)
                data!!.regularprice = CurrencyFormatter.setsymbol(edge!!.node.price.amount, edge.node.price.currencyCode.toString())
                if (variant.compareAtPriceV2 != null) {
                    val special = java.lang.Double.valueOf(edge.node.compareAtPrice.amount)
                    val regular = java.lang.Double.valueOf(edge.node.price.amount)
                    if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                        data!!.regularprice = CurrencyFormatter.setsymbol(edge.node.compareAtPrice.amount, edge.node.compareAtPrice.currencyCode.toString())
                        data!!.specialprice = CurrencyFormatter.setsymbol(edge.node.price.amount, edge.node.price.currencyCode.toString())
                        data!!.offertext = getDiscount(special, regular).toString() + "%off"

                    } else {
                        data!!.regularprice = CurrencyFormatter.setsymbol(edge.node.price.amount, edge.node.price.currencyCode.toString())
                        data!!.specialprice = CurrencyFormatter.setsymbol(edge.node.compareAtPrice.amount, edge.node.compareAtPrice.currencyCode.toString())
                        data!!.offertext = getDiscount(regular, special).toString() + "%off"
                    }
                    data!!.isStrike = true
                    binding!!.regularprice.paintFlags = binding!!.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                    binding!!.specialprice.visibility = View.VISIBLE
                    binding!!.offertext.visibility = View.VISIBLE
                    binding!!.offertext.setTextColor(resources.getColor(R.color.green))
                } else {
                    data!!.isStrike = false
                    binding!!.specialprice.visibility = View.GONE
                    binding!!.offertext.visibility = View.GONE
                    binding!!.regularprice.paintFlags = binding!!.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
                }
            }
            model!!.filterList(productedge.variants.edges)
            binding!!.productdata = data
            binding!!.clickhandlers = ClickHandlers()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getDiscount(regular: Double, special: Double): Int {
        return ((regular - special) / regular * 100).toInt()
    }

    private fun getEdge(edges: List<Storefront.ProductVariantPricePairEdge>): Storefront.ProductVariantPricePairEdge? {
        var pairEdge: Storefront.ProductVariantPricePairEdge? = null
        try {
            for (i in edges.indices) {
                if (edges[i].node.price.currencyCode.toString() == model!!.presentmentCurrency) {
                    pairEdge = edges[i]
                    break
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return pairEdge
    }

    inner class ClickHandlers {
        fun addtoCart(view: View, data: ListData) {
            if (Constant.current == null) {
                Toast.makeText(view.context, resources.getString(R.string.selectvariant), Toast.LENGTH_LONG).show()
            } else {
                model!!.addToCart(Constant.current!!.variant_id!!,model!!.id,data.regularprice.toString().removePrefix("ZAR"),data.textdata.toString())
                Toast.makeText(view.context, resources.getString(R.string.successcart), Toast.LENGTH_LONG).show()
                invalidateOptionsMenu()
            }
        }

        fun addtoWish(view: View, data: ListData) {
            Log.i("MageNative", "In Wish")
            if (model!!.setWishList(data.product?.id.toString())) {
                Toast.makeText(view.context, resources.getString(R.string.successwish), Toast.LENGTH_LONG).show()
                data.addtowish = resources.getString(R.string.alreadyinwish)
            }
        }

        fun shareProduct(view: View, data: ListData) {
            //Toast.makeText(ProductView.this,data.getProduct().getOnlineStoreUrl(),Toast.LENGTH_LONG).show();
            val shareString = resources.getString(R.string.hey) + "  " + data.product!!.title + "  " + resources.getString(R.string.on) + "  " + resources.getString(R.string.app_name) + "\n" + data.product!!.onlineStoreUrl + "?pid=" + data.product!!.id.toString()
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, view.context.resources.getString(R.string.app_name))
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareString)
            view.context.startActivity(Intent.createChooser(shareIntent, view.context.resources.getString(R.string.share)))
        }

        fun showAR(view: View, data: ListData) {
            var sceneViewerIntent = Intent(Intent.ACTION_VIEW);
            var intentUri: Uri =
                    Uri.parse("https://arvr.google.com/scene-viewer/1.1").buildUpon()
                            .appendQueryParameter("file", data.arimage)
                            .build();
            sceneViewerIntent.setData(intentUri);
            sceneViewerIntent.setPackage("com.google.ar.core");
            startActivity(sceneViewerIntent);
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.m_product, menu)
        val item = menu.findItem(R.id.cart_item)
        item.setActionView(R.layout.m_count)
        val notifCount = item.actionView
        val textView = notifCount.findViewById<TextView>(R.id.count)
        textView.text = "" + cartCount
        notifCount.setOnClickListener {
            val mycartlist = Intent(this@ProductView, CartList::class.java)
            startActivity(mycartlist)
        }
        return true
    }

    override fun onResume() {
        super.onResume()
        invalidateOptionsMenu()
    }
}
