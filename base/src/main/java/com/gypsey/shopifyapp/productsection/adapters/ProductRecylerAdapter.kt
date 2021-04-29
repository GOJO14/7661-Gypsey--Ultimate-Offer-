package com.gypsey.shopifyapp.productsection.adapters

import android.app.Activity
import android.content.Intent
import android.graphics.Paint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.gypsey.shopifyapp.databinding.MProductitemBinding
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.JsonElement
import com.gypsey.shopifyapp.MyApplication
import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.basesection.models.CommanModel
import com.gypsey.shopifyapp.basesection.models.ListData
import com.gypsey.shopifyapp.network_transaction.CustomResponse
import com.gypsey.shopifyapp.network_transaction.doRetrofitCall
import com.gypsey.shopifyapp.productsection.activities.ProductView
import com.gypsey.shopifyapp.productsection.viewholders.ProductItem
import com.gypsey.shopifyapp.quickadd_section.activities.QuickAddActivity
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.utils.AESEnDecryption
import com.gypsey.shopifyapp.utils.CurrencyFormatter
import com.gypsey.shopifyapp.utils.Urls
import com.shopify.graphql.support.ID
import io.reactivex.disposables.CompositeDisposable
import org.json.JSONObject
import java.math.BigDecimal
import javax.inject.Inject

class ProductRecylerAdapter @Inject
constructor() : RecyclerView.Adapter<ProductItem>() {
    private var layoutInflater: LayoutInflater? = null
    lateinit var products: MutableList<Storefront.ProductEdge>
    private var activity: Activity? = null
    private var repository:Repository?=null
    var presentmentcurrency: String? = null
    private val disposables = CompositeDisposable()

    fun setData(products: List<Storefront.ProductEdge>?, activity: Activity,repository: Repository) {
        this.products = products as MutableList<Storefront.ProductEdge>
        this.activity = activity
        this.repository=repository
    }

    init {
        setHasStableIds(true)
    }

    override fun getItemViewType(position: Int): Int {
        var viewtype = 0
        if (!products[position].node.availableForSale) {
            viewtype = -1
        }
        return viewtype
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItem {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        val binding = DataBindingUtil.inflate<MProductitemBinding>(layoutInflater!!, R.layout.m_productitem, parent, false)
        return ProductItem(binding)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: ProductItem, position: Int) {
        val variant = this.products[position].node.variants.edges[0].node
        val data = ListData()
        Log.i("MageNative", "Product ID" + this.products[position].node.id)
        data.product = this.products[position].node
        data.textdata = this.products[position].node.title
        data.description = this.products[position].node.description
        var edge:Storefront.ProductVariantPricePairEdge?=null;
        if (presentmentcurrency == "nopresentmentcurrency") {
            data.regularprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
            if (variant.compareAtPriceV2 != null) {
                val special = java.lang.Double.valueOf(variant.compareAtPriceV2.amount)
                val regular = java.lang.Double.valueOf(variant.priceV2.amount)
                if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                    data.regularprice = CurrencyFormatter.setsymbol(variant.compareAtPriceV2.amount, variant.compareAtPriceV2.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
                    data.offertext = getDiscount(special, regular).toString() + "%off"

                } else {
                    data.regularprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(variant.compareAtPriceV2.amount, variant.compareAtPriceV2.currencyCode.toString())
                    data.offertext = getDiscount(regular, special).toString() + "%off"
                }
                holder.binding!!.regularprice.paintFlags = holder.binding!!.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                holder.binding!!.specialprice.visibility = View.VISIBLE
                holder.binding!!.offertext.visibility = View.VISIBLE
                holder.binding!!.offertext.setTextColor(activity!!.resources.getColor(R.color.green))
            } else {
                holder.binding!!.specialprice.visibility = View.GONE
                holder.binding!!.offertext.visibility = View.GONE
                holder.binding!!.regularprice.paintFlags = holder.binding!!.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        } else {
             edge = getEdge(variant.presentmentPrices.edges)
            data.regularprice = CurrencyFormatter.setsymbol(edge!!.node.price.amount, edge.node.price.currencyCode.toString())
            if (variant.compareAtPriceV2 != null) {
                val special = java.lang.Double.valueOf(edge.node.compareAtPrice.amount)
                val regular = java.lang.Double.valueOf(edge.node.price.amount)
                if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                    data.regularprice = CurrencyFormatter.setsymbol(edge.node.compareAtPrice.amount, edge.node.compareAtPrice.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(edge.node.price.amount, edge.node.price.currencyCode.toString())
                    data.offertext = getDiscount(special, regular).toString() + "%off"

                } else {
                    data.regularprice = CurrencyFormatter.setsymbol(edge.node.price.amount, edge.node.price.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(edge.node.compareAtPrice.amount, edge.node.compareAtPrice.currencyCode.toString())
                    data.offertext = getDiscount(regular, special).toString() + "%off"
                }
                holder.binding!!.regularprice.paintFlags = holder.binding!!.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                holder.binding!!.specialprice.visibility = View.VISIBLE
                holder.binding!!.offertext.visibility = View.VISIBLE
                holder.binding!!.offertext.setTextColor(activity!!.resources.getColor(R.color.green))
            } else {
                holder.binding!!.specialprice.visibility = View.GONE
                holder.binding!!.offertext.visibility = View.GONE
                holder.binding!!.regularprice.paintFlags = holder.binding!!.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }
        holder.binding!!.listdata = data
        val model = CommanModel()
        if (this.products[position].node.images.edges.size > 0) {
            model.imageurl = this.products[position].node.images.edges[0].node.transformedSrc
        }
        holder.binding!!.commondata = model
        holder.binding!!.clickproduct = Product(position)

        getProductOffers(this.products[position].node.id,edge!!.node.price.amount,holder);
    }

    override fun getItemCount(): Int {
        return products.size
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

    fun getProductOffers(id: ID, amount: String, holder: ProductItem) {
        var map: HashMap<String, String> = LinkedHashMap()
        var totalPrice = 0.0f;
        val dataList = repository!!.allCartItems
        val size = dataList.size
        /*********************************************************************************************************************/
        try {
            map.put("shop", Urls((MyApplication.context))!!.shopdomain)
            if (repository!!.isLogin) {
                Log.i("customeridtest", "" + repository!!.allUserData[0].customer_id);
                Log.i("customeridtest", "" + AESEnDecryption().getBase64Decode(repository!!.allUserData[0].customer_id));
                map.put("customer[id]", AESEnDecryption().getBase64Decode(repository!!.allUserData[0].customer_id).toString())
                map.put("customer[email]", repository!!.allUserData[0].email.toString())
                map.put("customer[tags][0]", Urls.TAGS)
            }


            Log.d("productdata", "" + size)

            for (i in 0 until size) {
                totalPrice = totalPrice.plus(dataList[i].price.toFloat())
                map.put("cart_items[$i][product_id]", AESEnDecryption().getBase64Decode(dataList[i].product_id).toString())
                map.put("cart_items[$i][variant_id]", AESEnDecryption().getBase64Decode(dataList[i].variant_id).toString())
                map.put("cart_items[$i][quantity]", dataList[i].qty.toString())
                map.put("cart_items[$i][price]", dataList[i].price)
            }
            map.put("total_orignal_price", totalPrice.toString())
            map.put("total_price", totalPrice.toString())
            map.put("product[id]", AESEnDecryption().getBase64Decode(id.toString()).toString())
            map.put("product[price]", amount.removePrefix("ZAR"))
            map.put("page_type", "product")

        } catch (e: Exception) {
            e.printStackTrace()
        }

        /*********************************************************************************************************************/
        Log.d("productdata adapter", "" + map)
        if (size>0){
            activity?.let {
                doRetrofitCall(repository!!.getProductsWihTags(map), disposables, customResponse = object : CustomResponse {
                    override fun onSuccessRetrofit(result: JsonElement) {
                        Log.d("result success", "" + result)
                        val jsondata = JSONObject(result.toString())
                        if (jsondata.getJSONObject("data").getJSONArray("actions").length()>0){
                            holder!!.binding!!.saletag.visibility = View.VISIBLE
                        }else{
                            holder!!.binding!!.saletag.visibility = View.GONE
                        }
                    }

                    override fun onErrorRetrofit(error: Throwable) {
                        Log.d("result error", "" + error)
                    }
                }, context = it)
            }
        }
    }
    inner class Product(var position: Int) {
        fun productClick(view: View, data: ListData) {
            val productintent = Intent(view.context, ProductView::class.java)
            productintent.putExtra("ID", data.product!!.id.toString())
            productintent.putExtra("tittle", data.textdata)
            productintent.putExtra("product", data.product)
            view.context.startActivity(productintent)
        }
        fun addCart(view: View, data: ListData){
            var customQuickAddActivity = QuickAddActivity(context = activity!!, theme = R.style.WideDialogFull, product_id = data.product!!.id.toString(), repository = repository!!)
            customQuickAddActivity.show()
        }
    }
}
