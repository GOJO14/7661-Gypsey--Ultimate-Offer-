package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MAddressbottomsheetBindingImpl extends MAddressbottomsheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.startguide, 3);
        sViewsWithIds.put(R.id.endguide, 4);
        sViewsWithIds.put(R.id.maincontent, 5);
        sViewsWithIds.put(R.id.firstname, 6);
        sViewsWithIds.put(R.id.lastname, 7);
        sViewsWithIds.put(R.id.address1, 8);
        sViewsWithIds.put(R.id.address2, 9);
        sViewsWithIds.put(R.id.city, 10);
        sViewsWithIds.put(R.id.state, 11);
        sViewsWithIds.put(R.id.country, 12);
        sViewsWithIds.put(R.id.pincode, 13);
        sViewsWithIds.put(R.id.phone, 14);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerAddressAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlerCancelActionAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public MAddressbottomsheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private MAddressbottomsheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[10]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[12]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[14]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[13]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[11]
            , (com.shopify.shopifyapp.customviews.MageNativeButton) bindings[2]
            );
        this.bottomSheet.setTag(null);
        this.cancelAction.setTag(null);
        this.submit.setTag(null);
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
            setHandler((com.shopify.shopifyapp.addresssection.activities.AddressList.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.shopify.shopifyapp.addresssection.activities.AddressList.ClickHandler Handler) {
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
        com.shopify.shopifyapp.addresssection.activities.AddressList.ClickHandler handler = mHandler;
        android.view.View.OnClickListener handlerAddressAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener handlerCancelActionAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (handler != null) {
                    // read handler::Address
                    handlerAddressAndroidViewViewOnClickListener = (((mHandlerAddressAndroidViewViewOnClickListener == null) ? (mHandlerAddressAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerAddressAndroidViewViewOnClickListener).setValue(handler));
                    // read handler::cancelAction
                    handlerCancelActionAndroidViewViewOnClickListener = (((mHandlerCancelActionAndroidViewViewOnClickListener == null) ? (mHandlerCancelActionAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlerCancelActionAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.cancelAction.setOnClickListener(handlerCancelActionAndroidViewViewOnClickListener);
            this.submit.setOnClickListener(handlerAddressAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.shopify.shopifyapp.addresssection.activities.AddressList.ClickHandler value;
        public OnClickListenerImpl setValue(com.shopify.shopifyapp.addresssection.activities.AddressList.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.Address(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.shopify.shopifyapp.addresssection.activities.AddressList.ClickHandler value;
        public OnClickListenerImpl1 setValue(com.shopify.shopifyapp.addresssection.activities.AddressList.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.cancelAction(arg0); 
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