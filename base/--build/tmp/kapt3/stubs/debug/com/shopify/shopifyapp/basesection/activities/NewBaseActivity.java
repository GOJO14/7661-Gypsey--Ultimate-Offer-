package com.shopify.shopifyapp.basesection.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010P\u001a\u00020QJ\u0010\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000bH\u0002J\u0006\u0010W\u001a\u00020QJ\"\u0010X\u001a\u00020Q2\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0014J\u0012\u0010]\u001a\u00020Q2\b\u0010^\u001a\u0004\u0018\u00010_H\u0014J\u0010\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cH\u0016J\u0010\u0010d\u001a\u00020Q2\u0006\u0010e\u001a\u00020fH\u0016J\b\u0010g\u001a\u00020QH\u0014J\u0016\u0010h\u001a\u00020Q2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020k0jH\u0002J\u001e\u0010l\u001a\u00020Q2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020n2\u0006\u0010p\u001a\u00020nJ\u0016\u0010q\u001a\u00020r2\u0006\u0010e\u001a\u00020r2\u0006\u0010s\u001a\u00020nJ\u000e\u0010t\u001a\u00020Q2\u0006\u0010u\u001a\u00020nJ\u000e\u0010v\u001a\u00020Q2\u0006\u0010w\u001a\u00020nJ\u0016\u0010x\u001a\u00020Q2\u0006\u0010y\u001a\u00020n2\u0006\u0010z\u001a\u00020nJ\u001e\u0010{\u001a\u00020Q2\u0006\u0010|\u001a\u00020n2\u0006\u0010}\u001a\u00020n2\u0006\u0010~\u001a\u00020nJ\b\u0010\u007f\u001a\u00020QH\u0002J\u0010\u0010\u0080\u0001\u001a\u00020Q2\u0007\u0010\u0081\u0001\u001a\u00020nJ\t\u0010\u0082\u0001\u001a\u00020QH\u0004J\u0007\u0010\u0083\u0001\u001a\u00020QJ\u0018\u0010\u0084\u0001\u001a\u00020Q2\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020k0jH\u0002J\u0012\u0010\u0086\u0001\u001a\u00020Q2\u0007\u0010\u0087\u0001\u001a\u00020nH\u0004J\u0012\u0010\u0088\u0001\u001a\u00020Q2\u0007\u0010\u0089\u0001\u001a\u00020nH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\'\u001a\u0004\u0018\u00010(@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010D\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010/\"\u0004\bF\u00101R\u001e\u0010G\u001a\u00020H8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0011\"\u0004\bO\u0010\u0013\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/shopify/shopifyapp/basesection/activities/NewBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/shopify/shopifyapp/basesection/fragments/BaseFragment$OnFragmentInteractionListener;", "()V", "adapter", "Lcom/shopify/shopifyapp/basesection/adapters/RecylerAdapter;", "getAdapter", "()Lcom/shopify/shopifyapp/basesection/adapters/RecylerAdapter;", "setAdapter", "(Lcom/shopify/shopifyapp/basesection/adapters/RecylerAdapter;)V", "cartCount", "", "getCartCount", "()I", "cartitem", "Landroid/view/MenuItem;", "getCartitem", "()Landroid/view/MenuItem;", "setCartitem", "(Landroid/view/MenuItem;)V", "drawer_layout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawer_layout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setDrawer_layout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getFab", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setFab", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "item", "getItem", "setItem", "listDialog", "Landroid/app/Dialog;", "mDrawerToggle", "Landroidx/appcompat/app/ActionBarDrawerToggle;", "<set-?>", "Lcom/shopify/shopifyapp/basesection/viewmodels/LeftMenuViewModel;", "model", "getModel", "()Lcom/shopify/shopifyapp/basesection/viewmodels/LeftMenuViewModel;", "search", "Lcom/shopify/shopifyapp/customviews/MageNativeTextView;", "getSearch", "()Lcom/shopify/shopifyapp/customviews/MageNativeTextView;", "setSearch", "(Lcom/shopify/shopifyapp/customviews/MageNativeTextView;)V", "searchsection", "Landroid/widget/RelativeLayout;", "getSearchsection", "()Landroid/widget/RelativeLayout;", "setSearchsection", "(Landroid/widget/RelativeLayout;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "toolimage", "Landroid/widget/ImageView;", "getToolimage", "()Landroid/widget/ImageView;", "setToolimage", "(Landroid/widget/ImageView;)V", "tooltext", "getTooltext", "setTooltext", "viewModelFactory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getViewModelFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setViewModelFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "wishitem", "getWishitem", "setWishitem", "closePopUp", "", "consumeResponse", "reponse", "Lcom/shopify/shopifyapp/utils/ApiResponse;", "dpToPx", "dp", "getCurrency", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onFragmentInteraction", "view", "Landroid/view/View;", "onResume", "preparePopUp", "currencyCodes", "", "Lcom/shopify/buy3/Storefront$CurrencyCode;", "setIconColors", "countback", "", "counttext", "iconcolor", "setLayout", "Landroidx/recyclerview/widget/RecyclerView;", "orientation", "setLogoImage", "url", "setPanelBackgroundColor", "color", "setSearchOption", "type", "placeholder", "setSearchOptions", "searchback", "searchtext", "searhcborder", "setToggle", "setWishList", "visiblity", "showBackButton", "showHumburger", "showPopUp", "enabledPresentmentCurrencies", "showTittle", "tittle", "showToast", "msg", "base_debug"})
public class NewBaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.shopify.shopifyapp.basesection.fragments.BaseFragment.OnFragmentInteractionListener {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.toolbar)
    public androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.fab)
    public com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.toolimage)
    public android.widget.ImageView toolimage;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.tooltext)
    public com.shopify.shopifyapp.customviews.MageNativeTextView tooltext;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.searchsection)
    public android.widget.RelativeLayout searchsection;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.drawer_layout)
    public androidx.drawerlayout.widget.DrawerLayout drawer_layout;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.search)
    public com.shopify.shopifyapp.customviews.MageNativeTextView search;
    private androidx.appcompat.app.ActionBarDrawerToggle mDrawerToggle;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.Nullable()
    private com.shopify.shopifyapp.basesection.viewmodels.LeftMenuViewModel model;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.basesection.adapters.RecylerAdapter adapter;
    private android.app.Dialog listDialog;
    @org.jetbrains.annotations.NotNull()
    public android.view.MenuItem item;
    @org.jetbrains.annotations.NotNull()
    public android.view.MenuItem wishitem;
    @org.jetbrains.annotations.NotNull()
    public android.view.MenuItem cartitem;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.floatingactionbutton.FloatingActionButton getFab() {
        return null;
    }
    
    public final void setFab(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getToolimage() {
        return null;
    }
    
    public final void setToolimage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.customviews.MageNativeTextView getTooltext() {
        return null;
    }
    
    public final void setTooltext(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.customviews.MageNativeTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getSearchsection() {
        return null;
    }
    
    public final void setSearchsection(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.drawerlayout.widget.DrawerLayout getDrawer_layout() {
        return null;
    }
    
    public final void setDrawer_layout(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.customviews.MageNativeTextView getSearch() {
        return null;
    }
    
    public final void setSearch(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.customviews.MageNativeTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.shopify.shopifyapp.basesection.viewmodels.LeftMenuViewModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.basesection.adapters.RecylerAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.basesection.adapters.RecylerAdapter p0) {
    }
    
    private final int getCartCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.MenuItem getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.MenuItem getWishitem() {
        return null;
    }
    
    public final void setWishitem(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.MenuItem getCartitem() {
        return null;
    }
    
    public final void setCartitem(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setToggle() {
    }
    
    protected final void showBackButton() {
    }
    
    public final void showHumburger() {
    }
    
    protected final void showTittle(@org.jetbrains.annotations.NotNull()
    java.lang.String tittle) {
    }
    
    @java.lang.Override()
    public void onFragmentInteraction(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.ApiResponse reponse) {
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    public final void getCurrency() {
    }
    
    private final void preparePopUp(java.util.List<? extends com.shopify.buy3.Storefront.CurrencyCode> currencyCodes) {
    }
    
    private final void showPopUp(java.util.List<? extends com.shopify.buy3.Storefront.CurrencyCode> enabledPresentmentCurrencies) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView setLayout(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.lang.String orientation) {
        return null;
    }
    
    public final void closePopUp() {
    }
    
    private final int dpToPx(int dp) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void setSearchOption(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String placeholder) {
    }
    
    public final void setWishList(@org.jetbrains.annotations.NotNull()
    java.lang.String visiblity) {
    }
    
    public final void setLogoImage(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void setPanelBackgroundColor(@org.jetbrains.annotations.NotNull()
    java.lang.String color) {
    }
    
    public final void setIconColors(@org.jetbrains.annotations.NotNull()
    java.lang.String countback, @org.jetbrains.annotations.NotNull()
    java.lang.String counttext, @org.jetbrains.annotations.NotNull()
    java.lang.String iconcolor) {
    }
    
    public final void setSearchOptions(@org.jetbrains.annotations.NotNull()
    java.lang.String searchback, @org.jetbrains.annotations.NotNull()
    java.lang.String searchtext, @org.jetbrains.annotations.NotNull()
    java.lang.String searhcborder) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public NewBaseActivity() {
        super();
    }
}