package com.gypsey.shopifyapp.productsection.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter

import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.productsection.fragments.ImageFragment

class ImagSlider(fm: FragmentManager, behavior: Int) : FragmentStatePagerAdapter(fm, behavior) {
    private var images: List<Storefront.ImageEdge>? = null
    fun setData(images: List<Storefront.ImageEdge>) {
        this.images = images
    }

    override fun getItem(position: Int): Fragment {
        var fragment: ImageFragment? = null
        try {
            fragment = ImageFragment()
            val bundle = Bundle()
            bundle.putString("url", images!![position].node.originalSrc)
            fragment.arguments = bundle
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return fragment!!
    }

    override fun getCount(): Int {
        return images!!.size
    }
}
