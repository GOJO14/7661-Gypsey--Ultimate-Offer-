package com.shopify.shopifyapp.wishlistsection.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\u0007R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007R&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0005\"\u0004\b\u001b\u0010\u0007R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0005\"\u0004\b\u001e\u0010\u0007R*\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0005\"\u0004\b!\u0010\u0007R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0005\"\u0004\b$\u0010\u0007R\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0005\"\u0004\b\'\u0010\u0007R\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0005\"\u0004\b*\u0010\u0007\u00a8\u0006+"}, d2 = {"Lcom/shopify/shopifyapp/wishlistsection/models/WishListItem;", "Landroidx/databinding/BaseObservable;", "()V", "isImage", "", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "isSet_strike", "", "()Z", "setSet_strike", "(Z)V", "normalprice", "getNormalprice", "setNormalprice", "offertext", "getOffertext", "setOffertext", "position", "", "getPosition", "()I", "setPosition", "(I)V", "productname", "getProductname", "setProductname", "specialprice", "getSpecialprice", "setSpecialprice", "variant_id", "getVariant_id", "setVariant_id", "variant_one", "getVariant_one", "setVariant_one", "variant_three", "getVariant_three", "setVariant_three", "variant_two", "getVariant_two", "setVariant_two", "base_debug"})
public final class WishListItem extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String variant_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productname;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String normalprice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String specialprice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String variant_one;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String variant_two;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String variant_three;
    private boolean isSet_strike;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isImage;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String offertext;
    private int position;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getVariant_id() {
        return null;
    }
    
    public final void setVariant_id(@org.jetbrains.annotations.Nullable()
    java.lang.String variant_id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductname() {
        return null;
    }
    
    public final void setProductname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNormalprice() {
        return null;
    }
    
    public final void setNormalprice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpecialprice() {
        return null;
    }
    
    public final void setSpecialprice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVariant_one() {
        return null;
    }
    
    public final void setVariant_one(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVariant_two() {
        return null;
    }
    
    public final void setVariant_two(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVariant_three() {
        return null;
    }
    
    public final void setVariant_three(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isSet_strike() {
        return false;
    }
    
    public final void setSet_strike(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String isImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOffertext() {
        return null;
    }
    
    public final void setOffertext(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @androidx.databinding.Bindable()
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int position) {
    }
    
    public WishListItem() {
        super();
    }
}