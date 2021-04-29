package com.gypsey.shopifyapp.basesection.models
import android.text.Spanned
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.shopify.buy3.Storefront
class ListData : BaseObservable() {

    var textdata: String? = null
    var product: Storefront.Product? = null

    var description: String? = null
    var descriptionhmtl: Spanned? = null

    var specialprice: String? = null

    var regularprice: String? = null
    var offertext: String? = null

    @get:Bindable
    var addtowish: String? = null
        set(addtowish) {
            field = addtowish
            notifyPropertyChanged(BR.addtowish)
        }

    var isStrike: Boolean = false
    var arimage:String? =null
}
