package com.shopify.shopifyapp.addresssection.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001e\u0010\t\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/shopify/shopifyapp/addresssection/adapters/AddressListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shopify/shopifyapp/addresssection/viewholders/AddressViewHolder;", "()V", "data", "", "Lcom/shopify/buy3/Storefront$MailingAddressEdge;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "model", "Lcom/shopify/shopifyapp/addresssection/viewmodels/AddressModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickHandler", "base_debug"})
public final class AddressListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shopify.shopifyapp.addresssection.viewholders.AddressViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.shopify.buy3.Storefront.MailingAddressEdge> data;
    private android.view.LayoutInflater layoutInflater;
    private com.shopify.shopifyapp.addresssection.viewmodels.AddressModel model;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.shopify.buy3.Storefront.MailingAddressEdge> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.shopify.buy3.Storefront.MailingAddressEdge> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shopify.shopifyapp.addresssection.viewholders.AddressViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.addresssection.viewholders.AddressViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shopify.buy3.Storefront.MailingAddressEdge> data, @org.jetbrains.annotations.Nullable()
    com.shopify.shopifyapp.addresssection.viewmodels.AddressModel model) {
    }
    
    @javax.inject.Inject()
    public AddressListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/shopify/shopifyapp/addresssection/adapters/AddressListAdapter$ClickHandler;", "", "(Lcom/shopify/shopifyapp/addresssection/adapters/AddressListAdapter;)V", "deleteAddress", "", "view", "Landroid/view/View;", "address", "Lcom/shopify/shopifyapp/addresssection/models/Address;", "editAddress", "base_debug"})
    public final class ClickHandler {
        
        public final void deleteAddress(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.addresssection.models.Address address) {
        }
        
        public final void editAddress(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.addresssection.models.Address address) {
        }
        
        public ClickHandler() {
            super();
        }
    }
}