package com.shopify.shopifyapp.databinding;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class MCategorySquareBindingImpl extends MCategorySquareBinding implements com.shopify.shopifyapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MCategorySquareBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private MCategorySquareBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[1]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[15]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[12]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[3]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[9]
            , (com.shopify.shopifyapp.customviews.MageNativeTextView) bindings[6]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            );
        this.catFive.setTag("cat_five");
        this.catFour.setTag("cat_four");
        this.catOne.setTag("cat_one");
        this.catTextFive.setTag(null);
        this.catTextFour.setTag(null);
        this.catTextOne.setTag(null);
        this.catTextThree.setTag(null);
        this.catTextTwo.setTag(null);
        this.catThree.setTag("cat_three");
        this.catTwo.setTag("cat_two");
        this.imageFive.setTag(null);
        this.imageFour.setTag(null);
        this.imageOne.setTag(null);
        this.imageThree.setTag(null);
        this.imageTwo.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 5);
        mCallback25 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 3);
        mCallback23 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 1);
        mCallback26 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 4);
        mCallback24 = new com.shopify.shopifyapp.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
        if (BR.category == variableId) {
            setCategory((com.shopify.shopifyapp.homesection.models.CategoryCircle) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCategory(@Nullable com.shopify.shopifyapp.homesection.models.CategoryCircle Category) {
        updateRegistration(0, Category);
        this.mCategory = Category;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.category);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCategory((com.shopify.shopifyapp.homesection.models.CategoryCircle) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCategory(com.shopify.shopifyapp.homesection.models.CategoryCircle Category, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.radius) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.cat_image_one) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.cat_text_one) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.cat_image_two) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.cat_text_two) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.cat_image_three) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.cat_text_three) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.cat_image_four) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.cat_text_four) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.cat_image_five) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.cat_text_five) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
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
        java.lang.String categoryCatTextOne = null;
        java.lang.String categoryCatImageFive = null;
        java.lang.String categoryCatTextFive = null;
        java.lang.String categoryCatImageThree = null;
        com.shopify.shopifyapp.homesection.models.CategoryCircle category = mCategory;
        java.lang.String categoryCatTextTwo = null;
        java.lang.String categoryCatImageOne = null;
        java.lang.String categoryCatTextFour = null;
        java.lang.String categoryCatTextThree = null;
        java.lang.String categoryCatImageTwo = null;
        java.lang.String categoryRadius = null;
        java.lang.String categoryCatImageFour = null;

        if ((dirtyFlags & 0x1fffL) != 0) {


            if ((dirtyFlags & 0x1009L) != 0) {

                    if (category != null) {
                        // read category.cat_text_one
                        categoryCatTextOne = category.getCat_text_one();
                    }
            }
            if ((dirtyFlags & 0x1403L) != 0) {

                    if (category != null) {
                        // read category.cat_image_five
                        categoryCatImageFive = category.getCat_image_five();
                    }
            }
            if ((dirtyFlags & 0x1801L) != 0) {

                    if (category != null) {
                        // read category.cat_text_five
                        categoryCatTextFive = category.getCat_text_five();
                    }
            }
            if ((dirtyFlags & 0x1043L) != 0) {

                    if (category != null) {
                        // read category.cat_image_three
                        categoryCatImageThree = category.getCat_image_three();
                    }
            }
            if ((dirtyFlags & 0x1021L) != 0) {

                    if (category != null) {
                        // read category.cat_text_two
                        categoryCatTextTwo = category.getCat_text_two();
                    }
            }
            if ((dirtyFlags & 0x1007L) != 0) {

                    if (category != null) {
                        // read category.cat_image_one
                        categoryCatImageOne = category.getCat_image_one();
                    }
            }
            if ((dirtyFlags & 0x1201L) != 0) {

                    if (category != null) {
                        // read category.cat_text_four
                        categoryCatTextFour = category.getCat_text_four();
                    }
            }
            if ((dirtyFlags & 0x1081L) != 0) {

                    if (category != null) {
                        // read category.cat_text_three
                        categoryCatTextThree = category.getCat_text_three();
                    }
            }
            if ((dirtyFlags & 0x1013L) != 0) {

                    if (category != null) {
                        // read category.cat_image_two
                        categoryCatImageTwo = category.getCat_image_two();
                    }
            }
            if ((dirtyFlags & 0x1557L) != 0) {

                    if (category != null) {
                        // read category.radius
                        categoryRadius = category.getRadius();
                    }

                if ((dirtyFlags & 0x1403L) != 0) {
                }
                if ((dirtyFlags & 0x1007L) != 0) {
                }
                if ((dirtyFlags & 0x1013L) != 0) {
                }
                if ((dirtyFlags & 0x1043L) != 0) {
                }
            }
            if ((dirtyFlags & 0x1103L) != 0) {

                    if (category != null) {
                        // read category.cat_image_four
                        categoryCatImageFour = category.getCat_image_four();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            this.catFive.setOnClickListener(mCallback27);
            this.catFour.setOnClickListener(mCallback26);
            this.catOne.setOnClickListener(mCallback23);
            this.catThree.setOnClickListener(mCallback25);
            this.catTwo.setOnClickListener(mCallback24);
        }
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catTextFive, categoryCatTextFive);
        }
        if ((dirtyFlags & 0x1201L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catTextFour, categoryCatTextFour);
        }
        if ((dirtyFlags & 0x1009L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catTextOne, categoryCatTextOne);
        }
        if ((dirtyFlags & 0x1081L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catTextThree, categoryCatTextThree);
        }
        if ((dirtyFlags & 0x1021L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.catTextTwo, categoryCatTextTwo);
        }
        if ((dirtyFlags & 0x1403L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.Image(this.imageFive, categoryRadius, categoryCatImageFive);
        }
        if ((dirtyFlags & 0x1103L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.Image(this.imageFour, categoryRadius, categoryCatImageFour);
        }
        if ((dirtyFlags & 0x1007L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.Image(this.imageOne, categoryRadius, categoryCatImageOne);
        }
        if ((dirtyFlags & 0x1043L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.Image(this.imageThree, categoryRadius, categoryCatImageThree);
        }
        if ((dirtyFlags & 0x1013L) != 0) {
            // api target 1

            com.shopify.shopifyapp.basesection.models.CommanModel.Image(this.imageTwo, categoryRadius, categoryCatImageTwo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // category
                com.shopify.shopifyapp.homesection.models.CategoryCircle category = mCategory;
                // category != null
                boolean categoryJavaLangObjectNull = false;



                categoryJavaLangObjectNull = (category) != (null);
                if (categoryJavaLangObjectNull) {




                    category.catClick(callbackArg_0, category);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // category
                com.shopify.shopifyapp.homesection.models.CategoryCircle category = mCategory;
                // category != null
                boolean categoryJavaLangObjectNull = false;



                categoryJavaLangObjectNull = (category) != (null);
                if (categoryJavaLangObjectNull) {




                    category.catClick(callbackArg_0, category);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // category
                com.shopify.shopifyapp.homesection.models.CategoryCircle category = mCategory;
                // category != null
                boolean categoryJavaLangObjectNull = false;



                categoryJavaLangObjectNull = (category) != (null);
                if (categoryJavaLangObjectNull) {




                    category.catClick(callbackArg_0, category);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // category
                com.shopify.shopifyapp.homesection.models.CategoryCircle category = mCategory;
                // category != null
                boolean categoryJavaLangObjectNull = false;



                categoryJavaLangObjectNull = (category) != (null);
                if (categoryJavaLangObjectNull) {




                    category.catClick(callbackArg_0, category);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // category
                com.shopify.shopifyapp.homesection.models.CategoryCircle category = mCategory;
                // category != null
                boolean categoryJavaLangObjectNull = false;



                categoryJavaLangObjectNull = (category) != (null);
                if (categoryJavaLangObjectNull) {




                    category.catClick(callbackArg_0, category);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): category
        flag 1 (0x2L): category.radius
        flag 2 (0x3L): category.cat_image_one
        flag 3 (0x4L): category.cat_text_one
        flag 4 (0x5L): category.cat_image_two
        flag 5 (0x6L): category.cat_text_two
        flag 6 (0x7L): category.cat_image_three
        flag 7 (0x8L): category.cat_text_three
        flag 8 (0x9L): category.cat_image_four
        flag 9 (0xaL): category.cat_text_four
        flag 10 (0xbL): category.cat_image_five
        flag 11 (0xcL): category.cat_text_five
        flag 12 (0xdL): null
    flag mapping end*/
    //end
}