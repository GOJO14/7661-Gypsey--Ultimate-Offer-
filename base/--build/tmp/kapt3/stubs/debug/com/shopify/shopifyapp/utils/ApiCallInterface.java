package com.shopify.shopifyapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J@\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/shopify/shopifyapp/utils/ApiCallInterface;", "", "getHomePage", "Lio/reactivex/Single;", "Lcom/google/gson/JsonElement;", "mid", "", "getMenus", "setDevices", "device_id", "email", "type", "unique_id", "setOrder", "checkout_token", "base_debug"})
public abstract interface ApiCallInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getcategorymenus/")
    public abstract io.reactivex.Single<com.google.gson.JsonElement> getMenus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mid")
    java.lang.String mid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "homepagedata")
    public abstract io.reactivex.Single<com.google.gson.JsonElement> getHomePage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mid")
    java.lang.String mid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "setorder")
    public abstract io.reactivex.Single<com.google.gson.JsonElement> setOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mid")
    java.lang.String mid, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "checkout_token")
    java.lang.String checkout_token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "setdevices")
    public abstract io.reactivex.Single<com.google.gson.JsonElement> setDevices(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mid")
    java.lang.String mid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "device_id")
    java.lang.String device_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "unique_id")
    java.lang.String unique_id);
}