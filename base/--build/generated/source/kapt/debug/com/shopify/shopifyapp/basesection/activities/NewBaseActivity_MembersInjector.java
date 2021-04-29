package com.shopify.shopifyapp.basesection.activities;

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
public final class NewBaseActivity_MembersInjector implements MembersInjector<NewBaseActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  private final Provider<RecylerAdapter> adapterProvider;

  public NewBaseActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<RecylerAdapter> adapterProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<NewBaseActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<RecylerAdapter> adapterProvider) {
    return new NewBaseActivity_MembersInjector(viewModelFactoryProvider, adapterProvider);}

  @Override
  public void injectMembers(NewBaseActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectViewModelFactory(NewBaseActivity instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectAdapter(NewBaseActivity instance, RecylerAdapter adapter) {
    instance.adapter = adapter;
  }
}
