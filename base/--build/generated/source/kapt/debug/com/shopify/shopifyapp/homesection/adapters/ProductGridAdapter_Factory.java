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
public final class ProductGridAdapter_Factory implements Factory<ProductGridAdapter> {
  private static final ProductGridAdapter_Factory INSTANCE = new ProductGridAdapter_Factory();

  @Override
  public ProductGridAdapter get() {
    return new ProductGridAdapter();
  }

  public static ProductGridAdapter_Factory create() {
    return INSTANCE;
  }

  public static ProductGridAdapter newInstance() {
    return new ProductGridAdapter();
  }
}
