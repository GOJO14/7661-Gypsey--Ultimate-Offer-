package com.gypsey.shopifyapp.wishlistsection.viewmodels

import android.content.Context
import android.util.Base64
import android.util.Log
import android.widget.Toast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.Storefront
import com.shopify.graphql.support.Error
import com.shopify.graphql.support.ID

import com.gypsey.shopifyapp.dbconnection.entities.CartItemData
import com.gypsey.shopifyapp.dbconnection.entities.ItemData
import com.gypsey.shopifyapp.homesection.adapters.ProductListSliderAdapter
import com.gypsey.shopifyapp.homesection.adapters.ProductSliderGridAdapter
import com.gypsey.shopifyapp.homesection.adapters.ProductSliderListAdapter
import com.gypsey.shopifyapp.network_transaction.CustomResponse
import com.gypsey.shopifyapp.network_transaction.doGraphQLQueryGraph
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.shopifyqueries.Query
import com.gypsey.shopifyapp.utils.GraphQLResponse
import com.gypsey.shopifyapp.utils.Status
import com.gypsey.shopifyapp.utils.WishListDbResponse
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.nio.charset.Charset

import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

class WishListViewModel(var repository: Repository) : ViewModel() {
    private val data = MutableLiveData<WishListDbResponse>()
    private val wishListData = MutableLiveData<MutableList<Storefront.Product>>()
    val message = MutableLiveData<String>()
    private val changes = MutableLiveData<Boolean>()
    lateinit var context: Context
    val cartCount: Int
        get() {
            val count = intArrayOf(0)
            try {
                val executor = Executors.newSingleThreadExecutor()
                val callable = Callable {
                    if (repository.allCartItems.size > 0) {
                        count[0] = repository.allCartItems.size
                    }
                    count[0]
                }
                val future = executor.submit(callable)
                count[0] = future.get()
                executor.shutdown()
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return count[0]
        }

    fun getToastMessage(): MutableLiveData<String> {
        return message;
    }

    val wishListCount: Int
        get() {
            val count = intArrayOf(0)
            try {
                val executor = Executors.newSingleThreadExecutor()
                val callable = Callable {
                    if (repository.wishListData.size > 0) {
                        count[0] = repository.wishListData.size
                    }
                    count[0]
                }
                val future = executor.submit(callable)
                count[0] = future.get()
                executor.shutdown()
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return count[0]
        }

    fun Response(): MutableLiveData<MutableList<Storefront.Product>> {
        FetchData()
        return wishListData
    }

    fun updateResponse(): MutableLiveData<Boolean> {
        return changes
    }

    private fun FetchData() {
        try {
            val runnable = Runnable {
                if (repository.wishListData.size > 0) {
                    Log.i("MageNative", "inwish")
                    Log.i("MageNative", "wish count 3 : " + repository.wishListData.size)
                    var product_ids = ArrayList<ID>()
                    val edges = mutableListOf<Storefront.Product>()
                    for (i in 0..repository.wishListData.size - 1) {
                        product_ids.add(ID(repository.wishListData[i].product_id))
                    }
                    getAllProductsById(product_ids, edges)
                } else {
                    Log.i("MageNative", "nowish")
                    GlobalScope.launch(Dispatchers.Main) {
                        message.value = "No Data in WishList"
                    }
                }
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun getAllProductsById(productIds: ArrayList<ID>, edges: MutableList<Storefront.Product>) {
        doGraphQLQueryGraph(repository, Query.getAllProductsByID(productIds), customResponse = object : CustomResponse {
            override fun onSuccessQuery(result: GraphCallResult<Storefront.QueryRoot>) {
                if (result is GraphCallResult.Success<*>) {
                    consumeResponse(GraphQLResponse.success(result as GraphCallResult.Success<*>), edges, productIds)
                } else {
                    consumeResponse(GraphQLResponse.error(result as GraphCallResult.Failure), edges, productIds)
                }
            }
        }, context = context)
    }

    private fun consumeResponse(reponse: GraphQLResponse, edges: MutableList<Storefront.Product>, productIds: ArrayList<ID>) {
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
                    Log.i("MageNatyive", "ERROR" + errormessage.toString())
                    message.setValue(errormessage.toString())
                } else {
                    try {
                        for (i in 0..result.data!!.nodes.size - 1) {
                            edges.add(result.data!!.nodes[i] as Storefront.Product)
                        }
                        if (edges.size == productIds.size) {
                            filterProduct(edges)
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                        when (context!!.getPackageName()) {
                            "com.gypsey.shopifyapp" -> {
                                Toast.makeText(context, "Please Provide Visibility to Products and Collections", Toast.LENGTH_LONG).show()
                            }
                        }
                    }
                }
            }
            Status.ERROR -> {
                Log.i("MageNatyive", "ERROR-1" + reponse.error!!.error.message)
                message.setValue(reponse.error!!.error.message)
            }
        }
    }

    private fun filterProduct(edges: MutableList<Storefront.Product>) {
        repository.getProductListSlider(edges)
                .subscribeOn(Schedulers.io())
                .filter { x -> x.availableForSale }
                .toList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { result -> wishListData.value = result }
    }

    fun deleteData(variant_id: String) {
        try {
            val runnable = Runnable {
                try {
                    val data = repository.getSingleData(variant_id)
                    repository.deleteSingleData(data)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun addToCart(variantId: String) {
        try {
            val runnable = Runnable {
                val data: CartItemData
                if (repository.getSingLeItem(variantId) == null) {
                    data = CartItemData()
                    data.variant_id = variantId
                    data.qty = 1
                    repository.addSingLeItem(data)
                } else {
                    data = repository.getSingLeItem(variantId)
                    val qty = data.qty + 1
                    data.qty = qty
                    repository.updateSingLeItem(data)
                }
                Log.i("MageNative", "CartCount : " + repository.allCartItems.size)
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun update(value: Boolean) {
        changes.value = value
    }

    private fun getProductID(id: String?): String? {
        var cat_id: String? = null
        try {
            val data = Base64.encode(("gid://shopify/Product/" + id!!).toByteArray(), Base64.DEFAULT)
            cat_id = String(data, Charset.defaultCharset()).trim { it <= ' ' }
            Log.i("MageNatyive", "ProductSliderID :$id " + cat_id)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return cat_id
    }
}
