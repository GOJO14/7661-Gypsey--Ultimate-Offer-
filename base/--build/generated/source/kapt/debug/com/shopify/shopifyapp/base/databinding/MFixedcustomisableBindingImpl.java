package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MFixedcustomisableBindingImpl extends MFixedcustomisableBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerback, 7);
        sViewsWithIds.put(R.id.productdata, 8);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MFixedcustomisableBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private MFixedcustomisableBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (info.androidhive.fontawesome.FontTextView) bindings[4]
            );
        this.actiontext.setTag(null);
        this.headertext.setTag(null);
        this.panelbackgroundcolor.setTag(null);
        this.subheadertext.setTag(null);
        this.timer.setTag(null);
        this.timerMessage.setTag(null);
        this.timericon.setTag(null);
        setRootTag(root);
        // listeners
        mCallback29 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        else if (fieldId == BR.actiontext) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.actiontextvisibity) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.subheadertext) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.subheadertextvisibity) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.timericon) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.timertext) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.timertextmessage) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon = 0;
        com.shopify.shopifyapp.homesection.models.ProductSlider productslider = mProductslider;
        java.lang.Integer productsliderHeadertextvisibility = null;
        java.lang.String productsliderTimertext = null;
        java.lang.String productsliderSubheadertext = null;
        java.lang.Integer productsliderTimericon = null;
        java.lang.Integer productsliderSubheadertextvisibity = null;
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity = 0;
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility = 0;
        java.lang.String productsliderHeadertext = null;
        java.lang.String productsliderTimertextmessage = null;
        java.lang.Integer productsliderActiontextvisibity = null;
        java.lang.String productsliderActiontext = null;
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderActiontextvisibity = 0;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x405L) != 0) {

                    if (productslider != null) {
                        // read productslider.headertextvisibility
                        productsliderHeadertextvisibility = productslider.getHeadertextvisibility();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.headertextvisibility)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility = androidx.databinding.ViewDataBinding.safeUnbox(productsliderHeadertextvisibility);
            }
            if ((dirtyFlags & 0x501L) != 0) {

                    if (productslider != null) {
                        // read productslider.timertext
                        productsliderTimertext = productslider.getTimertext();
                    }
            }
            if ((dirtyFlags & 0x421L) != 0) {

                    if (productslider != null) {
                        // read productslider.subheadertext
                        productsliderSubheadertext = productslider.getSubheadertext();
                    }
            }
            if ((dirtyFlags & 0x481L) != 0) {

                    if (productslider != null) {
                        // read productslider.timericon
                        productsliderTimericon = productslider.getTimericon();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.timericon)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon = androidx.databinding.ViewDataBinding.safeUnbox(productsliderTimericon);
            }
            if ((dirtyFlags & 0x441L) != 0) {

                    if (productslider != null) {
                        // read productslider.subheadertextvisibity
                        productsliderSubheadertextvisibity = productslider.getSubheadertextvisibity();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.subheadertextvisibity)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity = androidx.databinding.ViewDataBinding.safeUnbox(productsliderSubheadertextvisibity);
            }
            if ((dirtyFlags & 0x403L) != 0) {

                    if (productslider != null) {
                        // read productslider.headertext
                        productsliderHeadertext = productslider.getHeadertext();
                    }
            }
            if ((dirtyFlags & 0x601L) != 0) {

                    if (productslider != null) {
                        // read productslider.timertextmessage
                        productsliderTimertextmessage = productslider.getTimertextmessage();
                    }
            }
            if ((dirtyFlags & 0x411L) != 0) {

                    if (productslider != null) {
                        // read productslider.actiontextvisibity
                        productsliderActiontextvisibity = productslider.getActiontextvisibity();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.actiontextvisibity)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderActiontextvisibity = androidx.databinding.ViewDataBinding.safeUnbox(productsliderActiontextvisibity);
            }
            if ((dirtyFlags & 0x409L) != 0) {

                    if (productslider != null) {
                        // read productslider.actiontext
                        productsliderActiontext = productslider.getActiontext();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x409L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.actiontext, productsliderActiontext);
        }
        if ((dirtyFlags & 0x411L) != 0) {
            // api target 1

            this.actiontext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderActiontextvisibity);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.actiontext.setOnClickListener(mCallback29);
        }
        if ((dirtyFlags & 0x403L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headertext, productsliderHeadertext);
        }
        if ((dirtyFlags & 0x405L) != 0) {
            // api target 1

            this.headertext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility);
        }
        if ((dirtyFlags & 0x421L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subheadertext, productsliderSubheadertext);
        }
        if ((dirtyFlags & 0x441L) != 0) {
            // api target 1

            this.subheadertext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity);
        }
        if ((dirtyFlags & 0x501L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timer, productsliderTimertext);
        }
        if ((dirtyFlags & 0x481L) != 0) {
            // api target 1

            this.timer.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon);
            this.timerMessage.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon);
            this.timericon.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timerMessage, productsliderTimertextmessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // productslider != null
        boolean productsliderJavaLangObjectNull = false;
        // productslider
        com.shopify.shopifyapp.homesection.models.ProductSlider productslider = mProductslider;



        productsliderJavaLangObjectNull = (productslider) != (null);
        if (productsliderJavaLangObjectNull) {




            productslider.moreAction(callbackArg_0, productslider);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productslider
        flag 1 (0x2L): productslider.headertext
        flag 2 (0x3L): productslider.headertextvisibility
        flag 3 (0x4L): productslider.actiontext
        flag 4 (0x5L): productslider.actiontextvisibity
        flag 5 (0x6L): productslider.subheadertext
        flag 6 (0x7L): productslider.subheadertextvisibity
        flag 7 (0x8L): productslider.timericon
        flag 8 (0x9L): productslider.timertext
        flag 9 (0xaL): productslider.timertextmessage
        flag 10 (0xbL): null
    flag mapping end*/
    //end
}