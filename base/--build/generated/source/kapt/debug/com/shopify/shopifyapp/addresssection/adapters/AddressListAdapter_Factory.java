package com.shopify.shopifyapp.addresssection.adapters;

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
public final class AddressListAdapter_Factory implements Factory<AddressListAdapter> {
  private static final AddressListAdapter_Factory INSTANCE = new AddressListAdapter_Factory();

  @Override
  public AddressListAdapter get() {
    return new AddressListAdapter();
  }

  public static AddressListAdapter_Factory create() {
    return INSTANCE;
  }

  public static AddressListAdapter newInstance() {
    return new AddressListAdapter();
  }
}
