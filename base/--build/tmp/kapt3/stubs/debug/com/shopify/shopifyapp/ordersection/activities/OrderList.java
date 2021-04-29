package com.shopify.shopifyapp.ordersection.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0014H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/shopify/shopifyapp/ordersection/activities/OrderList;", "Lcom/shopify/shopifyapp/basesection/activities/BaseActivity;", "()V", "adapter", "Lcom/shopify/shopifyapp/ordersection/adapters/OrderListAdapter;", "getAdapter", "()Lcom/shopify/shopifyapp/ordersection/adapters/OrderListAdapter;", "setAdapter", "(Lcom/shopify/shopifyapp/ordersection/adapters/OrderListAdapter;)V", "binding", "Lcom/shopify/shopifyapp/base/databinding/MOrderlistBinding;", "factory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "model", "Lcom/shopify/shopifyapp/ordersection/viewmodels/OrderListViewModel;", "ordercursor", "", "orderlist", "Landroidx/recyclerview/widget/RecyclerView;", "orders", "", "Lcom/shopify/buy3/Storefront$OrderEdge;", "recyclerViewOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "consumeResponse", "", "response", "Lcom/shopify/buy3/Storefront$OrderConnection;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showToast", "msg", "base_debug"})
public final class OrderList extends com.shopify.shopifyapp.basesection.activities.BaseActivity {
    private com.shopify.shopifyapp.databinding.MOrderlistBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory factory;
    private androidx.recyclerview.widget.RecyclerView orderlist;
    private com.shopify.shopifyapp.ordersection.viewmodels.OrderListViewModel model;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.ordersection.adapters.OrderListAdapter adapter;
    private java.util.List<com.shopify.buy3.Storefront.OrderEdge> orders;
    private java.lang.String ordercursor;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener recyclerViewOnScrollListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.ordersection.adapters.OrderListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.ordersection.adapters.OrderListAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    private final void consumeResponse(com.shopify.buy3.Storefront.OrderConnection response) {
    }
    
    public OrderList() {
        super();
    }
}