package com.shopify.shopifyapp.loginsection.activity;

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
public final class RegistrationActivity_MembersInjector implements MembersInjector<RegistrationActivity> {
  private final Provider<ViewModelFactory> factoryProvider;

  public RegistrationActivity_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<RegistrationActivity> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new RegistrationActivity_MembersInjector(factoryProvider);}

  @Override
  public void injectMembers(RegistrationActivity instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(RegistrationActivity instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
