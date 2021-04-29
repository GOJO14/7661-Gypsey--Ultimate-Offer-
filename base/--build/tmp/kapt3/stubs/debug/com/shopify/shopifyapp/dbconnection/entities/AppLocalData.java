package com.shopify.shopifyapp.dbconnection.entities;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/shopify/shopifyapp/dbconnection/entities/AppLocalData;", "Ljava/io/Serializable;", "()V", "currencycode", "", "getCurrencycode", "()Ljava/lang/String;", "setCurrencycode", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "isIstrialexpire", "", "()Z", "setIstrialexpire", "(Z)V", "trialexpiredata", "getTrialexpiredata", "setTrialexpiredata", "base_debug"})
public final class AppLocalData implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @androidx.room.ColumnInfo(name = "istrialexpire")
    private boolean isIstrialexpire;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "trialexpiredata")
    private java.lang.String trialexpiredata;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "currencycode")
    private java.lang.String currencycode;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final boolean isIstrialexpire() {
        return false;
    }
    
    public final void setIstrialexpire(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTrialexpiredata() {
        return null;
    }
    
    public final void setTrialexpiredata(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrencycode() {
        return null;
    }
    
    public final void setCurrencycode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public AppLocalData() {
        super();
    }
}