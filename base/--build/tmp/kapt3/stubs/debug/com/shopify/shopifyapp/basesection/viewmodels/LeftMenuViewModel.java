package com.shopify.shopifyapp.basesection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\nJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0006\u0010%\u001a\u00020!J\b\u0010&\u001a\u00020!H\u0002J\b\u0010\'\u001a\u00020!H\u0002J\u000e\u0010(\u001a\u00020!2\u0006\u0010\r\u001a\u00020)J\u0017\u0010*\u001a\u00020!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0082\u0002J\u0006\u0010.\u001a\u00020!J\b\u0010/\u001a\u00020!H\u0014J\u0010\u00100\u001a\u00020!2\b\u00101\u001a\u0004\u0018\u00010\u000fR\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\b\u00a8\u00062"}, d2 = {"Lcom/shopify/shopifyapp/basesection/viewmodels/LeftMenuViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "cartCount", "", "getCartCount", "()I", "currencyResponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/shopify/buy3/Storefront$CurrencyCode;", "data", "Ljava/util/HashMap;", "", "getData", "()Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "handler", "Landroid/os/Handler;", "isLoggedIn", "", "()Z", "message", "getMessage", "responseLiveData", "Lcom/shopify/shopifyapp/utils/ApiResponse;", "wishListcount", "getWishListcount", "Response", "consumeResponse", "", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "currencyResponse", "fetchUserData", "getCurrency", "getMenus", "insertPreviewData", "Lorg/json/JSONObject;", "invoke", "result", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$QueryRoot;", "logOut", "onCleared", "setCurrencyData", "currencyCode", "base_debug"})
public final class LeftMenuViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.ApiResponse> responseLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> data = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.CurrencyCode>> currencyResponseLiveData = null;
    private final android.os.Handler handler = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> getData() {
        return null;
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.ApiResponse> Response() {
        return null;
    }
    
    public final int getCartCount() {
        return 0;
    }
    
    public final int getWishListcount() {
        return 0;
    }
    
    public final void fetchUserData() {
    }
    
    private final void getMenus() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.CurrencyCode>> currencyResponse() {
        return null;
    }
    
    private final void getCurrency() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.QueryRoot> result) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void setCurrencyData(@org.jetbrains.annotations.Nullable()
    java.lang.String currencyCode) {
    }
    
    public final void logOut() {
    }
    
    public final void insertPreviewData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject data) {
    }
    
    public LeftMenuViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}