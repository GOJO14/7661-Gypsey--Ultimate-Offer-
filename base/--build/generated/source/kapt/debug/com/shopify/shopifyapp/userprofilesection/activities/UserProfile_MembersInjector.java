package com.shopify.shopifyapp.userprofilesection.activities;

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
public final class UserProfile_MembersInjector implements MembersInjector<UserProfile> {
  private final Provider<ViewModelFactory> factoryProvider;

  public UserProfile_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<UserProfile> create(Provider<ViewModelFactory> factoryProvider) {
    return new UserProfile_MembersInjector(factoryProvider);}

  @Override
  public void injectMembers(UserProfile instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(UserProfile instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
