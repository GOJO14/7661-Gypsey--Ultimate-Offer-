package com.shopify.shopifyapp.collectionsection.activities;

import com.shopify.shopifyapp.collectionsection.adapters.CollectionRecylerAdapter;
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
public final class CollectionList_MembersInjector implements MembersInjector<CollectionList> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<CollectionRecylerAdapter> adapterProvider;

  public CollectionList_MembersInjector(Provider<ViewModelFactory> factoryProvider,
      Provider<CollectionRecylerAdapter> adapterProvider) {
    this.factoryProvider = factoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<CollectionList> create(Provider<ViewModelFactory> factoryProvider,
      Provider<CollectionRecylerAdapter> adapterProvider) {
    return new CollectionList_MembersInjector(factoryProvider, adapterProvider);}

  @Override
  public void injectMembers(CollectionList instance) {
    injectFactory(instance, factoryProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectFactory(CollectionList instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectAdapter(CollectionList instance, CollectionRecylerAdapter adapter) {
    instance.adapter = adapter;
  }
}
