package com.shopify.shopifyapp.productsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0012J\u0014\u0010#\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\u0017\u0010\'\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0082\u0002J\u000e\u0010+\u001a\u00020,2\u0006\u0010\"\u001a\u00020\u0012J\b\u0010-\u001a\u00020!H\u0014J\u0006\u0010.\u001a\u00020,J\u000e\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/shopify/shopifyapp/productsection/viewmodels/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "cartCount", "", "getCartCount", "()I", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "filteredlist", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/shopify/buy3/Storefront$ProductVariantEdge;", "getFilteredlist", "()Landroidx/lifecycle/MutableLiveData;", "handle", "", "getHandle", "()Ljava/lang/String;", "setHandle", "(Ljava/lang/String;)V", "id", "getId", "setId", "presentmentCurrency", "getPresentmentCurrency", "setPresentmentCurrency", "responseLiveData", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "Response", "addToCart", "", "variantId", "filterList", "list", "getProductsByHandle", "getProductsById", "invoke", "result", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$QueryRoot;", "isInwishList", "", "onCleared", "setPresentmentCurrencyForModel", "setWishList", "variant", "Lcom/shopify/shopifyapp/productsection/models/VariantData;", "base_debug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String handle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentmentCurrency;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.GraphQLResponse> responseLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.ProductVariantEdge>> filteredlist = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHandle() {
        return null;
    }
    
    public final void setHandle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentmentCurrency() {
        return null;
    }
    
    public final void setPresentmentCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.ProductVariantEdge>> getFilteredlist() {
        return null;
    }
    
    public final int getCartCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.GraphQLResponse> Response() {
        return null;
    }
    
    private final void getProductsById() {
    }
    
    private final void getProductsByHandle() {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.QueryRoot> result) {
    }
    
    public final boolean setPresentmentCurrencyForModel() {
        return false;
    }
    
    public final boolean setWishList(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.productsection.models.VariantData variant) {
        return false;
    }
    
    public final void filterList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductVariantEdge> list) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final boolean isInwishList(@org.jetbrains.annotations.NotNull()
    java.lang.String variantId) {
        return false;
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    java.lang.String variantId) {
    }
    
    public ProductViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}