package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MLeftmenufragmentBindingImpl extends MLeftmenufragmentBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontalguideline, 17);
        sViewsWithIds.put(R.id.verticalguideline, 18);
        sViewsWithIds.put(R.id.headertext, 19);
        sViewsWithIds.put(R.id.line, 20);
        sViewsWithIds.put(R.id.menulist, 21);
        sViewsWithIds.put(R.id.line_two, 22);
        sViewsWithIds.put(R.id.barrierline, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MLeftmenufragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private MLeftmenufragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[15]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[11]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[23]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[16]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[12]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[19]
            , (androidx.constraintlayout.widget.Guideline) bindings[17]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[13]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[20]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[22]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[14]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[21]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[7]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[9]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[10]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            );
        this.appversion.setTag(null);
        this.autosearch.setTag("autosearch");
        this.copyright.setTag(null);
        this.currencyswitcher.setTag("currencyswitcher");
        this.invitefriends.setTag("invitefriends");
        this.lineThree.setTag(null);
        this.logout.setTag("logout");
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.menulinktittle.setTag("collections");
        this.myaccountsection.setTag("currencyswitcher");
        this.myaddress.setTag("myaddress");
        this.mycartlist.setTag("mycartlist");
        this.myorders.setTag("myorders");
        this.myprofile.setTag("myprofile");
        this.mywishlist.setTag("mywishlist");
        this.previewsection.setTag("livepreview");
        this.signin.setTag(null);
        setRootTag(root);
        // listeners
        mCallback49 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 13);
        mCallback39 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 3);
        mCallback47 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 11);
        mCallback37 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        mCallback45 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 9);
        mCallback43 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 7);
        mCallback42 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 6);
        mCallback40 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 4);
        mCallback38 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
        mCallback48 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 12);
        mCallback46 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 10);
        mCallback44 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 8);
        mCallback41 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 5);
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
        else if (fieldId == BR.username) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.tag) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.previewvislible) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.visible) {
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
        java.lang.String menudataAppversion = null;
        int menudataVisible = 0;
        int menudataPreviewvislible = 0;
        com.shopify.shopifyapp.basesection.models.MenuData menudata = mMenudata;
        java.lang.String menudataUsername = null;
        com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;
        java.lang.String menudataTag = null;
        java.lang.String menudataCopyright = null;

        if ((dirtyFlags & 0x7dL) != 0) {


            if ((dirtyFlags & 0x41L) != 0) {

                    if (menudata != null) {
                        // read menudata.appversion
                        menudataAppversion = menudata.getAppversion();
                        // read menudata.copyright
                        menudataCopyright = menudata.getCopyright();
                    }
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (menudata != null) {
                        // read menudata.visible
                        menudataVisible = menudata.getVisible();
                    }
            }
            if ((dirtyFlags & 0x51L) != 0) {

                    if (menudata != null) {
                        // read menudata.previewvislible
                        menudataPreviewvislible = menudata.getPreviewvislible();
                    }
            }
            if ((dirtyFlags & 0x45L) != 0) {

                    if (menudata != null) {
                        // read menudata.username
                        menudataUsername = menudata.getUsername();
                    }
            }
            if ((dirtyFlags & 0x49L) != 0) {

                    if (menudata != null) {
                        // read menudata.tag
                        menudataTag = menudata.getTag();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appversion, menudataAppversion);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.copyright, menudataCopyright);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.autosearch.setOnClickListener(mCallback46);
            this.currencyswitcher.setOnClickListener(mCallback47);
            this.invitefriends.setOnClickListener(mCallback48);
            this.logout.setOnClickListener(mCallback49);
            this.menulinktittle.setOnClickListener(mCallback38);
            this.myaccountsection.setOnClickListener(mCallback40);
            this.myaddress.setOnClickListener(mCallback42);
            this.mycartlist.setOnClickListener(mCallback44);
            this.myorders.setOnClickListener(mCallback45);
            this.myprofile.setOnClickListener(mCallback41);
            this.mywishlist.setOnClickListener(mCallback43);
            this.previewsection.setOnClickListener(mCallback39);
            this.signin.setOnClickListener(mCallback37);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            this.lineThree.setVisibility(menudataPreviewvislible);
            this.previewsection.setVisibility(menudataPreviewvislible);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.logout.setVisibility(menudataVisible);
        }
        if ((dirtyFlags & 0x45L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.signin, menudataUsername);
        }
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            this.signin.setTag(menudataTag);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 13: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
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



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // clickdata != null
                boolean clickdataJavaLangObjectNull = false;
                // clickdata
                com.shopify.shopifyapp.basesection.fragments.LeftMenu.ClickHandlers clickdata = mClickdata;



                clickdataJavaLangObjectNull = (clickdata) != (null);
                if (clickdataJavaLangObjectNull) {



                    clickdata.navigationClicks(callbackArg_0);
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
        flag 2 (0x3L): menudata.username
        flag 3 (0x4L): menudata.tag
        flag 4 (0x5L): menudata.previewvislible
        flag 5 (0x6L): menudata.visible
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}