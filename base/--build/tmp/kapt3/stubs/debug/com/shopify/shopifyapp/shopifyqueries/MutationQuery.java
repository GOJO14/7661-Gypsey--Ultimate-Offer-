package com.shopify.shopifyapp.shopifyqueries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ&\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ$\u0010\u0015\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0018"}, d2 = {"Lcom/shopify/shopifyapp/shopifyqueries/MutationQuery;", "", "()V", "addAddress", "Lcom/shopify/buy3/Storefront$MutationQuery;", "input", "Lcom/shopify/buy3/Storefront$MailingAddressInput;", "token", "", "createaccount", "firstname", "lastname", "email", "password", "deleteCustomerAddress", "address_id", "Lcom/shopify/graphql/support/ID;", "getLoginDetails", "username", "recoverCustomer", "renewToken", "updateAddress", "updateCustomer", "Lcom/shopify/buy3/Storefront$CustomerUpdateInput;", "base_debug"})
public final class MutationQuery {
    public static final com.shopify.shopifyapp.shopifyqueries.MutationQuery INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.MutationQuery getLoginDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.MutationQuery createaccount(@org.jetbrains.annotations.NotNull()
    java.lang.String firstname, @org.jetbrains.annotations.NotNull()
    java.lang.String lastname, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.MutationQuery renewToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.MutationQuery updateCustomer(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.Storefront.CustomerUpdateInput input, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.MutationQuery recoverCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.MutationQuery deleteCustomerAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    com.shopify.graphql.support.ID address_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.MutationQuery addAddress(@org.jetbrains.annotations.Nullable()
    com.shopify.buy3.Storefront.MailingAddressInput input, @org.jetbrains.annotations.Nullable()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.buy3.Storefront.MutationQuery updateAddress(@org.jetbrains.annotations.Nullable()
    com.shopify.buy3.Storefront.MailingAddressInput input, @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    com.shopify.graphql.support.ID address_id) {
        return null;
    }
    
    private MutationQuery() {
        super();
    }
}