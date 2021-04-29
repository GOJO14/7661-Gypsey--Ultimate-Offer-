package com.shopify.shopifyapp.homesection.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bH\u0016J&\u0010&\u001a\u00020 2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/shopify/shopifyapp/homesection/adapters/ProductGridAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shopify/shopifyapp/homesection/viewholders/SliderItemTypeOne;", "()V", "activity", "Landroid/app/Activity;", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "setJsonObject", "(Lorg/json/JSONObject;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "presentmentcurrency", "", "getPresentmentcurrency", "()Ljava/lang/String;", "setPresentmentcurrency", "(Ljava/lang/String;)V", "products", "", "Lcom/shopify/buy3/Storefront$ProductEdge;", "getEdge", "Lcom/shopify/buy3/Storefront$ProductVariantPricePairEdge;", "edges", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "item", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "Product", "base_debug"})
public final class ProductGridAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shopify.shopifyapp.homesection.viewholders.SliderItemTypeOne> {
    private android.view.LayoutInflater layoutInflater;
    private java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> products;
    private android.app.Activity activity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentmentcurrency;
    @org.jetbrains.annotations.Nullable()
    private org.json.JSONObject jsonObject;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentmentcurrency() {
        return null;
    }
    
    public final void setPresentmentcurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject getJsonObject() {
        return null;
    }
    
    public final void setJsonObject(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> products, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shopify.shopifyapp.homesection.viewholders.SliderItemTypeOne onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.viewholders.SliderItemTypeOne item, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final com.shopify.buy3.Storefront.ProductVariantPricePairEdge getEdge(java.util.List<? extends com.shopify.buy3.Storefront.ProductVariantPricePairEdge> edges) {
        return null;
    }
    
    @javax.inject.Inject()
    public ProductGridAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/shopify/shopifyapp/homesection/adapters/ProductGridAdapter$Product;", "", "(Lcom/shopify/shopifyapp/homesection/adapters/ProductGridAdapter;)V", "productClick", "", "view", "Landroid/view/View;", "data", "Lcom/shopify/shopifyapp/basesection/models/ListData;", "base_debug"})
    public final class Product {
        
        public final void productClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.basesection.models.ListData data) {
        }
        
        public Product() {
            super();
        }
    }
}