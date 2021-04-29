package com.shopify.shopifyapp.dbconnection.database;

import java.lang.System;

@androidx.room.Database(entities = {com.shopify.shopifyapp.dbconnection.entities.AppLocalData.class, com.shopify.shopifyapp.dbconnection.entities.UserLocalData.class, com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData.class, com.shopify.shopifyapp.dbconnection.entities.ItemData.class, com.shopify.shopifyapp.dbconnection.entities.CartItemData.class, com.shopify.shopifyapp.dbconnection.entities.LivePreviewData.class}, version = 8)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/shopify/shopifyapp/dbconnection/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cartItemDataDao", "Lcom/shopify/shopifyapp/dbconnection/dao/CartItemDataDao;", "getCartItemDataDao", "()Lcom/shopify/shopifyapp/dbconnection/dao/CartItemDataDao;", "itemDataDao", "Lcom/shopify/shopifyapp/dbconnection/dao/ItemDataDao;", "getItemDataDao", "()Lcom/shopify/shopifyapp/dbconnection/dao/ItemDataDao;", "appLocalDataDaoDao", "Lcom/shopify/shopifyapp/dbconnection/dao/AppLocalDataDao;", "getLivePreviewDao", "Lcom/shopify/shopifyapp/dbconnection/dao/LivePreviewDao;", "base_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopify.shopifyapp.dbconnection.dao.ItemDataDao getItemDataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopify.shopifyapp.dbconnection.dao.CartItemDataDao getCartItemDataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopify.shopifyapp.dbconnection.dao.AppLocalDataDao appLocalDataDaoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopify.shopifyapp.dbconnection.dao.LivePreviewDao getLivePreviewDao();
    
    public AppDatabase() {
        super();
    }
}