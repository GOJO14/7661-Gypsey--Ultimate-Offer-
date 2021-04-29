package com.gypsey.shopifyapp.ordersection.viewmodels

import android.content.Context
import android.os.Handler
import android.os.Looper

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.GraphResponse
import com.shopify.buy3.QueryGraphCall
import com.shopify.buy3.Storefront
import com.shopify.graphql.support.Error
import com.gypsey.shopifyapp.dbconnection.entities.CustomerTokenData
import com.gypsey.shopifyapp.network_transaction.CustomResponse
import com.gypsey.shopifyapp.network_transaction.doGraphQLQueryGraph
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.shopifyqueries.Query
import com.gypsey.shopifyapp.utils.GraphQLResponse
import com.gypsey.shopifyapp.utils.Status

class OrderListViewModel(private val repository: Repository) : ViewModel() {
    var cursor = "nocursor"
        set(cursor) {
            field = cursor
            fetchOrderData()
        }
    lateinit var context: Context
    private val response = MutableLiveData<Storefront.OrderConnection>()
    val errorResponse = MutableLiveData<String>()
    fun getResponse_(): MutableLiveData<Storefront.OrderConnection> {
        fetchOrderData()
        return response
    }

    private fun fetchOrderData() {
        try {
            val tokenData = repository.accessToken[0]
            doGraphQLQueryGraph(repository, Query.getOrderList(tokenData.customerAccessToken, cursor), customResponse = object : CustomResponse {
                override fun onSuccessQuery(result: GraphCallResult<Storefront.QueryRoot>) {
                    invokes(result)
                }
            }, context = context)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun invokes(graphCallResult: GraphCallResult<Storefront.QueryRoot>): Unit {
        if (graphCallResult is GraphCallResult.Success<*>) {
            consumeResponse(GraphQLResponse.success(graphCallResult as GraphCallResult.Success<*>))
        } else {
            consumeResponse(GraphQLResponse.error(graphCallResult as GraphCallResult.Failure))
        }
        return Unit
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
                    errorResponse.setValue(errormessage.toString())
                } else {
                    try {
                        response.setValue(result.data!!.customer.orders)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                }
            }
            Status.ERROR -> errorResponse.setValue(reponse.error!!.error.message)
            else -> {
            }
        }
    }
}
