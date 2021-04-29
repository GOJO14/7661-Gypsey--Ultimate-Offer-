package com.shopify.shopifyapp.productsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u0002052\u0006\u00107\u001a\u000208H\u0002J\u0016\u00109\u001a\u0002052\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;J\b\u0010<\u001a\u000205H\u0002J\b\u0010=\u001a\u000205H\u0002J\b\u0010>\u001a\u000205H\u0002J\u0006\u0010?\u001a\u00020\u0006J\u0006\u0010@\u001a\u00020\u0006J\u0017\u0010A\u001a\u0002052\f\u0010B\u001a\b\u0012\u0004\u0012\u00020D0CH\u0082\u0002J\b\u0010E\u001a\u000205H\u0014J\b\u0010F\u001a\u000205H\u0002J\u000e\u0010G\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010H\u001a\u0002052\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\n\"\u0004\b-\u0010\fR\u001a\u0010.\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006I"}, d2 = {"Lcom/shopify/shopifyapp/productsection/viewmodels/ProductListModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "categoryHandle", "", "categoryID", "cursor", "getCursor", "()Ljava/lang/String;", "setCursor", "(Ljava/lang/String;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "filteredproducts", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/shopify/buy3/Storefront$ProductEdge;", "getFilteredproducts", "()Landroidx/lifecycle/MutableLiveData;", "isDirection", "", "()Z", "setDirection", "(Z)V", "keys", "Lcom/shopify/buy3/Storefront$ProductSortKeys;", "getKeys", "()Lcom/shopify/buy3/Storefront$ProductSortKeys;", "setKeys", "(Lcom/shopify/buy3/Storefront$ProductSortKeys;)V", "message", "getMessage", "number", "", "getNumber", "()I", "setNumber", "(I)V", "presentmentCurrency", "getPresentmentCurrency", "setPresentmentCurrency", "shopID", "getShopID", "setShopID", "sortKeys", "Lcom/shopify/buy3/Storefront$ProductCollectionSortKeys;", "getSortKeys", "()Lcom/shopify/buy3/Storefront$ProductCollectionSortKeys;", "setSortKeys", "(Lcom/shopify/buy3/Storefront$ProductCollectionSortKeys;)V", "Response", "", "consumeResponse", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "filterProduct", "list", "", "getAllProducts", "getProductsByHandle", "getProductsById", "getcategoryHandle", "getcategoryID", "invoke", "result", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$QueryRoot;", "onCleared", "setPresentmentCurrencyForModel", "setcategoryHandle", "setcategoryID", "base_debug"})
public final class ProductListModel extends androidx.lifecycle.ViewModel {
    private java.lang.String categoryID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String shopID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentmentCurrency;
    private java.lang.String categoryHandle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cursor;
    private boolean isDirection;
    @org.jetbrains.annotations.NotNull()
    private com.shopify.buy3.Storefront.ProductCollectionSortKeys sortKeys;
    @org.jetbrains.annotations.NotNull()
    private com.shopify.buy3.Storefront.ProductSortKeys keys;
    private int number;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.ProductEdge>> filteredproducts = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShopID() {
        return null;
    }
    
    public final void setShopID(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getCursor() {
        return null;
    }
    
    public final void setCursor(@org.jetbrains.annotations.NotNull()
    java.lang.String cursor) {
    }
    
    public final boolean isDirection() {
        return false;
    }
    
    public final void setDirection(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.ProductCollectionSortKeys getSortKeys() {
        return null;
    }
    
    public final void setSortKeys(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.Storefront.ProductCollectionSortKeys p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.ProductSortKeys getKeys() {
        return null;
    }
    
    public final void setKeys(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.Storefront.ProductSortKeys p0) {
    }
    
    public final int getNumber() {
        return 0;
    }
    
    public final void setNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.ProductEdge>> getFilteredproducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getcategoryID() {
        return null;
    }
    
    public final void setcategoryID(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryID) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getcategoryHandle() {
        return null;
    }
    
    public final void setcategoryHandle(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryHandle) {
    }
    
    public final void Response() {
    }
    
    private final void getAllProducts() {
    }
    
    private final void getProductsById() {
    }
    
    private final void getProductsByHandle() {
    }
    
    private final void setPresentmentCurrencyForModel() {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.QueryRoot> result) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void filterProduct(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> list) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ProductListModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}