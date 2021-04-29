package com.shopify.shopifyapp.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000fJ\u000e\u0010)\u001a\u00020&2\u0006\u0010\'\u001a\u00020#J\u0006\u0010*\u001a\u00020&J\u0006\u0010+\u001a\u00020&J\u0006\u0010,\u001a\u00020&J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u000201J\u001a\u00102\u001a\b\u0012\u0004\u0012\u000204032\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\nJ\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u000201J\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\nJ\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020:032\f\u00105\u001a\b\u0012\u0004\u0012\u00020:0\nJ\u000e\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u000201J\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001c0.2\u0006\u0010\'\u001a\u00020\u001cJ\u000e\u0010>\u001a\u00020#2\u0006\u0010<\u001a\u000201J\u000e\u0010?\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001cJ\u000e\u0010@\u001a\u00020&2\u0006\u0010\'\u001a\u000208J\u000e\u0010A\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0012J\u000e\u0010B\u001a\u00020&2\u0006\u0010\'\u001a\u00020#J\u000e\u0010C\u001a\u00020&2\u0006\u0010D\u001a\u00020\u000bJ4\u0010E\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u0002012\u0006\u0010F\u001a\u0002012\u0006\u0010G\u001a\u0002012\u0006\u0010H\u001a\u0002012\u0006\u0010I\u001a\u000201J\u001e\u0010J\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u0002012\b\u0010K\u001a\u0004\u0018\u000101J\u000e\u0010L\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000bJ\u000e\u0010M\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001cJ\u000e\u0010N\u001a\u00020&2\u0006\u0010\'\u001a\u000208J\u000e\u0010O\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000fJ\u000e\u0010P\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u00078FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\n8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\r\u00a8\u0006Q"}, d2 = {"Lcom/shopify/shopifyapp/repositories/Repository;", "", "apiCallInterface", "Lcom/shopify/shopifyapp/utils/ApiCallInterface;", "appdatabase", "Lcom/shopify/shopifyapp/dbconnection/database/AppDatabase;", "graphClient", "Lcom/shopify/buy3/GraphClient;", "(Lcom/shopify/shopifyapp/utils/ApiCallInterface;Lcom/shopify/shopifyapp/dbconnection/database/AppDatabase;Lcom/shopify/buy3/GraphClient;)V", "accessToken", "", "Lcom/shopify/shopifyapp/dbconnection/entities/CustomerTokenData;", "getAccessToken", "()Ljava/util/List;", "allCartItems", "Lcom/shopify/shopifyapp/dbconnection/entities/CartItemData;", "getAllCartItems", "allUserData", "Lcom/shopify/shopifyapp/dbconnection/entities/UserLocalData;", "getAllUserData", "getGraphClient", "()Lcom/shopify/buy3/GraphClient;", "setGraphClient", "(Lcom/shopify/buy3/GraphClient;)V", "isLogin", "", "()Z", "localData", "Lcom/shopify/shopifyapp/dbconnection/entities/AppLocalData;", "getLocalData", "requestHeader", "Lokhttp3/OkHttpClient;", "getRequestHeader$base_debug", "()Lokhttp3/OkHttpClient;", "wishListData", "Lcom/shopify/shopifyapp/dbconnection/entities/ItemData;", "getWishListData", "addSingLeItem", "", "data", "deleteSingLeItem", "deleteSingleData", "deleteUserData", "deleteWishListData", "deletecart", "getHomePage", "Lio/reactivex/Single;", "Lcom/google/gson/JsonElement;", "mid", "", "getList", "Lio/reactivex/Observable;", "Lcom/shopify/buy3/Storefront$ProductVariantEdge;", "list", "getMenus", "getPreviewData", "Lcom/shopify/shopifyapp/dbconnection/entities/LivePreviewData;", "getProductList", "Lcom/shopify/buy3/Storefront$ProductEdge;", "getSingLeItem", "id", "getSingle", "getSingleData", "insertData", "insertPreviewData", "insertUserData", "insertWishListData", "saveaccesstoken", "token", "setDevice", "device_id", "email", "type", "unique_id", "setOrder", "checkout_token", "updateAccessToken", "updateData", "updatePreviewData", "updateSingLeItem", "updateUserData", "base_debug"})
public final class Repository {
    private final com.shopify.shopifyapp.utils.ApiCallInterface apiCallInterface = null;
    private final com.shopify.shopifyapp.dbconnection.database.AppDatabase appdatabase = null;
    @org.jetbrains.annotations.NotNull()
    private com.shopify.buy3.GraphClient graphClient;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.GraphClient getGraphClient() {
        return null;
    }
    
    public final void setGraphClient(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.GraphClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getRequestHeader$base_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shopify.shopifyapp.dbconnection.entities.AppLocalData> getLocalData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shopify.shopifyapp.dbconnection.entities.ItemData> getWishListData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shopify.shopifyapp.dbconnection.entities.CartItemData> getAllCartItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shopify.shopifyapp.dbconnection.entities.UserLocalData> getAllUserData() {
        return null;
    }
    
    public final boolean isLogin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData> getAccessToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.google.gson.JsonElement> getMenus(@org.jetbrains.annotations.NotNull()
    java.lang.String mid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.google.gson.JsonElement> getHomePage(@org.jetbrains.annotations.NotNull()
    java.lang.String mid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.google.gson.JsonElement> setDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String mid, @org.jetbrains.annotations.NotNull()
    java.lang.String device_id, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String unique_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.google.gson.JsonElement> setOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String mid, @org.jetbrains.annotations.Nullable()
    java.lang.String checkout_token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.shopify.buy3.Storefront.ProductVariantEdge> getList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductVariantEdge> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.shopify.buy3.Storefront.ProductEdge> getProductList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> list) {
        return null;
    }
    
    public final void insertData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.AppLocalData data) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.AppLocalData data) {
    }
    
    public final void insertWishListData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.ItemData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.dbconnection.entities.ItemData getSingleData(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public final void deleteSingleData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.ItemData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.shopify.shopifyapp.dbconnection.entities.AppLocalData> getSingle(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.AppLocalData data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.dbconnection.entities.CartItemData getSingLeItem(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public final void addSingLeItem(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.CartItemData data) {
    }
    
    public final void updateSingLeItem(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.CartItemData data) {
    }
    
    public final void deleteSingLeItem(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.CartItemData data) {
    }
    
    public final void deletecart() {
    }
    
    public final void insertUserData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.UserLocalData data) {
    }
    
    public final void updateUserData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.UserLocalData data) {
    }
    
    public final void saveaccesstoken(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData token) {
    }
    
    public final void updateAccessToken(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData data) {
    }
    
    public final void deleteWishListData() {
    }
    
    public final void deleteUserData() {
    }
    
    public final void insertPreviewData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.LivePreviewData data) {
    }
    
    public final void updatePreviewData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.LivePreviewData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shopify.shopifyapp.dbconnection.entities.LivePreviewData> getPreviewData() {
        return null;
    }
    
    public Repository(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ApiCallInterface apiCallInterface, @org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.database.AppDatabase appdatabase, @org.jetbrains.annotations.NotNull()
    com.shopify.buy3.GraphClient graphClient) {
        super();
    }
}