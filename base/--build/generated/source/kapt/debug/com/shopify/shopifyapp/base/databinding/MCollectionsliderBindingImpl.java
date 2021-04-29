package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MCollectionsliderBindingImpl extends MCollectionsliderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerback, 3);
        sViewsWithIds.put(R.id.productdata, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MCollectionsliderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private MCollectionsliderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            );
        this.headertext.setTag(null);
        this.panelbackgroundcolor.setTag(null);
        this.subheadertext.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.productslider == variableId) {
            setProductslider((com.shopify.shopifyapp.homesection.models.ProductSlider) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProductslider(@Nullable com.shopify.shopifyapp.homesection.models.ProductSlider Productslider) {
        updateRegistration(0, Productslider);
        this.mProductslider = Productslider;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.productslider);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProductslider((com.shopify.shopifyapp.homesection.models.ProductSlider) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProductslider(com.shopify.shopifyapp.homesection.models.ProductSlider Productslider, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.headertext) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.headertextvisibility) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.subheadertext) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.subheadertextvisibity) {
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
        java.lang.Integer productsliderSubheadertextvisibity = null;
        com.shopify.shopifyapp.homesection.models.ProductSlider productslider = mProductslider;
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity = 0;
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility = 0;
        java.lang.Integer productsliderHeadertextvisibility = null;
        java.lang.String productsliderHeadertext = null;
        java.lang.String productsliderSubheadertext = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (productslider != null) {
                        // read productslider.subheadertextvisibity
                        productsliderSubheadertextvisibity = productslider.getSubheadertextvisibity();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.subheadertextvisibity)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity = androidx.databinding.ViewDataBinding.safeUnbox(productsliderSubheadertextvisibity);
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (productslider != null) {
                        // read productslider.headertextvisibility
                        productsliderHeadertextvisibility = productslider.getHeadertextvisibility();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.headertextvisibility)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility = androidx.databinding.ViewDataBinding.safeUnbox(productsliderHeadertextvisibility);
            }
            if ((dirtyFlags & 0x23L) != 0) {

                    if (productslider != null) {
                        // read productslider.headertext
                        productsliderHeadertext = productslider.getHeadertext();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (productslider != null) {
                        // read productslider.subheadertext
                        productsliderSubheadertext = productslider.getSubheadertext();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headertext, productsliderHeadertext);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            this.headertext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subheadertext, productsliderSubheadertext);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.subheadertext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productslider
        flag 1 (0x2L): productslider.headertext
        flag 2 (0x3L): productslider.headertextvisibility
        flag 3 (0x4L): productslider.subheadertext
        flag 4 (0x5L): productslider.subheadertextvisibity
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}