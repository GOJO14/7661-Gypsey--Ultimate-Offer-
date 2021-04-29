package com.gypsey.shopifyapp.basesection.models

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class FeaturesModel : BaseObservable() {
    @Bindable
    var in_app_wishlist: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.in_app_wishlist)
        }


    @Bindable
    var rtl_support: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.rtl_support)
        }


    @Bindable
    var product_share: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.product_share)
        }

    @Bindable
    var multi_currency: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.multi_currency)
        }

    @Bindable
    var multi_language: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.multi_language)
        }

    @Bindable
    var abandoned_cart_compaigns: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.abandoned_cart_compaigns)
        }

    @Bindable
    var ai_product_reccomendaton: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.ai_product_reccomendaton)
        }

    @Bindable
    var qr_code_search_scanner: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.qr_code_search_scanner)
        }

    @Bindable
    var ardumented_reality: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.ardumented_reality)
        }

}