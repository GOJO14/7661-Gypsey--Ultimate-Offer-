package com.shopify.shopifyapp.ordersection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\fR$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/shopify/shopifyapp/ordersection/viewmodels/OrderListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "cursor", "", "getCursor", "()Ljava/lang/String;", "setCursor", "(Ljava/lang/String;)V", "errorResponse", "Landroidx/lifecycle/MutableLiveData;", "getErrorResponse", "()Landroidx/lifecycle/MutableLiveData;", "response", "Lcom/shopify/buy3/Storefront$OrderConnection;", "consumeResponse", "", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "fetchOrderData", "getResponse_", "base_debug"})
public final class OrderListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cursor;
    private final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.OrderConnection> response = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorResponse = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCursor() {
        return null;
    }
    
    public final void setCursor(@org.jetbrains.annotations.NotNull()
    java.lang.String cursor) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.OrderConnection> getResponse_() {
        return null;
    }
    
    private final void fetchOrderData() {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public OrderListViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}