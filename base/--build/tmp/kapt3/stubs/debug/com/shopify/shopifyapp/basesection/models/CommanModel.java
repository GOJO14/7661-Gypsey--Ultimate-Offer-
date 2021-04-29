package com.shopify.shopifyapp.basesection.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/shopify/shopifyapp/basesection/models/CommanModel;", "Landroidx/databinding/BaseObservable;", "()V", "imageurl", "", "getImageurl", "()Ljava/lang/String;", "setImageurl", "(Ljava/lang/String;)V", "Companion", "base_debug"})
public final class CommanModel extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageurl;
    public static final com.shopify.shopifyapp.basesection.models.CommanModel.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getImageurl() {
        return null;
    }
    
    public final void setImageurl(@org.jetbrains.annotations.Nullable()
    java.lang.String imageurl) {
    }
    
    public CommanModel() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"circleImageUrl"})
    public static final void circleLoadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"radius", "url"})
    public static final void Image(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String radius, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/shopify/shopifyapp/basesection/models/CommanModel$Companion;", "", "()V", "Image", "", "view", "Landroid/widget/ImageView;", "radius", "", "url", "circleLoadImage", "imageUrl", "loadImage", "base_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"imageUrl"})
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"circleImageUrl"})
        public final void circleLoadImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"radius", "url"})
        public final void Image(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
        java.lang.String radius, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
        }
        
        private Companion() {
            super();
        }
    }
}