package com.shopify.shopifyapp.dependecyinjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010#\u001a\u00020&H&J\u0010\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H&J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u000202H&J\u0010\u00103\u001a\u00020\u00032\u0006\u0010 \u001a\u000204H&J\u0010\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u000207H&\u00a8\u00068"}, d2 = {"Lcom/shopify/shopifyapp/dependecyinjection/MageNativeAppComponent;", "", "doAddressListInjection", "", "addressList", "Lcom/shopify/shopifyapp/addresssection/activities/AddressList;", "doAutoSearchActivityInjection", "cart", "Lcom/shopify/shopifyapp/searchsection/activities/AutoSearch;", "doBaseActivityInjection", "base", "Lcom/shopify/shopifyapp/basesection/activities/BaseActivity;", "Lcom/shopify/shopifyapp/basesection/activities/NewBaseActivity;", "doCartListActivityInjection", "Lcom/shopify/shopifyapp/cartsection/activities/CartList;", "doCheckoutWeblinkActivityInjection", "Lcom/shopify/shopifyapp/checkoutsection/activities/CheckoutWeblink;", "doCollectionInjection", "collectionList", "Lcom/shopify/shopifyapp/collectionsection/activities/CollectionList;", "doHomePageInjection", "home", "Lcom/shopify/shopifyapp/homesection/activities/HomePage;", "doHomePageModelInjection", "Lcom/shopify/shopifyapp/homesection/viewmodels/HomePageViewModel;", "doLeftMeuInjection", "left", "Lcom/shopify/shopifyapp/basesection/fragments/LeftMenu;", "doLoginActivtyInjection", "loginActivity", "Lcom/shopify/shopifyapp/loginsection/activity/LoginActivity;", "doOrderListInjection", "profile", "Lcom/shopify/shopifyapp/ordersection/activities/OrderList;", "doProductListInjection", "product", "Lcom/shopify/shopifyapp/productsection/activities/ProductList;", "doProductViewInjection", "Lcom/shopify/shopifyapp/productsection/activities/ProductView;", "doRegistrationActivityInjection", "registrationActivity", "Lcom/shopify/shopifyapp/loginsection/activity/RegistrationActivity;", "doServiceInjection", "job", "Lcom/shopify/shopifyapp/jobservicessection/JobScheduler;", "doSplashInjection", "splash", "Lcom/shopify/shopifyapp/basesection/activities/Splash;", "doURlInjection", "urls", "Lcom/shopify/shopifyapp/utils/Urls;", "doUserProfileInjection", "Lcom/shopify/shopifyapp/userprofilesection/activities/UserProfile;", "doWishListActivityInjection", "wish", "Lcom/shopify/shopifyapp/wishlistsection/activities/WishList;", "base_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {com.shopify.shopifyapp.dependecyinjection.UtilsModule.class})
public abstract interface MageNativeAppComponent {
    
    public abstract void doSplashInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.basesection.activities.Splash splash);
    
    public abstract void doProductListInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.productsection.activities.ProductList product);
    
    public abstract void doCollectionInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.collectionsection.activities.CollectionList collectionList);
    
    public abstract void doProductViewInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.productsection.activities.ProductView product);
    
    public abstract void doBaseActivityInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.basesection.activities.BaseActivity base);
    
    public abstract void doBaseActivityInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.basesection.activities.NewBaseActivity base);
    
    public abstract void doWishListActivityInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.wishlistsection.activities.WishList wish);
    
    public abstract void doCartListActivityInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.cartsection.activities.CartList cart);
    
    public abstract void doCheckoutWeblinkActivityInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.checkoutsection.activities.CheckoutWeblink cart);
    
    public abstract void doAutoSearchActivityInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.searchsection.activities.AutoSearch cart);
    
    public abstract void doLoginActivtyInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.loginsection.activity.LoginActivity loginActivity);
    
    public abstract void doRegistrationActivityInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.loginsection.activity.RegistrationActivity registrationActivity);
    
    public abstract void doLeftMeuInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.basesection.fragments.LeftMenu left);
    
    public abstract void doUserProfileInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.userprofilesection.activities.UserProfile profile);
    
    public abstract void doOrderListInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.ordersection.activities.OrderList profile);
    
    public abstract void doAddressListInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.addresssection.activities.AddressList addressList);
    
    public abstract void doHomePageInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.activities.HomePage home);
    
    public abstract void doHomePageModelInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.viewmodels.HomePageViewModel home);
    
    public abstract void doServiceInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.jobservicessection.JobScheduler job);
    
    public abstract void doURlInjection(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.utils.Urls urls);
}