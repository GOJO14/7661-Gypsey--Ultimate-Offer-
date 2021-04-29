package com.shopify.shopifyapp.dbconnection.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "CustomerTokenData")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/shopify/shopifyapp/dbconnection/entities/CustomerTokenData;", "Ljava/io/Serializable;", "customerAccessToken", "", "expireTime", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerAccessToken", "()Ljava/lang/String;", "setCustomerAccessToken", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "getExpireTime", "setExpireTime", "id", "", "getId", "()I", "setId", "(I)V", "base_debug"})
public final class CustomerTokenData implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ExpireTime")
    private java.lang.String expireTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "email")
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CustomerAccessToken")
    private java.lang.String customerAccessToken;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExpireTime() {
        return null;
    }
    
    public final void setExpireTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerAccessToken() {
        return null;
    }
    
    public final void setCustomerAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public CustomerTokenData(@org.jetbrains.annotations.Nullable()
    java.lang.String customerAccessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String expireTime) {
        super();
    }
}