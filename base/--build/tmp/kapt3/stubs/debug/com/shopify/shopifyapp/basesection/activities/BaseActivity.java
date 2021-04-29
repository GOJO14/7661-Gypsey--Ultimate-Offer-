package com.shopify.shopifyapp.basesection.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\"H\u0002J\b\u0010-\u001a\u00020\"H\u0004J\u0006\u0010.\u001a\u00020\"J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020+H\u0004R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00061"}, d2 = {"Lcom/shopify/shopifyapp/basesection/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/shopify/shopifyapp/basesection/fragments/BaseFragment$OnFragmentInteractionListener;", "()V", "drawer_layout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawer_layout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setDrawer_layout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "mDrawerToggle", "Landroidx/appcompat/app/ActionBarDrawerToggle;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "toolimage", "Landroid/widget/ImageView;", "getToolimage", "()Landroid/widget/ImageView;", "setToolimage", "(Landroid/widget/ImageView;)V", "tooltext", "Lcom/shopify/shopifyapp/customviews/MageNativeTextView;", "getTooltext", "()Lcom/shopify/shopifyapp/customviews/MageNativeTextView;", "setTooltext", "(Lcom/shopify/shopifyapp/customviews/MageNativeTextView;)V", "dpToPx", "", "dp", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentInteraction", "view", "Landroid/view/View;", "setLayout", "Landroidx/recyclerview/widget/RecyclerView;", "orientation", "", "setToggle", "showBackButton", "showHumburger", "showTittle", "tittle", "base_debug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.shopify.shopifyapp.basesection.fragments.BaseFragment.OnFragmentInteractionListener {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.toolbar)
    public androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.toolimage)
    public android.widget.ImageView toolimage;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.tooltext)
    public com.shopify.shopifyapp.customviews.MageNativeTextView tooltext;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.shopify.shopifyapp.R2.id.drawer_layout)
    public androidx.drawerlayout.widget.DrawerLayout drawer_layout;
    private androidx.appcompat.app.ActionBarDrawerToggle mDrawerToggle;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
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
    public final androidx.drawerlayout.widget.DrawerLayout getDrawer_layout() {
        return null;
    }
    
    public final void setDrawer_layout(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView setLayout(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.lang.String orientation) {
        return null;
    }
    
    private final int dpToPx(int dp) {
        return 0;
    }
    
    public BaseActivity() {
        super();
    }
}