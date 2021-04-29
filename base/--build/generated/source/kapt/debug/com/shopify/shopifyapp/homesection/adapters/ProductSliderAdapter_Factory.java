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
public final class ProductSliderAdapter_Factory implements Factory<ProductSliderAdapter> {
  private static final ProductSliderAdapter_Factory INSTANCE = new ProductSliderAdapter_Factory();

  @Override
  public ProductSliderAdapter get() {
    return new ProductSliderAdapter();
  }

  public static ProductSliderAdapter_Factory create() {
    return INSTANCE;
  }

  public static ProductSliderAdapter newInstance() {
    return new ProductSliderAdapter();
  }
}
