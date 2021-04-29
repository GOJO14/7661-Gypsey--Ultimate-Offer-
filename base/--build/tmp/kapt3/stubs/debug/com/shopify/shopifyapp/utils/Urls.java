package com.shopify.shopifyapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u0011\u0010\f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/shopify/shopifyapp/utils/Urls;", "", "app", "Lcom/shopify/shopifyapp/MyApplication;", "(Lcom/shopify/shopifyapp/MyApplication;)V", "apikey", "", "getApikey", "()Ljava/lang/String;", "getApp", "()Lcom/shopify/shopifyapp/MyApplication;", "setApp", "mid", "getMid", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "getRepository", "()Lcom/shopify/shopifyapp/repositories/Repository;", "setRepository", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "shopdomain", "getShopdomain", "Data", "base_debug"})
public final class Urls {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.repositories.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private com.shopify.shopifyapp.MyApplication app;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://shopifymobileapp.cedcommerce.com/shopifymobile/shopifyapi/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MENU = "getcategorymenus/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SETORDER = "setorder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SETDEVICES = "setdevices";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOMEPAGE = "homepagedata";
    public static final com.shopify.shopifyapp.utils.Urls.Data Data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.repositories.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.MyApplication getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.MyApplication p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShopdomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApikey() {
        return null;
    }
    
    public Urls(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.MyApplication app) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/shopify/shopifyapp/utils/Urls$Data;", "", "()V", "BASE_URL", "", "HOMEPAGE", "MENU", "SETDEVICES", "SETORDER", "base_debug"})
    public static final class Data {
        
        private Data() {
            super();
        }
    }
}