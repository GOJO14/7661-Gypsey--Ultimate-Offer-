package com.shopify.shopifyapp.addresssection.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(H\u0002J\u0016\u0010,\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0006J\u0016\u0010.\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010/\u001a\u00020\u001fH\u0002J\u000e\u00100\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u00101\u001a\u00020\u001fJ\u0018\u00102\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u00103\u001a\u0004\u0018\u000104J\u0016\u00105\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013\u00a8\u00066"}, d2 = {"Lcom/shopify/shopifyapp/addresssection/viewmodels/AddressModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "addr", "Lcom/shopify/shopifyapp/addresssection/models/Address;", "address", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/shopify/buy3/Storefront$MailingAddressEdge;", "addresscursor", "", "getAddresscursor", "()Ljava/lang/String;", "setAddresscursor", "(Ljava/lang/String;)V", "addresses", "getAddresses", "()Landroidx/lifecycle/MutableLiveData;", "data", "Lcom/shopify/shopifyapp/dbconnection/entities/CustomerTokenData;", "editaddress", "getEditaddress", "message", "getMessage", "msg", "sheet", "", "getSheet", "addAddress", "", "input", "Lcom/shopify/buy3/Storefront$MailingAddressInput;", "addAddressinvoke", "graphCallResult", "Lcom/shopify/buy3/GraphCallResult;", "Lcom/shopify/buy3/Storefront$Mutation;", "consumeAddAddressResponse", "reponse", "Lcom/shopify/shopifyapp/utils/GraphQLResponse;", "consumeAddressResponse", "consumeResponse", "consumeUpdateAddressResponse", "deleteAddress", "adress", "deleteAddressinvoke", "getAddressList", "setAddress", "setSheet", "updateAddress", "address_id", "Lcom/shopify/graphql/support/ID;", "updateAddressinvoke", "base_debug"})
public final class AddressModel extends androidx.lifecycle.ViewModel {
    private com.shopify.shopifyapp.addresssection.models.Address addr;
    private java.lang.String msg;
    private com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData data;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addresscursor;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sheet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.addresssection.models.Address> editaddress = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.MailingAddressEdge>> address = null;
    private final com.shopify.shopifyapp.repositories.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddresscursor() {
        return null;
    }
    
    public final void setAddresscursor(@org.jetbrains.annotations.NotNull()
    java.lang.String addresscursor) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.shopify.shopifyapp.addresssection.models.Address> getEditaddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.shopify.buy3.Storefront.MailingAddressEdge>> getAddresses() {
        return null;
    }
    
    private final void getAddressList() {
    }
    
    private final void consumeResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void setSheet() {
    }
    
    public final void deleteAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.addresssection.models.Address adress) {
    }
    
    private final void deleteAddressinvoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeAddressResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void addAddress(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.Storefront.MailingAddressInput input) {
    }
    
    private final void addAddressinvoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeAddAddressResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.addresssection.models.Address address) {
    }
    
    public final void updateAddress(@org.jetbrains.annotations.NotNull()
    com.shopify.buy3.Storefront.MailingAddressInput input, @org.jetbrains.annotations.Nullable()
    com.shopify.graphql.support.ID address_id) {
    }
    
    private final void updateAddressinvoke(com.shopify.buy3.GraphCallResult<? extends com.shopify.buy3.Storefront.Mutation> graphCallResult) {
    }
    
    private final void consumeUpdateAddressResponse(com.shopify.shopifyapp.utils.GraphQLResponse reponse) {
    }
    
    public AddressModel(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository repository) {
        super();
    }
}