package com.gypsey.shopifyapp.utils

import com.gypsey.shopifyapp.dbconnection.entities.AppLocalData

import io.reactivex.annotations.NonNull
import io.reactivex.annotations.Nullable

import com.gypsey.shopifyapp.utils.Status.ERROR
import com.gypsey.shopifyapp.utils.Status.SUCCESS

class LocalDbResponse private constructor(val status: Status, @param:Nullable @field:Nullable
val data: AppLocalData?, @param:Nullable @field:Nullable
                                          val error: Throwable?) {
    companion object {

        fun success(@NonNull data: AppLocalData): LocalDbResponse {
            return LocalDbResponse(SUCCESS, data, null)
        }

        fun error(@NonNull error: Throwable): LocalDbResponse {
            return LocalDbResponse(ERROR, null, error)
        }
    }

}
