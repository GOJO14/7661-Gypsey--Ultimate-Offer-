package com.gypsey.shopifyapp.productsection.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView

import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.databinding.MVariantoptionBinding
import com.gypsey.shopifyapp.basesection.models.CommanModel
import com.gypsey.shopifyapp.basesection.models.ListData
import com.gypsey.shopifyapp.productsection.models.VariantData
import com.gypsey.shopifyapp.productsection.viewholders.VariantItem
import com.gypsey.shopifyapp.productsection.viewmodels.ProductViewModel

import javax.inject.Inject

class VariantAdapter @Inject
constructor() : RecyclerView.Adapter<VariantItem>() {
    private var variants: List<Storefront.ProductVariantEdge>? = null
    private var model: ProductViewModel? = null
    private var data: ListData? = null
    private var layoutInflater: LayoutInflater? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VariantItem {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        val binding = DataBindingUtil.inflate<MVariantoptionBinding>(layoutInflater!!, R.layout.m_variantoption, parent, false)
        binding.selected1.textSize = 10f
        binding.selected2.textSize = 10f
        binding.selected3.textSize = 10f
        return VariantItem(binding)
    }

    override fun onBindViewHolder(holder: VariantItem, position: Int) {
        val model = CommanModel()
        model.imageurl = variants?.get(position)?.node?.image?.originalSrc
        holder.binding.commondata = model
        val data = VariantData()
        data.position = position
        data.variant_id = variants!![position].node.id.toString()
        data.variantimage = variants!![position]?.node?.image?.transformedSrc
        data.data = this.data
        data.model = this.model
        setVariants(data, holder, variants!![position].node.selectedOptions)
        if (variants!!.size == 1) {
            data.blockClick(holder.binding.mainView, data)
            holder.binding.mainView.visibility = View.GONE
            holder.binding.mainView.layoutParams = ViewGroup.LayoutParams(0, 0)
        } else {
            holder.binding.mainView.layoutParams = ViewGroup.LayoutParams(250, 250)
            holder.binding.mainView.visibility = View.VISIBLE
        }
    }

    private fun setVariants(data: VariantData, holder: VariantItem, selectedOptions: List<Storefront.SelectedOption>) {
        try {
            val iterator1 = selectedOptions.iterator()
            var counter = 0
            var option: Storefront.SelectedOption
            while (iterator1.hasNext()) {
                counter = counter + 1
                option = iterator1.next()
                val finalvalue = option.name + " : " + option.value
                if (counter == 1) {
                    data.selectedoption_one = finalvalue
                }
                if (counter == 2) {
                    data.selectedoption_two = finalvalue
                }
                if (counter == 3) {
                    data.selectedoption_three = finalvalue
                }
                if (counter > 3) {
                    break
                }
            }
            holder.binding.variantdata = data
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun getItemCount(): Int {
        return variants!!.size
    }

    fun setData(variants: List<Storefront.ProductVariantEdge>, model: ProductViewModel?, data: ListData?) {
        this.variants = variants
        this.model = model
        this.data = data
    }

    override fun getItemViewType(position: Int): Int {
        var viewtype = 0
        if (!variants!![position].node.availableForSale) {
            viewtype = -1
        }
        return viewtype
    }
}
