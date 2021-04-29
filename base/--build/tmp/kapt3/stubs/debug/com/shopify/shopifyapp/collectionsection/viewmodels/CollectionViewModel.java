package com.shopify.shopifyapp.collectionsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0017\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/shopify/shopifyapp/collectionsection/viewmodels/CollectionViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "cursor", "", "getCursor", "()Ljava/lang/String;", "setCursor", "(Ljava/lang/String;)V", "message", "Landroidx/lifecycle/MutableLiveData;", "getMessage", "()Landroidx/lifecycle/MutableLiveData;", "responsedata", "", "Lcom/shopify/buy3/Storefront$CollectionEdge;", "Response", "consumeResponse", "", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "getCollectionData", "invoke", "result", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$QueryRoot;", "base_debug"})
public final class CollectionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cursor;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.CollectionEdge>> responsedata = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCursor() {
        return null;
    }
    
    public final void setCursor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.CollectionEdge>> Response() {
        return null;
    }
    
    private final void getCollectionData() {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.QueryRoot> result) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public CollectionViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}