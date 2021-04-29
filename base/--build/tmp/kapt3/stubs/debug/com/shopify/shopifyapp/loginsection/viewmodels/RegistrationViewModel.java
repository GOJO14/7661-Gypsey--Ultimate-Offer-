package com.shopify.shopifyapp.loginsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J&\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000eJ\u0017\u0010\u001e\u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0082\u0002J\u0016\u0010\"\u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tJ(\u0010&\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u000e\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/shopify/shopifyapp/loginsection/viewmodels/RegistrationViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "loginresponsedata", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shopify/buy3/Storefront$CustomerAccessToken;", "message", "", "getMessage", "()Landroidx/lifecycle/MutableLiveData;", "password", "responsedata", "Lcom/shopify/buy3/Storefront$Customer;", "LoginResponse", "Response", "consumeLoginResponse", "", "graphQLResponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "consumeResponse", "reponse", "getLoginData", "email", "getRegistrationDetails", "firstname", "lastname", "insertUserData", "customer", "invoke", "graphCallResult", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$Mutation;", "invokes", "isValidEmail", "", "target", "registeruseer", "savetoken", "token", "base_debug"})
public final class RegistrationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.Customer> responsedata = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.CustomerAccessToken> loginresponsedata = null;
    private java.lang.String password;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.CustomerAccessToken> LoginResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.Customer> Response() {
        return null;
    }
    
    public final void getRegistrationDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String firstname, @org.jetbrains.annotations.NotNull()
    java.lang.String lastname, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final void registeruseer(java.lang.String firstname, java.lang.String lastname, java.lang.String email, java.lang.String password) {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void insertUserData(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.Storefront.Customer customer) {
    }
    
    private final void getLoginData(java.lang.String email, java.lang.String password) {
    }
    
    private final void invokes(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeLoginResponse(com.shopify.shopifyapp.utils.GraphQLResponse graphQLResponse) {
    }
    
    public final void savetoken(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.Storefront.CustomerAccessToken token) {
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String target) {
        return false;
    }
    
    public RegistrationViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}