package com.shopify.shopifyapp.basesection.adapters;

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
public final class RecylerAdapter_Factory implements Factory<RecylerAdapter> {
  private static final RecylerAdapter_Factory INSTANCE = new RecylerAdapter_Factory();

  @Override
  public RecylerAdapter get() {
    return new RecylerAdapter();
  }

  public static RecylerAdapter_Factory create() {
    return INSTANCE;
  }

  public static RecylerAdapter newInstance() {
    return new RecylerAdapter();
  }
}
