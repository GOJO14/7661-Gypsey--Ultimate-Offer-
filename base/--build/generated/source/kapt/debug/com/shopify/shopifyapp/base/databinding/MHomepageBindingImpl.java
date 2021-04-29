package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MHomepageBindingImpl extends MHomepageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bannersection, 6);
        sViewsWithIds.put(R.id.background_color, 7);
        sViewsWithIds.put(R.id.background_withoutcolor, 8);
        sViewsWithIds.put(R.id.banners, 9);
        sViewsWithIds.put(R.id.slider1, 10);
        sViewsWithIds.put(R.id.middlebanners, 11);
        sViewsWithIds.put(R.id.slider2, 12);
        sViewsWithIds.put(R.id.slider3, 13);
        sViewsWithIds.put(R.id.bottombanners, 14);
        sViewsWithIds.put(R.id.slider4, 15);
        sViewsWithIds.put(R.id.slider5, 16);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MHomepageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private MHomepageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[8]
            , (androidx.viewpager.widget.ViewPager) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.viewpager.widget.ViewPager) bindings[14]
            , (android.widget.ScrollView) bindings[0]
            , (androidx.viewpager.widget.ViewPager) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[5]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[4]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[2]
            );
        this.main.setTag(null);
        this.sliderfiveheading.setTag(null);
        this.sliderfourheading.setTag(null);
        this.slideroneheading.setTag(null);
        this.sliderthreeheading.setTag(null);
        this.slidertwoheading.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.heading == variableId) {
            setHeading((com.shopify.shopifyapp.homesection.models.Heading) variable);
        }
        else if (BR.common == variableId) {
            setCommon((com.shopify.shopifyapp.basesection.models.CommanModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHeading(@Nullable com.shopify.shopifyapp.homesection.models.Heading Heading) {
        updateRegistration(0, Heading);
        this.mHeading = Heading;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.heading);
        super.requestRebind();
    }
    public void setCommon(@Nullable com.shopify.shopifyapp.basesection.models.CommanModel Common) {
        this.mCommon = Common;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHeading((com.shopify.shopifyapp.homesection.models.Heading) object, fieldId);
            case 1 :
                return onChangeCommon((com.shopify.shopifyapp.basesection.models.CommanModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHeading(com.shopify.shopifyapp.homesection.models.Heading Heading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.heading_one) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.heading_two) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.heading_three) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.heading_four) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.heading_five) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCommon(com.shopify.shopifyapp.basesection.models.CommanModel Common, int fieldId) {
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
        com.shopify.shopifyapp.homesection.models.Heading heading = mHeading;
        java.lang.String headingHeadingThree = null;
        java.lang.String headingHeadingFour = null;
        java.lang.String headingHeadingOne = null;
        java.lang.String headingHeadingTwo = null;
        java.lang.String headingHeadingFive = null;

        if ((dirtyFlags & 0xfdL) != 0) {


            if ((dirtyFlags & 0x91L) != 0) {

                    if (heading != null) {
                        // read heading.heading_three
                        headingHeadingThree = heading.getHeading_three();
                    }
            }
            if ((dirtyFlags & 0xa1L) != 0) {

                    if (heading != null) {
                        // read heading.heading_four
                        headingHeadingFour = heading.getHeading_four();
                    }
            }
            if ((dirtyFlags & 0x85L) != 0) {

                    if (heading != null) {
                        // read heading.heading_one
                        headingHeadingOne = heading.getHeading_one();
                    }
            }
            if ((dirtyFlags & 0x89L) != 0) {

                    if (heading != null) {
                        // read heading.heading_two
                        headingHeadingTwo = heading.getHeading_two();
                    }
            }
            if ((dirtyFlags & 0xc1L) != 0) {

                    if (heading != null) {
                        // read heading.heading_five
                        headingHeadingFive = heading.getHeading_five();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sliderfiveheading, headingHeadingFive);
        }
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sliderfourheading, headingHeadingFour);
        }
        if ((dirtyFlags & 0x85L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.slideroneheading, headingHeadingOne);
        }
        if ((dirtyFlags & 0x91L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sliderthreeheading, headingHeadingThree);
        }
        if ((dirtyFlags & 0x89L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.slidertwoheading, headingHeadingTwo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): heading
        flag 1 (0x2L): common
        flag 2 (0x3L): heading.heading_one
        flag 3 (0x4L): heading.heading_two
        flag 4 (0x5L): heading.heading_three
        flag 5 (0x6L): heading.heading_four
        flag 6 (0x7L): heading.heading_five
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}