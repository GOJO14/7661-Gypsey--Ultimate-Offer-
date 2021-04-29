package com.shopify.shopifyapp.dbconnection.entities;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/shopify/shopifyapp/dbconnection/entities/CartItemData;", "Ljava/io/Serializable;", "()V", "qty", "", "getQty", "()I", "setQty", "(I)V", "variant_id", "", "getVariant_id", "()Ljava/lang/String;", "setVariant_id", "(Ljava/lang/String;)V", "base_debug"})
public final class CartItemData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "variant_id")
    @androidx.room.PrimaryKey()
    public java.lang.String variant_id;
    @androidx.room.ColumnInfo(name = "qty")
    private int qty;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVariant_id() {
        return null;
    }
    
    public final void setVariant_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getQty() {
        return 0;
    }
    
    public final void setQty(int p0) {
    }
    
    public CartItemData() {
        super();
    }
}