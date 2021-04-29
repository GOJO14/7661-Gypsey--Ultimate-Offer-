package com.shopify.shopifyapp.cartsection.activities;

import com.shopify.shopifyapp.cartsection.adapters.CartListAdapter;
import com.shopify.shopifyapp.utils.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CartList_MembersInjector implements MembersInjector<CartList> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<CartListAdapter> adapterProvider;

  public CartList_MembersInjector(Provider<ViewModelFactory> factoryProvider,
      Provider<CartListAdapter> adapterProvider) {
    this.factoryProvider = factoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<CartList> create(Provider<ViewModelFactory> factoryProvider,
      Provider<CartListAdapter> adapterProvider) {
    return new CartList_MembersInjector(factoryProvider, adapterProvider);}

  @Override
  public void injectMembers(CartList instance) {
    injectFactory(instance, factoryProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectFactory(CartList instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectAdapter(CartList instance, CartListAdapter adapter) {
    instance.adapter = adapter;
  }
}
