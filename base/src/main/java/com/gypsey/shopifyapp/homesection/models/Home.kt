package com.gypsey.shopifyapp.homesection.models

import android.content.Intent
import android.util.Base64
import android.view.View

import com.gypsey.shopifyapp.basesection.activities.Weblink
import com.gypsey.shopifyapp.productsection.activities.ProductList
import com.gypsey.shopifyapp.productsection.activities.ProductView

import java.io.UnsupportedEncodingException
import java.nio.charset.Charset

class Home {
    var link_to: String? = null
    var id: String? = null

    fun Click(view: View, home: Home) {
        when (home.link_to) {
            "collections" -> {
                val collection = "gid://shopify/Collection/" + home.id!!
                val intent = Intent(view.context, ProductList::class.java)
                intent.putExtra("ID", getBase64Encode(collection))
                intent.putExtra("tittle", " ")
                view.context.startActivity(intent)
            }
            "products" -> {
                val product = "gid://shopify/Product/" + home.id!!
                val prod_link = Intent(view.context, ProductView::class.java)
                prod_link.putExtra("ID", getBase64Encode(product))
                view.context.startActivity(prod_link)
            }
            "web_url" -> {
                val weblink = Intent(view.context, Weblink::class.java)
                weblink.putExtra("link", home.id)
                weblink.putExtra("name", " ")
                view.context.startActivity(weblink)
            }
        }
    }

    fun getBase64Encode(id: String): String {
        var id = id
        val data = Base64.encode(id.toByteArray(), Base64.DEFAULT)
        try {
            id = String(data, Charset.defaultCharset()).trim { it <= ' ' }
        } catch (e: UnsupportedEncodingException) {
            e.printStackTrace()
        }

        return id
    }
}
