package com.gypsey.shopifyapp.cartsection.adapters

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView


import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.databinding.MCartitemBinding
import com.gypsey.shopifyapp.basesection.models.CommanModel
import com.gypsey.shopifyapp.cartsection.models.CartListItem
import com.gypsey.shopifyapp.cartsection.viewholders.CartItem
import com.gypsey.shopifyapp.cartsection.viewmodels.CartListViewModel
import com.gypsey.shopifyapp.utils.CurrencyFormatter

import java.math.BigDecimal

import javax.inject.Inject

class CartListAdapter @Inject constructor() : RecyclerView.Adapter<CartItem>() {
    var data: MutableList<Storefront.CheckoutLineItemEdge>? = null
    private var layoutInflater: LayoutInflater? = null
    private var model: CartListViewModel? = null

    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartItem {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        val binding = DataBindingUtil.inflate<MCartitemBinding>(layoutInflater!!, R.layout.m_cartitem, parent, false)
        return CartItem(binding)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: CartItem, position: Int) {
        val item = CartListItem()
        item.position = position
        item.product_id = data?.get(position)!!.node.variant.product.id.toString()
        item.variant_id = data?.get(position)!!.node.variant.id.toString()
        item.productname = data?.get(position)!!.node.title
        val variant = data?.get(position)!!.node.variant
        item.normalprice = CurrencyFormatter.setsymbol(variant.presentmentPrices.edges[0].node.price.amount, variant.presentmentPrices.edges[0].node.price.currencyCode.toString())
        if (variant.compareAtPriceV2 != null) {
            val special = java.lang.Double.valueOf(variant.presentmentPrices.edges[0].node.compareAtPrice.amount)
            val regular = java.lang.Double.valueOf(variant.presentmentPrices.edges[0].node.price.amount)
            if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                item.normalprice = CurrencyFormatter.setsymbol(variant.presentmentPrices.edges[0].node.compareAtPrice.amount, variant.presentmentPrices.edges[0].node.compareAtPrice.currencyCode.toString())
                item.specialprice = CurrencyFormatter.setsymbol(variant.presentmentPrices.edges[0].node.price.amount, variant.presentmentPrices.edges[0].node.price.currencyCode.toString())
                item.offertext = getDiscount(special, regular).toString() + "%off"

            } else {
                item.normalprice = CurrencyFormatter.setsymbol(variant.presentmentPrices.edges[0].node.price.amount, variant.presentmentPrices.edges[0].node.price.currencyCode.toString())
                item.specialprice = CurrencyFormatter.setsymbol(variant.presentmentPrices.edges[0].node.compareAtPrice.amount, variant.presentmentPrices.edges[0].node.compareAtPrice.currencyCode.toString())
                item.offertext = getDiscount(regular, special).toString() + "%off"
            }
            holder.binding.regularprice.paintFlags = holder.binding.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            holder.binding.specialprice.visibility = View.VISIBLE
            holder.binding.offertext.visibility = View.VISIBLE
            holder.binding.offertext.setTextColor(holder.binding.offertext.context.resources.getColor(R.color.green))
        } else {
            holder.binding.specialprice.visibility = View.GONE
            holder.binding.offertext.visibility = View.GONE
            holder.binding.regularprice.paintFlags = holder.binding.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }
        val model = CommanModel()
        model.imageurl = variant?.image?.originalSrc
        holder.binding.commondata = model
        item.image = variant?.image?.originalSrc
        item.qty = data?.get(position)!!.node.quantity!!.toString()
        holder.binding.name.textSize = 12f
        holder.binding.specialprice.textSize = 13f
        holder.binding.regularprice.textSize = 11f
        holder.binding.offertext.textSize = 11f
        holder.binding.variantOne.textSize = 11f
        holder.binding.variantTwo.textSize = 11f
        holder.binding.variantThree.textSize = 11f
        holder.binding.remove.textSize = 11f
        holder.binding.movetowish.textSize = 11f
        holder.binding.quantity.textSize = 11f
        holder.binding.handlers = ClickHandlers()
        setVariants(item, holder, variant.selectedOptions)

    }

    private fun setVariants(item: CartListItem, holder: CartItem, selectedOptions: List<Storefront.SelectedOption>) {
        try {
            val iterator1 = selectedOptions.iterator()
            var counter = 0
            var option: Storefront.SelectedOption
            while (iterator1.hasNext()) {
                counter = counter + 1
                option = iterator1.next()
                if (!option.value.equals("Default Title", true)) {
                    val finalvalue = option.name + " : " + option.value
                    if (counter == 1) {
                        item.variant_one = finalvalue
                    }
                    if (counter == 2) {
                        item.variant_two = finalvalue
                    }
                    if (counter == 3) {
                        item.variant_three = finalvalue
                    }
                    if (counter > 3) {
                        break
                    }
                }
            }
            holder.binding.variantdata = item
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun getItemCount(): Int {
        return data!!.size
    }

    fun setData(data: MutableList<Storefront.CheckoutLineItemEdge>, model: CartListViewModel?) {
        this.data = data
        this.model = model
    }

    fun getDiscount(regular: Double, special: Double): Int {
        return ((regular - special) / regular * 100).toInt()
    }

    inner class ClickHandlers {
        fun moveToWishList(view: View, item: CartListItem) {
            model!!.moveToWishList(item)
            data!!.removeAt(item.position)
            notifyItemRemoved(item.position)
            notifyItemRangeChanged(item.position, data!!.size)
        }

        fun removeFromCart(view: View, item: CartListItem) {
            model!!.removeFromCart(item)
            data!!.removeAt(item.position)
            notifyItemRemoved(item.position)
            notifyItemRangeChanged(item.position, data!!.size)
        }

        fun increase(view: View, item: CartListItem) {
            item.qty = (Integer.parseInt(item.qty!!) + 1).toString()
            model!!.updateCart(item)
            model!!.getCartOffers()
        }

        fun decrease(view: View, item: CartListItem) {
            if (Integer.parseInt(item.qty!!) == 1) {
                model!!.removeFromCart(item)
                data!!.removeAt(item.position)
                notifyItemRemoved(item.position)
                notifyItemRangeChanged(item.position, data!!.size)

            } else {
                item.qty = (Integer.parseInt(item.qty!!) - 1).toString()
                model!!.updateCart(item)
            }
            model!!.getCartOffers()

        }
    }
}
