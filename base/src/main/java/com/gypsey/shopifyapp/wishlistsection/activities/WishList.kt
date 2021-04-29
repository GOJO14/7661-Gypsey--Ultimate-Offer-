package com.gypsey.shopifyapp.wishlistsection.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.shopify.buy3.Storefront

import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.databinding.MWishlistBinding
import com.gypsey.shopifyapp.basesection.activities.BaseActivity
import com.gypsey.shopifyapp.cartsection.activities.CartList
import com.gypsey.shopifyapp.dbconnection.entities.ItemData
import com.gypsey.shopifyapp.utils.Status
import com.gypsey.shopifyapp.utils.ViewModelFactory
import com.gypsey.shopifyapp.utils.WishListDbResponse
import com.gypsey.shopifyapp.wishlistsection.adapters.WishListAdapter
import com.gypsey.shopifyapp.wishlistsection.viewmodels.WishListViewModel

import javax.inject.Inject

class WishList : BaseActivity() {
    private var binding: MWishlistBinding? = null

    @Inject
    lateinit var factory: ViewModelFactory
    private var model: WishListViewModel? = null

    @Inject
    lateinit var adapter: WishListAdapter
    private var list: RecyclerView? = null
    private val cartCount: Int
        get() = model!!.cartCount

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val group = findViewById<ViewGroup>(R.id.container)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.m_wishlist, group, true)
        showBackButton()
        showTittle(resources.getString(R.string.mywishlist))
        list = binding!!.wishlist
        list = setLayout(list!!, "grid")
        (application as MyApplication).mageNativeAppComponent!!.doWishListActivityInjection(this)
        model = ViewModelProviders.of(this, factory).get(WishListViewModel::class.java)
        model?.context = this
        model!!.Response().observe(this, Observer { consumeWishlist(it) })
        model!!.getToastMessage().observe(this, Observer { consumeErrorResponse(it) })
        model!!.updateResponse().observe(this, Observer<Boolean> { this.consumeResponse(it) })
    }

    private fun consumeErrorResponse(it: String?) {
        showToast(it!!)
    }

    private fun consumeWishlist(it: MutableList<Storefront.Product>?) {
        Log.i("MageNative", "wishcount : " + it?.size)
        showTittle(resources.getString(R.string.mywishlist) + " ( " + it?.size + " items )")
        adapter!!.setData(it, this, model!!)
        adapter!!.notifyDataSetChanged()
        list!!.adapter = adapter
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }


    private fun consumeResponse(response: Boolean?) {
        try {
            if (response!!) {
                invalidateOptionsMenu()
                showTittle(resources.getString(R.string.mywishlist) + " ( " + model!!.wishListCount + " items )")
                if (model!!.wishListCount == 0) {
                    showToast(resources.getString(R.string.errorwish))
                    finish()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
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
            val mycartlist = Intent(this@WishList, CartList::class.java)
            startActivity(mycartlist)
        }
        return true
    }

    override fun onResume() {
        super.onResume()
        invalidateOptionsMenu()
    }
}
