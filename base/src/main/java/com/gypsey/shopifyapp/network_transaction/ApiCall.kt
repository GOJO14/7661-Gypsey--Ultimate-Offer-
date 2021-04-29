package com.gypsey.shopifyapp.network_transaction

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.util.Log
import android.widget.Adapter
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.JsonElement
import com.gypsey.shopifyapp.loader_section.CustomLoader
import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.utils.ApiResponse
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


var customLoader: CustomLoader? = null
private val TAG = "ApiCall"
fun ViewModel.doGraphQLMutateGraph(repository: Repository, query: Storefront.MutationQuery, customResponse: CustomResponse, context: Context) {
    Log.d(TAG, "doGraphQLMutateGraph: "+query)
    GlobalScope.launch(Dispatchers.Main) {
        if (customLoader != null) {
            customLoader!!.dismiss()
            customLoader = null
        }
        customLoader = CustomLoader(context)
        customLoader!!.show()
    }

    var call = repository.graphClient.mutateGraph(query)
    call.enqueue { result: GraphCallResult<Storefront.Mutation> ->
        GlobalScope.launch(Dispatchers.Main) {
            customLoader!!.dismiss()
            customResponse.onSuccessMutate(result)

        }
    }
}

fun ViewModel.doGraphQLQueryGraph(repository: Repository, query: Storefront.QueryRootQuery, customResponse: CustomResponse, context: Context) {
    Log.d(TAG, "doGraphQLQueryGraph: "+query)
    GlobalScope.launch(Dispatchers.Main) {
        if (customLoader != null) {
            customLoader!!.dismiss()
            customLoader = null
        }
        customLoader = CustomLoader(context)
        customLoader!!.show()
    }
    var call = repository.graphClient.queryGraph(query)
    call.enqueue { result: GraphCallResult<Storefront.QueryRoot> ->
        GlobalScope.launch(Dispatchers.Main) {
            customLoader!!.dismiss()
            customResponse.onSuccessQuery(result)

        }
    }
}

fun Dialog.doGraphQLQueryGraph(repository: Repository, query: Storefront.QueryRootQuery, customResponse: CustomResponse, context: Context) {
    Log.d(TAG, "doGraphQLQueryGraph: "+query)
    GlobalScope.launch(Dispatchers.Main) {
        if (customLoader != null) {
            customLoader!!.dismiss()
            customLoader = null
        }
        customLoader = CustomLoader(context)
        customLoader!!.show()
    }
    var call = repository.graphClient.queryGraph(query)
    call.enqueue { result: GraphCallResult<Storefront.QueryRoot> ->
        GlobalScope.launch(Dispatchers.Main) {
            customLoader!!.dismiss()
            customResponse.onSuccessQuery(result)

        }
    }
}

fun ViewModel.doRetrofitCall(postData: Single<JsonElement>, disposables: CompositeDisposable, customResponse: CustomResponse, context: Context) {
    GlobalScope.launch(Dispatchers.Main) {
        if (customLoader != null) {
            customLoader!!.dismiss()
            customLoader = null
        }
        customLoader = CustomLoader(context)
        customLoader!!.show()
    }
    disposables.add(postData
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                    { result ->
                        customLoader!!.dismiss()
                        customResponse.onSuccessRetrofit(result)
                    },
                    { throwable ->
                        customLoader!!.dismiss()
                        customResponse.onErrorRetrofit(throwable)
                    }
            ))
}

fun doRetrofitCall(postData: Single<JsonElement>, disposables: CompositeDisposable, customResponse: CustomResponse, context: Activity) {
    /*GlobalScope.launch(Dispatchers.Main) {
        if (customLoader != null) {
            customLoader!!.dismiss()
            customLoader = null
        }
        customLoader = CustomLoader(context)
        customLoader!!.show()
    }*/
    disposables.add(postData
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                    { result ->
                        //customLoader!!.dismiss()
                        customResponse.onSuccessRetrofit(result)
                    },
                    { throwable ->
                        //customLoader!!.dismiss()
                        customResponse.onErrorRetrofit(throwable)
                    }
            ))
}