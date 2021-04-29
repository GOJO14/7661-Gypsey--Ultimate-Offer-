package com.shopify.shopifyapp.checkoutsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/shopify/shopifyapp/checkoutsection/viewmodels/CheckoutWebLinkViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "data", "Lcom/shopify/shopifyapp/dbconnection/entities/UserLocalData;", "getData", "()Lcom/shopify/shopifyapp/dbconnection/entities/UserLocalData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isLoggedIn", "", "()Z", "responseLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shopify/shopifyapp/utils/ApiResponse;", "deleteCart", "", "onCleared", "setOrder", "mid", "", "checkout_token", "base_debug"})
public final class CheckoutWebLinkViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.ApiResponse> responseLiveData = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.shopify.shopifyapp.dbconnection.entities.UserLocalData getData() {
        return null;
    }
    
    public final void setOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String mid, @org.jetbrains.annotations.Nullable()
    java.lang.String checkout_token) {
    }
    
    public final void deleteCart() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CheckoutWebLinkViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}