package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MProductviewBindingImpl extends MProductviewBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.images, 9);
        sViewsWithIds.put(R.id.indicator, 10);
        sViewsWithIds.put(R.id.barrier, 11);
        sViewsWithIds.put(R.id.variantheading, 12);
        sViewsWithIds.put(R.id.productvariant, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MProductviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private MProductviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.shopify.shopifyapp.customviews.MageNativeButton) bindings[7]
            , (com.shopify.shopifyapp.customviews.MageNativeButton) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[11]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (androidx.viewpager.widget.ViewPager) bindings[9]
            , (com.shopify.shopifyapp.utils.CirclePageIndicator) bindings[10]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[12]
            );
        this.addtocart.setTag(null);
        this.addtowish.setTag(null);
        this.description.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.offertext.setTag(null);
        this.regularprice.setTag(null);
        this.shareicon.setTag(null);
        this.specialprice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
        mCallback16 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 3);
        mCallback14 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.productdata == variableId) {
            setProductdata((com.shopify.shopifyapp.basesection.models.ListData) variable);
        }
        else if (BR.clickhandlers == variableId) {
            setClickhandlers((com.shopify.shopifyapp.productsection.activities.ProductView.ClickHandlers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProductdata(@Nullable com.shopify.shopifyapp.basesection.models.ListData Productdata) {
        updateRegistration(0, Productdata);
        this.mProductdata = Productdata;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.productdata);
        super.requestRebind();
    }
    public void setClickhandlers(@Nullable com.shopify.shopifyapp.productsection.activities.ProductView.ClickHandlers Clickhandlers) {
        this.mClickhandlers = Clickhandlers;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickhandlers);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProductdata((com.shopify.shopifyapp.basesection.models.ListData) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProductdata(com.shopify.shopifyapp.basesection.models.ListData Productdata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.addtowish) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String productdataTextdata = null;
        java.lang.String productdataAddtowish = null;
        com.shopify.shopifyapp.basesection.models.ListData productdata = mProductdata;
        java.lang.String productdataRegularprice = null;
        com.shopify.shopifyapp.productsection.activities.ProductView.ClickHandlers clickhandlers = mClickhandlers;
        java.lang.String productdataOffertext = null;
        java.lang.String productdataSpecialprice = null;
        android.text.Spanned productdataDescriptionhmtl = null;

        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0x9L) != 0) {

                    if (productdata != null) {
                        // read productdata.textdata
                        productdataTextdata = productdata.getTextdata();
                        // read productdata.regularprice
                        productdataRegularprice = productdata.getRegularprice();
                        // read productdata.offertext
                        productdataOffertext = productdata.getOffertext();
                        // read productdata.specialprice
                        productdataSpecialprice = productdata.getSpecialprice();
                        // read productdata.descriptionhmtl
                        productdataDescriptionhmtl = productdata.getDescriptionhmtl();
                    }
            }

                if (productdata != null) {
                    // read productdata.addtowish
                    productdataAddtowish = productdata.getAddtowish();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.addtocart.setOnClickListener(mCallback15);
            this.addtowish.setOnClickListener(mCallback16);
            this.shareicon.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addtowish, productdataAddtowish);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, productdataDescriptionhmtl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, productdataTextdata);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.offertext, productdataOffertext);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.regularprice, productdataRegularprice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.specialprice, productdataSpecialprice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // productdata
                com.shopify.shopifyapp.basesection.models.ListData productdata = mProductdata;
                // clickhandlers != null
                boolean clickhandlersJavaLangObjectNull = false;
                // clickhandlers
                com.shopify.shopifyapp.productsection.activities.ProductView.ClickHandlers clickhandlers = mClickhandlers;



                clickhandlersJavaLangObjectNull = (clickhandlers) != (null);
                if (clickhandlersJavaLangObjectNull) {




                    clickhandlers.addtoCart(callbackArg_0, productdata);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // productdata
                com.shopify.shopifyapp.basesection.models.ListData productdata = mProductdata;
                // clickhandlers != null
                boolean clickhandlersJavaLangObjectNull = false;
                // clickhandlers
                com.shopify.shopifyapp.productsection.activities.ProductView.ClickHandlers clickhandlers = mClickhandlers;



                clickhandlersJavaLangObjectNull = (clickhandlers) != (null);
                if (clickhandlersJavaLangObjectNull) {




                    clickhandlers.addtoWish(callbackArg_0, productdata);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // productdata
                com.shopify.shopifyapp.basesection.models.ListData productdata = mProductdata;
                // clickhandlers != null
                boolean clickhandlersJavaLangObjectNull = false;
                // clickhandlers
                com.shopify.shopifyapp.productsection.activities.ProductView.ClickHandlers clickhandlers = mClickhandlers;



                clickhandlersJavaLangObjectNull = (clickhandlers) != (null);
                if (clickhandlersJavaLangObjectNull) {




                    clickhandlers.shareProduct(callbackArg_0, productdata);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productdata
        flag 1 (0x2L): clickhandlers
        flag 2 (0x3L): productdata.addtowish
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}