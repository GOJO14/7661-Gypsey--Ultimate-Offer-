package com.shopify.shopifyapp.dbconnection.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/shopify/shopifyapp/dbconnection/dao/LivePreviewDao;", "", "getPreviewDetails", "", "Lcom/shopify/shopifyapp/dbconnection/entities/LivePreviewData;", "getGetPreviewDetails", "()Ljava/util/List;", "delete", "", "data", "insert", "update", "base_debug"})
public abstract interface LivePreviewDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM LivePreviewData")
    public abstract java.util.List<com.shopify.shopifyapp.dbconnection.entities.LivePreviewData> getGetPreviewDetails();
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.LivePreviewData data);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.LivePreviewData data);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.LivePreviewData data);
}