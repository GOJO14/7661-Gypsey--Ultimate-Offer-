package com.shopify.shopifyapp.collectionsection.adapters;

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
public final class CollectionRecylerAdapter_Factory implements Factory<CollectionRecylerAdapter> {
  private static final CollectionRecylerAdapter_Factory INSTANCE = new CollectionRecylerAdapter_Factory();

  @Override
  public CollectionRecylerAdapter get() {
    return new CollectionRecylerAdapter();
  }

  public static CollectionRecylerAdapter_Factory create() {
    return INSTANCE;
  }

  public static CollectionRecylerAdapter newInstance() {
    return new CollectionRecylerAdapter();
  }
}
