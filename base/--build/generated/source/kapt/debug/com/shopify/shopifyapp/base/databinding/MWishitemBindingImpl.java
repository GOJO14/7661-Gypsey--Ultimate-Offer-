package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MWishitemBindingImpl extends MWishitemBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.line, 11);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MWishitemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private MWishitemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[11]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[9]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[7]
            );
        this.cancelAction.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.movetocart.setTag(null);
        this.name.setTag(null);
        this.offertext.setTag(null);
        this.regularprice.setTag(null);
        this.specialprice.setTag(null);
        this.variantOne.setTag(null);
        this.variantThree.setTag(null);
        this.variantTwo.setTag(null);
        setRootTag(root);
        // listeners
        mCallback35 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        mCallback36 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.commondata == variableId) {
            setCommondata((com.shopify.shopifyapp.basesection.models.CommanModel) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((com.shopify.shopifyapp.wishlistsection.adapters.WishListAdapter.ClickHandlers) variable);
        }
        else if (BR.variantdata == variableId) {
            setVariantdata((com.shopify.shopifyapp.wishlistsection.models.WishListItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCommondata(@Nullable com.shopify.shopifyapp.basesection.models.CommanModel Commondata) {
        updateRegistration(0, Commondata);
        this.mCommondata = Commondata;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.commondata);
        super.requestRebind();
    }
    public void setHandler(@Nullable com.shopify.shopifyapp.wishlistsection.adapters.WishListAdapter.ClickHandlers Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setVariantdata(@Nullable com.shopify.shopifyapp.wishlistsection.models.WishListItem Variantdata) {
        updateRegistration(1, Variantdata);
        this.mVariantdata = Variantdata;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.variantdata);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCommondata((com.shopify.shopifyapp.basesection.models.CommanModel) object, fieldId);
            case 1 :
                return onChangeVariantdata((com.shopify.shopifyapp.wishlistsection.models.WishListItem) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCommondata(com.shopify.shopifyapp.basesection.models.CommanModel Commondata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.imageurl) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVariantdata(com.shopify.shopifyapp.wishlistsection.models.WishListItem Variantdata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.shopify.shopifyapp.basesection.models.CommanModel commondata = mCommondata;
        java.lang.String variantdataSpecialprice = null;
        java.lang.String variantdataVariantTwo = null;
        java.lang.String variantdataProductname = null;
        java.lang.String variantdataOffertext = null;
        com.shopify.shopifyapp.wishlistsection.adapters.WishListAdapter.ClickHandlers handler = mHandler;
        com.shopify.shopifyapp.wishlistsection.models.WishListItem variantdata = mVariantdata;
        java.lang.String variantdataVariantOne = null;
        java.lang.String variantdataNormalprice = null;
        java.lang.String variantdataVariantThree = null;
        java.lang.String commondataImageurl = null;

        if ((dirtyFlags & 0x19L) != 0) {



                if (commondata != null) {
                    // read commondata.imageurl
                    commondataImageurl = commondata.getImageurl();
                }
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (variantdata != null) {
                    // read variantdata.specialprice
                    variantdataSpecialprice = variantdata.getSpecialprice();
                    // read variantdata.variant_two
                    variantdataVariantTwo = variantdata.getVariant_two();
                    // read variantdata.productname
                    variantdataProductname = variantdata.getProductname();
                    // read variantdata.offertext
                    variantdataOffertext = variantdata.getOffertext();
                    // read variantdata.variant_one
                    variantdataVariantOne = variantdata.getVariant_one();
                    // read variantdata.normalprice
                    variantdataNormalprice = variantdata.getNormalprice();
                    // read variantdata.variant_three
                    variantdataVariantThree = variantdata.getVariant_three();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.cancelAction.setOnClickListener(mCallback36);
            this.movetocart.setOnClickListener(mCallback35);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.image, commondataImageurl);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, variantdataProductname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.offertext, variantdataOffertext);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.regularprice, variantdataNormalprice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.specialprice, variantdataSpecialprice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.variantOne, variantdataVariantOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.variantThree, variantdataVariantThree);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.variantTwo, variantdataVariantTwo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                com.shopify.shopifyapp.wishlistsection.adapters.WishListAdapter.ClickHandlers handler = mHandler;
                // variantdata
                com.shopify.shopifyapp.wishlistsection.models.WishListItem variantdata = mVariantdata;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.moveToCart(callbackArg_0, variantdata);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.shopify.shopifyapp.wishlistsection.adapters.WishListAdapter.ClickHandlers handler = mHandler;
                // variantdata
                com.shopify.shopifyapp.wishlistsection.models.WishListItem variantdata = mVariantdata;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.removeWishList(callbackArg_0, variantdata);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): commondata
        flag 1 (0x2L): variantdata
        flag 2 (0x3L): handler
        flag 3 (0x4L): commondata.imageurl
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}