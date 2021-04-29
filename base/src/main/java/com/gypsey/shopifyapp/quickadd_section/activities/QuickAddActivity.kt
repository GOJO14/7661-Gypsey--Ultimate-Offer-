package com.gypsey.shopifyapp.quickadd_section.activities

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.Storefront
import com.shopify.graphql.support.Error
import com.shopify.graphql.support.ID
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.cartsection.activities.CartList
import com.gypsey.shopifyapp.cartsection.viewmodels.CartListViewModel
import com.gypsey.shopifyapp.databinding.ActivityQuickAddBinding
import com.gypsey.shopifyapp.dbconnection.entities.CartItemData
import com.gypsey.shopifyapp.network_transaction.CustomResponse
import com.gypsey.shopifyapp.network_transaction.doGraphQLQueryGraph
import com.gypsey.shopifyapp.productsection.models.VariantData
import com.gypsey.shopifyapp.quickadd_section.adapter.QuickVariantAdapter
import com.gypsey.shopifyapp.quickadd_section.adapter.QuickVariantAdapter.Companion.selectedPosition
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.shopifyqueries.Query
import com.gypsey.shopifyapp.utils.GraphQLResponse
import com.gypsey.shopifyapp.utils.Status
import com.gypsey.shopifyapp.wishlistsection.activities.WishList
import com.gypsey.shopifyapp.wishlistsection.adapters.WishListAdapter
import com.gypsey.shopifyapp.wishlistsection.viewmodels.WishListViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class QuickAddActivity(var cartListViewModel: CartListViewModel? = null,context: Context, var activity: Context? = null, theme: Int, var product_id: String, var repository: Repository, var wishListViewModel: WishListViewModel? = null, var position: Int? = null, var wishlistData: MutableList<Storefront.Product>? = null) : BottomSheetDialog(context, theme) {
    lateinit var binding: ActivityQuickAddBinding
    private val TAG = "QuickAddActivity"
    lateinit var app: MyApplication
    var variant_id: String? = null
    var variant_price: String = ""
    var product_title: String = ""
    var product_price: String = ""
    var bottomSheetDialog: BottomSheetDialog? = null
    lateinit var quickVariantAdapter: QuickVariantAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.activity_quick_add, null, false)
        setContentView(binding.root)
        this.window?.setBackgroundDrawableResource(android.R.color.transparent)
        bottomSheetDialog = this
        initView()

    }


    private fun initView() {
        quickVariantAdapter = QuickVariantAdapter()
        doGraphQLQueryGraph(repository, Query.getProductById(product_id!!), customResponse = object : CustomResponse {
            override fun onSuccessQuery(result: GraphCallResult<Storefront.QueryRoot>) {
                invoke(result)
            }
        }, context = context)
        binding.handler = VariantClickHandler()
        setPresentmentCurrencyForModel()

    }

    private fun setPresentmentCurrencyForModel() {
        try {
            val runnable = Runnable {
                if (repository.localData[0].currencycode == null) {
                    quickVariantAdapter.presentmentcurrency = "nopresentmentcurrency"
                } else {
                    quickVariantAdapter.presentmentcurrency = repository.localData[0].currencycode
                }
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun invoke(result: GraphCallResult<Storefront.QueryRoot>) {
        if (result is GraphCallResult.Success<*>) {
            consumeResponse(GraphQLResponse.success(result as GraphCallResult.Success<*>))
        } else {
            consumeResponse(GraphQLResponse.error(result as GraphCallResult.Failure))
        }
    }

    private fun consumeResponse(reponse: GraphQLResponse) {
        when (reponse.status) {
            Status.SUCCESS -> {
                val result = (reponse.data as GraphCallResult.Success<Storefront.QueryRoot>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                    Toast.makeText(context, "" + errormessage, Toast.LENGTH_SHORT).show()
                } else {
                    var productedge: Storefront.Product? = null
                    productedge = result.data!!.node as Storefront.Product
                    // a.previewImage

                    Log.i("MageNative", "Product_id" + productedge!!.id.toString())
                    setProductData(productedge)
                }
            }
            Status.ERROR -> Toast.makeText(context, reponse.error!!.error.message, Toast.LENGTH_SHORT).show()
            else -> {
            }
        }
    }

    private fun setProductData(productedge: Storefront.Product) {
        quickVariantAdapter.setData(productedge.variants.edges, context, itemClick = object : QuickVariantAdapter.ItemClick {
            override fun variantSelection(variantData: VariantData) {
                variant_id = variantData.variant_id
                product_title = productedge.title
                product_price = productedge.variants.edges[0].node.priceV2.amount.toString()
                Log.d(TAG, "variantSelection: " + variantData.variant_id+" "+productedge.title+" "+product_id+" "+product_price)
            }
        })
        binding.variantList.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        selectedPosition = -1
        binding.variantList.adapter = quickVariantAdapter

    }

    fun addToCart(variantId: String, quantity: Int,product_id: String,product_title:String,price:String) {
        try {
            val runnable = Runnable {
                val data: CartItemData
                if (repository.getSingLeItem(variantId) == null) {
                    data = CartItemData()
                    data.variant_id = variantId
                    data.qty = quantity
                    data.product_title =product_title
                    data.product_id=product_id
                    data.price=price
                    repository.addSingLeItem(data)
                } else {
                    data = repository.getSingLeItem(variantId)
                    val qt = data.qty
                    data.qty = qt + quantity
                    data.product_title =product_title
                    data.product_id=product_id
                    data.price=price
                    repository.updateSingLeItem(data)
                }
                Log.i("MageNative", "CartCount : " + repository.allCartItems.size)


            }
            Thread(runnable).start()

            Log.d("cartListViewModel","out "+cartListViewModel);

            if (cartListViewModel !=null){
                Log.d("cartListViewModel","In");
                cartListViewModel!!.Response();
            }

            if (wishListViewModel != null) {
                if (activity is WishList) {
                    wishListViewModel!!.deleteData(product_id)
                    wishlistData!!.removeAt(position!!)
                    (activity as WishList).adapter.notifyItemRemoved(position!!)
                    (activity as WishList).adapter.notifyItemRangeChanged(position!!, wishlistData!!.size)
                    wishListViewModel!!.update(true)
                    (activity as WishList).invalidateOptionsMenu()
                }
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    inner class VariantClickHandler {
        var quantity: Int = 1
        fun addcart(view: View) {
            if (variant_id == null) {
                Toast.makeText(view.context, view.context.resources.getString(R.string.selectvariant), Toast.LENGTH_LONG).show()
            } else {
                addToCart(variant_id!!, quantity, product_id,product_title,product_price)
                Toast.makeText(context, context.getString(R.string.successcart), Toast.LENGTH_LONG).show()
                bottomSheetDialog?.dismiss()
            }
        }

        fun closeDialog(view: View) {
            bottomSheetDialog?.dismiss()
        }

        fun decrease(view: View) {
            if ((binding.quantity.text.toString()).toInt() > 1) {
                quantity--
                binding.quantity.text = quantity.toString()
            }
        }

        fun increase(view: View) {
            quantity++
            binding.quantity.text = quantity.toString()
        }
    }
}