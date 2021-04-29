package com.shopify.shopifyapp.dbconnection.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "LivePreviewData")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/shopify/shopifyapp/dbconnection/entities/LivePreviewData;", "Ljava/io/Serializable;", "mid", "", "shopurl", "apikey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApikey", "()Ljava/lang/String;", "setApikey", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "getMid", "setMid", "getShopurl", "setShopurl", "base_debug"})
public final class LivePreviewData implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "mid")
    private java.lang.String mid;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "shopurl")
    private java.lang.String shopurl;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "apikey")
    private java.lang.String apikey;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMid() {
        return null;
    }
    
    public final void setMid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShopurl() {
        return null;
    }
    
    public final void setShopurl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApikey() {
        return null;
    }
    
    public final void setApikey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public LivePreviewData(@org.jetbrains.annotations.NotNull()
    java.lang.String mid, @org.jetbrains.annotations.NotNull()
    java.lang.String shopurl, @org.jetbrains.annotations.NotNull()
    java.lang.String apikey) {
        super();
    }
}