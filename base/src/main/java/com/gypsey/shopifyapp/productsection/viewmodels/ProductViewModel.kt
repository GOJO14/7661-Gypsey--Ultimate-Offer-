package com.gypsey.shopifyapp.productsection.viewmodels

import android.content.Context
import android.util.Base64
import android.util.Log

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.JsonElement
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.basesection.models.ListData

import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.dbconnection.entities.CartItemData
import com.gypsey.shopifyapp.dbconnection.entities.ItemData
import com.gypsey.shopifyapp.dependecyinjection.Body
import com.gypsey.shopifyapp.dependecyinjection.InnerData
import com.gypsey.shopifyapp.network_transaction.CustomResponse
import com.gypsey.shopifyapp.network_transaction.doGraphQLQueryGraph
import com.gypsey.shopifyapp.network_transaction.doRetrofitCall
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.shopifyqueries.Query
import com.gypsey.shopifyapp.utils.AESEnDecryption
import com.gypsey.shopifyapp.utils.ApiResponse
import com.gypsey.shopifyapp.utils.GraphQLResponse
import com.gypsey.shopifyapp.utils.Urls
import java.util.concurrent.Callable
import java.util.concurrent.Executors

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import me.jessyan.retrofiturlmanager.RetrofitUrlManager

class ProductViewModel(private val repository: Repository) : ViewModel() {
    var handle = ""
    var id = ""
    var presentmentCurrency: String? = null
    private val disposables = CompositeDisposable()
    private val responseLiveData = MutableLiveData<GraphQLResponse>()
    lateinit var context: Context
    val filteredlist = MutableLiveData<List<Storefront.ProductVariantEdge>>()
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

    fun Response(): MutableLiveData<GraphQLResponse> {
        if (!id.isEmpty()) {
            getProductsById()
        }
        if (!handle.isEmpty()) {
            getProductsByHandle()
        }
        return responseLiveData
    }

    private fun getProductsById() {
        try {
            doGraphQLQueryGraph(repository, Query.getProductById(id), customResponse = object : CustomResponse {
                override fun onSuccessQuery(result: GraphCallResult<Storefront.QueryRoot>) {
                    invoke(result)
                }
            }, context = context)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun getProductsByHandle() {
        try {
            doGraphQLQueryGraph(repository, Query.getProductByHandle(handle), customResponse = object : CustomResponse {
                override fun onSuccessQuery(result: GraphCallResult<Storefront.QueryRoot>) {
                    invoke(result)
                }
            }, context = context)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private operator fun invoke(result: GraphCallResult<Storefront.QueryRoot>): Unit {
        if (result is GraphCallResult.Success<*>) {
            responseLiveData.setValue(GraphQLResponse.success(result as GraphCallResult.Success<*>))
        } else {
            responseLiveData.setValue(GraphQLResponse.error(result as GraphCallResult.Failure))
        }
        return Unit
    }

    fun setPresentmentCurrencyForModel(): Boolean {
        val isadded = booleanArrayOf(false)
        try {
            val executor = Executors.newSingleThreadExecutor()
            val callable = Callable {
                if (repository.localData[0].currencycode == null) {
                    presentmentCurrency = "nopresentmentcurrency"
                } else {
                    presentmentCurrency = repository.localData[0].currencycode
                }
                isadded[0] = true
                isadded[0]
            }
            val future = executor.submit(callable)
            isadded[0] = future.get()
            executor.shutdown()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return isadded[0]
    }

    fun setWishList(product_id: String): Boolean {
        val isadded = booleanArrayOf(false)
        try {
            val executor = Executors.newSingleThreadExecutor()
            val callable = Callable {
                if (repository.getSingleData(product_id) == null) {
                    Log.i("MageNative", "WishListCount : " + repository.wishListData.size)
                    val data = ItemData()
                    data.product_id = product_id
                    repository.insertWishListData(data)
                    Log.i("MageNative", "WishListCount 2: " + repository.wishListData.size)
                    isadded[0] = true
                }
                isadded[0]
            }
            val future = executor.submit(callable)
            isadded[0] = future.get()
            executor.shutdown()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return isadded[0]
    }

    fun filterList(list: List<Storefront.ProductVariantEdge>) {
        try {
            disposables.add(repository.getList(list)
                    .subscribeOn(Schedulers.io())
                    .filter { x -> x.node.availableForSale }
                    .toList()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe { result -> filteredlist.setValue(result) })
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun onCleared() {
        disposables.clear()
    }

    public fun isInwishList(variantId: String): Boolean {
        val isadded = booleanArrayOf(false)
        try {
            val executor = Executors.newSingleThreadExecutor()
            val callable = Callable {
                if (repository.getSingleData(variantId) != null) {

                    Log.i("MageNative", "item already in wishlist : ")
                    isadded[0] = true
                }
                isadded[0]
            }
            val future = executor.submit(callable)
            isadded[0] = future.get()
            executor.shutdown()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return isadded[0]
    }

    fun addToCart(variantId: String, id: String, regularprice: String, title: String) {
        Log.d("addtocart", variantId + " " + id + " " + regularprice + " "+title)
        try {
            val runnable = Runnable {
                val data: CartItemData
                if (repository.getSingLeItem(variantId) == null) {
                    data = CartItemData()
                    data.variant_id = variantId
                    data.qty = 1
                    data.price = regularprice
                    data.product_id = id
                    data.product_title = title
                    repository.addSingLeItem(data)
                } else {
                    data = repository.getSingLeItem(variantId)
                    val qty = data.qty + 1
                    data.qty = qty
                    data.price = regularprice
                    data.product_id = id
                    data.product_title = title
                    repository.updateSingLeItem(data)
                }
                Log.i("MageNative", "CartCount : " + repository.allCartItems.size)
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private val api = MutableLiveData<ApiResponse>()
    fun getApiResponse(): MutableLiveData<ApiResponse> {
        return api
    }

    fun getRecommendations(id: String) {
        RetrofitUrlManager.getInstance().putDomain("douban", Urls.PERSONALISED);
        try {
            var query = InnerData()
            query.id = "query1"
            query.maxRecommendations = 8
            query.recommendationType = "similar_products"
            var list = mutableListOf<Long>()
            var s = String(Base64.decode(id, Base64.DEFAULT))
            list.add(s.replace("gid://shopify/Product/", "").toLong())
            query.productIds = list
            var body = Body()
            body.queries = mutableListOf(query)
            Log.i("Body", "" + list)
            doRetrofitCall(repository.getRecommendation(body), disposables, customResponse = object : CustomResponse {
                override fun onSuccessRetrofit(result: JsonElement) {
                    api.setValue(ApiResponse.success(result))
                }

                override fun onErrorRetrofit(error: Throwable) {
                    api.setValue(ApiResponse.error(error))
                }
            }, context = context)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private val productOfferLiveData = MutableLiveData<ApiResponse>()

    fun getProductOffersResponse(): MutableLiveData<ApiResponse> {
        return productOfferLiveData
    }

    fun getProductOffers(data: ListData) {
        var map: HashMap<String, String> = LinkedHashMap()
        var totalPrice = 0.0f;
        val dataList = repository.allCartItems
        val size = dataList.size
        /*********************************************************************************************************************/
        try {
            map.put("shop", Urls((MyApplication.context))!!.shopdomain)
            if (repository.isLogin) {
                Log.i("customeridtest", "" + repository.allUserData[0].customer_id);
                Log.i("customeridtest", "" + AESEnDecryption().getBase64Decode(repository.allUserData[0].customer_id));
                map.put("customer[id]", AESEnDecryption().getBase64Decode(repository.allUserData[0].customer_id).toString())
                map.put("customer[email]", repository.allUserData[0].email.toString())
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
            map.put("product[id]", AESEnDecryption().getBase64Decode(id).toString())
            map.put("product[price]", data.regularprice.toString().removePrefix("ZAR"))
            map.put("page_type", "product")

        } catch (e: Exception) {
            e.printStackTrace()
        }

        /*********************************************************************************************************************/
        Log.d("productdata ", "" + map)
        if (size>0){
            doRetrofitCall(repository.getProductsWihTags(map), disposables, customResponse = object : CustomResponse {
                override fun onSuccessRetrofit(result: JsonElement) {
                    Log.d("result success", "" + result)
                    productOfferLiveData.setValue(ApiResponse.success(result))
                }

                override fun onErrorRetrofit(error: Throwable) {
                    Log.d("result error", "" + error)
                    productOfferLiveData.setValue(ApiResponse.error(error))
                }
            }, context = context)
        }
    }


}
