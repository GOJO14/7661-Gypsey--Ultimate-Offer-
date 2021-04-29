package com.shopify.shopifyapp.basesection.activities;

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
public final class Splash_MembersInjector implements MembersInjector<Splash> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public Splash_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<Splash> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new Splash_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(Splash instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(Splash instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
