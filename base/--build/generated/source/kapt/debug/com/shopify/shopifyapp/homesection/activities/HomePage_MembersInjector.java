package com.shopify.shopifyapp.homesection.activities;

import com.shopify.shopifyapp.basesection.activities.NewBaseActivity_MembersInjector;
import com.shopify.shopifyapp.basesection.adapters.RecylerAdapter;
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
public final class HomePage_MembersInjector implements MembersInjector<HomePage> {
  private final Provider<ViewModelFactory> factoryAndViewModelFactoryProvider;

  private final Provider<RecylerAdapter> adapterProvider;

  public HomePage_MembersInjector(Provider<ViewModelFactory> factoryAndViewModelFactoryProvider,
      Provider<RecylerAdapter> adapterProvider) {
    this.factoryAndViewModelFactoryProvider = factoryAndViewModelFactoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<HomePage> create(
      Provider<ViewModelFactory> factoryAndViewModelFactoryProvider,
      Provider<RecylerAdapter> adapterProvider) {
    return new HomePage_MembersInjector(factoryAndViewModelFactoryProvider, adapterProvider);}

  @Override
  public void injectMembers(HomePage instance) {
    NewBaseActivity_MembersInjector.injectViewModelFactory(instance, factoryAndViewModelFactoryProvider.get());
    NewBaseActivity_MembersInjector.injectAdapter(instance, adapterProvider.get());
    injectFactory(instance, factoryAndViewModelFactoryProvider.get());
  }

  public static void injectFactory(HomePage instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
