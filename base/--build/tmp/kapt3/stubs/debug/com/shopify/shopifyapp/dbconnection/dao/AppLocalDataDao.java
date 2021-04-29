package com.shopify.shopifyapp.dbconnection.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\'J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\'J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\'J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\bH\'J\b\u0010\u0017\u001a\u00020\u000eH\'J\b\u0010\u0018\u001a\u00020\u000eH\'J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\'J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\bH\'J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\'J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\bH\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\u001d"}, d2 = {"Lcom/shopify/shopifyapp/dbconnection/dao/AppLocalDataDao;", "", "all", "", "Lcom/shopify/shopifyapp/dbconnection/entities/AppLocalData;", "getAll", "()Ljava/util/List;", "allUserData", "Lcom/shopify/shopifyapp/dbconnection/entities/UserLocalData;", "getAllUserData", "customerToken", "Lcom/shopify/shopifyapp/dbconnection/entities/CustomerTokenData;", "getCustomerToken", "InsertCustomerToken", "", "customerTokenData", "UpdateCustomerToken", "delete", "appLocalData", "deleteCustomerToken", "CustomerTokenData", "deleteUserData", "UserLocalData", "deleteall", "deletealldata", "insert", "insertUserData", "update", "updateUserData", "base_debug"})
public abstract interface AppLocalDataDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM applocaldata")
    public abstract java.util.List<com.shopify.shopifyapp.dbconnection.entities.AppLocalData> getAll();
    
    /**
     * *
     *
     * @return UserLocalData
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM UserLocalData")
    public abstract java.util.List<com.shopify.shopifyapp.dbconnection.entities.UserLocalData> getAllUserData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CustomerTokenData")
    public abstract java.util.List<com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData> getCustomerToken();
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.AppLocalData appLocalData);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.AppLocalData appLocalData);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.AppLocalData appLocalData);
    
    @androidx.room.Insert()
    public abstract void insertUserData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.UserLocalData UserLocalData);
    
    @androidx.room.Delete()
    public abstract void deleteUserData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.UserLocalData UserLocalData);
    
    @androidx.room.Update()
    public abstract void updateUserData(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.UserLocalData UserLocalData);
    
    @androidx.room.Query(value = "DELETE  FROM UserLocalData")
    public abstract void deletealldata();
    
    /**
     * *
     *
     * @param customerTokenData
     */
    @androidx.room.Insert()
    public abstract void InsertCustomerToken(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData customerTokenData);
    
    @androidx.room.Update()
    public abstract void UpdateCustomerToken(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData customerTokenData);
    
    @androidx.room.Delete()
    public abstract void deleteCustomerToken(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData CustomerTokenData);
    
    @androidx.room.Query(value = "DELETE  FROM CustomerTokenData")
    public abstract void deleteall();
}