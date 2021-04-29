package com.gypsey.shopifyapp.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.gypsey.shopifyapp.addresssection.viewmodels.AddressModel
import com.gypsey.shopifyapp.basesection.viewmodels.LeftMenuViewModel
import com.gypsey.shopifyapp.basesection.viewmodels.SplashViewModel
import com.gypsey.shopifyapp.cartsection.viewmodels.CartListViewModel
import com.gypsey.shopifyapp.checkoutsection.viewmodels.CheckoutWebLinkViewModel
import com.gypsey.shopifyapp.collectionsection.viewmodels.CollectionViewModel
import com.gypsey.shopifyapp.homesection.viewmodels.HomePageViewModel
import com.gypsey.shopifyapp.loginsection.viewmodels.LoginViewModel
import com.gypsey.shopifyapp.loginsection.viewmodels.RegistrationViewModel
import com.gypsey.shopifyapp.ordersection.viewmodels.OrderListViewModel
import com.gypsey.shopifyapp.personalised.viewmodels.PersonalisedViewModel
import com.gypsey.shopifyapp.productsection.viewmodels.ProductListModel
import com.gypsey.shopifyapp.productsection.viewmodels.ProductViewModel
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.searchsection.viewmodels.SearchListModel
import com.gypsey.shopifyapp.userprofilesection.viewmodels.UserProfileViewModel
import com.gypsey.shopifyapp.wishlistsection.viewmodels.WishListViewModel

import javax.inject.Inject

class ViewModelFactory @Inject
constructor(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SplashViewModel::class.java)) {
            return SplashViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(LeftMenuViewModel::class.java)) {
            return LeftMenuViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(ProductListModel::class.java)) {
            return ProductListModel(repository) as T
        }
        if (modelClass.isAssignableFrom(CollectionViewModel::class.java)) {
            return CollectionViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(ProductViewModel::class.java)) {
            return ProductViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(RegistrationViewModel::class.java)) {
            return RegistrationViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(WishListViewModel::class.java)) {
            return WishListViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(CartListViewModel::class.java)) {
            return CartListViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(CheckoutWebLinkViewModel::class.java)) {
            return CheckoutWebLinkViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(SearchListModel::class.java)) {
            return SearchListModel(repository) as T
        }
        if (modelClass.isAssignableFrom(UserProfileViewModel::class.java)) {
            return UserProfileViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(OrderListViewModel::class.java)) {
            return OrderListViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(AddressModel::class.java)) {
            return AddressModel(repository) as T
        }
        if (modelClass.isAssignableFrom(HomePageViewModel::class.java)) {
            return HomePageViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(PersonalisedViewModel::class.java)) {
            return PersonalisedViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}
