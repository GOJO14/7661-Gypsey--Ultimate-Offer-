package com.shopify.shopifyapp.homesection.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u001e\u0010$\u001a\u00020\u001e2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/shopify/shopifyapp/homesection/adapters/ProductSlidertypeTwoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shopify/shopifyapp/homesection/viewholders/SliderItemTypeOne;", "()V", "activity", "Landroid/app/Activity;", "layoutInflater", "Landroid/view/LayoutInflater;", "presentmentcurrency", "", "getPresentmentcurrency", "()Ljava/lang/String;", "setPresentmentcurrency", "(Ljava/lang/String;)V", "products", "", "Lcom/shopify/buy3/Storefront$ProductEdge;", "getDiscount", "", "regular", "", "special", "getEdge", "Lcom/shopify/buy3/Storefront$ProductVariantPricePairEdge;", "edges", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "", "item", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "base_debug"})
public final class ProductSlidertypeTwoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shopify.shopifyapp.homesection.viewholders.SliderItemTypeOne> {
    private android.view.LayoutInflater layoutInflater;
    private java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> products;
    private android.app.Activity activity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentmentcurrency;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentmentcurrency() {
        return null;
    }
    
    public final void setPresentmentcurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> products, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
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
    
    public final int getDiscount(double regular, double special) {
        return 0;
    }
    
    private final com.shopify.buy3.Storefront.ProductVariantPricePairEdge getEdge(java.util.List<? extends com.shopify.buy3.Storefront.ProductVariantPricePairEdge> edges) {
        return null;
    }
    
    @javax.inject.Inject()
    public ProductSlidertypeTwoAdapter() {
        super();
    }
}