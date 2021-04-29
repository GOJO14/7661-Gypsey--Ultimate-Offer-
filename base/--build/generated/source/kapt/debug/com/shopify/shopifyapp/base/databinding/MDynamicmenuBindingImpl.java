package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MDynamicmenuBindingImpl extends MDynamicmenuBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.submenus, 3);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MDynamicmenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private MDynamicmenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[3]
            );
        this.MageNativeMaincat.setTag(null);
        this.catname.setTag(null);
        this.expandCollapse.setTag(null);
        setRootTag(root);
        // listeners
        mCallback32 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        mCallback33 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
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
        if (BR.menudata == variableId) {
            setMenudata((com.shopify.shopifyapp.basesection.models.MenuData) variable);
        }
        else if (BR.clickdata == variableId) {
            setClickdata((com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenudata(@Nullable com.shopify.shopifyapp.basesection.models.MenuData Menudata) {
        updateRegistration(0, Menudata);
        this.mMenudata = Menudata;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.menudata);
        super.requestRebind();
    }
    public void setClickdata(@Nullable com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers Clickdata) {
        this.mClickdata = Clickdata;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickdata);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMenudata((com.shopify.shopifyapp.basesection.models.MenuData) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMenudata(com.shopify.shopifyapp.basesection.models.MenuData Menudata, int fieldId) {
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
        com.shopify.shopifyapp.basesection.models.MenuData menudata = mMenudata;
        com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;
        java.lang.String menudataTitle = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (menudata != null) {
                    // read menudata.title
                    menudataTitle = menudata.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catname, menudataTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.catname.setOnClickListener(mCallback32);
            this.expandCollapse.setOnClickListener(mCallback33);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // menudata
                com.shopify.shopifyapp.basesection.models.MenuData menudata = mMenudata;
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {




                    clickdata.getMenu(callbackArg_0, menudata);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.expandMenu(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menudata
        flag 1 (0x2L): clickdata
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}