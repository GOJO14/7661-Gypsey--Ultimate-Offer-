package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MForgotbottomsheetBindingImpl extends MForgotbottomsheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.email, 2);
        sViewsWithIds.put(R.id.forgotpassword, 3);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlersForgotPasswordAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public MForgotbottomsheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private MForgotbottomsheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeButton) bindings[1]
            );
        this.bottomSheet.setTag(null);
        this.login.setTag(null);
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
        if (BR.handlers == variableId) {
            setHandlers((com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandlers(@Nullable com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers Handlers) {
        updateRegistration(0, Handlers);
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handlers);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHandlers((com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHandlers(com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers Handlers, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers handlers = mHandlers;
        android.view.View.OnClickListener handlersForgotPasswordAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (handlers != null) {
                    // read handlers::forgotPassword
                    handlersForgotPasswordAndroidViewViewOnClickListener = (((mHandlersForgotPasswordAndroidViewViewOnClickListener == null) ? (mHandlersForgotPasswordAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlersForgotPasswordAndroidViewViewOnClickListener).setValue(handlers));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.login.setOnClickListener(handlersForgotPasswordAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers value;
        public OnClickListenerImpl setValue(com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.forgotPassword(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handlers
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}