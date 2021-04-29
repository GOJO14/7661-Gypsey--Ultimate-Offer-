package com.shopify.shopifyapp.checkoutsection.activities;

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
public final class CheckoutWeblink_MembersInjector implements MembersInjector<CheckoutWeblink> {
  private final Provider<ViewModelFactory> factoryProvider;

  public CheckoutWeblink_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<CheckoutWeblink> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new CheckoutWeblink_MembersInjector(factoryProvider);}

  @Override
  public void injectMembers(CheckoutWeblink instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(CheckoutWeblink instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
