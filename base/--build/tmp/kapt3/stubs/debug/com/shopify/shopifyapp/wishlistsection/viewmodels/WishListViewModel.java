package com.shopify.shopifyapp.wishlistsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000bJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/shopify/shopifyapp/wishlistsection/viewmodels/WishListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "cartCount", "", "getCartCount", "()I", "changes", "Landroidx/lifecycle/MutableLiveData;", "", "data", "Lcom/shopify/shopifyapp/utils/WishListDbResponse;", "wishListCount", "getWishListCount", "FetchData", "", "Response", "addToCart", "variantId", "", "deleteData", "variant_id", "update", "value", "updateResponse", "base_debug"})
public final class WishListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.WishListDbResponse> data = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> changes = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    public final int getCartCount() {
        return 0;
    }
    
    public final int getWishListCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.utils.WishListDbResponse> Response() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> updateResponse() {
        return null;
    }
    
    private final void FetchData() {
    }
    
    public final void deleteData(@org.jetbrains.annotations.NotNull()
    java.lang.String variant_id) {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    java.lang.String variantId) {
    }
    
    public final void update(boolean value) {
    }
    
    public WishListViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}