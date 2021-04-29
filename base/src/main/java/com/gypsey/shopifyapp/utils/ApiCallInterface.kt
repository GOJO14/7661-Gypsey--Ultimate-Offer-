package com.gypsey.shopifyapp.utils

import com.google.gson.JsonElement
import io.reactivex.Single
import retrofit2.http.*


interface ApiCallInterface {

    @GET(Urls.MENU)
    fun getMenus(@Query("mid") mid: String): Single<JsonElement>

    @GET(Urls.HOMEPAGE)
    fun getHomePage(@Query("mid") mid: String): Single<JsonElement>

    @GET(Urls.SETORDER)
    fun setOrder(@Query("mid") mid: String, @Query("checkout_token") checkout_token: String?): Single<JsonElement>

    @GET(Urls.SETDEVICES)
    fun setDevices(@Query("mid") mid: String, @Query("device_id") device_id: String, @Query("email") email: String, @Query("type") type: String, @Query("unique_id") unique_id: String): Single<JsonElement>

    @Headers(Urls.HEADER) // Add the Domain-Name header
    @POST(Urls.RECOMMENDATION)
    fun getRecommendations(@Header("X-SHOP") shop: String, @Header("X-CLIENT") client: String, @Header("X-ACCESS-TOKEN") token: String, @Header("Content-Type") content_tyepe: String, @Body body: com.gypsey.shopifyapp.dependecyinjection.Body): Single<JsonElement>

    @GET(Urls.CUSTOMER_TAGS)
    fun getCustomerTags(@Query("mid") mid: String?, @Query("cid") cid: String?, @Query("fields") tags: String?): Single<JsonElement>

    @FormUrlEncoded
    @POST(Urls.PRODUCTS_WITH_TAGS+"getproduct")
    fun getProductData(@FieldMap hashMap: HashMap<String, String>): Single<JsonElement>

    @FormUrlEncoded
    @POST(Urls.PRODUCTS_WITH_TAGS+"getcart")
    fun getCartData(@FieldMap hashMap: HashMap<String, String>): Single<JsonElement>

    @FormUrlEncoded
    @POST(Urls.PRODUCTS_WITH_TAGS+"getinvoiceurl")
    fun getinvoiceurl(@FieldMap hashMap: HashMap<String, String>): Single<JsonElement>
}
