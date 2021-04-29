package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MAddressitemBindingImpl extends MAddressitemBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.phonetext, 12);
        sViewsWithIds.put(R.id.line, 13);
        sViewsWithIds.put(R.id.barrier, 14);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MAddressitemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private MAddressitemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[14]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[7]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[10]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[11]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[13]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[9]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[12]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[8]
            );
        this.address1.setTag(null);
        this.address2.setTag(null);
        this.city.setTag(null);
        this.country.setTag(null);
        this.delete.setTag(null);
        this.editaddress.setTag(null);
        this.firstname.setTag(null);
        this.lastname.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.phone.setTag(null);
        this.state.setTag(null);
        this.zip.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
        if (BR.address == variableId) {
            setAddress((com.shopify.shopifyapp.addresssection.models.Address) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddress(@Nullable com.shopify.shopifyapp.addresssection.models.Address Address) {
        updateRegistration(0, Address);
        this.mAddress = Address;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.address);
        super.requestRebind();
    }
    public void setHandler(@Nullable com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAddress((com.shopify.shopifyapp.addresssection.models.Address) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAddress(com.shopify.shopifyapp.addresssection.models.Address Address, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.firstName) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.lastName) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.address1) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.address2) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.city) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.province) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.country) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.zip) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.phone) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        java.lang.String addressProvince = null;
        com.shopify.shopifyapp.addresssection.models.Address address = mAddress;
        com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter.ClickHandler handler = mHandler;
        java.lang.String addressAddress2 = null;
        java.lang.String addressAddress1 = null;
        java.lang.String addressPhone = null;
        java.lang.String addressCountry = null;
        java.lang.String addressCity = null;
        java.lang.String addressZip = null;
        java.lang.String addressLastName = null;
        java.lang.String addressFirstName = null;

        if ((dirtyFlags & 0xffdL) != 0) {


            if ((dirtyFlags & 0x881L) != 0) {

                    if (address != null) {
                        // read address.province
                        addressProvince = address.getProvince();
                    }
            }
            if ((dirtyFlags & 0x821L) != 0) {

                    if (address != null) {
                        // read address.address2
                        addressAddress2 = address.getAddress2();
                    }
            }
            if ((dirtyFlags & 0x811L) != 0) {

                    if (address != null) {
                        // read address.address1
                        addressAddress1 = address.getAddress1();
                    }
            }
            if ((dirtyFlags & 0xc01L) != 0) {

                    if (address != null) {
                        // read address.phone
                        addressPhone = address.getPhone();
                    }
            }
            if ((dirtyFlags & 0x901L) != 0) {

                    if (address != null) {
                        // read address.country
                        addressCountry = address.getCountry();
                    }
            }
            if ((dirtyFlags & 0x841L) != 0) {

                    if (address != null) {
                        // read address.city
                        addressCity = address.getCity();
                    }
            }
            if ((dirtyFlags & 0xa01L) != 0) {

                    if (address != null) {
                        // read address.zip
                        addressZip = address.getZip();
                    }
            }
            if ((dirtyFlags & 0x809L) != 0) {

                    if (address != null) {
                        // read address.lastName
                        addressLastName = address.getLastName();
                    }
            }
            if ((dirtyFlags & 0x805L) != 0) {

                    if (address != null) {
                        // read address.firstName
                        addressFirstName = address.getFirstName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x811L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address1, addressAddress1);
        }
        if ((dirtyFlags & 0x821L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address2, addressAddress2);
        }
        if ((dirtyFlags & 0x841L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.city, addressCity);
        }
        if ((dirtyFlags & 0x901L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.country, addressCountry);
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback1);
            this.editaddress.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x805L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstname, addressFirstName);
        }
        if ((dirtyFlags & 0x809L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lastname, addressLastName);
        }
        if ((dirtyFlags & 0xc01L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phone, addressPhone);
        }
        if ((dirtyFlags & 0x881L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.state, addressProvince);
        }
        if ((dirtyFlags & 0xa01L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.zip, addressZip);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // address
                com.shopify.shopifyapp.addresssection.models.Address address = mAddress;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.editAddress(callbackArg_0, address);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // address
                com.shopify.shopifyapp.addresssection.models.Address address = mAddress;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.deleteAddress(callbackArg_0, address);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): address
        flag 1 (0x2L): handler
        flag 2 (0x3L): address.firstName
        flag 3 (0x4L): address.lastName
        flag 4 (0x5L): address.address1
        flag 5 (0x6L): address.address2
        flag 6 (0x7L): address.city
        flag 7 (0x8L): address.province
        flag 8 (0x9L): address.country
        flag 9 (0xaL): address.zip
        flag 10 (0xbL): address.phone
        flag 11 (0xcL): null
    flag mapping end*/
    //end
}