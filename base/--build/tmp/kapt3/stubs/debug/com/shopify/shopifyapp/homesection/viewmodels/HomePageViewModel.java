package com.shopify.shopifyapp.homesection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001^B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002J\u0015\u0010=\u001a\u00020>2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b?J*\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u00109\u001a\u00020:2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010G\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010H\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010I\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010J\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010K\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010L\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010M\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010N\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010O\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J\u000e\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020 J0\u0010R\u001a\u00020>2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020<0T2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u00109\u001a\u00020:2\u0006\u0010E\u001a\u00020FH\u0002J\u0018\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f0\u001eJ(\u0010V\u001a\u00020>2\u0006\u0010W\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u00109\u001a\u00020:2\u0006\u0010E\u001a\u00020FJ\f\u0010X\u001a\b\u0012\u0004\u0012\u00020 0\u001eJ\u0014\u0010Y\u001a\u0004\u0018\u00010 2\b\u0010W\u001a\u0004\u0018\u00010 H\u0002J\b\u0010Z\u001a\u00020>H\u0002J\u0010\u0010[\u001a\u00020>2\u0006\u0010E\u001a\u00020FH\u0002J*\u0010\\\u001a\u00020>2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u00109\u001a\u00020:2\u0006\u0010]\u001a\u00020 2\u0006\u0010E\u001a\u00020FH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR#\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u001c\u0010&\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u0006_"}, d2 = {"Lcom/shopify/shopifyapp/homesection/viewmodels/HomePageViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "adapter", "Lcom/shopify/shopifyapp/homesection/adapters/CollectionGridAdapter;", "getAdapter", "()Lcom/shopify/shopifyapp/homesection/adapters/CollectionGridAdapter;", "setAdapter", "(Lcom/shopify/shopifyapp/homesection/adapters/CollectionGridAdapter;)V", "context", "Lcom/shopify/shopifyapp/homesection/activities/HomePage;", "getContext", "()Lcom/shopify/shopifyapp/homesection/activities/HomePage;", "setContext", "(Lcom/shopify/shopifyapp/homesection/activities/HomePage;)V", "gridAdapter", "Lcom/shopify/shopifyapp/homesection/adapters/ProductGridAdapter;", "getGridAdapter", "()Lcom/shopify/shopifyapp/homesection/adapters/ProductGridAdapter;", "setGridAdapter", "(Lcom/shopify/shopifyapp/homesection/adapters/ProductGridAdapter;)V", "homeadapter", "Lcom/shopify/shopifyapp/homesection/adapters/ProductSliderAdapter;", "getHomeadapter", "()Lcom/shopify/shopifyapp/homesection/adapters/ProductSliderAdapter;", "setHomeadapter", "(Lcom/shopify/shopifyapp/homesection/adapters/ProductSliderAdapter;)V", "homepagedata", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "Landroid/view/View;", "getHomepagedata", "()Landroidx/lifecycle/MutableLiveData;", "message", "getMessage", "presentmentCurrency", "getPresentmentCurrency", "()Ljava/lang/String;", "setPresentmentCurrency", "(Ljava/lang/String;)V", "productListAdapter", "Lcom/shopify/shopifyapp/homesection/adapters/ProductListAdapter;", "getProductListAdapter", "()Lcom/shopify/shopifyapp/homesection/adapters/ProductListAdapter;", "setProductListAdapter", "(Lcom/shopify/shopifyapp/homesection/adapters/ProductListAdapter;)V", "slideradapter", "Lcom/shopify/shopifyapp/homesection/adapters/CollectionSliderAdapter;", "getSlideradapter", "()Lcom/shopify/shopifyapp/homesection/adapters/CollectionSliderAdapter;", "setSlideradapter", "(Lcom/shopify/shopifyapp/homesection/adapters/CollectionSliderAdapter;)V", "checkProduct", "", "jsonArray", "Lorg/json/JSONArray;", "productedge", "Lcom/shopify/buy3/Storefront$ProductEdge;", "connectFirebaseForHomePageData", "", "connectFirebaseForHomePageData$base_debug", "consumeResponse", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "productdata", "Landroidx/recyclerview/widget/RecyclerView;", "jsonObject", "Lorg/json/JSONObject;", "createBannerSlider", "createCategoryCircle", "createCategorySquare", "createCollectionGrid", "createCollectionListSlider", "createFixedCustomisableLayout", "createHvLayout", "createProductSlider", "createStandAloneBanner", "dowloadJson", "downloadlink", "filterProduct", "list", "", "getHomePageData", "getProductsById", "id", "getToastMessage", "getcategoryID", "setPresentmentCurrencyForModel", "topbar", "updateDataInRecylerView", "cat_id", "MyCount", "base_debug"})
public final class HomePageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentmentCurrency;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, android.view.View>> homepagedata = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.homesection.adapters.ProductSliderAdapter homeadapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.homesection.adapters.ProductListAdapter productListAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.homesection.adapters.CollectionGridAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.homesection.adapters.CollectionSliderAdapter slideradapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.homesection.adapters.ProductGridAdapter gridAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.shopify.shopifyapp.homesection.activities.HomePage context;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentmentCurrency() {
        return null;
    }
    
    public final void setPresentmentCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, android.view.View>> getHomepagedata() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.homesection.adapters.ProductSliderAdapter getHomeadapter() {
        return null;
    }
    
    public final void setHomeadapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.adapters.ProductSliderAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.homesection.adapters.ProductListAdapter getProductListAdapter() {
        return null;
    }
    
    public final void setProductListAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.adapters.ProductListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.homesection.adapters.CollectionGridAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.adapters.CollectionGridAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.homesection.adapters.CollectionSliderAdapter getSlideradapter() {
        return null;
    }
    
    public final void setSlideradapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.adapters.CollectionSliderAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.homesection.adapters.ProductGridAdapter getGridAdapter() {
        return null;
    }
    
    public final void setGridAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.adapters.ProductGridAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.homesection.activities.HomePage getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.activities.HomePage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, android.view.View>> getHomePageData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getToastMessage() {
        return null;
    }
    
    private final void setPresentmentCurrencyForModel() {
    }
    
    public final void connectFirebaseForHomePageData$base_debug(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.activities.HomePage context) {
    }
    
    public final void dowloadJson(@org.jetbrains.annotations.NotNull()
    java.lang.String downloadlink) {
    }
    
    private final void topbar(org.json.JSONObject jsonObject) {
    }
    
    private final void createFixedCustomisableLayout(org.json.JSONObject jsonObject) {
    }
    
    private final void createCollectionListSlider(org.json.JSONObject jsonObject) {
    }
    
    private final void createHvLayout(org.json.JSONObject jsonObject) {
    }
    
    private final void createStandAloneBanner(org.json.JSONObject jsonObject) {
    }
    
    private final void createCollectionGrid(org.json.JSONObject jsonObject) {
    }
    
    private final void createCategorySquare(org.json.JSONObject jsonObject) {
    }
    
    private final void createProductSlider(org.json.JSONObject jsonObject) {
    }
    
    private final void updateDataInRecylerView(androidx.recyclerview.widget.RecyclerView productdata, org.json.JSONArray jsonArray, java.lang.String cat_id, org.json.JSONObject jsonObject) {
    }
    
    public final void getProductsById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView productdata, @org.jetbrains.annotations.NotNull()
    org.json.JSONArray jsonArray, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) {
    }
    
    private final java.lang.String getcategoryID(java.lang.String id) {
        return null;
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse, androidx.recyclerview.widget.RecyclerView productdata, org.json.JSONArray jsonArray, org.json.JSONObject jsonObject) {
    }
    
    private final void filterProduct(java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> list, androidx.recyclerview.widget.RecyclerView productdata, org.json.JSONArray jsonArray, org.json.JSONObject jsonObject) {
    }
    
    private final boolean checkProduct(org.json.JSONArray jsonArray, com.shopify.buy3.Storefront.ProductEdge productedge) {
        return false;
    }
    
    private final void createBannerSlider(org.json.JSONObject jsonObject) {
    }
    
    private final void createCategoryCircle(org.json.JSONObject jsonObject) {
    }
    
    public HomePageViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/shopify/shopifyapp/homesection/viewmodels/HomePageViewModel$MyCount;", "Landroid/os/CountDownTimer;", "millisInFuture", "", "countDownInterval", "productSlider", "Lcom/shopify/shopifyapp/homesection/models/ProductSlider;", "format", "", "(JJLcom/shopify/shopifyapp/homesection/models/ProductSlider;Ljava/lang/String;)V", "getFormat", "()Ljava/lang/String;", "setFormat", "(Ljava/lang/String;)V", "getProductSlider", "()Lcom/shopify/shopifyapp/homesection/models/ProductSlider;", "setProductSlider", "(Lcom/shopify/shopifyapp/homesection/models/ProductSlider;)V", "onFinish", "", "onTick", "millisUntilFinished", "base_debug"})
    public static final class MyCount extends android.os.CountDownTimer {
        @org.jetbrains.annotations.NotNull()
        private com.shopify.shopifyapp.homesection.models.ProductSlider productSlider;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String format;
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopify.shopifyapp.homesection.models.ProductSlider getProductSlider() {
            return null;
        }
        
        public final void setProductSlider(@org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.homesection.models.ProductSlider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormat() {
            return null;
        }
        
        public final void setFormat(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @java.lang.Override()
        public void onFinish() {
        }
        
        @java.lang.Override()
        public void onTick(long millisUntilFinished) {
        }
        
        public MyCount(long millisInFuture, long countDownInterval, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.homesection.models.ProductSlider productSlider, @org.jetbrains.annotations.NotNull()
        java.lang.String format) {
            super(0L, 0L);
        }
    }
}