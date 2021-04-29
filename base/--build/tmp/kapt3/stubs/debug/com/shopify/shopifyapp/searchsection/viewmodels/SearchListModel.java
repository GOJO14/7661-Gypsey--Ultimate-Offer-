package com.shopify.shopifyapp.searchsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0014\u0010\u001d\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0011J\u0017\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0082\u0002J\b\u0010%\u001a\u00020\u001bH\u0014J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u0011J\u0006\u0010(\u001a\u00020\u001bJ\u0010\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/shopify/shopifyapp/searchsection/viewmodels/SearchListModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "avc", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "filteredproducts", "", "Lcom/shopify/buy3/Storefront$ProductEdge;", "getFilteredproducts", "()Landroidx/lifecycle/MutableLiveData;", "mSearchResultsSubject", "Lio/reactivex/subjects/PublishSubject;", "", "message", "getMessage", "presentmentcurrency", "getPresentmentcurrency", "()Ljava/lang/String;", "setPresentmentcurrency", "(Ljava/lang/String;)V", "responseLiveData", "consumeResponse", "", "reponse", "filterProduct", "list", "getProductsByKeywords", "keyword", "invoke", "result", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$QueryRoot;", "onCleared", "searchResultforscanner", "barcode", "setPresentmentCurrencyForModel", "setSearchData", "data", "base_debug"})
public final class SearchListModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentmentcurrency;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.GraphQLResponse> responseLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.ProductEdge>> filteredproducts = null;
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.GraphQLResponse> avc = null;
    private final io.reactivex.subjects.PublishSubject<java.lang.String> mSearchResultsSubject = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentmentcurrency() {
        return null;
    }
    
    public final void setPresentmentcurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.ProductEdge>> getFilteredproducts() {
        return null;
    }
    
    public final void setPresentmentCurrencyForModel() {
    }
    
    public final void getProductsByKeywords(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
    }
    
    private final void invoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.QueryRoot> result) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void filterProduct(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> list) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void setSearchData(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    public final void searchResultforscanner(@org.jetbrains.annotations.NotNull()
    java.lang.String barcode) {
    }
    
    public SearchListModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}