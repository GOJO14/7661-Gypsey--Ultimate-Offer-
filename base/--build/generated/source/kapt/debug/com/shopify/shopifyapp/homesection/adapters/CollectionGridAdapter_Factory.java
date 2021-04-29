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
public final class CollectionGridAdapter_Factory implements Factory<CollectionGridAdapter> {
  private static final CollectionGridAdapter_Factory INSTANCE = new CollectionGridAdapter_Factory();

  @Override
  public CollectionGridAdapter get() {
    return new CollectionGridAdapter();
  }

  public static CollectionGridAdapter_Factory create() {
    return INSTANCE;
  }

  public static CollectionGridAdapter newInstance() {
    return new CollectionGridAdapter();
  }
}
