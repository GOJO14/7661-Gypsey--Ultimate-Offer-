package com.shopify.shopifyapp.productsection.adapters;

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
public final class ProductRecylerAdapter_Factory implements Factory<ProductRecylerAdapter> {
  private static final ProductRecylerAdapter_Factory INSTANCE = new ProductRecylerAdapter_Factory();

  @Override
  public ProductRecylerAdapter get() {
    return new ProductRecylerAdapter();
  }

  public static ProductRecylerAdapter_Factory create() {
    return INSTANCE;
  }

  public static ProductRecylerAdapter newInstance() {
    return new ProductRecylerAdapter();
  }
}
