package com.shopify.shopifyapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/shopify/shopifyapp/utils/ApiResponse;", "", "status", "Lcom/shopify/shopifyapp/utils/Status;", "data", "Lcom/google/gson/JsonElement;", "error", "", "(Lcom/shopify/shopifyapp/utils/Status;Lcom/google/gson/JsonElement;Ljava/lang/Throwable;)V", "getData", "()Lcom/google/gson/JsonElement;", "getError", "()Ljava/lang/Throwable;", "getStatus", "()Lcom/shopify/shopifyapp/utils/Status;", "Companion", "base_debug"})
public final class ApiResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.shopify.shopifyapp.utils.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final com.google.gson.JsonElement data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Throwable error = null;
    public static final com.shopify.shopifyapp.utils.ApiResponse.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.gson.JsonElement getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getError() {
        return null;
    }
    
    private ApiResponse(com.shopify.shopifyapp.utils.Status status, com.google.gson.JsonElement data, java.lang.Throwable error) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/shopify/shopifyapp/utils/ApiResponse$Companion;", "", "()V", "error", "Lcom/shopify/shopifyapp/utils/ApiResponse;", "", "loading", "success", "data", "Lcom/google/gson/JsonElement;", "base_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopify.shopifyapp.utils.ApiResponse loading() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopify.shopifyapp.utils.ApiResponse success(@org.jetbrains.annotations.NotNull()
        @io.reactivex.annotations.NonNull()
        com.google.gson.JsonElement data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopify.shopifyapp.utils.ApiResponse error(@org.jetbrains.annotations.NotNull()
        @io.reactivex.annotations.NonNull()
        java.lang.Throwable error) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}