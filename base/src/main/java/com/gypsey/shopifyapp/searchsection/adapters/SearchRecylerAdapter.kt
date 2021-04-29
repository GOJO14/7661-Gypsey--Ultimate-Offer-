package com.gypsey.shopifyapp.searchsection.adapters

import android.app.Activity
import android.content.Intent
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView

import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.databinding.MSearchitemBinding
import com.gypsey.shopifyapp.basesection.models.CommanModel
import com.gypsey.shopifyapp.basesection.models.ListData
import com.gypsey.shopifyapp.productsection.activities.ProductView
import com.gypsey.shopifyapp.searchsection.viewholders.SearechItem
import com.gypsey.shopifyapp.utils.CurrencyFormatter

import java.math.BigDecimal

import javax.inject.Inject

class SearchRecylerAdapter @Inject
constructor() : RecyclerView.Adapter<SearechItem>() {
    private var layoutInflater: LayoutInflater? = null
    var products: MutableList<Storefront.ProductEdge>? = null
    private var activity: Activity? = null
    var presentmentcurrency: String? = null
    fun setData(products: List<Storefront.ProductEdge>, activity: Activity) {
        this.products = products as MutableList<Storefront.ProductEdge>
        this.activity = activity
    }

    init {
        setHasStableIds(true)
    }

    override fun getItemViewType(position: Int): Int {
        var viewtype = 0
        if (!products?.get(position)!!.node.availableForSale) {
            viewtype = -1
        }
        return viewtype
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearechItem {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        val binding = DataBindingUtil.inflate<MSearchitemBinding>(layoutInflater!!, R.layout.m_searchitem, parent, false)
        return SearechItem(binding)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: SearechItem, position: Int) {
        val variant = this.products?.get(position)!!.node.variants.edges[0].node
        val data = ListData()
        data.product = products?.get(position)!!.node
        data.textdata = products?.get(position)!!.node.title
        data.description = products?.get(position)!!.node.description
        if (presentmentcurrency == "nopresentmentcurrency") {
            data.regularprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
            if (variant.compareAtPriceV2 != null) {
                val special = java.lang.Double.valueOf(variant.compareAtPriceV2.amount)
                val regular = java.lang.Double.valueOf(variant.priceV2.amount)
                if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                    data.regularprice = CurrencyFormatter.setsymbol(variant.compareAtPriceV2.amount, variant.compareAtPriceV2.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
                    data.offertext = getDiscount(special, regular).toString() + "%off"
                    holder.binding.regularprice.paintFlags = holder.binding.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                    holder.binding.specialprice.visibility = View.VISIBLE
                    holder.binding.offertext.visibility = View.VISIBLE
                    holder.binding.offertext.setTextColor(activity!!.resources.getColor(R.color.green))
                } else {
                    holder.binding.specialprice.visibility = View.GONE
                    holder.binding.offertext.visibility = View.GONE
                    holder.binding.regularprice.paintFlags = holder.binding.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
                }
            } else {
                holder.binding.specialprice.visibility = View.GONE
                holder.binding.offertext.visibility = View.GONE
                holder.binding.regularprice.paintFlags = holder.binding.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        } else {
            val edge = getEdge(variant.presentmentPrices.edges)
            data.regularprice = CurrencyFormatter.setsymbol(edge!!.node.price.amount, edge.node.price.currencyCode.toString())
            if (variant.compareAtPriceV2 != null) {
                val special = java.lang.Double.valueOf(edge.node.compareAtPrice.amount)
                val regular = java.lang.Double.valueOf(edge.node.price.amount)
                if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                    data.regularprice = CurrencyFormatter.setsymbol(edge.node.compareAtPrice.amount, edge.node.compareAtPrice.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(edge.node.price.amount, edge.node.price.currencyCode.toString())
                    data.offertext = getDiscount(special, regular).toString() + "%off"
                    holder.binding.regularprice.paintFlags = holder.binding.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                    holder.binding.specialprice.visibility = View.VISIBLE
                    holder.binding.offertext.visibility = View.VISIBLE
                    holder.binding.offertext.setTextColor(activity!!.resources.getColor(R.color.green))
                } else {
                    holder.binding.specialprice.visibility = View.GONE
                    holder.binding.offertext.visibility = View.GONE
                    holder.binding.regularprice.paintFlags = holder.binding.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
                }
            } else {
                holder.binding.specialprice.visibility = View.GONE
                holder.binding.offertext.visibility = View.GONE
                holder.binding.regularprice.paintFlags = holder.binding.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }
        holder.binding.listdata = data
        val model = CommanModel()
        if (products?.get(position)!!.node.images.edges.size > 0) {
            model.imageurl = products?.get(position)!!.node.images.edges[0].node.transformedSrc
        }
        holder.binding.commondata = model
        holder.binding.clickproduct = Product()
    }

    override fun getItemCount(): Int {
        return products!!.size
    }

    fun getDiscount(regular: Double, special: Double): Int {

        return ((regular - special) / regular * 100).toInt()
    }

    private fun getEdge(edges: List<Storefront.ProductVariantPricePairEdge>): Storefront.ProductVariantPricePairEdge? {
        var pairEdge: Storefront.ProductVariantPricePairEdge? = null
        try {
            for (i in edges.indices) {
                if (edges[i].node.price.currencyCode.toString() == presentmentcurrency) {
                    pairEdge = edges[i]
                    break
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return pairEdge
    }

    inner class Product {
        fun productClick(view: View, data: ListData) {
            val productintent = Intent(view.context, ProductView::class.java)
            productintent.putExtra("ID", data.product!!.id.toString())
            productintent.putExtra("tittle", data.textdata)
            productintent.putExtra("product", data.product)
            view.context.startActivity(productintent)
        }
    }
}
