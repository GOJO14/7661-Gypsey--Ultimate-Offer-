package com.shopify.shopifyapp.homesection.adapters;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductListAdapter_Factory implements Factory<ProductListAdapter> {
  private static final ProductListAdapter_Factory INSTANCE = new ProductListAdapter_Factory();

  @Override
  public ProductListAdapter get() {
    return new ProductListAdapter();
  }

  public static ProductListAdapter_Factory create() {
    return INSTANCE;
  }

  public static ProductListAdapter newInstance() {
    return new ProductListAdapter();
  }
}
