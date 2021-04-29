package com.shopify.shopifyapp.ordersection.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J \u0010\t\u001a\u00020\u00122\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/shopify/shopifyapp/ordersection/adapters/OrderListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shopify/shopifyapp/ordersection/viewholders/OrderItem;", "()V", "data", "", "Lcom/shopify/buy3/Storefront$OrderEdge;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "model", "Lcom/shopify/shopifyapp/ordersection/viewmodels/OrderListViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "base_debug"})
public final class OrderListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shopify.shopifyapp.ordersection.viewholders.OrderItem> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.shopify.buy3.Storefront.OrderEdge> data;
    private android.view.LayoutInflater layoutInflater;
    private com.shopify.shopifyapp.ordersection.viewmodels.OrderListViewModel model;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.shopify.buy3.Storefront.OrderEdge> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.shopify.buy3.Storefront.OrderEdge> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shopify.shopifyapp.ordersection.viewholders.OrderItem onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.ordersection.viewholders.OrderItem holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.shopify.buy3.Storefront.OrderEdge> data, @org.jetbrains.annotations.Nullable()
    com.shopify.shopifyapp.ordersection.viewmodels.OrderListViewModel model) {
    }
    
    @javax.inject.Inject()
    public OrderListAdapter() {
        super();
    }
}