package com.gypsey.shopifyapp.productsection.models
import android.util.Log
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.basesection.models.ListData
import com.gypsey.shopifyapp.productsection.viewmodels.ProductViewModel
import com.gypsey.shopifyapp.utils.Constant
 class VariantData : BaseObservable() {
    var variant_id: String? = null
    var variantimage: String? = null
    var selectedoption_one: String? = null
    var selectedoption_two: String? = null
    var selectedoption_three: String? = null
    var position: Int = 0
    @get:Bindable
    var istick :Int= View.GONE
        set(value) {
            field = value
            notifyPropertyChanged(BR.istick)
        }
    var data: ListData? = null
    var model: ProductViewModel? = null

    fun blockClick(view: View, data: VariantData) {
        if (Constant.previous == null) {
            Constant.previous = data
        } else {
            Constant.previous = Constant.current
            Constant.previous!!.istick = View.GONE
        }
        Constant.current = data
        data.istick = View.VISIBLE
        Log.i("MageNative", "Variant Id : " + data.variant_id!!)
        Log.i("MageNative", "Variant Id : " + data.model!!.isInwishList(data.variant_id!!))
        Log.i("MageNative", "Variant Id : " + data.data!!.textdata!!)
//        if (data.model!!.isInwishList(data.variant_id!!)) {
//            data.data!!.addtowish = view.context.resources.getString(R.string.alreadyinwish)
//        } else {
//            data.data!!.addtowish = view.context.resources.getString(R.string.addtowish)
//        }
    }
}
