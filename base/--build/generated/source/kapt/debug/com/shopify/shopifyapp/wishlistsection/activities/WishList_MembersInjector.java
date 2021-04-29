package com.shopify.shopifyapp.wishlistsection.activities;

import com.shopify.shopifyapp.utils.ViewModelFactory;
import com.shopify.shopifyapp.wishlistsection.adapters.WishListAdapter;
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
public final class WishList_MembersInjector implements MembersInjector<WishList> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<WishListAdapter> adapterProvider;

  public WishList_MembersInjector(Provider<ViewModelFactory> factoryProvider,
      Provider<WishListAdapter> adapterProvider) {
    this.factoryProvider = factoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<WishList> create(Provider<ViewModelFactory> factoryProvider,
      Provider<WishListAdapter> adapterProvider) {
    return new WishList_MembersInjector(factoryProvider, adapterProvider);}

  @Override
  public void injectMembers(WishList instance) {
    injectFactory(instance, factoryProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectFactory(WishList instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectAdapter(WishList instance, WishListAdapter adapter) {
    instance.adapter = adapter;
  }
}
