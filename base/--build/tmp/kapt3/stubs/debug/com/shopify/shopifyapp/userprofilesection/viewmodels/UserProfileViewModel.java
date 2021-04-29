package com.shopify.shopifyapp.userprofilesection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\bJ\u0017\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0082\u0002J\u0016\u0010 \u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020!0\u001eH\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tJ\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'H\u0002J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/shopify/shopifyapp/userprofilesection/viewmodels/UserProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "data", "Lcom/shopify/shopifyapp/dbconnection/entities/CustomerTokenData;", "errorMessageResponse", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessageResponse", "()Landroidx/lifecycle/MutableLiveData;", "password", "passwordResponse", "getPasswordResponse", "response", "Lcom/shopify/buy3/Storefront$Customer;", "user", "Lcom/shopify/shopifyapp/dbconnection/entities/UserLocalData;", "consumeDataResponse", "", "graphQLResponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "consumeResponse", "reponse", "fetchData", "fetchPassword", "getResponse_", "invoke", "graphCallResult", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$QueryRoot;", "invokes", "Lcom/shopify/buy3/Storefront$Mutation;", "isValidEmail", "", "target", "saveCustomerToken", "token", "Lcom/shopify/buy3/Storefront$CustomerAccessToken;", "saveUser", "localuser", "Lcom/shopify/shopifyapp/userprofilesection/models/User;", "updateDataonServer", "base_debug"})
public final class UserProfileViewModel extends androidx.lifecycle.ViewModel {
    private com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData data;
    private com.shopify.shopifyapp.dbconnection.entities.UserLocalData user;
    private final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.Customer> response = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessageResponse = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessageResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPasswordResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.Customer> getResponse_() {
        return null;
    }
    
    private final void fetchPassword() {
    }
    
    private final void fetchData() {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.QueryRoot> graphCallResult) {
    }
    
    private final void consumeDataResponse(com.shopify.shopifyapp.utils.GraphQLResponse graphQLResponse) {
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.userprofilesection.models.User localuser) {
    }
    
    public final void updateDataonServer(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.userprofilesection.models.User localuser) {
    }
    
    private final void invokes(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    private final void saveCustomerToken(com.shopify.buy3.Storefront.CustomerAccessToken token) {
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String target) {
        return false;
    }
    
    public UserProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}