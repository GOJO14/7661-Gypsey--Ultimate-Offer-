package com.gypsey.shopifyapp.homesection.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.gson.JsonElement
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.basesection.activities.NewBaseActivity
import com.gypsey.shopifyapp.basesection.viewmodels.SplashViewModel.Companion.featuresModel
import com.gypsey.shopifyapp.databinding.MHomepageModifiedBinding
import com.gypsey.shopifyapp.homesection.viewmodels.HomePageViewModel
import com.gypsey.shopifyapp.personalised.adapters.PersonalisedAdapter
import com.gypsey.shopifyapp.personalised.viewmodels.PersonalisedViewModel
import com.gypsey.shopifyapp.utils.ApiResponse
import com.gypsey.shopifyapp.utils.Constant
import com.gypsey.shopifyapp.utils.Status
import com.gypsey.shopifyapp.utils.ViewModelFactory
import org.json.JSONObject
import javax.inject.Inject

class HomePage : NewBaseActivity() {
    private var binding: MHomepageModifiedBinding? = null

    @Inject
    lateinit var factory: ViewModelFactory
    private var homemodel: HomePageViewModel? = null
    lateinit var homepage: LinearLayoutCompat
    private var personamodel: PersonalisedViewModel? = null

    @Inject
    lateinit var personalisedadapter: PersonalisedAdapter

    @Inject
    lateinit var padapter: PersonalisedAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val group = findViewById<ViewGroup>(R.id.container)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.m_homepage_modified, group, true)
        homepage = binding!!.homecontainer
        (application as MyApplication).mageNativeAppComponent!!.doHomePageInjection(this)
        homemodel = ViewModelProvider(this, factory).get(HomePageViewModel::class.java)
        homemodel!!.context = this
        personamodel = ViewModelProvider(this, factory).get(PersonalisedViewModel::class.java)
        homemodel!!.connectFirebaseForHomePageData(this, homepage)

        if (featuresModel.ai_product_reccomendaton) {
            if (Constant.ispersonalisedEnable) {
                homemodel!!.getApiResponse().observe(this, Observer<ApiResponse> { this.consumeResponse(it) })
                homemodel!!.getBestApiResponse().observe(this, Observer<ApiResponse> { this.consumeResponse(it) })
            }
        }
        // GlobalScope.launch(Dispatchers.Main) {
        homemodel!!.getToastMessage().observe(this@HomePage, Observer<String> { consumeResponse(it) })
        homemodel!!.getHomePageData().observe(this@HomePage, Observer<HashMap<String, View>> { consumeResponse(it) })
        homemodel!!.getCustomerTags()
        //}
    }



    fun consumeResponse(data: String) {
        Toast.makeText(this, data, Toast.LENGTH_LONG).show()
    }

    fun consumeResponse(data: HashMap<String, View>) {
        if (data.containsKey("top-bar_")) {
            homepage.addView(data.get("top-bar_"))
        }
        if (data.containsKey("category-circle_")) {
            homepage.addView(data.get("category-circle_"))
        }
        if (data.containsKey("banner-slider_")) {
            homepage.addView(data.get("banner-slider_"))
        }
        if (data.containsKey("product-list-slider_")) {
            homepage.addView(data.get("product-list-slider_"))
        }
        if (data.containsKey("category-square_")) {
            homepage.addView(data.get("category-square_"))
        }
        if (data.containsKey("collection-grid-layout_")) {
            homepage.addView(data.get("collection-grid-layout_"))
        }
        if (data.containsKey("standalone-banner_")) {
            homepage.addView(data.get("standalone-banner_"))
        }
        if (data.containsKey("three-product-hv-layout_")) {
            homepage.addView(data.get("three-product-hv-layout_"))
        }
        if (data.containsKey("fixed-customisable-layout_")) {
            homepage.addView(data.get("fixed-customisable-layout_"))
        }
        if (data.containsKey("collection-list-slider_")) {
            homepage.addView(data.get("collection-list-slider_"))
        }

    }

    override fun onResume() {
        super.onResume()
        if (wishtextView != null) {
            wishtextView!!.text = "" + model!!.wishListcount
        }
        if (textView != null) {
            textView!!.text = "" + model!!.cartCount
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
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
            Log.i("MageNative", "TrendingProducts" + jsondata)
            if (jsondata.has("trending")) {
                binding!!.personalisedsection.visibility = View.VISIBLE
                setLayout(binding!!.personalised, "horizontal")
                personamodel!!.setPersonalisedData(jsondata.getJSONObject("trending").getJSONArray("products"), personalisedadapter, homemodel!!.presentmentCurrency!!, binding!!.personalised)
            }
            if (jsondata.has("bestsellers")) {
                binding!!.bestsellerpersonalisedsection.visibility = View.VISIBLE
                setLayout(binding!!.bestpersonalised, "horizontal")
                personamodel!!.setPersonalisedData(jsondata.getJSONObject("bestsellers").getJSONArray("products"), padapter, homemodel!!.presentmentCurrency!!, binding!!.bestpersonalised)
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}
