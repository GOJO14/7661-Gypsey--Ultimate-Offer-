package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MCartitemBindingImpl extends MCartitemBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.qtysection, 14);
        sViewsWithIds.put(R.id.line, 15);
        sViewsWithIds.put(R.id.barrier, 16);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MCartitemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private MCartitemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[16]
            , (android.widget.ImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.ImageView) bindings[11]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[15]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[13]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (android.widget.LinearLayout) bindings[14]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[10]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[12]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[7]
            );
        this.decrese.setTag(null);
        this.image.setTag(null);
        this.increase.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.movetowish.setTag(null);
        this.name.setTag(null);
        this.offertext.setTag(null);
        this.quantity.setTag(null);
        this.regularprice.setTag(null);
        this.remove.setTag(null);
        this.specialprice.setTag(null);
        this.variantOne.setTag(null);
        this.variantThree.setTag(null);
        this.variantTwo.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 4);
        mCallback5 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        else if (BR.variantdata == variableId) {
            setVariantdata((com.shopify.shopifyapp.cartsection.models.CartListItem) variable);
        }
        else if (BR.handlers == variableId) {
            setHandlers((com.shopify.shopifyapp.cartsection.adapters.CartListAdapter.ClickHandlers) variable);
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
    public void setVariantdata(@Nullable com.shopify.shopifyapp.cartsection.models.CartListItem Variantdata) {
        updateRegistration(1, Variantdata);
        this.mVariantdata = Variantdata;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.variantdata);
        super.requestRebind();
    }
    public void setHandlers(@Nullable com.shopify.shopifyapp.cartsection.adapters.CartListAdapter.ClickHandlers Handlers) {
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handlers);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCommondata((com.shopify.shopifyapp.basesection.models.CommanModel) object, fieldId);
            case 1 :
                return onChangeVariantdata((com.shopify.shopifyapp.cartsection.models.CartListItem) object, fieldId);
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
    private boolean onChangeVariantdata(com.shopify.shopifyapp.cartsection.models.CartListItem Variantdata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.qty) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        com.shopify.shopifyapp.cartsection.models.CartListItem variantdata = mVariantdata;
        java.lang.String variantdataVariantOne = null;
        java.lang.String variantdataNormalprice = null;
        java.lang.String variantdataVariantThree = null;
        com.shopify.shopifyapp.cartsection.adapters.CartListAdapter.ClickHandlers handlers = mHandlers;
        java.lang.String commondataImageurl = null;
        java.lang.String variantdataQty = null;

        if ((dirtyFlags & 0x29L) != 0) {



                if (commondata != null) {
                    // read commondata.imageurl
                    commondataImageurl = commondata.getImageurl();
                }
        }
        if ((dirtyFlags & 0x32L) != 0) {


            if ((dirtyFlags & 0x22L) != 0) {

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

                if (variantdata != null) {
                    // read variantdata.qty
                    variantdataQty = variantdata.getQty();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.decrese.setOnClickListener(mCallback4);
            this.increase.setOnClickListener(mCallback5);
            this.movetowish.setOnClickListener(mCallback7);
            this.remove.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.image, commondataImageurl);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, variantdataProductname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.offertext, variantdataOffertext);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.regularprice, variantdataNormalprice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.specialprice, variantdataSpecialprice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.variantOne, variantdataVariantOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.variantThree, variantdataVariantThree);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.variantTwo, variantdataVariantTwo);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.quantity, variantdataQty);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // handlers
                com.shopify.shopifyapp.cartsection.adapters.CartListAdapter.ClickHandlers handlers = mHandlers;
                // variantdata
                com.shopify.shopifyapp.cartsection.models.CartListItem variantdata = mVariantdata;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {




                    handlers.removeFromCart(callbackArg_0, variantdata);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handlers
                com.shopify.shopifyapp.cartsection.adapters.CartListAdapter.ClickHandlers handlers = mHandlers;
                // variantdata
                com.shopify.shopifyapp.cartsection.models.CartListItem variantdata = mVariantdata;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {




                    handlers.decrease(callbackArg_0, variantdata);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handlers
                com.shopify.shopifyapp.cartsection.adapters.CartListAdapter.ClickHandlers handlers = mHandlers;
                // variantdata
                com.shopify.shopifyapp.cartsection.models.CartListItem variantdata = mVariantdata;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {




                    handlers.moveToWishList(callbackArg_0, variantdata);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handlers
                com.shopify.shopifyapp.cartsection.adapters.CartListAdapter.ClickHandlers handlers = mHandlers;
                // variantdata
                com.shopify.shopifyapp.cartsection.models.CartListItem variantdata = mVariantdata;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {




                    handlers.increase(callbackArg_0, variantdata);
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
        flag 2 (0x3L): handlers
        flag 3 (0x4L): commondata.imageurl
        flag 4 (0x5L): variantdata.qty
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}