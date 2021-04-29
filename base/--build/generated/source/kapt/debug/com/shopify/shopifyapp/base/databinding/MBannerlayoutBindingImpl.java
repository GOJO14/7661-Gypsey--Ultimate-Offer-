package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MBannerlayoutBindingImpl extends MBannerlayoutBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MBannerlayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private MBannerlayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[0]
            );
        this.bannerimage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
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
        if (BR.home == variableId) {
            setHome((com.shopify.shopifyapp.homesection.models.Home) variable);
        }
        else if (BR.common == variableId) {
            setCommon((com.shopify.shopifyapp.basesection.models.CommanModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHome(@Nullable com.shopify.shopifyapp.homesection.models.Home Home) {
        this.mHome = Home;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.home);
        super.requestRebind();
    }
    public void setCommon(@Nullable com.shopify.shopifyapp.basesection.models.CommanModel Common) {
        updateRegistration(0, Common);
        this.mCommon = Common;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.common);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCommon((com.shopify.shopifyapp.basesection.models.CommanModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCommon(com.shopify.shopifyapp.basesection.models.CommanModel Common, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.imageurl) {
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
        java.lang.String commonImageurl = null;
        com.shopify.shopifyapp.homesection.models.Home home = mHome;
        com.shopify.shopifyapp.basesection.models.CommanModel common = mCommon;

        if ((dirtyFlags & 0xdL) != 0) {



                if (common != null) {
                    // read common.imageurl
                    commonImageurl = common.getImageurl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.loadImage(this.bannerimage, commonImageurl);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.bannerimage.setOnClickListener(mCallback59);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // home != null
        boolean homeJavaLangObjectNull = false;
        // home
        com.shopify.shopifyapp.homesection.models.Home home = mHome;



        homeJavaLangObjectNull = (home) != (null);
        if (homeJavaLangObjectNull) {




            home.Click(callbackArg_0, home);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): common
        flag 1 (0x2L): home
        flag 2 (0x3L): common.imageurl
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}