package com.shopify.shopifyapp.ordersection.adapters;

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
public final class OrderListAdapter_Factory implements Factory<OrderListAdapter> {
  private static final OrderListAdapter_Factory INSTANCE = new OrderListAdapter_Factory();

  @Override
  public OrderListAdapter get() {
    return new OrderListAdapter();
  }

  public static OrderListAdapter_Factory create() {
    return INSTANCE;
  }

  public static OrderListAdapter newInstance() {
    return new OrderListAdapter();
  }
}
