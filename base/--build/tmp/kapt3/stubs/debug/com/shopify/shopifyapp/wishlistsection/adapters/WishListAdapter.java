package com.shopify.shopifyapp.wishlistsection.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001c\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/shopify/shopifyapp/wishlistsection/adapters/WishListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shopify/shopifyapp/wishlistsection/viewholders/WishItem;", "()V", "data", "", "Lcom/shopify/shopifyapp/dbconnection/entities/ItemData;", "layoutInflater", "Landroid/view/LayoutInflater;", "model", "Lcom/shopify/shopifyapp/wishlistsection/viewmodels/WishListViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "ClickHandlers", "base_debug"})
public final class WishListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shopify.shopifyapp.wishlistsection.viewholders.WishItem> {
    private java.util.List<com.shopify.shopifyapp.dbconnection.entities.ItemData> data;
    private android.view.LayoutInflater layoutInflater;
    private com.shopify.shopifyapp.wishlistsection.viewmodels.WishListViewModel model;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shopify.shopifyapp.wishlistsection.viewholders.WishItem onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.wishlistsection.viewholders.WishItem holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shopify.shopifyapp.dbconnection.entities.ItemData> data, @org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.wishlistsection.viewmodels.WishListViewModel model) {
    }
    
    @javax.inject.Inject()
    public WishListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/shopify/shopifyapp/wishlistsection/adapters/WishListAdapter$ClickHandlers;", "", "(Lcom/shopify/shopifyapp/wishlistsection/adapters/WishListAdapter;)V", "moveToCart", "", "view", "Landroid/view/View;", "item", "Lcom/shopify/shopifyapp/wishlistsection/models/WishListItem;", "removeWishList", "base_debug"})
    public final class ClickHandlers {
        
        public final void removeWishList(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.wishlistsection.models.WishListItem item) {
        }
        
        public final void moveToCart(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.wishlistsection.models.WishListItem item) {
        }
        
        public ClickHandlers() {
            super();
        }
    }
}