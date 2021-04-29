package com.shopify.shopifyapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(0);

  static {
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(105);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "actiontext");
      sKeys.put(2, "actiontextvisibity");
      sKeys.put(3, "address");
      sKeys.put(4, "address1");
      sKeys.put(5, "address2");
      sKeys.put(6, "address_id");
      sKeys.put(7, "addtowish");
      sKeys.put(8, "bannerlink");
      sKeys.put(9, "bannertype");
      sKeys.put(10, "bottomdata");
      sKeys.put(11, "buttononelink");
      sKeys.put(12, "buttononetype");
      sKeys.put(13, "buttontwolink");
      sKeys.put(14, "buttontwotype");
      sKeys.put(15, "cat_image_five");
      sKeys.put(16, "cat_image_four");
      sKeys.put(17, "cat_image_one");
      sKeys.put(18, "cat_image_three");
      sKeys.put(19, "cat_image_two");
      sKeys.put(20, "cat_link_five");
      sKeys.put(21, "cat_link_four");
      sKeys.put(22, "cat_link_one");
      sKeys.put(23, "cat_link_three");
      sKeys.put(24, "cat_link_two");
      sKeys.put(25, "cat_text_five");
      sKeys.put(26, "cat_text_four");
      sKeys.put(27, "cat_text_one");
      sKeys.put(28, "cat_text_three");
      sKeys.put(29, "cat_text_two");
      sKeys.put(30, "cat_value_five");
      sKeys.put(31, "cat_value_four");
      sKeys.put(32, "cat_value_one");
      sKeys.put(33, "cat_value_three");
      sKeys.put(34, "cat_value_two");
      sKeys.put(35, "category");
      sKeys.put(36, "categorydata");
      sKeys.put(37, "city");
      sKeys.put(38, "clickdata");
      sKeys.put(39, "clickhandlers");
      sKeys.put(40, "clickproduct");
      sKeys.put(41, "common");
      sKeys.put(42, "commondata");
      sKeys.put(43, "commonmodel");
      sKeys.put(44, "country");
      sKeys.put(45, "email");
      sKeys.put(46, "firstName");
      sKeys.put(47, "firstname");
      sKeys.put(48, "handler");
      sKeys.put(49, "handlers");
      sKeys.put(50, "headertext");
      sKeys.put(51, "headertextvisibility");
      sKeys.put(52, "heading");
      sKeys.put(53, "heading_five");
      sKeys.put(54, "heading_four");
      sKeys.put(55, "heading_one");
      sKeys.put(56, "heading_three");
      sKeys.put(57, "heading_two");
      sKeys.put(58, "home");
      sKeys.put(59, "hvimageone");
      sKeys.put(60, "hvimagethree");
      sKeys.put(61, "hvimagetwo");
      sKeys.put(62, "hvnameone");
      sKeys.put(63, "hvnamethree");
      sKeys.put(64, "hvnametwo");
      sKeys.put(65, "hvtypeone");
      sKeys.put(66, "hvtypethree");
      sKeys.put(67, "hvtypetwo");
      sKeys.put(68, "hvvalueone");
      sKeys.put(69, "hvvaluethree");
      sKeys.put(70, "hvvaluetwo");
      sKeys.put(71, "image");
      sKeys.put(72, "imageurl");
      sKeys.put(73, "istick");
      sKeys.put(74, "lastName");
      sKeys.put(75, "lastname");
      sKeys.put(76, "listdata");
      sKeys.put(77, "menudata");
      sKeys.put(78, "order");
      sKeys.put(79, "password");
      sKeys.put(80, "phone");
      sKeys.put(81, "position");
      sKeys.put(82, "previewvislible");
      sKeys.put(83, "productdata");
      sKeys.put(84, "productslider");
      sKeys.put(85, "province");
      sKeys.put(86, "qty");
      sKeys.put(87, "radius");
      sKeys.put(88, "stand");
      sKeys.put(89, "subheadertext");
      sKeys.put(90, "subheadertextvisibity");
      sKeys.put(91, "subtotaltext");
      sKeys.put(92, "tag");
      sKeys.put(93, "text_one");
      sKeys.put(94, "text_two");
      sKeys.put(95, "textaligment");
      sKeys.put(96, "timericon");
      sKeys.put(97, "timertext");
      sKeys.put(98, "timertextmessage");
      sKeys.put(99, "user");
      sKeys.put(100, "username");
      sKeys.put(101, "variant_id");
      sKeys.put(102, "variantdata");
      sKeys.put(103, "visible");
      sKeys.put(104, "zip");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(0);

    static {
    }
  }
}
