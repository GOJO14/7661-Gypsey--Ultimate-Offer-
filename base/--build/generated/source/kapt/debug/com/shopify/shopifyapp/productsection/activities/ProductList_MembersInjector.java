package com.shopify.shopifyapp.productsection.activities;

import com.shopify.shopifyapp.productsection.adapters.ProductRecylerAdapter;
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
public final class ProductList_MembersInjector implements MembersInjector<ProductList> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<ProductRecylerAdapter> adapterProvider;

  public ProductList_MembersInjector(Provider<ViewModelFactory> factoryProvider,
      Provider<ProductRecylerAdapter> adapterProvider) {
    this.factoryProvider = factoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<ProductList> create(Provider<ViewModelFactory> factoryProvider,
      Provider<ProductRecylerAdapter> adapterProvider) {
    return new ProductList_MembersInjector(factoryProvider, adapterProvider);}

  @Override
  public void injectMembers(ProductList instance) {
    injectFactory(instance, factoryProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectFactory(ProductList instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectAdapter(ProductList instance, ProductRecylerAdapter adapter) {
    instance.adapter = adapter;
  }
}
