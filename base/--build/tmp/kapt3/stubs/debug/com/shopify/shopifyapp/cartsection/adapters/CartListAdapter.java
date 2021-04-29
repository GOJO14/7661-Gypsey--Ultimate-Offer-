package com.shopify.shopifyapp.cartsection.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u001e\u0010\t\u001a\u00020\u00192\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ&\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/shopify/shopifyapp/cartsection/adapters/CartListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shopify/shopifyapp/cartsection/viewholders/CartItem;", "()V", "data", "", "Lcom/shopify/buy3/Storefront$CheckoutLineItemEdge;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "model", "Lcom/shopify/shopifyapp/cartsection/viewmodels/CartListViewModel;", "getDiscount", "", "regular", "", "special", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setVariants", "item", "Lcom/shopify/shopifyapp/cartsection/models/CartListItem;", "selectedOptions", "", "Lcom/shopify/buy3/Storefront$SelectedOption;", "ClickHandlers", "base_debug"})
public final class CartListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shopify.shopifyapp.cartsection.viewholders.CartItem> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.shopify.buy3.Storefront.CheckoutLineItemEdge> data;
    private android.view.LayoutInflater layoutInflater;
    private com.shopify.shopifyapp.cartsection.viewmodels.CartListViewModel model;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.shopify.buy3.Storefront.CheckoutLineItemEdge> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.shopify.buy3.Storefront.CheckoutLineItemEdge> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shopify.shopifyapp.cartsection.viewholders.CartItem onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.cartsection.viewholders.CartItem holder, int position) {
    }
    
    private final void setVariants(com.shopify.shopifyapp.cartsection.models.CartListItem item, com.shopify.shopifyapp.cartsection.viewholders.CartItem holder, java.util.List<? extends com.shopify.buy3.Storefront.SelectedOption> selectedOptions) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shopify.buy3.Storefront.CheckoutLineItemEdge> data, @org.jetbrains.annotations.Nullable()
    com.shopify.shopifyapp.cartsection.viewmodels.CartListViewModel model) {
    }
    
    public final int getDiscount(double regular, double special) {
        return 0;
    }
    
    @javax.inject.Inject()
    public CartListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lcom/shopify/shopifyapp/cartsection/adapters/CartListAdapter$ClickHandlers;", "", "(Lcom/shopify/shopifyapp/cartsection/adapters/CartListAdapter;)V", "decrease", "", "view", "Landroid/view/View;", "item", "Lcom/shopify/shopifyapp/cartsection/models/CartListItem;", "increase", "moveToWishList", "removeFromCart", "base_debug"})
    public final class ClickHandlers {
        
        public final void moveToWishList(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.cartsection.models.CartListItem item) {
        }
        
        public final void removeFromCart(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.cartsection.models.CartListItem item) {
        }
        
        public final void increase(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.cartsection.models.CartListItem item) {
        }
        
        public final void decrease(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.cartsection.models.CartListItem item) {
        }
        
        public ClickHandlers() {
            super();
        }
    }
}