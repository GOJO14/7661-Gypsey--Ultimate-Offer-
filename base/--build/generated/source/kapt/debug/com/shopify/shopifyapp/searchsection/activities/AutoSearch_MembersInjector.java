package com.shopify.shopifyapp.searchsection.activities;

import com.shopify.shopifyapp.searchsection.adapters.SearchRecylerAdapter;
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
public final class AutoSearch_MembersInjector implements MembersInjector<AutoSearch> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<SearchRecylerAdapter> adapterProvider;

  public AutoSearch_MembersInjector(Provider<ViewModelFactory> factoryProvider,
      Provider<SearchRecylerAdapter> adapterProvider) {
    this.factoryProvider = factoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<AutoSearch> create(Provider<ViewModelFactory> factoryProvider,
      Provider<SearchRecylerAdapter> adapterProvider) {
    return new AutoSearch_MembersInjector(factoryProvider, adapterProvider);}

  @Override
  public void injectMembers(AutoSearch instance) {
    injectFactory(instance, factoryProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectFactory(AutoSearch instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectAdapter(AutoSearch instance, SearchRecylerAdapter adapter) {
    instance.adapter = adapter;
  }
}
