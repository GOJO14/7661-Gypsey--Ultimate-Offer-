package com.shopify.shopifyapp.addresssection.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R*\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR*\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR*\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR*\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR*\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR*\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR&\u0010\"\u001a\u00020#2\u0006\u0010\"\u001a\u00020#8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R*\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR*\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010\u00058G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\t\u00a8\u0006."}, d2 = {"Lcom/shopify/shopifyapp/addresssection/models/Address;", "Landroidx/databinding/BaseObservable;", "Ljava/io/Serializable;", "()V", "address1", "", "getAddress1", "()Ljava/lang/String;", "setAddress1", "(Ljava/lang/String;)V", "address2", "getAddress2", "setAddress2", "address_id", "Lcom/shopify/graphql/support/ID;", "getAddress_id", "()Lcom/shopify/graphql/support/ID;", "setAddress_id", "(Lcom/shopify/graphql/support/ID;)V", "city", "getCity", "setCity", "country", "getCountry", "setCountry", "firstName", "getFirstName", "setFirstName", "lastName", "getLastName", "setLastName", "phone", "getPhone", "setPhone", "position", "", "getPosition", "()I", "setPosition", "(I)V", "province", "getProvince", "setProvince", "zip", "getZip", "setZip", "base_debug"})
public final class Address extends androidx.databinding.BaseObservable implements java.io.Serializable {
    private int position;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String firstName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String address1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String address2;
    @org.jetbrains.annotations.Nullable()
    private com.shopify.graphql.support.ID address_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String province;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String city;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String country;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String phone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String zip;
    
    @androidx.databinding.Bindable()
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.Nullable()
    java.lang.String firstName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.Nullable()
    java.lang.String lastName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getAddress1() {
        return null;
    }
    
    public final void setAddress1(@org.jetbrains.annotations.Nullable()
    java.lang.String address1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getAddress2() {
        return null;
    }
    
    public final void setAddress2(@org.jetbrains.annotations.Nullable()
    java.lang.String address2) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final com.shopify.graphql.support.ID getAddress_id() {
        return null;
    }
    
    public final void setAddress_id(@org.jetbrains.annotations.Nullable()
    com.shopify.graphql.support.ID address_id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getProvince() {
        return null;
    }
    
    public final void setProvince(@org.jetbrains.annotations.Nullable()
    java.lang.String province) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    java.lang.String city) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String country) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String phone) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getZip() {
        return null;
    }
    
    public final void setZip(@org.jetbrains.annotations.Nullable()
    java.lang.String zip) {
    }
    
    public Address() {
        super();
    }
}