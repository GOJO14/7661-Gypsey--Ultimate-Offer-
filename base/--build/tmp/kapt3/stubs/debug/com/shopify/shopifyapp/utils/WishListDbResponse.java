package com.shopify.shopifyapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/shopify/shopifyapp/utils/WishListDbResponse;", "", "status", "Lcom/shopify/shopifyapp/utils/Status;", "data", "", "Lcom/shopify/shopifyapp/dbconnection/entities/ItemData;", "error", "", "(Lcom/shopify/shopifyapp/utils/Status;Ljava/util/List;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "getStatus", "()Lcom/shopify/shopifyapp/utils/Status;", "Companion", "base_debug"})
public final class WishListDbResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.shopify.shopifyapp.utils.Status status = null;
    @org.jetbrains.annotations.Nullable()
    @io.reactivex.annotations.Nullable()
    private final java.util.List<com.shopify.shopifyapp.dbconnection.entities.ItemData> data = null;
    @org.jetbrains.annotations.Nullable()
    @io.reactivex.annotations.Nullable()
    private final java.lang.String error = null;
    public static final com.shopify.shopifyapp.utils.WishListDbResponse.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.shopify.shopifyapp.dbconnection.entities.ItemData> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    private WishListDbResponse(com.shopify.shopifyapp.utils.Status status, @io.reactivex.annotations.Nullable()
    java.util.List<com.shopify.shopifyapp.dbconnection.entities.ItemData> data, @io.reactivex.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00042\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a8\u0006\n"}, d2 = {"Lcom/shopify/shopifyapp/utils/WishListDbResponse$Companion;", "", "()V", "error", "Lcom/shopify/shopifyapp/utils/WishListDbResponse;", "", "success", "data", "", "Lcom/shopify/shopifyapp/dbconnection/entities/ItemData;", "base_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopify.shopifyapp.utils.WishListDbResponse success(@org.jetbrains.annotations.NotNull()
        @io.reactivex.annotations.NonNull()
        java.util.List<com.shopify.shopifyapp.dbconnection.entities.ItemData> data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopify.shopifyapp.utils.WishListDbResponse error(@org.jetbrains.annotations.NotNull()
        @io.reactivex.annotations.NonNull()
        java.lang.String error) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}