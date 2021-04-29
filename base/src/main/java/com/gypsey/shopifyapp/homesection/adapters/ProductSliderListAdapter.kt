package com.gypsey.shopifyapp.homesection.adapters
import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.R2.attr.constraintSet
import com.gypsey.shopifyapp.databinding.MSlideritemoneBinding
import com.gypsey.shopifyapp.databinding.MSlideritemtwoBinding
import com.gypsey.shopifyapp.basesection.models.CommanModel
import com.gypsey.shopifyapp.basesection.models.ListData
import com.gypsey.shopifyapp.cartsection.viewmodels.CartListViewModel
import com.gypsey.shopifyapp.customviews.MageNativeTextView
import com.gypsey.shopifyapp.homesection.viewholders.SliderItemTypeOne
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.utils.CurrencyFormatter
import kotlinx.android.synthetic.main.m_trial.*
import org.json.JSONObject
import java.math.BigDecimal
import javax.inject.Inject
class ProductSliderListAdapter @Inject
 constructor() : RecyclerView.Adapter<SliderItemTypeOne>() {
    private var layoutInflater: LayoutInflater? = null
    private var products: List<Storefront.Product>?=null
    private var activity: Activity? = null
    var presentmentcurrency: String? = null
    var cartListViewModel:CartListViewModel? = null
    var jsonObject:JSONObject?=null
    lateinit var repository: Repository
    fun setData(products: List<Storefront.Product>?, activity: Activity,jsonObject: JSONObject,repository: Repository) {
        this.products = products
        this.activity = activity
        this.jsonObject=jsonObject
        this.repository=repository
    }
    fun setData(products: List<Storefront.Product>?, activity: Activity,repository: Repository) {
        this.products = products
        this.activity = activity
        this.repository=repository
    }
    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderItemTypeOne {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        var binding = DataBindingUtil.inflate<MSlideritemoneBinding>(layoutInflater!!, R.layout.m_slideritemone, parent, false)

        if (jsonObject!=null){
            when(jsonObject!!.getString("item_shape")){
                "square"->{
                    binding.card.radius=0f
                    binding.card.cardElevation=0f
                    binding.card.useCompatPadding=false
                }
            }
        }
        return SliderItemTypeOne(binding)
    }
    override fun onBindViewHolder(item: SliderItemTypeOne, position: Int) {
        val variant = products?.get(position)!!.variants.edges.get(0).node
        val data = ListData()
        var view:View
        var card:CardView
        var tittle:MageNativeTextView
        var price:MageNativeTextView
        var special:MageNativeTextView
        var addtocart: AppCompatButton
        data.product = products?.get(position)
        data.textdata = products?.get(position)?.title.toString().trim()
        if (presentmentcurrency == "nopresentmentcurrency") {
            data.regularprice = CurrencyFormatter.setsymbol(variant!!.priceV2.amount, variant.priceV2.currencyCode.toString())
            if (variant.compareAtPriceV2 != null) {
                val special = java.lang.Double.valueOf(variant.compareAtPriceV2.amount)
                val regular = java.lang.Double.valueOf(variant.priceV2.amount)
                if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                    data.regularprice = CurrencyFormatter.setsymbol(variant.compareAtPriceV2.amount, variant.compareAtPriceV2.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
                } else {
                    data.regularprice = CurrencyFormatter.setsymbol(variant.priceV2.amount, variant.priceV2.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(variant.compareAtPriceV2.amount, variant.compareAtPriceV2.currencyCode.toString())
                }
                item.binding.regularprice.paintFlags = item.binding.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                item.binding.specialprice.visibility = View.VISIBLE
            } else {
                item.binding.specialprice.visibility = View.GONE
                item.binding.regularprice.paintFlags = item.binding.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        } else {
            val edge = getEdge(variant!!.presentmentPrices.edges)
            data.regularprice = CurrencyFormatter.setsymbol(edge?.node?.price?.amount!!, edge?.node?.price?.currencyCode.toString())
            if (variant.compareAtPriceV2 != null) {
                val special = java.lang.Double.valueOf(edge.node.compareAtPrice.amount)
                val regular = java.lang.Double.valueOf(edge.node.price.amount)
                if (BigDecimal.valueOf(special).compareTo(BigDecimal.valueOf(regular)) == 1) {
                    data.regularprice = CurrencyFormatter.setsymbol(edge.node.compareAtPrice.amount, edge.node.compareAtPrice.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(edge.node.price.amount, edge.node.price.currencyCode.toString())

                } else {
                    data.regularprice = CurrencyFormatter.setsymbol(edge.node.price.amount, edge.node.price.currencyCode.toString())
                    data.specialprice = CurrencyFormatter.setsymbol(edge.node.compareAtPrice.amount, edge.node.compareAtPrice.currencyCode.toString())
                }
                item.binding.regularprice.paintFlags = item.binding.regularprice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                item.binding.specialprice.visibility = View.VISIBLE
            } else {
                item.binding.specialprice.visibility = View.GONE
                item.binding.regularprice.paintFlags = item.binding.regularprice.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }
        val model = CommanModel()
        model.imageurl = products?.get(position)?.images?.edges?.get(0)?.node?.transformedSrc
        item.binding.listdata = data
        item.binding.commondata = model
        item.binding.clickproduct = ProductSliderAdapter().Product(repository,activity!!)
        val params:ConstraintLayout.LayoutParams
        view=item.binding.main
        card=item.binding.card
        tittle=item.binding.name
        price=item.binding.regularprice
        special=item.binding.specialprice
        addtocart=item.binding.addCart
        params = item.binding.name.layoutParams as ConstraintLayout.LayoutParams


         val priceparams = item.binding.pricesection.layoutParams as ConstraintLayout.LayoutParams

         var alignment:String= "center"

        if (jsonObject!=null){
            if(jsonObject!!.has("item_text_alignment"))   {
                alignment=jsonObject!!.getString("item_text_alignment")
            }else{
                alignment=jsonObject!!.getString("item_alignment")
            }
        }



         when(alignment) {
             "right" -> {
                 params.endToEnd = ConstraintSet.PARENT_ID
                 priceparams.endToEnd = ConstraintSet.PARENT_ID
                 params.startToStart=ConstraintSet.GONE
                 priceparams.startToStart=ConstraintSet.GONE
             }
             "center" -> {
                 params.endToEnd = ConstraintSet.PARENT_ID
                 priceparams.endToEnd = ConstraintSet.PARENT_ID
                 params.startToStart=ConstraintSet.PARENT_ID
                 priceparams.startToStart=ConstraintSet.PARENT_ID
             }
         }
         var tittlevisibility:Int=View.VISIBLE

        if (jsonObject!=null){
            if(jsonObject!!.getString("item_title").equals("1")){
                tittlevisibility=View.VISIBLE
            }else{
                tittlevisibility=View.GONE
            }
        }




         var productpricevisibility:Int=View.VISIBLE
         var specialpricevisibility:Int=View.VISIBLE

        if (jsonObject!=null){
            if(jsonObject!!.getString("item_price").equals("1")){
                productpricevisibility=View.VISIBLE
                if(jsonObject!!.getString("item_compare_at_price").equals("1")){
                    specialpricevisibility=View.VISIBLE
                }else{
                    specialpricevisibility=View.GONE
                }
            }else{
                productpricevisibility=View.GONE
                specialpricevisibility=View.GONE
            }
        }

         if(tittlevisibility==View.GONE&&productpricevisibility==View.GONE) {
             var parms= item.binding.card.layoutParams
             var pars= item.binding.image.layoutParams
             parms.height=700
             pars.height=700
             item.binding.nameandpricesection.visibility=View.GONE
         }
         item.binding.name.visibility=tittlevisibility
         item.binding.regularprice.visibility=productpricevisibility
         item.binding.specialprice.visibility=specialpricevisibility

        if(jsonObject!=null){
            addtocart.visibility = View.GONE
        }else{
            addtocart.visibility = View.VISIBLE

        }

        if (jsonObject!=null){
            var cell_background_color=JSONObject(jsonObject!!.getString("cell_background_color"))
            if(jsonObject!!.getString("item_border").equals("1")){
                var item_border_color=JSONObject(jsonObject!!.getString("item_border_color"))
                card.setCardBackgroundColor(Color.parseColor(item_border_color.getString("color")))
                card.setContentPadding(3,3,3,3)
            }
            var item_title_color=JSONObject(jsonObject!!.getString("item_title_color"))
            var item_price_color=JSONObject(jsonObject!!.getString("item_price_color"))
            var item_compare_at_price_color=JSONObject(jsonObject!!.getString("item_compare_at_price_color"))
            view.setBackgroundColor(Color.parseColor(cell_background_color.getString("color")))
            tittle.setTextColor(Color.parseColor(item_title_color.getString("color")))
            price.setTextColor(Color.parseColor(item_price_color.getString("color")))
            special.setTextColor(Color.parseColor(item_compare_at_price_color.getString("color")))
            val face : Typeface
            when(jsonObject!!.getString("item_title_font_weight")){
                "bold"->{
                    face= Typeface.createFromAsset(activity!!.assets,"fonts/bold.ttf");
                }else->{
                face= Typeface.createFromAsset(activity!!.assets,"fonts/normal.ttf");
            }
            }
            tittle.setTypeface(face)
            if(jsonObject!!.getString("item_title_font_style").equals("italic")) {
                tittle.setTypeface(tittle.getTypeface(), Typeface.ITALIC);
            }
            val priceface : Typeface
            when(jsonObject!!.getString("header_subtitle_font_weight")){
                "bold"->{
                    priceface= Typeface.createFromAsset(activity!!.assets,"fonts/bold.ttf");
                }else->{
                priceface= Typeface.createFromAsset(activity!!.assets,"fonts/normal.ttf");
            }
            }
            price.setTypeface(priceface)
            if(jsonObject!!.getString("item_price_font_style").equals("italic")) {
                price.setTypeface(price.getTypeface(), Typeface.ITALIC);
            }
            val specialpriceface : Typeface
            when(jsonObject!!.getString("item_compare_at_price_font_weight")){
                "bold"->{
                    specialpriceface= Typeface.createFromAsset(activity!!.assets,"fonts/bold.ttf");
                }else->{
                specialpriceface= Typeface.createFromAsset(activity!!.assets,"fonts/normal.ttf");
            }
            }
            special.setTypeface(specialpriceface)
            if(jsonObject!!.getString("item_compare_at_price_font_style").equals("italic")) {
                special.setTypeface(special.getTypeface(), Typeface.ITALIC);
            }
        }



    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return products!!.size
    }
    private fun getEdge(edges: List<Storefront.ProductVariantPricePairEdge>): Storefront.ProductVariantPricePairEdge? {
        var pairEdge: Storefront.ProductVariantPricePairEdge? = null
        try {
            for (i in edges.indices) {
                if (edges[i].node.price.currencyCode.toString() == presentmentcurrency) {
                    pairEdge = edges[i]
                    break
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return pairEdge
    }


}
