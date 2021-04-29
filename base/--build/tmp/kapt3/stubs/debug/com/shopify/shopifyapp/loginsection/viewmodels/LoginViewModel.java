package com.shopify.shopifyapp.loginsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0006J\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0017\u0010\u001b\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082\u0002J\u0016\u0010\u001f\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0007J\u0016\u0010&\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0016\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/shopify/shopifyapp/loginsection/viewmodels/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "errormessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrormessage", "()Landroidx/lifecycle/MutableLiveData;", "password", "response", "Lcom/shopify/buy3/Storefront$Customer;", "responsedata", "Lcom/shopify/buy3/Storefront$CustomerAccessToken;", "username", "MapLoginDetails", "", "graphQLResponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "Response", "consumeResponse", "reponse", "consumeResponseLogin", "getLoginData", "getResponsedata_", "getUser", "invoke", "graphCallResult", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$Mutation;", "invokes", "Lcom/shopify/buy3/Storefront$QueryRoot;", "isValidEmail", "", "target", "recoverCustomer", "email", "recoverCustomerinvoke", "saveUser", "firstName", "lastName", "savetoken", "token", "base_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.CustomerAccessToken> responsedata = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.Customer> response = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errormessage = null;
    private java.lang.String username;
    private java.lang.String password;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrormessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.Customer> getResponsedata_() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.CustomerAccessToken> Response() {
        return null;
    }
    
    public final void getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final void getLoginData(java.lang.String username, java.lang.String password) {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeResponseLogin(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void savetoken(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.Storefront.CustomerAccessToken token) {
    }
    
    private final void invokes(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.QueryRoot> graphCallResult) {
    }
    
    private final void MapLoginDetails(com.shopify.shopifyapp.utils.GraphQLResponse graphQLResponse) {
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName) {
    }
    
    public final void recoverCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    private final void recoverCustomerinvoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String target) {
        return false;
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}