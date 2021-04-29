package com.shopify.shopifyapp.cartsection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\nJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\"J\u000e\u0010)\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'J\u000e\u0010*\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\b\u00a8\u0006+"}, d2 = {"Lcom/shopify/shopifyapp/cartsection/viewmodels/CartListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "cartCount", "", "getCartCount", "()I", "customerCheckoutResponse", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "getCustomerCheckoutResponse", "()Landroidx/lifecycle/MutableLiveData;", "data", "Lcom/shopify/buy3/Storefront$Checkout;", "isLoggedIn", "", "()Z", "lineItems", "", "Lcom/shopify/buy3/Storefront$CheckoutLineItemInput;", "getLineItems", "()Ljava/util/List;", "message", "getMessage", "presentCurrency", "getPresentCurrency", "()Ljava/lang/String;", "wishListcount", "getWishListcount", "Response", "consumeResponse", "", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "moveToWishList", "item", "Lcom/shopify/shopifyapp/cartsection/models/CartListItem;", "prepareCart", "removeFromCart", "updateCart", "base_debug"})
public final class CartListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.Checkout> data = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> customerCheckoutResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> getCustomerCheckoutResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    public final int getCartCount() {
        return 0;
    }
    
    private final java.util.List<com.shopify.buy3.Storefront.CheckoutLineItemInput> getLineItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPresentCurrency() {
        return null;
    }
    
    public final int getWishListcount() {
        return 0;
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.buy3.Storefront.Checkout> Response() {
        return null;
    }
    
    public final void prepareCart() {
    }
    
    public final void moveToWishList(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.cartsection.models.CartListItem item) {
    }
    
    public final void removeFromCart(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.cartsection.models.CartListItem item) {
    }
    
    public final void updateCart(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.cartsection.models.CartListItem item) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public CartListViewModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}