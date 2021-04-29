package com.shopify.shopifyapp.searchsection.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\"\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0012\u00102\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0012\u00105\u001a\u00020*2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020:H\u0016J+\u0010;\u001a\u00020&2\u0006\u0010.\u001a\u00020\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020,0=2\u0006\u0010>\u001a\u00020?H\u0016\u00a2\u0006\u0002\u0010@J\b\u0010A\u001a\u00020&H\u0002J\u0016\u0010B\u001a\u00020&2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002J\u0010\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u00020,H\u0002J\u0006\u0010H\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lcom/shopify/shopifyapp/searchsection/activities/AutoSearch;", "Lcom/shopify/shopifyapp/basesection/activities/BaseActivity;", "()V", "PERMISSION_REQUEST_CODE", "", "adapter", "Lcom/shopify/shopifyapp/searchsection/adapters/SearchRecylerAdapter;", "getAdapter", "()Lcom/shopify/shopifyapp/searchsection/adapters/SearchRecylerAdapter;", "setAdapter", "(Lcom/shopify/shopifyapp/searchsection/adapters/SearchRecylerAdapter;)V", "binding", "Lcom/shopify/shopifyapp/base/databinding/MAutosearchBinding;", "camera", "Lcom/mindorks/paracamera/Camera;", "factory", "Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "getFactory", "()Lcom/shopify/shopifyapp/utils/ViewModelFactory;", "setFactory", "(Lcom/shopify/shopifyapp/utils/ViewModelFactory;)V", "image", "Lcom/google/firebase/ml/vision/common/FirebaseVisionImage;", "getImage", "()Lcom/google/firebase/ml/vision/common/FirebaseVisionImage;", "setImage", "(Lcom/google/firebase/ml/vision/common/FirebaseVisionImage;)V", "labeler", "Lcom/google/firebase/ml/vision/label/FirebaseVisionImageLabeler;", "getLabeler", "()Lcom/google/firebase/ml/vision/label/FirebaseVisionImageLabeler;", "setLabeler", "(Lcom/google/firebase/ml/vision/label/FirebaseVisionImageLabeler;)V", "model", "Lcom/shopify/shopifyapp/searchsection/viewmodels/SearchListModel;", "viewlist", "Landroidx/recyclerview/widget/RecyclerView;", "checkImage", "", "bitmap", "Landroid/graphics/Bitmap;", "hasPermission", "", "permission", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestPermissions", "setRecylerData", "products", "", "Lcom/shopify/buy3/Storefront$ProductEdge;", "showToast", "msg", "takePicture", "base_debug"})
public final class AutoSearch extends com.shopify.shopifyapp.basesection.activities.BaseActivity {
    private com.shopify.shopifyapp.databinding.MAutosearchBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.utils.ViewModelFactory factory;
    private com.shopify.shopifyapp.searchsection.viewmodels.SearchListModel model;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.searchsection.adapters.SearchRecylerAdapter adapter;
    private androidx.recyclerview.widget.RecyclerView viewlist;
    private com.mindorks.paracamera.Camera camera;
    private final int PERMISSION_REQUEST_CODE = 1;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.ml.vision.common.FirebaseVisionImage image;
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.ml.vision.label.FirebaseVisionImageLabeler labeler;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.utils.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.searchsection.adapters.SearchRecylerAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.searchsection.adapters.SearchRecylerAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.ml.vision.common.FirebaseVisionImage getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    com.google.firebase.ml.vision.common.FirebaseVisionImage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.ml.vision.label.FirebaseVisionImageLabeler getLabeler() {
        return null;
    }
    
    public final void setLabeler(@org.jetbrains.annotations.NotNull()
    com.google.firebase.ml.vision.label.FirebaseVisionImageLabeler p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    private final void setRecylerData(java.util.List<? extends com.shopify.buy3.Storefront.ProductEdge> products) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void takePicture() {
    }
    
    private final void requestPermissions() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void checkImage(android.graphics.Bitmap bitmap) {
    }
    
    private final boolean hasPermission(java.lang.String permission) {
        return false;
    }
    
    public AutoSearch() {
        super();
    }
}