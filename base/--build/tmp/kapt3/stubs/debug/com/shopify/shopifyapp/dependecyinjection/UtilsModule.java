package com.shopify.shopifyapp.dependecyinjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u00a2\u0006\u0002\b\u0010J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0014J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016H\u0001\u00a2\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u0003H\u0001\u00a2\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020!H\u0001\u00a2\u0006\u0002\b\"J\u001d\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\'"}, d2 = {"Lcom/shopify/shopifyapp/dependecyinjection/UtilsModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "requestHeader", "Lokhttp3/OkHttpClient;", "getRequestHeader$base_debug", "()Lokhttp3/OkHttpClient;", "getApiCallInterface", "Lcom/shopify/shopifyapp/utils/ApiCallInterface;", "retrofit", "Lretrofit2/Retrofit;", "getApiCallInterface$base_debug", "getAppDatabase", "Lcom/shopify/shopifyapp/dbconnection/database/AppDatabase;", "getAppDatabase$base_debug", "getGraphClient", "Lcom/shopify/buy3/GraphClient;", "client", "getGraphClient$base_debug", "getRepository", "Lcom/shopify/shopifyapp/repositories/Repository;", "apiCallInterface", "appDatabase", "getRepository$base_debug", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "myRepository", "getViewModelFactory$base_debug", "provideContext", "provideContext$base_debug", "provideGson", "Lcom/google/gson/Gson;", "provideGson$base_debug", "provideRetrofit", "gson", "okHttpClient", "provideRetrofit$base_debug", "base_debug"})
@dagger.Module()
public final class UtilsModule {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient getRequestHeader$base_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson$base_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit$base_debug(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.shopify.shopifyapp.utils.ApiCallInterface getApiCallInterface$base_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.shopify.shopifyapp.repositories.Repository getRepository$base_debug(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ApiCallInterface apiCallInterface, @org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.database.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    com.shopify.buy3.GraphClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory$base_debug(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository myRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext$base_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.shopify.shopifyapp.dbconnection.database.AppDatabase getAppDatabase$base_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.shopify.buy3.GraphClient getGraphClient$base_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    public UtilsModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}