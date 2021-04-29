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
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<ViewModelFactory> factoryProvider;

  public LoginActivity_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<LoginActivity> create(Provider<ViewModelFactory> factoryProvider) {
    return new LoginActivity_MembersInjector(factoryProvider);}

  @Override
  public void injectMembers(LoginActivity instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(LoginActivity instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
