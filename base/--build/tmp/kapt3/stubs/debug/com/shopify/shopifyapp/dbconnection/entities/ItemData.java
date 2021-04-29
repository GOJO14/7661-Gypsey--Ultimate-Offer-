package com.shopify.shopifyapp.dbconnection.entities;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001e\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001e\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001e\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001e\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001e\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001e\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\b\u00a8\u0006&"}, d2 = {"Lcom/shopify/shopifyapp/dbconnection/entities/ItemData;", "Ljava/io/Serializable;", "()V", "image", "", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "isSet_strike", "", "()Z", "setSet_strike", "(Z)V", "normalprice", "getNormalprice", "setNormalprice", "offertext", "getOffertext", "setOffertext", "productname", "getProductname", "setProductname", "specialprice", "getSpecialprice", "setSpecialprice", "variant_id", "getVariant_id", "setVariant_id", "variant_one", "getVariant_one", "setVariant_one", "variant_three", "getVariant_three", "setVariant_three", "variant_two", "getVariant_two", "setVariant_two", "base_debug"})
public final class ItemData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "variant_id")
    @androidx.room.PrimaryKey()
    public java.lang.String variant_id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "productname")
    public java.lang.String productname;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "normalprice")
    public java.lang.String normalprice;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "specialprice")
    public java.lang.String specialprice;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "variant_one")
    public java.lang.String variant_one;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "variant_two")
    public java.lang.String variant_two;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "variant_three")
    public java.lang.String variant_three;
    @androidx.room.ColumnInfo(name = "set_strike")
    private boolean isSet_strike;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "image")
    public java.lang.String image;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "offertext")
    public java.lang.String offertext;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVariant_id() {
        return null;
    }
    
    public final void setVariant_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductname() {
        return null;
    }
    
    public final void setProductname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNormalprice() {
        return null;
    }
    
    public final void setNormalprice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpecialprice() {
        return null;
    }
    
    public final void setSpecialprice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVariant_one() {
        return null;
    }
    
    public final void setVariant_one(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVariant_two() {
        return null;
    }
    
    public final void setVariant_two(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVariant_three() {
        return null;
    }
    
    public final void setVariant_three(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSet_strike() {
        return false;
    }
    
    public final void setSet_strike(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOffertext() {
        return null;
    }
    
    public final void setOffertext(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ItemData() {
        super();
    }
}