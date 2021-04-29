package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.shopify.shopifyapp.DataBinderMapperImpl());
    addMapper("com.shopify.shopifyapp");
  }
}
