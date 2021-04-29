package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MUserprofileBindingImpl extends MUserprofileBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.startguide, 7);
        sViewsWithIds.put(R.id.endguide, 8);
        sViewsWithIds.put(R.id.maincontent, 9);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MUserprofileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private MUserprofileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (com.shopify.shopifyapp.customviews.MageNativeEditText) bindings[4]
            , (android.widget.ScrollView) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (com.shopify.shopifyapp.customviews.MageNativeButton) bindings[6]
            );
        this.ConfirmPassword.setTag(null);
        this.email.setTag(null);
        this.firstname.setTag(null);
        this.lastname.setTag(null);
        this.password.setTag(null);
        this.scroll.setTag(null);
        this.update.setTag(null);
        setRootTag(root);
        // listeners
        mCallback57 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setHandler((com.shopify.shopifyapp.userprofilesection.activities.UserProfile.ClickHandler) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.shopify.shopifyapp.userprofilesection.models.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.shopify.shopifyapp.userprofilesection.activities.UserProfile.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setUser(@Nullable com.shopify.shopifyapp.userprofilesection.models.User User) {
        updateRegistration(0, User);
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUser((com.shopify.shopifyapp.userprofilesection.models.User) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUser(com.shopify.shopifyapp.userprofilesection.models.User User, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.firstname) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.lastname) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        com.shopify.shopifyapp.userprofilesection.activities.UserProfile.ClickHandler handler = mHandler;
        java.lang.String userLastname = null;
        com.shopify.shopifyapp.userprofilesection.models.User user = mUser;
        java.lang.String userPassword = null;
        java.lang.String userEmail = null;
        java.lang.String userFirstname = null;

        if ((dirtyFlags & 0x7dL) != 0) {


            if ((dirtyFlags & 0x49L) != 0) {

                    if (user != null) {
                        // read user.lastname
                        userLastname = user.getLastname();
                    }
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (user != null) {
                        // read user.password
                        userPassword = user.getPassword();
                    }
            }
            if ((dirtyFlags & 0x51L) != 0) {

                    if (user != null) {
                        // read user.email
                        userEmail = user.getEmail();
                    }
            }
            if ((dirtyFlags & 0x45L) != 0) {

                    if (user != null) {
                        // read user.firstname
                        userFirstname = user.getFirstname();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ConfirmPassword, userPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.password, userPassword);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.email, userEmail);
        }
        if ((dirtyFlags & 0x45L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstname, userFirstname);
        }
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lastname, userLastname);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.update.setOnClickListener(mCallback57);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.shopify.shopifyapp.userprofilesection.activities.UserProfile.ClickHandler handler = mHandler;
        // user
        com.shopify.shopifyapp.userprofilesection.models.User user = mUser;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {




            handler.updateProfile(callbackArg_0, user);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): handler
        flag 2 (0x3L): user.firstname
        flag 3 (0x4L): user.lastname
        flag 4 (0x5L): user.email
        flag 5 (0x6L): user.password
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}