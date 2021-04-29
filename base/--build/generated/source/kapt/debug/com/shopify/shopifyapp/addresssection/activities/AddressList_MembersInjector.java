package com.shopify.shopifyapp.addresssection.activities;

import com.shopify.shopifyapp.addresssection.adapters.AddressListAdapter;
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
public final class AddressList_MembersInjector implements MembersInjector<AddressList> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<AddressListAdapter> adapterProvider;

  public AddressList_MembersInjector(Provider<ViewModelFactory> factoryProvider,
      Provider<AddressListAdapter> adapterProvider) {
    this.factoryProvider = factoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<AddressList> create(Provider<ViewModelFactory> factoryProvider,
      Provider<AddressListAdapter> adapterProvider) {
    return new AddressList_MembersInjector(factoryProvider, adapterProvider);}

  @Override
  public void injectMembers(AddressList instance) {
    injectFactory(instance, factoryProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectFactory(AddressList instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectAdapter(AddressList instance, AddressListAdapter adapter) {
    instance.adapter = adapter;
  }
}
