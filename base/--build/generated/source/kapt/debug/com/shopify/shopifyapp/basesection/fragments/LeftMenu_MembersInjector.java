package com.shopify.shopifyapp.basesection.fragments;

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
public final class LeftMenu_MembersInjector implements MembersInjector<LeftMenu> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public LeftMenu_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<LeftMenu> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new LeftMenu_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(LeftMenu instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(LeftMenu instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
