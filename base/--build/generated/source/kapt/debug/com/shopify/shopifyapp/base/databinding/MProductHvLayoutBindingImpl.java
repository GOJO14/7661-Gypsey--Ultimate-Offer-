package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MProductHvLayoutBindingImpl extends MProductHvLayoutBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerback, 16);
        sViewsWithIds.put(R.id.productdata, 17);
        sViewsWithIds.put(R.id.secondhvsection, 18);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MProductHvLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private MProductHvLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[9]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[15]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (info.androidhive.fontawesome.FontTextView) bindings[4]
            );
        this.actiontext.setTag(null);
        this.firsthvsection.setTag(null);
        this.headertext.setTag(null);
        this.hvimagOne.setTag(null);
        this.hvimagthree.setTag(null);
        this.hvimagtwo.setTag(null);
        this.hvnameone.setTag(null);
        this.hvnamethree.setTag(null);
        this.hvnametwo.setTag(null);
        this.panelbackgroundcolor.setTag(null);
        this.secondhvcard.setTag(null);
        this.subheadertext.setTag(null);
        this.thirdhvcard.setTag(null);
        this.timer.setTag(null);
        this.timerMessage.setTag(null);
        this.timericon.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 4);
        mCallback11 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
        mCallback12 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 3);
        mCallback10 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20000L;
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
        else if (fieldId == BR.hvimageone) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.hvnameone) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.textaligment) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.hvimagetwo) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        else if (fieldId == BR.hvnametwo) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        else if (fieldId == BR.hvimagethree) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        else if (fieldId == BR.hvnamethree) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
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
        int productsliderTextaligment = 0;
        java.lang.String productsliderHvnameone = null;
        java.lang.Integer productsliderHeadertextvisibility = null;
        java.lang.String productsliderTimertext = null;
        java.lang.String productsliderHvimagethree = null;
        java.lang.String productsliderHvimageone = null;
        java.lang.String productsliderSubheadertext = null;
        java.lang.Integer productsliderTimericon = null;
        java.lang.Integer productsliderSubheadertextvisibity = null;
        java.lang.String productsliderHvimagetwo = null;
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity = 0;
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility = 0;
        java.lang.String productsliderHvnamethree = null;
        java.lang.String productsliderHvnametwo = null;
        java.lang.String productsliderHeadertext = null;
        java.lang.String productsliderTimertextmessage = null;
        java.lang.Integer productsliderActiontextvisibity = null;
        java.lang.String productsliderActiontext = null;
        int androidxDatabindingViewDataBindingSafeUnboxProductsliderActiontextvisibity = 0;

        if ((dirtyFlags & 0x3ffffL) != 0) {


            if ((dirtyFlags & 0x21001L) != 0) {

                    if (productslider != null) {
                        // read productslider.textaligment
                        productsliderTextaligment = productslider.getTextaligment();
                    }
            }
            if ((dirtyFlags & 0x20801L) != 0) {

                    if (productslider != null) {
                        // read productslider.hvnameone
                        productsliderHvnameone = productslider.getHvnameone();
                    }
            }
            if ((dirtyFlags & 0x20005L) != 0) {

                    if (productslider != null) {
                        // read productslider.headertextvisibility
                        productsliderHeadertextvisibility = productslider.getHeadertextvisibility();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.headertextvisibility)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility = androidx.databinding.ViewDataBinding.safeUnbox(productsliderHeadertextvisibility);
            }
            if ((dirtyFlags & 0x20101L) != 0) {

                    if (productslider != null) {
                        // read productslider.timertext
                        productsliderTimertext = productslider.getTimertext();
                    }
            }
            if ((dirtyFlags & 0x28001L) != 0) {

                    if (productslider != null) {
                        // read productslider.hvimagethree
                        productsliderHvimagethree = productslider.getHvimagethree();
                    }
            }
            if ((dirtyFlags & 0x20401L) != 0) {

                    if (productslider != null) {
                        // read productslider.hvimageone
                        productsliderHvimageone = productslider.getHvimageone();
                    }
            }
            if ((dirtyFlags & 0x20021L) != 0) {

                    if (productslider != null) {
                        // read productslider.subheadertext
                        productsliderSubheadertext = productslider.getSubheadertext();
                    }
            }
            if ((dirtyFlags & 0x20081L) != 0) {

                    if (productslider != null) {
                        // read productslider.timericon
                        productsliderTimericon = productslider.getTimericon();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.timericon)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon = androidx.databinding.ViewDataBinding.safeUnbox(productsliderTimericon);
            }
            if ((dirtyFlags & 0x20041L) != 0) {

                    if (productslider != null) {
                        // read productslider.subheadertextvisibity
                        productsliderSubheadertextvisibity = productslider.getSubheadertextvisibity();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.subheadertextvisibity)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity = androidx.databinding.ViewDataBinding.safeUnbox(productsliderSubheadertextvisibity);
            }
            if ((dirtyFlags & 0x22001L) != 0) {

                    if (productslider != null) {
                        // read productslider.hvimagetwo
                        productsliderHvimagetwo = productslider.getHvimagetwo();
                    }
            }
            if ((dirtyFlags & 0x30001L) != 0) {

                    if (productslider != null) {
                        // read productslider.hvnamethree
                        productsliderHvnamethree = productslider.getHvnamethree();
                    }
            }
            if ((dirtyFlags & 0x24001L) != 0) {

                    if (productslider != null) {
                        // read productslider.hvnametwo
                        productsliderHvnametwo = productslider.getHvnametwo();
                    }
            }
            if ((dirtyFlags & 0x20003L) != 0) {

                    if (productslider != null) {
                        // read productslider.headertext
                        productsliderHeadertext = productslider.getHeadertext();
                    }
            }
            if ((dirtyFlags & 0x20201L) != 0) {

                    if (productslider != null) {
                        // read productslider.timertextmessage
                        productsliderTimertextmessage = productslider.getTimertextmessage();
                    }
            }
            if ((dirtyFlags & 0x20011L) != 0) {

                    if (productslider != null) {
                        // read productslider.actiontextvisibity
                        productsliderActiontextvisibity = productslider.getActiontextvisibity();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(productslider.actiontextvisibity)
                    androidxDatabindingViewDataBindingSafeUnboxProductsliderActiontextvisibity = androidx.databinding.ViewDataBinding.safeUnbox(productsliderActiontextvisibity);
            }
            if ((dirtyFlags & 0x20009L) != 0) {

                    if (productslider != null) {
                        // read productslider.actiontext
                        productsliderActiontext = productslider.getActiontext();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20009L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.actiontext, productsliderActiontext);
        }
        if ((dirtyFlags & 0x20011L) != 0) {
            // api target 1

            this.actiontext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderActiontextvisibity);
        }
        if ((dirtyFlags & 0x20000L) != 0) {
            // api target 1

            this.actiontext.setOnClickListener(mCallback10);
            this.firsthvsection.setOnClickListener(mCallback11);
            this.secondhvcard.setOnClickListener(mCallback12);
            this.thirdhvcard.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0x20003L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headertext, productsliderHeadertext);
        }
        if ((dirtyFlags & 0x20005L) != 0) {
            // api target 1

            this.headertext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderHeadertextvisibility);
        }
        if ((dirtyFlags & 0x20401L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.hvimagOne, productsliderHvimageone);
        }
        if ((dirtyFlags & 0x28001L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.hvimagthree, productsliderHvimagethree);
        }
        if ((dirtyFlags & 0x22001L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.hvimagtwo, productsliderHvimagetwo);
        }
        if ((dirtyFlags & 0x20801L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hvnameone, productsliderHvnameone);
        }
        if ((dirtyFlags & 0x21001L) != 0) {
            // api target 1

            this.hvnameone.setGravity(productsliderTextaligment);
            this.hvnamethree.setGravity(productsliderTextaligment);
            this.hvnametwo.setGravity(productsliderTextaligment);
        }
        if ((dirtyFlags & 0x30001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hvnamethree, productsliderHvnamethree);
        }
        if ((dirtyFlags & 0x24001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hvnametwo, productsliderHvnametwo);
        }
        if ((dirtyFlags & 0x20021L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subheadertext, productsliderSubheadertext);
        }
        if ((dirtyFlags & 0x20041L) != 0) {
            // api target 1

            this.subheadertext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderSubheadertextvisibity);
        }
        if ((dirtyFlags & 0x20101L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timer, productsliderTimertext);
        }
        if ((dirtyFlags & 0x20081L) != 0) {
            // api target 1

            this.timer.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon);
            this.timerMessage.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon);
            this.timericon.setVisibility(androidxDatabindingViewDataBindingSafeUnboxProductsliderTimericon);
        }
        if ((dirtyFlags & 0x20201L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timerMessage, productsliderTimertextmessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // productslider != null
                boolean productsliderJavaLangObjectNull = false;
                // productslider.hvtypethree
                java.lang.String productsliderHvtypethree = null;
                // productslider
                com.shopify.shopifyapp.homesection.models.ProductSlider productslider = mProductslider;
                // productslider.hvvaluethree
                java.lang.String productsliderHvvaluethree = null;



                productsliderJavaLangObjectNull = (productslider) != (null);
                if (productsliderJavaLangObjectNull) {





                    productsliderHvtypethree = productslider.getHvtypethree();



                    productsliderHvvaluethree = productslider.getHvvaluethree();

                    productslider.navigateToPage(callbackArg_0, productsliderHvtypethree, productsliderHvvaluethree);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // productslider != null
                boolean productsliderJavaLangObjectNull = false;
                // productslider.hvtypeone
                java.lang.String productsliderHvtypeone = null;
                // productslider
                com.shopify.shopifyapp.homesection.models.ProductSlider productslider = mProductslider;
                // productslider.hvvalueone
                java.lang.String productsliderHvvalueone = null;



                productsliderJavaLangObjectNull = (productslider) != (null);
                if (productsliderJavaLangObjectNull) {





                    productsliderHvtypeone = productslider.getHvtypeone();



                    productsliderHvvalueone = productslider.getHvvalueone();

                    productslider.navigateToPage(callbackArg_0, productsliderHvtypeone, productsliderHvvalueone);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // productslider != null
                boolean productsliderJavaLangObjectNull = false;
                // productslider.hvvaluetwo
                java.lang.String productsliderHvvaluetwo = null;
                // productslider
                com.shopify.shopifyapp.homesection.models.ProductSlider productslider = mProductslider;
                // productslider.hvtypetwo
                java.lang.String productsliderHvtypetwo = null;



                productsliderJavaLangObjectNull = (productslider) != (null);
                if (productsliderJavaLangObjectNull) {





                    productsliderHvtypetwo = productslider.getHvtypetwo();



                    productsliderHvvaluetwo = productslider.getHvvaluetwo();

                    productslider.navigateToPage(callbackArg_0, productsliderHvtypetwo, productsliderHvvaluetwo);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // productslider != null
                boolean productsliderJavaLangObjectNull = false;
                // productslider
                com.shopify.shopifyapp.homesection.models.ProductSlider productslider = mProductslider;



                productsliderJavaLangObjectNull = (productslider) != (null);
                if (productsliderJavaLangObjectNull) {




                    productslider.moreAction(callbackArg_0, productslider);
                }
                break;
            }
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
        flag 10 (0xbL): productslider.hvimageone
        flag 11 (0xcL): productslider.hvnameone
        flag 12 (0xdL): productslider.textaligment
        flag 13 (0xeL): productslider.hvimagetwo
        flag 14 (0xfL): productslider.hvnametwo
        flag 15 (0x10L): productslider.hvimagethree
        flag 16 (0x11L): productslider.hvnamethree
        flag 17 (0x12L): null
    flag mapping end*/
    //end
}