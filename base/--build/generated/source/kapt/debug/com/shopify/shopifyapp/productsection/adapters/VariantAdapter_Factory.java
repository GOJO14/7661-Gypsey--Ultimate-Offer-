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
public final class VariantAdapter_Factory implements Factory<VariantAdapter> {
  private static final VariantAdapter_Factory INSTANCE = new VariantAdapter_Factory();

  @Override
  public VariantAdapter get() {
    return new VariantAdapter();
  }

  public static VariantAdapter_Factory create() {
    return INSTANCE;
  }

  public static VariantAdapter newInstance() {
    return new VariantAdapter();
  }
}
