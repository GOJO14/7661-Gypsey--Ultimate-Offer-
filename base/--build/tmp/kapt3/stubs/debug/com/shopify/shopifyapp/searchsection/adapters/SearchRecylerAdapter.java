package com.shopify.shopifyapp.searchsection.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0016H\u0016J\u001c\u0010)\u001a\u00020#2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006+"}, d2 = {"Lcom/shopify/shopifyapp/searchsection/adapters/SearchRecylerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shopify/shopifyapp/searchsection/viewholders/SearechItem;", "()V", "activity", "Landroid/app/Activity;", "layoutInflater", "Landroid/view/LayoutInflater;", "presentmentcurrency", "", "getPresentmentcurrency", "()Ljava/lang/String;", "setPresentmentcurrency", "(Ljava/lang/String;)V", "products", "", "Lcom/shopify/buy3/Storefront$ProductEdge;", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "getDiscount", "", "regular", "", "special", "getEdge", "Lcom/shopify/buy3/Storefront$ProductVariantPricePairEdge;", "edges", "getItemCount", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "Product", "base_debug"})
public final class SearchRecylerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shopify.shopifyapp.searchsection.viewholders.SearechItem> {
    private android.view.LayoutInflater layoutInflater;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> products;
    private android.app.Activity activity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentmentcurrency;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.shopify.buy3.Storefront.ProductEdge> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentmentcurrency() {
        return null;
    }
    
    public final void setPresentmentcurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> products, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shopify.shopifyapp.searchsection.viewholders.SearechItem onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.searchsection.viewholders.SearechItem holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final int getDiscount(double regular, double special) {
        return 0;
    }
    
    private final com.shopify.buy3.Storefront.ProductVariantPricePairEdge getEdge(java.util.List<? extends com.shopify.buy3.Storefront.ProductVariantPricePairEdge> edges) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchRecylerAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/shopify/shopifyapp/searchsection/adapters/SearchRecylerAdapter$Product;", "", "(Lcom/shopify/shopifyapp/searchsection/adapters/SearchRecylerAdapter;)V", "productClick", "", "view", "Landroid/view/View;", "data", "Lcom/shopify/shopifyapp/basesection/models/ListData;", "base_debug"})
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