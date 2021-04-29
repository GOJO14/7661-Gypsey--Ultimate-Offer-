package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MVariantoptionBindingImpl extends MVariantoptionBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MVariantoptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private MVariantoptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            );
        this.image.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.selected1.setTag(null);
        this.selected2.setTag(null);
        this.selected3.setTag(null);
        this.tickImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
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
        else if (BR.variantdata == variableId) {
            setVariantdata((com.shopify.shopifyapp.productsection.models.VariantData) variable);
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
    public void setVariantdata(@Nullable com.shopify.shopifyapp.productsection.models.VariantData Variantdata) {
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
                return onChangeVariantdata((com.shopify.shopifyapp.productsection.models.VariantData) object, fieldId);
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
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVariantdata(com.shopify.shopifyapp.productsection.models.VariantData Variantdata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.istick) {
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
        com.shopify.shopifyapp.basesection.models.CommanModel commondata = mCommondata;
        com.shopify.shopifyapp.productsection.models.VariantData variantdata = mVariantdata;
        java.lang.String variantdataSelectedoptionTwo = null;
        java.lang.String variantdataSelectedoptionOne = null;
        int variantdataIstick = 0;
        java.lang.String variantdataSelectedoptionThree = null;
        java.lang.String commondataImageurl = null;

        if ((dirtyFlags & 0x15L) != 0) {



                if (commondata != null) {
                    // read commondata.imageurl
                    commondataImageurl = commondata.getImageurl();
                }
        }
        if ((dirtyFlags & 0x1aL) != 0) {


            if ((dirtyFlags & 0x12L) != 0) {

                    if (variantdata != null) {
                        // read variantdata.selectedoption_two
                        variantdataSelectedoptionTwo = variantdata.getSelectedoption_two();
                        // read variantdata.selectedoption_one
                        variantdataSelectedoptionOne = variantdata.getSelectedoption_one();
                        // read variantdata.selectedoption_three
                        variantdataSelectedoptionThree = variantdata.getSelectedoption_three();
                    }
            }

                if (variantdata != null) {
                    // read variantdata.istick
                    variantdataIstick = variantdata.getIstick();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.image, commondataImageurl);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback30);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.selected1, variantdataSelectedoptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.selected2, variantdataSelectedoptionTwo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.selected3, variantdataSelectedoptionThree);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.tickImage.setVisibility(variantdataIstick);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // variantdata
        com.shopify.shopifyapp.productsection.models.VariantData variantdata = mVariantdata;
        // variantdata != null
        boolean variantdataJavaLangObjectNull = false;



        variantdataJavaLangObjectNull = (variantdata) != (null);
        if (variantdataJavaLangObjectNull) {




            variantdata.blockClick(callbackArg_0, variantdata);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): commondata
        flag 1 (0x2L): variantdata
        flag 2 (0x3L): commondata.imageurl
        flag 3 (0x4L): variantdata.istick
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}