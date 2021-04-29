package com.gypsey.shopifyapp.homesection.adapters

import android.content.Intent
import android.view.View
import com.gypsey.shopifyapp.basesection.models.ListData
import com.gypsey.shopifyapp.productsection.activities.ProductView

class ProductListAdapter {

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
