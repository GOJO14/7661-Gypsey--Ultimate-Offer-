package com.gypsey.shopifyapp.addresssection.viewholders
import androidx.recyclerview.widget.RecyclerView
import com.gypsey.shopifyapp.databinding.MAddressitemBinding
class AddressViewHolder :RecyclerView.ViewHolder{
    var binding: MAddressitemBinding
    constructor(binding: MAddressitemBinding) : super(binding.root) {
        this.binding=binding;
    }
}

