package com.shopify.shopifyapp.cartsection.adapters;

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
public final class CartListAdapter_Factory implements Factory<CartListAdapter> {
  private static final CartListAdapter_Factory INSTANCE = new CartListAdapter_Factory();

  @Override
  public CartListAdapter get() {
    return new CartListAdapter();
  }

  public static CartListAdapter_Factory create() {
    return INSTANCE;
  }

  public static CartListAdapter newInstance() {
    return new CartListAdapter();
  }
}
