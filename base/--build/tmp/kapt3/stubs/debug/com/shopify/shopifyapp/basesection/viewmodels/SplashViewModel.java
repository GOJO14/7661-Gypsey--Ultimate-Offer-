package com.shopify.shopifyapp.basesection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0016\u001a\u00020\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006J\u0017\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0082\u0002J\b\u0010\"\u001a\u00020\u0018H\u0014J\u0006\u0010#\u001a\u00020\u0018J\u0012\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/shopify/shopifyapp/basesection/viewmodels/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "apiresponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shopify/shopifyapp/utils/ApiResponse;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "errorMessageResponse", "", "getErrorMessageResponse", "()Landroidx/lifecycle/MutableLiveData;", "fireBaseResponseMutableLiveData", "Lcom/shopify/shopifyapp/utils/FireBaseResponse;", "isLogin", "", "()Z", "responseLiveData", "Lcom/shopify/shopifyapp/utils/LocalDbResponse;", "Response", "shop", "connectFireBaseForSplashData", "", "connectFirebaseForTrial", "consumeResponse", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "firebaseResponse", "invoke", "graphCallResult", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$Mutation;", "onCleared", "refreshTokenIfRequired", "renewToken", "customerAccessToken", "sendTokenToServer", "unique_id", "base_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.LocalDbResponse> responseLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.ApiResponse> apiresponseLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.FireBaseResponse> fireBaseResponseMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessageResponse = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessageResponse() {
        return null;
    }
    
    public final boolean isLogin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.LocalDbResponse> Response(@org.jetbrains.annotations.NotNull()
    java.lang.String shop) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.FireBaseResponse> firebaseResponse() {
        return null;
    }
    
    private final void connectFirebaseForTrial(java.lang.String shop) {
    }
    
    private final void connectFireBaseForSplashData() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void refreshTokenIfRequired() {
    }
    
    private final void renewToken(java.lang.String customerAccessToken) {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void sendTokenToServer(@org.jetbrains.annotations.NotNull()
    java.lang.String unique_id) {
    }
    
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}