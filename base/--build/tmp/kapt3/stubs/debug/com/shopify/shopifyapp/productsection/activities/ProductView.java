package com.shopify.shopifyapp.productsection.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010\u001f\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0016\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%J\u0018\u0010\'\u001a\u0004\u0018\u00010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0!H\u0002J\u0012\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u001cH\u0014J\u0012\u00102\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u000104H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/shopify/shopifyapp/productsection/activities/ProductView;", "Lcom/shopify/shopifyapp/basesection/activities/BaseActivity;", "()V", "adapter", "Lcom/shopify/shopifyapp/productsection/adapters/VariantAdapter;", "getAdapter", "()Lcom/shopify/shopifyapp/productsection/adapters/VariantAdapter;", "setAdapter", "(Lcom/shopify/shopifyapp/productsection/adapters/VariantAdapter;)V", "binding", "Lcom/shopify/shopifyapp/base/databinding/MProductviewBinding;", "cartCount", "", "getCartCount", "()I", "data", "Lcom/shopify/shopifyapp/basesection/models/ListData;", "factory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "model", "Lcom/shopify/shopifyapp/productsection/viewmodels/ProductViewModel;", "variantlist", "Landroidx/recyclerview/widget/RecyclerView;", "consumeResponse", "", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "filterResponse", "list", "", "Lcom/shopify/buy3/Storefront$ProductVariantEdge;", "getDiscount", "regular", "", "special", "getEdge", "Lcom/shopify/buy3/Storefront$ProductVariantPricePairEdge;", "edges", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onResume", "setProductData", "productedge", "Lcom/shopify/buy3/Storefront$Product;", "ClickHandlers", "base_debug"})
public final class ProductView extends com.shopify.shopifyapp.basesection.activities.BaseActivity {
    private com.shopify.shopifyapp.databinding.MProductviewBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory factory;
    private com.shopify.shopifyapp.productsection.viewmodels.ProductViewModel model;
    private androidx.recyclerview.widget.RecyclerView variantlist;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.productsection.adapters.VariantAdapter adapter;
    private com.shopify.shopifyapp.basesection.models.ListData data;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.productsection.adapters.VariantAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.productsection.adapters.VariantAdapter p0) {
    }
    
    private final int getCartCount() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void filterResponse(java.util.List<? extends com.shopify.buy3.Storefront.ProductVariantEdge> list) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    private final void setProductData(com.shopify.buy3.Storefront.Product productedge) {
    }
    
    public final int getDiscount(double regular, double special) {
        return 0;
    }
    
    private final com.shopify.buy3.Storefront.ProductVariantPricePairEdge getEdge(java.util.List<? extends com.shopify.buy3.Storefront.ProductVariantPricePairEdge> edges) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public ProductView() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000b"}, d2 = {"Lcom/shopify/shopifyapp/productsection/activities/ProductView$ClickHandlers;", "", "(Lcom/shopify/shopifyapp/productsection/activities/ProductView;)V", "addtoCart", "", "view", "Landroid/view/View;", "data", "Lcom/shopify/shopifyapp/basesection/models/ListData;", "addtoWish", "shareProduct", "base_debug"})
    public final class ClickHandlers {
        
        public final void addtoCart(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.basesection.models.ListData data) {
        }
        
        public final void addtoWish(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.basesection.models.ListData data) {
        }
        
        public final void shareProduct(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.basesection.models.ListData data) {
        }
        
        public ClickHandlers() {
            super();
        }
    }
}