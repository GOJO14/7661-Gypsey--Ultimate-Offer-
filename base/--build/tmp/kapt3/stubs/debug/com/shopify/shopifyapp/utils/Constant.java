package com.shopify.shopifyapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/shopify/shopifyapp/utils/Constant;", "", "()V", "current", "Lcom/shopify/shopifyapp/productsection/models/VariantData;", "getCurrent", "()Lcom/shopify/shopifyapp/productsection/models/VariantData;", "setCurrent", "(Lcom/shopify/shopifyapp/productsection/models/VariantData;)V", "policy", "Lcom/shopify/buy3/HttpCachePolicy$ExpirePolicy;", "getPolicy", "()Lcom/shopify/buy3/HttpCachePolicy$ExpirePolicy;", "setPolicy", "(Lcom/shopify/buy3/HttpCachePolicy$ExpirePolicy;)V", "previous", "getPrevious", "setPrevious", "checkInternetConnection", "", "context", "Landroid/content/Context;", "getProgressDialog", "Landroid/app/ProgressDialog;", "msg", "", "base_debug"})
public final class Constant {
    @org.jetbrains.annotations.Nullable()
    private static com.shopify.shopifyapp.productsection.models.VariantData previous;
    @org.jetbrains.annotations.Nullable()
    private static com.shopify.shopifyapp.productsection.models.VariantData current;
    @org.jetbrains.annotations.NotNull()
    private static com.shopify.buy3.HttpCachePolicy.ExpirePolicy policy;
    public static final com.shopify.shopifyapp.utils.Constant INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.shopify.shopifyapp.productsection.models.VariantData getPrevious() {
        return null;
    }
    
    public final void setPrevious(@org.jetbrains.annotations.Nullable()
    com.shopify.shopifyapp.productsection.models.VariantData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.shopify.shopifyapp.productsection.models.VariantData getCurrent() {
        return null;
    }
    
    public final void setCurrent(@org.jetbrains.annotations.Nullable()
    com.shopify.shopifyapp.productsection.models.VariantData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.HttpCachePolicy.ExpirePolicy getPolicy() {
        return null;
    }
    
    public final void setPolicy(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.HttpCachePolicy.ExpirePolicy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.ProgressDialog getProgressDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        return null;
    }
    
    public final boolean checkInternetConnection(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private Constant() {
        super();
    }
}