package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MRegistrationBindingImpl extends MRegistrationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.back_image, 2);
        sViewsWithIds.put(R.id.startguide, 3);
        sViewsWithIds.put(R.id.endguide, 4);
        sViewsWithIds.put(R.id.maincontent, 5);
        sViewsWithIds.put(R.id.firstname, 6);
        sViewsWithIds.put(R.id.lastname, 7);
        sViewsWithIds.put(R.id.email, 8);
        sViewsWithIds.put(R.id.password, 9);
        sViewsWithIds.put(R.id.Confirm_password, 10);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlersRegistrationRequestAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public MRegistrationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private MRegistrationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[10]
            , (com.shopify.shopifyapp.customviews.MageNativeButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[9]
            , (android.widget.ScrollView) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            );
        this.MageNativeRegister.setTag(null);
        this.scroll.setTag(null);
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
            setHandlers((com.shopify.shopifyapp.loginsection.activity.RegistrationActivity.MyClickHandlers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandlers(@Nullable com.shopify.shopifyapp.loginsection.activity.RegistrationActivity.MyClickHandlers Handlers) {
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
        android.view.View.OnClickListener handlersRegistrationRequestAndroidViewViewOnClickListener = null;
        com.shopify.shopifyapp.loginsection.activity.RegistrationActivity.MyClickHandlers handlers = mHandlers;

        if ((dirtyFlags & 0x3L) != 0) {



                if (handlers != null) {
                    // read handlers::RegistrationRequest
                    handlersRegistrationRequestAndroidViewViewOnClickListener = (((mHandlersRegistrationRequestAndroidViewViewOnClickListener == null) ? (mHandlersRegistrationRequestAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlersRegistrationRequestAndroidViewViewOnClickListener).setValue(handlers));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.MageNativeRegister.setOnClickListener(handlersRegistrationRequestAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.shopify.shopifyapp.loginsection.activity.RegistrationActivity.MyClickHandlers value;
        public OnClickListenerImpl setValue(com.shopify.shopifyapp.loginsection.activity.RegistrationActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.RegistrationRequest(arg0); 
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