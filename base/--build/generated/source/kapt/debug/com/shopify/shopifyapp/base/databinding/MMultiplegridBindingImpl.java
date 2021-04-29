package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MMultiplegridBindingImpl extends MMultiplegridBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nameandpricesection, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MMultiplegridBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private MMultiplegridBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            );
        this.card.setTag(null);
        this.image.setTag(null);
        this.main.setTag(null);
        this.name.setTag(null);
        this.regularprice.setTag(null);
        this.specialprice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
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
        else if (BR.clickproduct == variableId) {
            setClickproduct((com.shopify.shopifyapp.homesection.adapters.ProductGridAdapter.Product) variable);
        }
        else if (BR.listdata == variableId) {
            setListdata((com.shopify.shopifyapp.basesection.models.ListData) variable);
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
    public void setClickproduct(@Nullable com.shopify.shopifyapp.homesection.adapters.ProductGridAdapter.Product Clickproduct) {
        this.mClickproduct = Clickproduct;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.clickproduct);
        super.requestRebind();
    }
    public void setListdata(@Nullable com.shopify.shopifyapp.basesection.models.ListData Listdata) {
        updateRegistration(1, Listdata);
        this.mListdata = Listdata;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listdata);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCommondata((com.shopify.shopifyapp.basesection.models.CommanModel) object, fieldId);
            case 1 :
                return onChangeListdata((com.shopify.shopifyapp.basesection.models.ListData) object, fieldId);
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
    private boolean onChangeListdata(com.shopify.shopifyapp.basesection.models.ListData Listdata, int fieldId) {
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
        java.lang.String listdataRegularprice = null;
        com.shopify.shopifyapp.homesection.adapters.ProductGridAdapter.Product clickproduct = mClickproduct;
        java.lang.String commondataImageurl = null;
        java.lang.String listdataTextdata = null;
        java.lang.String listdataSpecialprice = null;
        com.shopify.shopifyapp.basesection.models.ListData listdata = mListdata;

        if ((dirtyFlags & 0x19L) != 0) {



                if (commondata != null) {
                    // read commondata.imageurl
                    commondataImageurl = commondata.getImageurl();
                }
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (listdata != null) {
                    // read listdata.regularprice
                    listdataRegularprice = listdata.getRegularprice();
                    // read listdata.textdata
                    listdataTextdata = listdata.getTextdata();
                    // read listdata.specialprice
                    listdataSpecialprice = listdata.getSpecialprice();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.image, commondataImageurl);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.main.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, listdataTextdata);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.regularprice, listdataRegularprice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.specialprice, listdataSpecialprice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickproduct
        com.shopify.shopifyapp.homesection.adapters.ProductGridAdapter.Product clickproduct = mClickproduct;
        // clickproduct != null
        boolean clickproductJavaLangObjectNull = false;
        // listdata
        com.shopify.shopifyapp.basesection.models.ListData listdata = mListdata;



        clickproductJavaLangObjectNull = (clickproduct) != (null);
        if (clickproductJavaLangObjectNull) {




            clickproduct.productClick(callbackArg_0, listdata);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): commondata
        flag 1 (0x2L): listdata
        flag 2 (0x3L): clickproduct
        flag 3 (0x4L): commondata.imageurl
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}