package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MAddresslistBindingImpl extends MAddresslistBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(3);
        sIncludes.setIncludes(0, 
            new String[] {"m_addresslist_main", "m_addressbottomsheet"},
            new int[] {1, 2},
            new int[] {com.shopify.shopifyapp.R.layout.m_addresslist_main,
                com.shopify.shopifyapp.R.layout.m_addressbottomsheet});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MAddresslistBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private MAddresslistBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.shopify.shopifyapp.databinding.MAddressbottomsheetBinding) bindings[2]
            , (com.shopify.shopifyapp.databinding.MAddresslistMainBinding) bindings[1]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mainlist.invalidateAll();
        mainbottomsheet.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mainlist.hasPendingBindings()) {
            return true;
        }
        if (mainbottomsheet.hasPendingBindings()) {
            return true;
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mainlist.setLifecycleOwner(lifecycleOwner);
        mainbottomsheet.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainlist((com.shopify.shopifyapp.databinding.MAddresslistMainBinding) object, fieldId);
            case 1 :
                return onChangeMainbottomsheet((com.shopify.shopifyapp.databinding.MAddressbottomsheetBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainlist(com.shopify.shopifyapp.databinding.MAddresslistMainBinding Mainlist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainbottomsheet(com.shopify.shopifyapp.databinding.MAddressbottomsheetBinding Mainbottomsheet, int fieldId) {
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
        com.shopify.shopifyapp.addresssection.activities.AddressList.ClickHandler handler = mHandler;

        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mainbottomsheet.setHandler(handler);
            this.mainlist.setHandler(handler);
        }
        executeBindingsOn(mainlist);
        executeBindingsOn(mainbottomsheet);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainlist
        flag 1 (0x2L): mainbottomsheet
        flag 2 (0x3L): handler
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}