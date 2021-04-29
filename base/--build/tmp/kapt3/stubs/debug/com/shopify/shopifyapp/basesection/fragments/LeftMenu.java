package com.shopify.shopifyapp.basesection.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/shopify/shopifyapp/basesection/fragments/LeftMenu;", "Lcom/shopify/shopifyapp/basesection/fragments/BaseFragment;", "()V", "binding", "Lcom/shopify/shopifyapp/base/databinding/MLeftmenufragmentBinding;", "currentactivity", "Landroid/app/Activity;", "viewModelFactory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getViewModelFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setViewModelFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "consumeResponse", "", "hash", "Ljava/util/HashMap;", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDetach", "onResume", "ClickHandlers", "Companion", "base_debug"})
public final class LeftMenu extends com.shopify.shopifyapp.basesection.fragments.BaseFragment {
    private com.shopify.shopifyapp.databinding.MLeftmenufragmentBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory viewModelFactory;
    private android.app.Activity currentactivity;
    @org.jetbrains.annotations.NotNull()
    public static androidx.appcompat.widget.LinearLayoutCompat menulist;
    private static android.content.Context currentcontext;
    @org.jetbrains.annotations.NotNull()
    protected static com.shopify.shopifyapp.basesection.viewmodels.LeftMenuViewModel leftmenu;
    private static com.shopify.shopifyapp.basesection.models.MenuData menuData;
    public static final com.shopify.shopifyapp.basesection.fragments.LeftMenu.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void consumeResponse(java.util.HashMap<java.lang.String, java.lang.String> hash) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public LeftMenu() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/shopify/shopifyapp/basesection/fragments/LeftMenu$ClickHandlers;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext$base_debug", "()Landroid/content/Context;", "setContext$base_debug", "open", "", "expandMenu", "", "view", "Landroid/view/View;", "getMenu", "menudata", "Lcom/shopify/shopifyapp/basesection/models/MenuData;", "navigationClicks", "base_debug"})
    public static final class ClickHandlers {
        private boolean open;
        @org.jetbrains.annotations.Nullable()
        private android.content.Context context;
        
        public final void getMenu(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.basesection.models.MenuData menudata) {
        }
        
        public final void expandMenu(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void navigationClicks(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getContext$base_debug() {
            return null;
        }
        
        public final void setContext$base_debug(@org.jetbrains.annotations.Nullable()
        android.content.Context p0) {
        }
        
        public ClickHandlers(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/shopify/shopifyapp/basesection/fragments/LeftMenu$Companion;", "", "()V", "currentcontext", "Landroid/content/Context;", "leftmenu", "Lcom/shopify/shopifyapp/basesection/viewmodels/LeftMenuViewModel;", "getLeftmenu", "()Lcom/shopify/shopifyapp/basesection/viewmodels/LeftMenuViewModel;", "setLeftmenu", "(Lcom/shopify/shopifyapp/basesection/viewmodels/LeftMenuViewModel;)V", "menuData", "Lcom/shopify/shopifyapp/basesection/models/MenuData;", "menulist", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getMenulist", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setMenulist", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "renderSuccessResponse", "", "data", "Lcom/google/gson/JsonElement;", "updateMenu", "array", "Lorg/json/JSONArray;", "base_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.LinearLayoutCompat getMenulist() {
            return null;
        }
        
        public final void setMenulist(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.LinearLayoutCompat p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final com.shopify.shopifyapp.basesection.viewmodels.LeftMenuViewModel getLeftmenu() {
            return null;
        }
        
        protected final void setLeftmenu(@org.jetbrains.annotations.NotNull()
        com.shopify.shopifyapp.basesection.viewmodels.LeftMenuViewModel p0) {
        }
        
        public final void renderSuccessResponse(@org.jetbrains.annotations.NotNull()
        com.google.gson.JsonElement data) {
        }
        
        private final void updateMenu(org.json.JSONArray array, androidx.appcompat.widget.LinearLayoutCompat menulist) {
        }
        
        private Companion() {
            super();
        }
    }
}