package com.gypsey.shopifyapp.network_transaction

import com.google.gson.JsonElement
import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.GraphResponse
import com.shopify.buy3.Storefront
import com.shopify.graphql.support.AbstractResponse

interface CustomResponse {
    fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {}
    fun onSuccessQuery(result: GraphCallResult<Storefront.QueryRoot>) {}
    fun onSuccessRetrofit(result: JsonElement) {}
    fun onErrorRetrofit(error: Throwable) {}
    /*fun onErrorMutate(abstractResponse: AbstractResponse<Any>) {}
    fun onErrorQuery(abstractResponse: AbstractResponse<Any>) {}*/
}