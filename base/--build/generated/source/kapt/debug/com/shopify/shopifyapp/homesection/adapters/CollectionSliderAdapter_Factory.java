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
public final class CollectionSliderAdapter_Factory implements Factory<CollectionSliderAdapter> {
  private static final CollectionSliderAdapter_Factory INSTANCE = new CollectionSliderAdapter_Factory();

  @Override
  public CollectionSliderAdapter get() {
    return new CollectionSliderAdapter();
  }

  public static CollectionSliderAdapter_Factory create() {
    return INSTANCE;
  }

  public static CollectionSliderAdapter newInstance() {
    return new CollectionSliderAdapter();
  }
}
