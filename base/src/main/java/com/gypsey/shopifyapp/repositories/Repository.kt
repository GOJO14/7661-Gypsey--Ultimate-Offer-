package com.gypsey.shopifyapp.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.shopify.buy3.GraphClient
import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.MyApplication.Companion.context
import com.gypsey.shopifyapp.dbconnection.database.AppDatabase
import com.gypsey.shopifyapp.dbconnection.entities.*
import com.gypsey.shopifyapp.dependecyinjection.Body
import com.gypsey.shopifyapp.utils.ApiCallInterface
import com.gypsey.shopifyapp.utils.Constant
import com.gypsey.shopifyapp.utils.Urls
import io.reactivex.Observable
import io.reactivex.Single
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class Repository {
    private val TAG = "Repository"
    private val apiCallInterface: ApiCallInterface
    private val appdatabase: AppDatabase
    var graphClient: GraphClient
        get() {
            return GraphClient.build(context, Urls(context).shopdomain, Urls(context).apikey, {
                httpClient = requestHeader
                httpCache(context.cacheDir, {
                    cacheMaxSizeBytes = 1024 * 1024 * 10
                    defaultCachePolicy = Constant.policy
                    Unit
                })
                Unit
            }, Constant.locale)
        }
    internal val requestHeader: OkHttpClient
        get() {
            val httpClient = OkHttpClient.Builder()
            httpClient.addInterceptor { chain ->
                val original = chain.request()
                val request = original.newBuilder().build()
                chain.proceed(request)
            }
                    .connectTimeout(100, TimeUnit.SECONDS)
                    .writeTimeout(100, TimeUnit.SECONDS)
                    .readTimeout(300, TimeUnit.SECONDS)
            return httpClient.build()
        }

    constructor(apiCallInterface: ApiCallInterface, appdatabase: AppDatabase, graphClient: GraphClient) {
        this.apiCallInterface = apiCallInterface
        this.appdatabase = appdatabase
        this.graphClient = graphClient
    }

    val localData: List<AppLocalData>
        get() = appdatabase.appLocalDataDaoDao().all
    val wishListData: List<ItemData>
        get() = appdatabase.itemDataDao.all
    val allCartItems: List<CartItemData>
        get() = appdatabase.cartItemDataDao.all

    val allCartItemsLive: LiveData<List<CartItemData>>
        get() = appdatabase.cartItemDataDao.allitems

    val allUserData: List<UserLocalData>
        get() = appdatabase.appLocalDataDaoDao().allUserData
    val isLogin: Boolean
        get() = if (appdatabase.appLocalDataDaoDao().customerToken.size > 0) {
            true
        } else {
            false
        }
    val accessToken: List<CustomerTokenData>
        get() = appdatabase.appLocalDataDaoDao().customerToken

    fun getMenus(mid: String): Single<JsonElement> {
        return apiCallInterface.getMenus(mid)
    }

    fun getCustomerTags(mid:String,cid:String,fields:String): Single<JsonElement> {
        return  apiCallInterface.getCustomerTags(mid,cid,fields)
    }

    fun getProductsWihTags(map : HashMap<String,String>) : Single<JsonElement>{
        return apiCallInterface.getProductData(map)
    }

    fun getCartData(map : HashMap<String,String>) : Single<JsonElement>{
        return apiCallInterface.getCartData(map)
    }

    fun getinvoiceurl(map : HashMap<String,String>) : Single<JsonElement>{
        return apiCallInterface.getinvoiceurl(map)
    }

    fun getRecommendation(body: Body): Single<JsonElement> {
        Log.i("MageNative", "Cross-sell-3" + body)
        return apiCallInterface.getRecommendations(Urls(context).shopdomain, Urls.CLIENT, Urls.TOKEN, "application/json", body)
    }

    fun getHomePage(mid: String): Single<JsonElement> {
        return apiCallInterface.getHomePage(mid)
    }

    fun setDevice(mid: String, device_id: String, email: String, type: String, unique_id: String): Single<JsonElement> {
        return apiCallInterface.setDevices(mid, device_id, email, type, unique_id)
    }

    fun setOrder(mid: String, checkout_token: String?): Single<JsonElement> {
        return apiCallInterface.setOrder(mid, checkout_token)
    }

    fun getList(list: List<Storefront.ProductVariantEdge>): Observable<Storefront.ProductVariantEdge> {
        return Observable.fromIterable(list)
    }

    fun getProductList(list: List<Storefront.ProductEdge>): Observable<Storefront.ProductEdge> {
        return Observable.fromIterable(list)
    }

    fun getProductListSlider(list: List<Storefront.Product>): Observable<Storefront.Product> {
        return Observable.fromIterable(list)
    }

    fun getJSonArray(list: JsonArray): Observable<JsonElement> {
        return Observable.fromIterable(list)
    }

    fun insertData(data: AppLocalData) {
        appdatabase.appLocalDataDaoDao().insert(data)
    }

    fun updateData(data: AppLocalData) {
        appdatabase.appLocalDataDaoDao().update(data)
    }

    fun deleteLocalData() {
        appdatabase.appLocalDataDaoDao().delete()
    }

    fun insertWishListData(data: ItemData) {
        appdatabase.itemDataDao.insert(data)
    }

    fun getSingleData(id: String): ItemData {
        return appdatabase.itemDataDao.getSingleData(id)
    }

    fun deleteSingleData(data: ItemData) {
        appdatabase.itemDataDao.delete(data)
    }

    fun getSingle(data: AppLocalData): Single<AppLocalData> {
        return Single.just(data)
    }

    fun getSingLeItem(id: String): CartItemData {
        return appdatabase.cartItemDataDao.getSingleData(id)
    }

    fun addSingLeItem(data: CartItemData) {
        appdatabase.cartItemDataDao.insert(data)
    }

    fun updateSingLeItem(data: CartItemData) {
        appdatabase.cartItemDataDao.update(data)
    }

    fun deleteSingLeItem(data: CartItemData) {
        appdatabase.cartItemDataDao.delete(data)
    }

    fun deletecart() {
        appdatabase.cartItemDataDao.deleteCart()
    }

    fun insertUserData(data: UserLocalData) {
        appdatabase.appLocalDataDaoDao().insertUserData(data)
    }

    fun updateUserData(data: UserLocalData) {
        appdatabase.appLocalDataDaoDao().updateUserData(data)
    }

    fun saveaccesstoken(token: CustomerTokenData) {
        appdatabase.appLocalDataDaoDao().InsertCustomerToken(token)

    }

    fun updateAccessToken(data: CustomerTokenData) {
        appdatabase.appLocalDataDaoDao().UpdateCustomerToken(data)
    }

    fun deleteWishListData() {
        appdatabase.itemDataDao.deleteall()
    }

    fun deleteUserData() {
        appdatabase.appLocalDataDaoDao().deletealldata()
        appdatabase.appLocalDataDaoDao().deleteall()
    }

    fun insertPreviewData(data: LivePreviewData) {
        appdatabase.getLivePreviewDao().insert(data)
    }

    fun updatePreviewData(data: LivePreviewData) {
        appdatabase.getLivePreviewDao().update(data)
    }

    fun getPreviewData(): List<LivePreviewData> {
        return appdatabase.getLivePreviewDao().getPreviewDetails
    }

}
