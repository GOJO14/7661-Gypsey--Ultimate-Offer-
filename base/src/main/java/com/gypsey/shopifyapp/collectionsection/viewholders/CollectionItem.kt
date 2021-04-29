package com.gypsey.shopifyapp.collectionsection.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.gypsey.shopifyapp.databinding.MCategorygriditemBinding

import com.gypsey.shopifyapp.databinding.MCategoryitemBinding
import com.gypsey.shopifyapp.databinding.MCollectionItemBinding

class CollectionItem : RecyclerView.ViewHolder{
    lateinit var gridbinding: MCategorygriditemBinding
    lateinit var binding: MCategoryitemBinding
    lateinit var collectionbinding: MCollectionItemBinding
    constructor(gridbinding: MCategorygriditemBinding):super(gridbinding.root){
        this.gridbinding=gridbinding
    }
    constructor(binding: MCategoryitemBinding) : super(binding.root) {
        this.binding = binding
    }
    constructor(collectionbinding: MCollectionItemBinding) : super(collectionbinding.root) {
        this.collectionbinding = collectionbinding
    }

}
