package com.shopify.shopifyapp.wishlistsection.adapters;

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
public final class WishListAdapter_Factory implements Factory<WishListAdapter> {
  private static final WishListAdapter_Factory INSTANCE = new WishListAdapter_Factory();

  @Override
  public WishListAdapter get() {
    return new WishListAdapter();
  }

  public static WishListAdapter_Factory create() {
    return INSTANCE;
  }

  public static WishListAdapter newInstance() {
    return new WishListAdapter();
  }
}
