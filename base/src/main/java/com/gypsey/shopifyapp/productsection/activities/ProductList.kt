package com.gypsey.shopifyapp.productsection.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.databinding.MProductlistitemBinding
import com.gypsey.shopifyapp.basesection.activities.BaseActivity
import com.gypsey.shopifyapp.customviews.MageNativeRadioButton
import com.gypsey.shopifyapp.productsection.adapters.ProductRecylerAdapter
import com.gypsey.shopifyapp.productsection.viewmodels.ProductListModel
import com.gypsey.shopifyapp.utils.ViewModelFactory

import javax.inject.Inject

class ProductList : BaseActivity() {
    private var binding: MProductlistitemBinding? = null
    private var productlist: RecyclerView? = null
    @Inject
    lateinit var factory: ViewModelFactory
    private var productListModel: ProductListModel? = null
    private var products: MutableList<Storefront.ProductEdge>? = null
    private var productcursor: String? = null
    @Inject
    lateinit var adapter: ProductRecylerAdapter
    private var sheet: BottomSheetBehavior<*>? = null
    private var sortselction: RadioGroup? = null
    private var flag = true
    private val recyclerViewOnScrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            super.onScrollStateChanged(recyclerView, newState)
        }

        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            val visibleItemCount = recyclerView.layoutManager!!.childCount
            val totalItemCount = recyclerView.layoutManager!!.itemCount
            var firstVisibleItemPosition = 0
            if (recyclerView.layoutManager is LinearLayoutManager) {
                firstVisibleItemPosition = (recyclerView.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()
            } else if (recyclerView.layoutManager is GridLayoutManager) {
                firstVisibleItemPosition = (recyclerView.layoutManager as GridLayoutManager).findFirstVisibleItemPosition()
            }
            if (!recyclerView.canScrollVertically(1)) {
                if (visibleItemCount + firstVisibleItemPosition >= totalItemCount && firstVisibleItemPosition >= 0
                        && totalItemCount >= products!!.size) {
                    productListModel!!.number = 20
                    productListModel!!.cursor = productcursor!!
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val group = findViewById<ViewGroup>(R.id.container)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.m_productlistitem, group, true)
        binding!!.handler = Handler()
        productlist = setLayout(binding!!.root.findViewById(R.id.productlist), "grid")
        sheet = BottomSheetBehavior.from(binding!!.root.findViewById<View>(R.id.bottom_sheet))
        sortselction = binding!!.root.findViewById(R.id.sortselction)
        showBackButton()
        if (intent.hasExtra("tittle") && intent.getStringExtra("tittle") != null) {
            showTittle(intent.getStringExtra("tittle"))
        }
        (application as MyApplication).mageNativeAppComponent!!.doProductListInjection(this)
        productListModel = ViewModelProvider(this, factory).get(ProductListModel::class.java)
        productListModel!!.context=this
        if (intent.getStringExtra("ID") != null) {
            productListModel!!.setcategoryID(intent.getStringExtra("ID"))
        }
        if (intent.getStringExtra("handle") != null) {
            productListModel!!.setcategoryHandle(intent.getStringExtra("handle"))
        }
        if (intent.getStringExtra("ID") == null && intent.getStringExtra("handle") == null) {
            productListModel!!.shopID = "allproduct"
            flag = false
        }
        productListModel!!.message.observe(this, Observer { this.showToast(it) })
        productListModel!!.Response()
        productListModel!!.filteredproducts.observe(this, Observer<MutableList<Storefront.ProductEdge>> { this.setRecylerData(it) })
        productlist!!.addOnScrollListener(recyclerViewOnScrollListener)
        sortselction!!.setOnCheckedChangeListener { group, checkedId ->
            val selectedId = group.checkedRadioButtonId
            val radioButton = findViewById<View>(selectedId) as MageNativeRadioButton
            appySort(radioButton)
        }
        sheet!!.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                if (newState == BottomSheetBehavior.STATE_DRAGGING) {
                    sheet!!.state = BottomSheetBehavior.STATE_EXPANDED
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {}
        })
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    private fun appySort(radioButton: MageNativeRadioButton) {
        try {

            when (radioButton.tag.toString()) {
                "atoz" -> {
                    if (flag) {
                        productListModel!!.sortKeys = Storefront.ProductCollectionSortKeys.TITLE
                    } else {
                        productListModel!!.keys = Storefront.ProductSortKeys.TITLE
                    }
                    productListModel!!.isDirection = false
                }
                "ztoa" -> {
                    if (flag) {
                        productListModel!!.sortKeys = Storefront.ProductCollectionSortKeys.TITLE
                    } else {
                        productListModel!!.keys = Storefront.ProductSortKeys.TITLE
                    }
                    productListModel!!.isDirection = true
                }
                "htol" -> {
                    if (flag) {
                        productListModel!!.sortKeys = Storefront.ProductCollectionSortKeys.PRICE
                    } else {
                        productListModel!!.keys = Storefront.ProductSortKeys.PRICE
                    }
                    productListModel!!.isDirection = true
                }
                "ltoh" -> {
                    if (flag) {
                        productListModel!!.sortKeys = Storefront.ProductCollectionSortKeys.PRICE
                    } else {
                        productListModel!!.keys = Storefront.ProductSortKeys.PRICE
                    }
                    productListModel!!.isDirection = false
                }
            }
            products = null
            productListModel!!.number = 10
            productListModel!!.cursor = "nocursor"
            sheet!!.state = BottomSheetBehavior.STATE_COLLAPSED
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun setRecylerData(products: MutableList<Storefront.ProductEdge>) {
        try {
            if (products.size > 0) {
                adapter!!.presentmentcurrency = productListModel!!.presentmentCurrency
                if (this.products == null) {
                    this.products = products
                    adapter!!.setData(this.products, this@ProductList,productListModel!!.repository)
                    productlist!!.adapter = adapter
                } else {
                    this.products!!.addAll(products)
                    adapter!!.notifyDataSetChanged()
                }
                productcursor = this.products!![this.products!!.size - 1].cursor
                Log.i("MageNative", "Cursor : " + productcursor!!)
            } else {
                showToast(resources.getString(R.string.noproducts))
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    inner class Handler {
        fun openSort(view: View) {
            if (sheet!!.state != BottomSheetBehavior.STATE_EXPANDED) {
                sheet!!.setState(BottomSheetBehavior.STATE_EXPANDED)
            } else {
                sheet!!.setState(BottomSheetBehavior.STATE_COLLAPSED)
            }
        }
    }
}
