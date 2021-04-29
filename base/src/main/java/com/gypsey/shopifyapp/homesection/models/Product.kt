package com.gypsey.shopifyapp.homesection.models

import android.content.Intent
import android.view.View

import com.gypsey.shopifyapp.basesection.models.ListData
import com.gypsey.shopifyapp.productsection.activities.ProductView

class Product {
    fun productClick(view: View, data: ListData) {
        val productintent = Intent(view.context, ProductView::class.java)
        productintent.putExtra("ID", data.product!!.id.toString())
        productintent.putExtra("tittle", data.textdata)
        productintent.putExtra("product", data.product)
        view.context.startActivity(productintent)
    }
}
