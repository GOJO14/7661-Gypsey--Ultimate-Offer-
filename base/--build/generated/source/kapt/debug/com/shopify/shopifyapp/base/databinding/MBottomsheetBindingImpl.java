package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MBottomsheetBindingImpl extends MBottomsheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.line, 2);
        sViewsWithIds.put(R.id.sortselction, 3);
        sViewsWithIds.put(R.id.atoz, 4);
        sViewsWithIds.put(R.id.ztoa, 5);
        sViewsWithIds.put(R.id.htol, 6);
        sViewsWithIds.put(R.id.ltoh, 7);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerOpenSortAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public MBottomsheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private MBottomsheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.shopify.shopifyapp.customviews.MageNativeRadioButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.shopify.shopifyapp.customviews.MageNativeRadioButton) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeRadioButton) bindings[7]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (android.widget.RadioGroup) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeRadioButton) bindings[5]
            );
        this.bottomSheet.setTag(null);
        this.sort.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setHandler((com.shopify.shopifyapp.productsection.activities.ProductList.Handler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.shopify.shopifyapp.productsection.activities.ProductList.Handler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.shopify.shopifyapp.productsection.activities.ProductList.Handler handler = mHandler;
        android.view.View.OnClickListener handlerOpenSortAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (handler != null) {
                    // read handler::openSort
                    handlerOpenSortAndroidViewViewOnClickListener = (((mHandlerOpenSortAndroidViewViewOnClickListener == null) ? (mHandlerOpenSortAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOpenSortAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.sort.setOnClickListener(handlerOpenSortAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.shopify.shopifyapp.productsection.activities.ProductList.Handler value;
        public OnClickListenerImpl setValue(com.shopify.shopifyapp.productsection.activities.ProductList.Handler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.openSort(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}