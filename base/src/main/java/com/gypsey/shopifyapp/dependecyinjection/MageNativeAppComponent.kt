package com.gypsey.shopifyapp.dependecyinjection

import android.content.Context
import com.gypsey.shopifyapp.addresssection.activities.AddressList
import com.gypsey.shopifyapp.basesection.activities.BaseActivity
import com.gypsey.shopifyapp.basesection.activities.NewBaseActivity
import com.gypsey.shopifyapp.basesection.activities.Splash
import com.gypsey.shopifyapp.basesection.fragments.LeftMenu
import com.gypsey.shopifyapp.cartsection.activities.CartList
import com.gypsey.shopifyapp.checkoutsection.activities.CheckoutWeblink
import com.gypsey.shopifyapp.checkoutsection.activities.OrderSuccessActivity
import com.gypsey.shopifyapp.collectionsection.activities.CollectionList
import com.gypsey.shopifyapp.homesection.activities.HomePage
import com.gypsey.shopifyapp.homesection.viewmodels.HomePageViewModel
import com.gypsey.shopifyapp.jobservicessection.JobScheduler
import com.gypsey.shopifyapp.loginsection.activity.LoginActivity
import com.gypsey.shopifyapp.loginsection.activity.RegistrationActivity
import com.gypsey.shopifyapp.ordersection.activities.OrderList
import com.gypsey.shopifyapp.productsection.activities.ProductList
import com.gypsey.shopifyapp.productsection.activities.ProductView
import com.gypsey.shopifyapp.quickadd_section.activities.QuickAddActivity
import com.gypsey.shopifyapp.searchsection.activities.AutoSearch
import com.gypsey.shopifyapp.userprofilesection.activities.UserProfile
import com.gypsey.shopifyapp.utils.Urls
import com.gypsey.shopifyapp.wishlistsection.activities.WishList

import javax.inject.Singleton

import dagger.Component

@Component(modules = [UtilsModule::class])
@Singleton
interface MageNativeAppComponent {

    fun doSplashInjection(splash: Splash)
    fun doProductListInjection(product: ProductList)
    fun doCollectionInjection(collectionList: CollectionList)
    fun doProductViewInjection(product: ProductView)
    fun doBaseActivityInjection(base: BaseActivity)
    fun doBaseActivityInjection(base: NewBaseActivity)
    fun doWishListActivityInjection(wish: WishList)
    fun doCartListActivityInjection(cart: CartList)
    fun doCheckoutWeblinkActivityInjection(cart: CheckoutWeblink)
    fun doAutoSearchActivityInjection(cart: AutoSearch)
    fun doLoginActivtyInjection(loginActivity: LoginActivity)
    fun doRegistrationActivityInjection(registrationActivity: RegistrationActivity)
    fun doLeftMeuInjection(left: LeftMenu)
    fun doUserProfileInjection(profile: UserProfile)
    fun doOrderListInjection(profile: OrderList)
    fun doAddressListInjection(addressList: AddressList)
    fun doHomePageInjection(home: HomePage)
    fun doHomePageModelInjection(home: HomePageViewModel)
    fun orderSuccessInjection(orderSuccessActivity: OrderSuccessActivity)
    fun quickAddInjection(quickAddActivity: QuickAddActivity)
    fun doServiceInjection(job: JobScheduler)
    fun doURlInjection(urls: Urls)
}
