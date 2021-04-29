package com.gypsey.shopifyapp.loginsection.viewmodels

import android.content.Context
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.JsonObject
import com.shopify.buy3.GraphCallResult
import com.shopify.buy3.Storefront
import com.shopify.graphql.support.Error
import com.gypsey.shopifyapp.dbconnection.entities.CustomerTokenData
import com.gypsey.shopifyapp.dbconnection.entities.UserLocalData
import com.gypsey.shopifyapp.network_transaction.CustomResponse
import com.gypsey.shopifyapp.network_transaction.doGraphQLMutateGraph
import com.gypsey.shopifyapp.network_transaction.doGraphQLQueryGraph
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.shopifyqueries.MutationQuery
import com.gypsey.shopifyapp.shopifyqueries.Query
import com.gypsey.shopifyapp.utils.GraphQLResponse
import com.gypsey.shopifyapp.utils.Status
import com.gypsey.shopifyapp.utils.Urls.Data.MulipassSecret
import java.math.BigInteger
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.security.SecureRandom
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern
import javax.crypto.Cipher
import javax.crypto.Mac
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

class LoginViewModel(private val repository: Repository) : ViewModel() {
    private val responsedata = MutableLiveData<Storefront.CustomerAccessToken>()
    private val response = MutableLiveData<Storefront.Customer>()
    val errormessage = MutableLiveData<String>()
    private var username = ""
    private var password = ""
    lateinit var context: Context
    fun getResponsedata_(): MutableLiveData<Storefront.Customer> {
        return response
    }

    fun Response(): MutableLiveData<Storefront.CustomerAccessToken> {
        return responsedata
    }

    fun getUser(username: String, password: String) {
        this.username = username
        this.password = password
        getLoginData(username, password)
    }

    private fun getLoginData(username: String, password: String) {
        try {
            doGraphQLMutateGraph(repository, MutationQuery.getLoginDetails(username, password), customResponse = object : CustomResponse {
                override fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {
                    invoke(result)
                }
            }, context = context)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun multipass_login(email: String) {
        val md: MessageDigest = MessageDigest.getInstance("SHA-256")
        val by = md.digest(MulipassSecret.toByteArray(StandardCharsets.UTF_8))
        val number = BigInteger(1, by)
        // Convert message digest into hex value
        val hexString: java.lang.StringBuilder = java.lang.StringBuilder(number.toString(16))
        // Pad with leading zeros
        while (hexString.length < 32) {
            hexString.insert(0, '0')
        }

        var encryption_key = hexString.toString().substring(0, 16)
        var signature_key = hexString.toString().substring(16, 32)
        val tz: TimeZone = TimeZone.getTimeZone("UTC")
        val df: DateFormat = SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ssZ") // Quoted "Z" to indicate UTC, no timezone offset

        df.setTimeZone(tz)
        val created_at: String = df.format(Date())
        var customer_obj: JsonObject = JsonObject()
        customer_obj.addProperty("email", email)
        customer_obj.addProperty("created_at", created_at)

        /*val json = "{ \"email\": \"manoharsinghrawat@magenative.com\", \"created_at\": \"2021-01-20T12:38:52+0530\" }"*/
        Log.i("customer_jsonObject1", customer_obj.toString())


        val random = SecureRandom()
        val ivSize = 16
        val iv = ByteArray(ivSize)
        random.nextBytes(iv)
        val ivSpec = IvParameterSpec(iv)
        val skeySpec = SecretKeySpec(encryption_key.toByteArray(), "AES")
        val cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING")
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivSpec)


        Log.d("encrypted - ivSize ", "" + iv.size)
        Log.d("encrypted - ivSize2 ", "" + cipher.doFinal(customer_obj.toString().toByteArray()).size)


        val encrypted = ByteArray(ivSize + cipher.doFinal(customer_obj.toString().toByteArray()).size)
        System.arraycopy(iv, 0, encrypted, 0, ivSize)
        System.arraycopy(cipher.doFinal(customer_obj.toString().toByteArray()), 0, encrypted, ivSize, cipher.doFinal(customer_obj.toString().toByteArray()).size)
        /*val encrypted: ByteArray = ArrayUtils.addAll(iv, cipher.doFinal(customer_obj.toString().toByteArray()))*/

        Log.d("encrypted", "" + encrypted.size)

        val sha256HMAC = Mac.getInstance("HmacSHA256")
        val secretKeySpec = SecretKeySpec(signature_key.toByteArray(), "HmacSHA256")
        sha256HMAC.init(secretKeySpec)
        val signature = sha256HMAC.doFinal(encrypted)

        Log.d("encrypted", "" + signature.size)


        val final = ByteArray(encrypted.size + signature.size)
        System.arraycopy(encrypted, 0, final, 0, encrypted.size)
        System.arraycopy(signature, 0, final, encrypted.size, signature.size)

        Log.d("encrypted - final ", "" + final.size)


        var token = Base64.getUrlEncoder().encodeToString(final/*ArrayUtils.addAll(encrypted, signature)*/);
        token = token.replace('+', '-')  // Replace + with -
                .replace('/', '_');

        Log.d("encrypted - token ", token)

        try {
            doGraphQLMutateGraph(repository, MutationQuery.multipass(token), customResponse = object : CustomResponse {
                override fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {
                    multipasstoken(result)
                }
            }, context = context)
        } catch (e: java.lang.Exception) {
            e.printStackTrace();
        }
    }

    private fun multipasstoken(result: GraphCallResult<Storefront.Mutation>) {
        try {
            if (result is GraphCallResult.Success<*>) {
                consumeResponsemulti(GraphQLResponse.success(result as GraphCallResult.Success<*>))
            } else {
                consumeResponsemulti(GraphQLResponse.error(result as GraphCallResult.Failure))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return Unit
    }

    private fun consumeResponsemulti(qlResponse: GraphQLResponse) {
        when (qlResponse.status) {
            Status.SUCCESS -> {
                val result = (qlResponse.data as GraphCallResult.Success<Storefront.Mutation>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                    this.errormessage.setValue(errormessage.toString())
                } else {
                    val errors = result.data!!.customerAccessTokenCreateWithMultipass.customerUserErrors
                    if (errors.size > 0) {
                        val iterator = errors.iterator()
                        var err = ""
                        while (iterator.hasNext()) {
                            val error = iterator.next() as Storefront.CustomerUserError
                            err += error.message
                        }
                        errormessage.setValue(err)
                    } else {

                        /*errormessage.setValue("Please Check Your Mail")*/
                        var token = result.data!!.customerAccessTokenCreateWithMultipass.customerAccessToken.accessToken
                        Log.i("multipass_token", token);
                    }
                }
            }
            Status.ERROR -> errormessage.setValue(qlResponse.error!!.error.message)
            else -> {
            }
        }
    }


    private operator fun invoke(graphCallResult: GraphCallResult<Storefront.Mutation>): Unit {
        if (graphCallResult is GraphCallResult.Success<*>) {
            consumeResponseLogin(GraphQLResponse.success(graphCallResult as GraphCallResult.Success<*>))
        } else {
            consumeResponseLogin(GraphQLResponse.error(graphCallResult as GraphCallResult.Failure))
        }
        return Unit
    }

    private fun consumeResponseLogin(reponse: GraphQLResponse) {
        when (reponse.status) {
            Status.SUCCESS -> {
                val result = (reponse.data as GraphCallResult.Success<Storefront.Mutation>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                    this.errormessage.setValue(errormessage.toString())
                } else {
                    val errors = result.data!!.customerAccessTokenCreate.customerUserErrors
                    if (errors.size > 0) {
                        val iterator = errors.iterator()
                        var err = ""
                        while (iterator.hasNext()) {
                            val error = iterator.next() as Storefront.CustomerUserError
                            err += error.message
                        }
                        errormessage.setValue(err)
                    } else {
                        responsedata.setValue(result.data!!.customerAccessTokenCreate.customerAccessToken)

                    }
                }
            }
            Status.ERROR -> errormessage.setValue(reponse.error!!.error.message)
            else -> {
            }
        }
    }

    fun savetoken(token: Storefront.CustomerAccessToken) {
        val customerTokenData = CustomerTokenData(token.accessToken, token.expiresAt.toLocalDateTime().toString())
        repository.saveaccesstoken(customerTokenData)
        try {
            doGraphQLQueryGraph(repository, Query.getCustomerDetails(token.accessToken), customResponse = object : CustomResponse {
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
            MapLoginDetails(GraphQLResponse.success(graphCallResult as GraphCallResult.Success<*>))
        } else {
            MapLoginDetails(GraphQLResponse.error(graphCallResult as GraphCallResult.Failure))
        }
        return Unit
    }

    private fun MapLoginDetails(graphQLResponse: GraphQLResponse) {
        when (graphQLResponse.status) {
            Status.SUCCESS -> {
                val result = (graphQLResponse.data as GraphCallResult.Success<Storefront.QueryRoot>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                    this.errormessage.setValue(errormessage.toString())
                } else {
                    response.setValue(result.data!!.customer)
                }
            }
            Status.ERROR -> errormessage.setValue(graphQLResponse.error!!.error.message)
            else -> {
            }
        }
    }

    fun saveUser(id:String,firstName: String, lastName: String) {
        val userLocalData = UserLocalData(id,firstName, lastName, username, password)
        repository.insertUserData(userLocalData)
    }

    fun recoverCustomer(email: String) {
        try {
            doGraphQLMutateGraph(repository, MutationQuery.recoverCustomer(email), customResponse = object : CustomResponse {
                override fun onSuccessMutate(result: GraphCallResult<Storefront.Mutation>) {
                    recoverCustomerinvoke(result)
                }
            }, context = context)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun recoverCustomerinvoke(graphCallResult: GraphCallResult<Storefront.Mutation>): Unit {
        try {
            if (graphCallResult is GraphCallResult.Success<*>) {
                consumeResponse(GraphQLResponse.success(graphCallResult as GraphCallResult.Success<*>))
            } else {
                consumeResponse(GraphQLResponse.error(graphCallResult as GraphCallResult.Failure))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return Unit
    }

    private fun consumeResponse(reponse: GraphQLResponse) {
        when (reponse.status) {
            Status.SUCCESS -> {
                val result = (reponse.data as GraphCallResult.Success<Storefront.Mutation>).response
                if (result.hasErrors) {
                    val errors = result.errors
                    val iterator = errors.iterator()
                    val errormessage = StringBuilder()
                    var error: Error? = null
                    while (iterator.hasNext()) {
                        error = iterator.next()
                        errormessage.append(error.message())
                    }
                    this.errormessage.setValue(errormessage.toString())
                } else {
                    val errors = result.data!!.customerRecover.customerUserErrors
                    if (errors.size > 0) {
                        val iterator = errors.iterator()
                        var err = ""
                        while (iterator.hasNext()) {
                            val error = iterator.next() as Storefront.CustomerUserError
                            err += error.message
                        }
                        errormessage.setValue(err)
                    } else {
                        errormessage.setValue("Please Check Your Mail")
                    }
                }
            }
            Status.ERROR -> errormessage.setValue(reponse.error!!.error.message)
            else -> {
            }
        }
    }

    fun isValidEmail(target: String): Boolean {
        val emailPattern = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE)
        return emailPattern.matcher(target).matches()
    }
}
