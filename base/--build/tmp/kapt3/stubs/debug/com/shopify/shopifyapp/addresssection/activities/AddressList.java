package com.shopify.shopifyapp.addresssection.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010+\u001a\u00020*2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0012\u0010,\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020*H\u0014J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u0014H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00066"}, d2 = {"Lcom/shopify/shopifyapp/addresssection/activities/AddressList;", "Lcom/shopify/shopifyapp/basesection/activities/BaseActivity;", "()V", "adapter", "Lcom/shopify/shopifyapp/addresssection/adapters/AddressListAdapter;", "getAdapter", "()Lcom/shopify/shopifyapp/addresssection/adapters/AddressListAdapter;", "setAdapter", "(Lcom/shopify/shopifyapp/addresssection/adapters/AddressListAdapter;)V", "address", "Lcom/shopify/shopifyapp/addresssection/models/Address;", "addresslist", "Landroidx/recyclerview/widget/RecyclerView;", "binding", "Lcom/shopify/shopifyapp/base/databinding/MAddresslistBinding;", "getBinding$base_debug", "()Lcom/shopify/shopifyapp/base/databinding/MAddresslistBinding;", "setBinding$base_debug", "(Lcom/shopify/shopifyapp/base/databinding/MAddresslistBinding;)V", "cursor", "", "factory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "mailingAddressEdges", "", "Lcom/shopify/buy3/Storefront$MailingAddressEdge;", "model", "Lcom/shopify/shopifyapp/addresssection/viewmodels/AddressModel;", "recyclerViewOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "sheet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "tag", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "editAddress", "", "listAddress", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "opensheet", "aBoolean", "", "showToast", "toast", "ClickHandler", "base_debug"})
public class AddressList extends com.shopify.shopifyapp.basesection.activities.BaseActivity {
    @org.jetbrains.annotations.Nullable()
    private com.shopify.shopifyapp.databinding.MAddresslistBinding binding;
    private com.shopify.shopifyapp.addresssection.viewmodels.AddressModel model;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory factory;
    private androidx.recyclerview.widget.RecyclerView addresslist;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter adapter;
    private java.lang.String cursor;
    private java.util.List<com.shopify.buy3.Storefront.MailingAddressEdge> mailingAddressEdges;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> sheet;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tag;
    private com.shopify.shopifyapp.addresssection.models.Address address;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener recyclerViewOnScrollListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.shopify.shopifyapp.databinding.MAddresslistBinding getBinding$base_debug() {
        return null;
    }
    
    public final void setBinding$base_debug(@org.jetbrains.annotations.Nullable()
    com.shopify.shopifyapp.databinding.MAddresslistBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void editAddress(com.shopify.shopifyapp.addresssection.models.Address address) {
    }
    
    private final void opensheet(boolean aBoolean) {
    }
    
    private final void listAddress(java.util.List<com.shopify.buy3.Storefront.MailingAddressEdge> mailingAddressEdges) {
    }
    
    private final void showToast(java.lang.String toast) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public AddressList() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004\u00a8\u0006\f"}, d2 = {"Lcom/shopify/shopifyapp/addresssection/activities/AddressList$ClickHandler;", "", "(Lcom/shopify/shopifyapp/addresssection/activities/AddressList;)V", "Address", "", "view", "Landroid/view/View;", "Proceed", "addAddress", "cancelAction", "closeSheet", "openSheet", "base_debug"})
    public final class ClickHandler {
        
        public final void addAddress(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void openSheet() {
        }
        
        public final void cancelAction(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void closeSheet() {
        }
        
        public final void Address(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        private final void Proceed() {
        }
        
        public ClickHandler() {
            super();
        }
    }
}