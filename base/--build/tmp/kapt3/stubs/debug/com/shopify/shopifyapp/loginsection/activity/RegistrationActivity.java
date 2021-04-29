package com.shopify.shopifyapp.loginsection.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/shopify/shopifyapp/loginsection/activity/RegistrationActivity;", "Lcom/shopify/shopifyapp/basesection/activities/BaseActivity;", "()V", "binding", "Lcom/shopify/shopifyapp/base/databinding/MRegistrationpageBinding;", "factory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "model", "Lcom/shopify/shopifyapp/loginsection/viewmodels/RegistrationViewModel;", "consumeLoginResponse", "", "token", "Lcom/shopify/buy3/Storefront$CustomerAccessToken;", "consumeResponse", "customer", "Lcom/shopify/buy3/Storefront$Customer;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showToast", "msg", "", "MyClickHandlers", "base_debug"})
public final class RegistrationActivity extends com.shopify.shopifyapp.basesection.activities.BaseActivity {
    private com.shopify.shopifyapp.databinding.MRegistrationpageBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory factory;
    private com.shopify.shopifyapp.loginsection.viewmodels.RegistrationViewModel model;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    private final void consumeLoginResponse(com.shopify.buy3.Storefront.CustomerAccessToken token) {
    }
    
    private final void consumeResponse(com.shopify.buy3.Storefront.Customer customer) {
    }
    
    public RegistrationActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/shopify/shopifyapp/loginsection/activity/RegistrationActivity$MyClickHandlers;", "", "context", "Landroid/content/Context;", "(Lcom/shopify/shopifyapp/loginsection/activity/RegistrationActivity;Landroid/content/Context;)V", "RegistrationRequest", "", "view", "Landroid/view/View;", "base_debug"})
    public final class MyClickHandlers {
        private final android.content.Context context = null;
        
        public final void RegistrationRequest(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public MyClickHandlers(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
}