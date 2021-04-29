package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MStandlonebannerBindingImpl extends MStandlonebannerBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.section_one, 4);
        sViewsWithIds.put(R.id.border_one, 5);
        sViewsWithIds.put(R.id.section_two, 6);
        sViewsWithIds.put(R.id.border_two, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MStandlonebannerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private MStandlonebannerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            );
        this.buttonOne.setTag(null);
        this.buttonTwo.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
        mCallback22 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 3);
        mCallback20 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
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
        if (BR.stand == variableId) {
            setStand((com.shopify.shopifyapp.homesection.models.StandAloneBanner) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStand(@Nullable com.shopify.shopifyapp.homesection.models.StandAloneBanner Stand) {
        updateRegistration(0, Stand);
        this.mStand = Stand;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.stand);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeStand((com.shopify.shopifyapp.homesection.models.StandAloneBanner) object, fieldId);
        }
        return false;
    }
    private boolean onChangeStand(com.shopify.shopifyapp.homesection.models.StandAloneBanner Stand, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.image) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.text_one) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.text_two) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String standImage = null;
        java.lang.String standTextTwo = null;
        com.shopify.shopifyapp.homesection.models.StandAloneBanner stand = mStand;
        java.lang.String standTextOne = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x13L) != 0) {

                    if (stand != null) {
                        // read stand.image
                        standImage = stand.getImage();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (stand != null) {
                        // read stand.text_two
                        standTextTwo = stand.getText_two();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (stand != null) {
                        // read stand.text_one
                        standTextOne = stand.getText_one();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.buttonOne, standTextOne);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.buttonOne.setOnClickListener(mCallback21);
            this.buttonTwo.setOnClickListener(mCallback22);
            this.image.setOnClickListener(mCallback20);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.buttonTwo, standTextTwo);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.image, standImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // stand
                com.shopify.shopifyapp.homesection.models.StandAloneBanner stand = mStand;
                // stand.buttononelink
                java.lang.String standButtononelink = null;
                // stand.buttononetype
                java.lang.String standButtononetype = null;
                // stand != null
                boolean standJavaLangObjectNull = false;



                standJavaLangObjectNull = (stand) != (null);
                if (standJavaLangObjectNull) {





                    standButtononetype = stand.getButtononetype();



                    standButtononelink = stand.getButtononelink();

                    stand.navigateToPage(callbackArg_0, standButtononetype, standButtononelink);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // stand
                com.shopify.shopifyapp.homesection.models.StandAloneBanner stand = mStand;
                // stand.buttontwotype
                java.lang.String standButtontwotype = null;
                // stand != null
                boolean standJavaLangObjectNull = false;
                // stand.buttontwolink
                java.lang.String standButtontwolink = null;



                standJavaLangObjectNull = (stand) != (null);
                if (standJavaLangObjectNull) {





                    standButtontwotype = stand.getButtontwotype();



                    standButtontwolink = stand.getButtontwolink();

                    stand.navigateToPage(callbackArg_0, standButtontwotype, standButtontwolink);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // stand.bannertype
                java.lang.String standBannertype = null;
                // stand
                com.shopify.shopifyapp.homesection.models.StandAloneBanner stand = mStand;
                // stand.bannerlink
                java.lang.String standBannerlink = null;
                // stand != null
                boolean standJavaLangObjectNull = false;



                standJavaLangObjectNull = (stand) != (null);
                if (standJavaLangObjectNull) {





                    standBannertype = stand.getBannertype();



                    standBannerlink = stand.getBannerlink();

                    stand.navigateToPage(callbackArg_0, standBannertype, standBannerlink);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): stand
        flag 1 (0x2L): stand.image
        flag 2 (0x3L): stand.text_one
        flag 3 (0x4L): stand.text_two
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}