package com.shopify.shopifyapp.productsection.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0016\u0010)\u001a\u00020#2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0016H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/shopify/shopifyapp/productsection/activities/ProductList;", "Lcom/shopify/shopifyapp/basesection/activities/BaseActivity;", "()V", "adapter", "Lcom/shopify/shopifyapp/productsection/adapters/ProductRecylerAdapter;", "getAdapter", "()Lcom/shopify/shopifyapp/productsection/adapters/ProductRecylerAdapter;", "setAdapter", "(Lcom/shopify/shopifyapp/productsection/adapters/ProductRecylerAdapter;)V", "binding", "Lcom/shopify/shopifyapp/base/databinding/MProductlistitemBinding;", "factory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "flag", "", "productListModel", "Lcom/shopify/shopifyapp/productsection/viewmodels/ProductListModel;", "productcursor", "", "productlist", "Landroidx/recyclerview/widget/RecyclerView;", "products", "", "Lcom/shopify/buy3/Storefront$ProductEdge;", "recyclerViewOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "sheet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "sortselction", "Landroid/widget/RadioGroup;", "appySort", "", "radioButton", "Lcom/shopify/shopifyapp/customviews/MageNativeRadioButton;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setRecylerData", "showToast", "msg", "Handler", "base_debug"})
public final class ProductList extends com.shopify.shopifyapp.basesection.activities.BaseActivity {
    private com.shopify.shopifyapp.databinding.MProductlistitemBinding binding;
    private androidx.recyclerview.widget.RecyclerView productlist;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory factory;
    private com.shopify.shopifyapp.productsection.viewmodels.ProductListModel productListModel;
    private java.util.List<com.shopify.buy3.Storefront.ProductEdge> products;
    private java.lang.String productcursor;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.productsection.adapters.ProductRecylerAdapter adapter;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> sheet;
    private android.widget.RadioGroup sortselction;
    private boolean flag;
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
    public final com.shopify.shopifyapp.productsection.adapters.ProductRecylerAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.productsection.adapters.ProductRecylerAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    private final void appySort(com.shopify.shopifyapp.customviews.MageNativeRadioButton radioButton) {
    }
    
    private final void setRecylerData(java.util.List<com.shopify.buy3.Storefront.ProductEdge> products) {
    }
    
    public ProductList() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/shopify/shopifyapp/productsection/activities/ProductList$Handler;", "", "(Lcom/shopify/shopifyapp/productsection/activities/ProductList;)V", "openSort", "", "view", "Landroid/view/View;", "base_debug"})
    public final class Handler {
        
        public final void openSort(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public Handler() {
            super();
        }
    }
}