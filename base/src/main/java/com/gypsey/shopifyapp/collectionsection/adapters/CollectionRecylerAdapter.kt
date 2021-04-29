package com.gypsey.shopifyapp.collectionsection.adapters

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView

import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.databinding.MCategoryitemBinding
import com.gypsey.shopifyapp.basesection.models.CommanModel
import com.gypsey.shopifyapp.collectionsection.models.Collection
import com.gypsey.shopifyapp.collectionsection.viewholders.CollectionItem

import javax.inject.Inject

class CollectionRecylerAdapter @Inject
 constructor() : RecyclerView.Adapter<CollectionItem>() {
    private var layoutInflater: LayoutInflater? = null
    lateinit var collectionEdges: List<Storefront.CollectionEdge>
    var activity: Activity? = null
        private set
    fun setData(collectionEdges: List<Storefront.CollectionEdge>, activity: Activity) {
        this.collectionEdges = collectionEdges
        this.activity = activity
    }
    init {
        setHasStableIds(true)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionItem {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        val binding = DataBindingUtil.inflate<MCategoryitemBinding>(layoutInflater!!, R.layout.m_categoryitem, parent, false)
        return CollectionItem(binding)
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun onBindViewHolder(holder: CollectionItem, position: Int) {

        Log.i("MageNative", "position : $position")
        if (collectionEdges[position].node.image != null) {
            val model = CommanModel()
            model.imageurl = collectionEdges[position].node.image.originalSrc
            holder.binding.commondata = model
        }
        val collection = Collection()
        val name = collectionEdges[position].node.title.substring(0, 1).toUpperCase() + collectionEdges[position].node.title.substring(1).toLowerCase()
        collection.category_name = name
        collection.id = collectionEdges[position].node.id
        holder.binding.categorydata = collection
    }
    override fun getItemCount(): Int {
        return collectionEdges.size
    }
}
