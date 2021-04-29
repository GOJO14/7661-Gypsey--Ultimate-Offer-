package com.shopify.shopifyapp.homesection.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018H\u0016J\u001e\u0010#\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/shopify/shopifyapp/homesection/adapters/CollectionSliderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/shopify/shopifyapp/collectionsection/viewholders/CollectionItem;", "()V", "<set-?>", "Landroid/app/Activity;", "activity", "getActivity", "()Landroid/app/Activity;", "collectionEdges", "Lorg/json/JSONArray;", "getCollectionEdges", "()Lorg/json/JSONArray;", "setCollectionEdges", "(Lorg/json/JSONArray;)V", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "setJsonObject", "(Lorg/json/JSONObject;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "base_debug"})
public final class CollectionSliderAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.shopify.shopifyapp.collectionsection.viewholders.CollectionItem> {
    private android.view.LayoutInflater layoutInflater;
    @org.jetbrains.annotations.NotNull()
    public org.json.JSONArray collectionEdges;
    @org.jetbrains.annotations.NotNull()
    public org.json.JSONObject jsonObject;
    @org.jetbrains.annotations.Nullable()
    private android.app.Activity activity;
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONArray getCollectionEdges() {
        return null;
    }
    
    public final void setCollectionEdges(@org.jetbrains.annotations.NotNull()
    org.json.JSONArray p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject getJsonObject() {
        return null;
    }
    
    public final void setJsonObject(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    org.json.JSONArray collectionEdges, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shopify.shopifyapp.collectionsection.viewholders.CollectionItem onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.collectionsection.viewholders.CollectionItem holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @javax.inject.Inject()
    public CollectionSliderAdapter() {
        super();
    }
}