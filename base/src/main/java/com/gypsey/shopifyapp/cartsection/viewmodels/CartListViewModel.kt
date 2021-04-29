package com.gypsey.shopifyapp.cartsection.viewmodels

import android.content.Context
import android.util.Base64
import android.util.Log
import android.widget.Toast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.JsonElement

import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.Storefront
import com.shopify.graphql.support.Error
import com.shopify.graphql.support.ID
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.cartsection.activities.CartList
import com.gypsey.shopifyapp.cartsection.models.CartListItem
import com.gypsey.shopifyapp.dbconnection.entities.CustomerTokenData
import com.gypsey.shopifyapp.dbconnection.entities.ItemData
import com.gypsey.shopifyapp.dependecyinjection.Body
import com.gypsey.shopifyapp.dependecyinjection.InnerData
import com.gypsey.shopifyapp.homesection.adapters.ProductListSliderAdapter
import com.gypsey.shopifyapp.homesection.adapters.ProductSliderAdapter
import com.gypsey.shopifyapp.homesection.adapters.ProductSliderGridAdapter
import com.gypsey.shopifyapp.homesection.adapters.ProductSliderListAdapter
import com.gypsey.shopifyapp.network_transaction.CustomResponse
import com.gypsey.shopifyapp.network_transaction.doGraphQLMutateGraph
import com.gypsey.shopifyapp.network_transaction.doGraphQLQueryGraph
import com.gypsey.shopifyapp.network_transaction.doRetrofitCall
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.shopifyqueries.Mutation
import com.gypsey.shopifyapp.shopifyqueries.MutationQuery
import com.gypsey.shopifyapp.shopifyqueries.Query
import com.gypsey.shopifyapp.utils.*
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import me.jessyan.retrofiturlmanager.RetrofitUrlManager
import java.util.*

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import javax.inject.Inject
import kotlin.collections.ArrayList

class CartListViewModel(private val repository: Repository) : ViewModel() {
    private val data = MutableLiveData<Storefront.Checkout>()
    private val giftcard = MutableLiveData<Storefront.Mutation>()
    private val giftcardRemove = MutableLiveData<Storefront.Mutation>()
    private val discount = MutableLiveData<Storefront.Mutation>()
    private val api = MutableLiveData<ApiResponse>()
    private val youmayapi = MutableLiveData<ApiResponse>()
    private val disposables = CompositeDisposable()
    lateinit var context: CartList
    private val TAG = "CartListViewModel"
    private val responsedata = MutableLiveData<Storefront.Checkout>()
    private val cartOfferLiveData = MutableLiveData<ApiResponse>()
    private val invoiceUrlLiveData = MutableLiveData<ApiResponse>()
    private val sliderLiveData = MutableLiveData<GraphQLResponse>()
    @Inject
    lateinit var homeadapter: ProductSliderListAdapter
    @Inject
    lateinit var adapter: ProductSliderAdapter
    var presentmentCurrency: String? = null


    var customeraccessToken: CustomerTokenData
        get() {
            return repository.accessToken[0]
        }
        set(value) {}
    val message = MutableLiveData<String>()
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
    private val lineItems: List<Storefront.CheckoutLineItemInput>
        get() {
            val checkoutLineItemInputs = ArrayList<Storefront.CheckoutLineItemInput>()
            try {
                var itemInput: Storefront.CheckoutLineItemInput? = null
                val dataList = repository.allCartItems
                val size = dataList.size
                for (i in 0 until size) {
                    itemInput = Storefront.CheckoutLineItemInput(dataList[i].qty, ID(dataList[i].variant_id))
                    checkoutLineItemInputs.add(itemInput)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return checkoutLineItemInputs
        }
    val presentCurrency: String
        get() {
            val currency = arrayOf("nopresentmentcurrency")
            try {
                val executor = Executors.newSingleThreadExecutor()
                val callable = Callable {
                    if (repository.localData[0].currencycode != null) {
                        currency[0] = repository.localData[0].currencycode!!
                    }
                    currency[0]
                }
                val future = executor.submit(callable)
                currency[0] = future.get()
                executor.shutdown()
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return currency[0]
        }
    val wishListcount: Int
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
    val isLoggedIn: Boolean
        get() = repository.isLogin

    fun Response(): MutableLiveData<Storefront.Checkout> {
        return data
    }

    fun getGiftCard(): MutableLiveData<Storefront.Mutation> {
        return giftcard
    }

    fun getDiscount(): MutableLiveData<Storefront.Mutation> {
        return discount
    }

    fun getGiftCardRemove(): MutableLiveData<Storefront.Mutation> {
        return giftcardRemove
    }

    fun getApiResponse(): MutableLiveData<ApiResponse> {
        return api
    }

    fun getYouMAyAPiResponse(): MutableLiveData<ApiResponse> {
        return youmayapi
    }

    fun getassociatecheckoutResponse(): MutableLiveData<Storefront.Checkout> {
        return responsedata
    }


    fun associatecheckout(checkoutId: ID?, customerAccessToken: String?) {
        try {
            doGraphQLMutateGraph(repository, MutationQuery.checkoutCustomerAssociateV2(checkoutId, customerAccessToken), customResponse = object : CustomResponse {
                override fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {
                    invoke(result)
                }
            }, context = context)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun invoke(graphCallResult: GraphCallResult<Storefront.Mutation>) {
        if (graphCallResult is GraphCallResult.Success<*>) {
            consumeResponseassociate(GraphQLResponse.success(graphCallResult as GraphCallResult.Success<*>))
        } else {
            consumeResponseassociate(GraphQLResponse.error(graphCallResult as GraphCallResult.Failure))
        }
        return Unit
    }


    private fun consumeResponseassociate(response: GraphQLResponse) {
        when (response.status) {
            Status.SUCCESS -> {
                val result = (response.data as GraphCallResult.Success<Storefront.Mutation>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                    /*this.errormessage.setValue(errormessage.toString())*/
                } else {
                    /* val payload = result.data!!.checkoutCreate
                     if (payload.checkoutUserErrors.size > 0) {
                         val iterator = payload.checkoutUserErrors.iterator()
                         var error: Storefront.CheckoutUserError? = null
                         while (iterator.hasNext()) {
                             error = iterator.next() as Storefront.CheckoutUserError
                             message.setValue(error.message)
                         }
                         *//*errormessage.setValue(err)*//*
                    } else {*/
                    responsedata.setValue(result.data!!.getCheckoutCustomerAssociateV2().getCheckout())
                    /*}*/
                }
            }
            /*Status.ERROR -> errormessage.setValue(response.error!!.error.message)*/
            else -> {
            }
        }
    }

    fun prepareCart() {
        try {
            repository.allCartItemsLive.observe(context, androidx.lifecycle.Observer {
                val runnable = object : Runnable {
                    override fun run() {
                        val input = Storefront.CheckoutCreateInput()
                        input.lineItems = lineItems
                        try {
                            var currency_list = ArrayList<Storefront.CurrencyCode>()
                            if (presentCurrency != "nopresentmentcurrency") {
                                val currencyCode = Storefront.CurrencyCode.valueOf(presentCurrency)
                                input.presentmentCurrencyCode = currencyCode
                                currency_list.add(Storefront.CurrencyCode.valueOf(presentCurrency))
                            }


                            doGraphQLMutateGraph(repository, Mutation.createCheckout(input, currency_list), customResponse = object : CustomResponse {
                                override fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {
                                    invoke(result)
                                }
                            }, context = context)
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }

                    private operator fun invoke(result: GraphCallResult<Storefront.Mutation>): Unit {
                        if (result is GraphCallResult.Success<*>) {
                            consumeResponse(GraphQLResponse.success(result as GraphCallResult.Success<*>))
                        } else {
                            consumeResponse(GraphQLResponse.error(result as GraphCallResult.Failure))
                        }
                        return Unit
                    }
                }
                Thread(runnable).start()
                getCartOffers()
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun moveToWishList(item: CartListItem) {
        try {
            val runnable = Runnable {
                if (repository.getSingleData(item.product_id!!) == null) {
                    val data = ItemData()
                    data.product_id = item.product_id!!
                    repository.insertWishListData(data)
                    Log.i("MageNative", "WishListCount : " + repository.wishListData.size)
                }
                removeFromCart(item)
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun removeFromCart(item: CartListItem) {
        try {
            val runnable = Runnable {
                val data = repository.getSingLeItem(item.variant_id!!)
                repository.deleteSingLeItem(data)
                prepareCart()
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun updateCart(item: CartListItem) {
        try {
            val runnable = Runnable {
                val data = repository.getSingLeItem(item.variant_id!!)
                data.qty = Integer.parseInt(item.qty!!)
                repository.updateSingLeItem(data)
                prepareCart()
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun consumeResponse(response: GraphQLResponse) {
        try {
            when (response.status) {
                Status.SUCCESS -> {
                    val result = (response.data as GraphCallResult.Success<Storefront.Mutation>).response
                    if (result.hasErrors) {
                        val errors = result.errors
                        val iterator = errors.iterator()
                        val errormessage = StringBuilder()
                        var error: Error? = null
                        while (iterator.hasNext()) {
                            error = iterator.next()
                            errormessage.append(error.message())
                        }
                        message.setValue(errormessage.toString())
                    } else {
                        val payload = result.data!!.checkoutCreate
                        if (payload.checkoutUserErrors.size > 0) {
                            val iterator = payload.checkoutUserErrors.iterator()
                            var error: Storefront.CheckoutUserError? = null
                            while (iterator.hasNext()) {
                                error = iterator.next() as Storefront.CheckoutUserError
                                message.setValue(error.message)
                            }
                        } else {
                            val checkout = payload.checkout
                            getRecommendations(checkout)
                            getYouMayRecommendations(checkout)
                            data.setValue(checkout)
                        }
                    }
                }
                Status.ERROR -> message.setValue(response.error!!.error.message)
                else -> {
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getYouMayRecommendations(checkout: Storefront.Checkout) {
        RetrofitUrlManager.getInstance().putDomain("douban", Urls.PERSONALISED);
        try {
            var query = InnerData()
            query.id = "query1"
            query.maxRecommendations = 8
            query.recommendationType = "cross_sell"
            var list = mutableListOf<Long>()
            for (i in 0..checkout.lineItems.edges.size - 1) {
                var s = String(Base64.decode(checkout.lineItems.edges.get(i).node.variant.product.id.toString(), Base64.DEFAULT))
                list.add(s.replace("gid://shopify/Product/", "").toLong())
            }
            query.productIds = list
            var body = Body()
            body.queries = mutableListOf(query)
            Log.i("Body", "" + list)
            disposables.add(repository.getRecommendation(body)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({ result -> youmayapi.setValue(ApiResponse.success(result)) },
                            { throwable -> youmayapi.setValue(ApiResponse.error(throwable)) }
                    ))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getRecommendations(checkout: Storefront.Checkout) {
        RetrofitUrlManager.getInstance().putDomain("douban", Urls.PERSONALISED);
        try {
            var query = InnerData()
            query.id = "query1"
            query.maxRecommendations = 8
            query.recommendationType = "bought_together"
            var list = mutableListOf<Long>()
            for (i in 0..checkout.lineItems.edges.size - 1) {
                var s = String(Base64.decode(checkout.lineItems.edges.get(i).node.variant.product.id.toString(), Base64.DEFAULT))
                list.add(s.replace("gid://shopify/Product/", "").toLong())
            }
            query.productIds = list
            var body = Body()
            body.queries = mutableListOf(query)
            Log.i("Body", "" + list)
            disposables.add(repository.getRecommendation(body)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({ result -> api.setValue(ApiResponse.success(result)) },
                            { throwable -> api.setValue(ApiResponse.error(throwable)) }
                    ))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onCleared() {
        disposables.clear()
    }

    fun applyGiftCard(gift_card: String, checkoutId: ID?) {
        var list = ArrayList<String>()
        list.add(gift_card)
        doGraphQLMutateGraph(repository, MutationQuery.checkoutGiftCardsAppend(checkoutId, list), customResponse = object : CustomResponse {
            override fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {
                invokeGift(result)
            }
        }, context = context)


    }

    fun invokeGift(result: GraphCallResult<Storefront.Mutation>): Unit {
        if (result is GraphCallResult.Success<*>) {
            consumeResponseGift(GraphQLResponse.success(result as GraphCallResult.Success<*>))
        } else {
            consumeResponseGift(GraphQLResponse.error(result as GraphCallResult.Failure))
        }
        return Unit
    }

    private fun consumeResponseGift(response: GraphQLResponse) {
        when (response.status) {
            Status.SUCCESS -> {
                val result = (response.data as GraphCallResult.Success<Storefront.Mutation>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                } else {
                    val payload = result.data!!.checkoutGiftCardsAppend
                    if (payload.userErrors.size > 0) {
                        val iterator = payload.userErrors.iterator()
                        var error: Storefront.UserError? = null
                        while (iterator.hasNext()) {
                            error = iterator.next() as Storefront.UserError
                            message.setValue(error.message)
                        }
                    } else {
                        giftcard.setValue(result.data)

                    }
                }
            }
            /*Status.ERROR -> errormessage.setValue(response.error!!.error.message)*/
            else -> {
            }
        }
    }

    fun removeGiftCard(giftcardID: ID?, checkoutId: ID?) {
        doGraphQLMutateGraph(repository, MutationQuery.checkoutGiftCardsRemove(giftcardID, checkoutId), customResponse = object : CustomResponse {
            override fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {
                invokeGiftRemove(result)
            }
        }, context = context)

    }

    private fun invokeGiftRemove(result: GraphCallResult<Storefront.Mutation>) {
        if (result is GraphCallResult.Success<*>) {
            consumeResponseGiftRemove(GraphQLResponse.success(result as GraphCallResult.Success<*>))
        } else {
            consumeResponseGiftRemove(GraphQLResponse.error(result as GraphCallResult.Failure))
        }
    }

    private fun consumeResponseGiftRemove(response: GraphQLResponse) {
        when (response.status) {
            Status.SUCCESS -> {
                val result = (response.data as GraphCallResult.Success<Storefront.Mutation>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                } else {
                    val payload = result.data!!.checkoutGiftCardRemoveV2
                    if (payload.userErrors.size > 0) {
                        val iterator = payload.userErrors.iterator()
                        var error: Storefront.UserError? = null
                        while (iterator.hasNext()) {
                            error = iterator.next() as Storefront.UserError
                            message.setValue(error.message)
                        }
                    } else {
                        giftcardRemove.setValue(result.data)

                    }
                }
            }
            /*Status.ERROR -> errormessage.setValue(response.error!!.error.message)*/
            else -> {
            }
        }
    }

    fun applyDiscount(checkoutId: ID?, discount_code: String) {
        doGraphQLMutateGraph(repository, MutationQuery.checkoutDiscountCodeApply(checkoutId, discount_code), customResponse = object : CustomResponse {
            override fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {
                invokeDiscount(result)
            }
        }, context = context)
    }

    private fun invokeDiscount(result: GraphCallResult<Storefront.Mutation>) {
        if (result is GraphCallResult.Success<*>) {
            consumeResponseDiscount(GraphQLResponse.success(result as GraphCallResult.Success<*>))
        } else {
            consumeResponseDiscount(GraphQLResponse.error(result as GraphCallResult.Failure))
        }
    }

    private fun consumeResponseDiscount(response: GraphQLResponse) {
        when (response.status) {
            Status.SUCCESS -> {
                val result = (response.data as GraphCallResult.Success<Storefront.Mutation>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                } else {
                    val payload = result.data!!.checkoutDiscountCodeApplyV2
                    if (payload.userErrors.size > 0) {
                        val iterator = payload.userErrors.iterator()
                        var error: Storefront.UserError? = null
                        while (iterator.hasNext()) {
                            error = iterator.next() as Storefront.UserError
                            message.setValue(error.message)
                        }
                    } else {
                        discount.setValue(result.data)
                    }
                }
            }
            /*Status.ERROR -> errormessage.setValue(response.error!!.error.message)*/
            else -> {
            }
        }
    }

    fun getCartOffers() {
        var map: HashMap<String, String> = LinkedHashMap()

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

            var totalPrice = 0.0f;
            val dataList = repository.allCartItems
            Log.d("cartdata", "" + dataList[0].price)
            val size = dataList.size
            Log.d("cartdata", "" + size)

            for (i in 0 until size) {
                totalPrice = totalPrice.plus(dataList[i].price.toFloat())
                map.put("cart[items][$i][product_id]", AESEnDecryption().getBase64Decode(dataList[i].product_id).toString())
                map.put("cart[items][$i][variant_id]", AESEnDecryption().getBase64Decode(dataList[i].variant_id).toString())
                map.put("cart[items][$i][quantity]", dataList[i].qty.toString())
                map.put("cart[items][$i][price]", dataList[i].price)
                map.put("cart[items][$i][product_title]", dataList[i].product_title)
            }
            map.put("cart[item_count]", size.toString())
            map.put("cart[original_total_price]", totalPrice.toString())
            map.put("cart[total_price]", totalPrice.toString())
            map.put("page_type", "cart")

        } catch (e: Exception) {
            e.printStackTrace()
        }

        /*********************************************************************************************************************/

        Log.d("cartdata ", "" + map)

        doRetrofitCall(repository.getCartData(map), disposables, customResponse = object : CustomResponse {
            override fun onSuccessRetrofit(result: JsonElement) {
                Log.d("result success", "" + result)
                cartOfferLiveData.setValue(ApiResponse.success(result))
            }

            override fun onErrorRetrofit(error: Throwable) {
                Log.d("result error", "" + error)
                cartOfferLiveData.setValue(ApiResponse.error(error))
            }
        }, context = context)
    }

    fun getInvoiceUrl() {
        var map: HashMap<String, String> = LinkedHashMap()

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

            var totalPrice = 0.0f;
            val dataList = repository.allCartItems
            Log.d("cartdata", "" + dataList[0].price)
            val size = dataList.size
            Log.d("cartdata", "" + size)

            for (i in 0 until size) {
                totalPrice = totalPrice.plus(dataList[i].price.toFloat())
                map.put("cart[items][$i][product_id]", AESEnDecryption().getBase64Decode(dataList[i].product_id).toString())
                map.put("cart[items][$i][variant_id]", AESEnDecryption().getBase64Decode(dataList[i].variant_id).toString())
                map.put("cart[items][$i][quantity]", dataList[i].qty.toString())
                map.put("cart[items][$i][price]", dataList[i].price)
                map.put("cart[items][$i][product_title]", dataList[i].product_title)

                map.put("discounts[cart][items][$i][product_id]", AESEnDecryption().getBase64Decode(dataList[i].product_id).toString())
                map.put("discounts[cart][items][$i][variant_id]", AESEnDecryption().getBase64Decode(dataList[i].variant_id).toString())
                map.put("discounts[cart][items][$i][quantity]", dataList[i].qty.toString())
                map.put("discounts[cart][items][$i][price]", dataList[i].price)
                map.put("discounts[cart][items][$i][product_title]", dataList[i].product_title)
            }

            map.put("discounts[cart][item_count]", size.toString())
            map.put("discounts[cart][original_total_price]", totalPrice.toString())
            map.put("discounts[cart][total_price]", totalPrice.toString())

            map.put("page_type", "invoice")

        } catch (e: Exception) {
            e.printStackTrace()
        }

        /*********************************************************************************************************************/

        Log.d("invoicedata ", "" + map)

        doRetrofitCall(repository.getinvoiceurl(map), disposables, customResponse = object : CustomResponse {
            override fun onSuccessRetrofit(result: JsonElement) {
                Log.d("result success", "" + result)
                invoiceUrlLiveData.setValue(ApiResponse.success(result))
            }

            override fun onErrorRetrofit(error: Throwable) {
                Log.d("result error", "" + error)
                invoiceUrlLiveData.setValue(ApiResponse.error(error))
            }
        }, context = context)
    }

    fun getInvoiceUrlResponse():MutableLiveData<ApiResponse>{
        return  invoiceUrlLiveData
    }

    fun getCartOffersResponse(): MutableLiveData<ApiResponse> {
        return cartOfferLiveData
    }

    fun geSliderDataResponse(): MutableLiveData<GraphQLResponse> {
        return sliderLiveData
    }

    fun requestProdcutSliderData(productIds: ArrayList<ID>, edges: MutableList<Storefront.Product>, upselllist: RecyclerView) {
        setPresentmentCurrencyForModel()
        doGraphQLQueryGraph(repository, Query.getAllProductsByID(productIds), customResponse = object : CustomResponse {
            override fun onSuccessQuery(result: GraphCallResult<Storefront.QueryRoot>) {
                invokesproducts(result, edges, upselllist)
            }
        }, context = context)
    }

    private fun invokesproducts(graphCallResult: GraphCallResult<Storefront.QueryRoot>, edges: MutableList<Storefront.Product>, upselllist: RecyclerView) {
        if (graphCallResult is GraphCallResult.Success<*>) {
            consumeResponseproducts(GraphQLResponse.success(graphCallResult as GraphCallResult.Success<*>), edges, upselllist)
        } else {
            consumeResponseproducts(GraphQLResponse.error(graphCallResult as GraphCallResult.Failure), edges, upselllist)
        }
    }

    private fun consumeResponseproducts(reponse: GraphQLResponse, edges: MutableList<Storefront.Product>, upselllist: RecyclerView) {
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
                            if (result.data!!.nodes[i] != null) {
                                Log.d("edgess", "" + result?.data?.nodes?.get(i)!!)

                                edges.add(result?.data?.nodes?.get(i)!! as Storefront.Product)
                            }
                        }
                        filterProduct(edges, upselllist)
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

    private fun filterProduct(list: List<Storefront.Product>, upselllist: RecyclerView?) {
        try {
            repository.getProductListSlider(list)
                    .subscribeOn(Schedulers.io())
                    .filter { x -> x.availableForSale }
                    .toList()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<List<Storefront.Product>> {
                        override fun onSubscribe(d: Disposable) {

                        }
                        override fun onSuccess(list: List<Storefront.Product>) {
                            Log.i("MageNatyive upselllist", "Data" + list.size)
                            homeadapter = ProductSliderListAdapter()
                            homeadapter!!.presentmentcurrency = presentmentCurrency
                            context.setLayout(upselllist!!, "horizontal")
                            homeadapter!!.setData(list,context, repository)
                            upselllist!!.adapter = homeadapter
                        }

                        override fun onError(e: Throwable) {
                            e.printStackTrace()
                        }
                    })
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun setPresentmentCurrencyForModel() {
        try {
            val runnable = Runnable {
                if (repository.localData[0].currencycode == null) {
                    presentmentCurrency = "nopresentmentcurrency"

                } else {
                    presentmentCurrency = repository.localData[0].currencycode
                }
            }
            Thread(runnable).start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }



}
