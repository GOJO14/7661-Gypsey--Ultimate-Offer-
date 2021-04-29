package com.shopify.shopifyapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/shopify/shopifyapp/MyApplication;", "Landroidx/multidex/MultiDexApplication;", "()V", "mageNativeAppComponent", "Lcom/shopify/shopifyapp/dependecyinjection/MageNativeAppComponent;", "getMageNativeAppComponent", "()Lcom/shopify/shopifyapp/dependecyinjection/MageNativeAppComponent;", "setMageNativeAppComponent", "(Lcom/shopify/shopifyapp/dependecyinjection/MageNativeAppComponent;)V", "attachBaseContext", "", "context", "Landroid/content/Context;", "onCreate", "Companion", "base_debug"})
public final class MyApplication extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.Nullable()
    private com.shopify.shopifyapp.dependecyinjection.MageNativeAppComponent mageNativeAppComponent;
    @org.jetbrains.annotations.NotNull()
    public static com.shopify.shopifyapp.MyApplication context;
    private static com.google.firebase.database.FirebaseDatabase mFirebaseInstance;
    private static com.google.firebase.database.FirebaseDatabase mFirebaseSecondanyInstance;
    private static com.google.firebase.database.DatabaseReference database;
    public static final com.shopify.shopifyapp.MyApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.shopify.shopifyapp.dependecyinjection.MageNativeAppComponent getMageNativeAppComponent() {
        return null;
    }
    
    public final void setMageNativeAppComponent(@org.jetbrains.annotations.Nullable()
    com.shopify.shopifyapp.dependecyinjection.MageNativeAppComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public MyApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/shopify/shopifyapp/MyApplication$Companion;", "", "()V", "context", "Lcom/shopify/shopifyapp/MyApplication;", "getContext", "()Lcom/shopify/shopifyapp/MyApplication;", "setContext", "(Lcom/shopify/shopifyapp/MyApplication;)V", "dataBaseReference", "Lcom/google/firebase/database/DatabaseReference;", "getDataBaseReference", "()Lcom/google/firebase/database/DatabaseReference;", "database", "mFirebaseInstance", "Lcom/google/firebase/database/FirebaseDatabase;", "mFirebaseSecondanyInstance", "getmFirebaseInstance", "getmFirebaseSecondanyInstance", "base_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopify.shopifyapp.MyApplication getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.MyApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.firebase.database.FirebaseDatabase getmFirebaseInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.firebase.database.FirebaseDatabase getmFirebaseSecondanyInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.firebase.database.DatabaseReference getDataBaseReference() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}