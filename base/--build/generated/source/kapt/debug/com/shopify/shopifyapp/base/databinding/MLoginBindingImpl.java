package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MLoginBindingImpl extends MLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.startguide, 5);
        sViewsWithIds.put(R.id.endguide, 6);
        sViewsWithIds.put(R.id.maincontent, 7);
        sViewsWithIds.put(R.id.username, 8);
        sViewsWithIds.put(R.id.password, 9);
    }
    // views
    @NonNull
    private final com.shopify.shopifyapp.customviews.MageNativeTextView mboundView4;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlersOnSignUpClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlersNewsignupAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHandlersForgotPassAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public MLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private MLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeButton) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[9]
            , (android.widget.ScrollView) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[8]
            );
        this.backImage.setTag(null);
        this.forgotpassword.setTag(null);
        this.login.setTag(null);
        this.mboundView4 = (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.scroll.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        else if (fieldId == BR.image) {
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
        android.view.View.OnClickListener handlersOnSignUpClickedAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener handlersNewsignupAndroidViewViewOnClickListener = null;
        java.lang.String handlersImage = null;
        com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers handlers = mHandlers;
        android.view.View.OnClickListener handlersForgotPassAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (handlers != null) {
                        // read handlers::onSignUpClicked
                        handlersOnSignUpClickedAndroidViewViewOnClickListener = (((mHandlersOnSignUpClickedAndroidViewViewOnClickListener == null) ? (mHandlersOnSignUpClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlersOnSignUpClickedAndroidViewViewOnClickListener).setValue(handlers));
                        // read handlers::newsignup
                        handlersNewsignupAndroidViewViewOnClickListener = (((mHandlersNewsignupAndroidViewViewOnClickListener == null) ? (mHandlersNewsignupAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlersNewsignupAndroidViewViewOnClickListener).setValue(handlers));
                        // read handlers::forgotPass
                        handlersForgotPassAndroidViewViewOnClickListener = (((mHandlersForgotPassAndroidViewViewOnClickListener == null) ? (mHandlersForgotPassAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHandlersForgotPassAndroidViewViewOnClickListener).setValue(handlers));
                    }
            }

                if (handlers != null) {
                    // read handlers.image
                    handlersImage = handlers.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.backImage, handlersImage);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.forgotpassword.setOnClickListener(handlersForgotPassAndroidViewViewOnClickListener);
            this.login.setOnClickListener(handlersOnSignUpClickedAndroidViewViewOnClickListener);
            this.mboundView4.setOnClickListener(handlersNewsignupAndroidViewViewOnClickListener);
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
            this.value.onSignUpClicked(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers value;
        public OnClickListenerImpl1 setValue(com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.newsignup(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers value;
        public OnClickListenerImpl2 setValue(com.shopify.shopifyapp.loginsection.activity.LoginActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.forgotPass(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handlers
        flag 1 (0x2L): handlers.image
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}