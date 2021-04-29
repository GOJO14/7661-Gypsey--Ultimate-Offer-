package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MCartlistBindingImpl extends MCartlistBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scroll, 6);
        sViewsWithIds.put(R.id.cartlist, 7);
        sViewsWithIds.put(R.id.taxtext, 8);
        sViewsWithIds.put(R.id.bottomsection, 9);
        sViewsWithIds.put(R.id.grandsection, 10);
        sViewsWithIds.put(R.id.totaltext, 11);
        sViewsWithIds.put(R.id.proceed, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MCartlistBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private MCartlistBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (com.shopify.shopifyapp.customviews.MageNativeButton) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[11]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.proceedtocheck.setTag(null);
        this.subtotal.setTag(null);
        this.subtotaltext.setTag(null);
        this.tax.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback31 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
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
        if (BR.handler == variableId) {
            setHandler((com.shopify.shopifyapp.cartsection.activities.CartList.ClickHandler) variable);
        }
        else if (BR.bottomdata == variableId) {
            setBottomdata((com.shopify.shopifyapp.cartsection.models.CartBottomData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.shopify.shopifyapp.cartsection.activities.CartList.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setBottomdata(@Nullable com.shopify.shopifyapp.cartsection.models.CartBottomData Bottomdata) {
        updateRegistration(0, Bottomdata);
        this.mBottomdata = Bottomdata;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bottomdata);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBottomdata((com.shopify.shopifyapp.cartsection.models.CartBottomData) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBottomdata(com.shopify.shopifyapp.cartsection.models.CartBottomData Bottomdata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.subtotaltext) {
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
        com.shopify.shopifyapp.cartsection.activities.CartList.ClickHandler handler = mHandler;
        java.lang.String bottomdataGrandtotal = null;
        java.lang.String bottomdataTax = null;
        com.shopify.shopifyapp.cartsection.models.CartBottomData bottomdata = mBottomdata;
        java.lang.String bottomdataSubtotal = null;
        java.lang.String bottomdataSubtotaltext = null;

        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0x9L) != 0) {

                    if (bottomdata != null) {
                        // read bottomdata.grandtotal
                        bottomdataGrandtotal = bottomdata.getGrandtotal();
                        // read bottomdata.tax
                        bottomdataTax = bottomdata.getTax();
                        // read bottomdata.subtotal
                        bottomdataSubtotal = bottomdata.getSubtotal();
                    }
            }

                if (bottomdata != null) {
                    // read bottomdata.subtotaltext
                    bottomdataSubtotaltext = bottomdata.getSubtotaltext();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.proceedtocheck.setOnClickListener(mCallback31);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, bottomdataSubtotal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tax, bottomdataTax);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, bottomdataGrandtotal);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotaltext, bottomdataSubtotaltext);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.shopify.shopifyapp.cartsection.activities.CartList.ClickHandler handler = mHandler;
        // bottomdata
        com.shopify.shopifyapp.cartsection.models.CartBottomData bottomdata = mBottomdata;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {




            handler.loadCheckout(callbackArg_0, bottomdata);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bottomdata
        flag 1 (0x2L): handler
        flag 2 (0x3L): bottomdata.subtotaltext
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}