package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MOrderitemBindingImpl extends MOrderitemBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ordernoheading, 7);
        sViewsWithIds.put(R.id.placedontext, 8);
        sViewsWithIds.put(R.id.totalspendingtext, 9);
        sViewsWithIds.put(R.id.line, 10);
        sViewsWithIds.put(R.id.boughtforheading, 11);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MOrderitemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private MOrderitemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[11]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[7]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[8]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[9]
            );
        this.boughtfor.setTag(null);
        this.date.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.orderdetails.setTag(null);
        this.orderno.setTag(null);
        this.totalspending.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
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
        if (BR.order == variableId) {
            setOrder((com.shopify.shopifyapp.ordersection.models.Order) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrder(@Nullable com.shopify.shopifyapp.ordersection.models.Order Order) {
        this.mOrder = Order;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.order);
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
        java.lang.String orderPrice = null;
        java.lang.String orderOrdernumber = null;
        java.lang.String orderBoughtfor = null;
        java.lang.String orderDate = null;
        com.shopify.shopifyapp.ordersection.models.Order order = mOrder;
        java.lang.String orderName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (order != null) {
                    // read order.price
                    orderPrice = order.getPrice();
                    // read order.ordernumber
                    orderOrdernumber = order.getOrdernumber();
                    // read order.boughtfor
                    orderBoughtfor = order.getBoughtfor();
                    // read order.date
                    orderDate = order.getDate();
                    // read order.name
                    orderName = order.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.boughtfor, orderBoughtfor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.date, orderDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, orderName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.orderno, orderOrdernumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalspending, orderPrice);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.orderdetails.setOnClickListener(mCallback19);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // order != null
        boolean orderJavaLangObjectNull = false;
        // order
        com.shopify.shopifyapp.ordersection.models.Order order = mOrder;



        orderJavaLangObjectNull = (order) != (null);
        if (orderJavaLangObjectNull) {




            order.orderView(callbackArg_0, order);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): order
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}