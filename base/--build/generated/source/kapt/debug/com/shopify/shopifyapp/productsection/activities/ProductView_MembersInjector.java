package com.shopify.shopifyapp.productsection.activities;

import com.shopify.shopifyapp.productsection.adapters.VariantAdapter;
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
public final class ProductView_MembersInjector implements MembersInjector<ProductView> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<VariantAdapter> adapterProvider;

  public ProductView_MembersInjector(Provider<ViewModelFactory> factoryProvider,
      Provider<VariantAdapter> adapterProvider) {
    this.factoryProvider = factoryProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<ProductView> create(Provider<ViewModelFactory> factoryProvider,
      Provider<VariantAdapter> adapterProvider) {
    return new ProductView_MembersInjector(factoryProvider, adapterProvider);}

  @Override
  public void injectMembers(ProductView instance) {
    injectFactory(instance, factoryProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  public static void injectFactory(ProductView instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectAdapter(ProductView instance, VariantAdapter adapter) {
    instance.adapter = adapter;
  }
}
