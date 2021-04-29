package com.shopify.shopifyapp.basesection.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/shopify/shopifyapp/basesection/activities/Splash;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/shopify/shopifyapp/base/databinding/MSplashBinding;", "product_id", "", "splashmodel", "Lcom/shopify/shopifyapp/basesection/viewmodels/SplashViewModel;", "viewModelFactory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getViewModelFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setViewModelFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "consumeErrorResponse", "", "error", "consumeResponse", "reponse", "Lcom/shopify/shopifyapp/utils/FireBaseResponse;", "Lcom/shopify/shopifyapp/utils/LocalDbResponse;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "renderSuccessResponse", "data", "Lcom/google/firebase/database/DataSnapshot;", "Lcom/shopify/shopifyapp/dbconnection/entities/AppLocalData;", "base_debug"})
public final class Splash extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory viewModelFactory;
    private com.shopify.shopifyapp.basesection.viewmodels.SplashViewModel splashmodel;
    private com.shopify.shopifyapp.databinding.MSplashBinding binding;
    private java.lang.String product_id;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void consumeErrorResponse(java.lang.String error) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.LocalDbResponse reponse) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.FireBaseResponse reponse) {
    }
    
    private final void renderSuccessResponse(com.shopify.shopifyapp.dbconnection.entities.AppLocalData data) {
    }
    
    private final void renderSuccessResponse(com.google.firebase.database.DataSnapshot data) {
    }
    
    public Splash() {
        super();
    }
}