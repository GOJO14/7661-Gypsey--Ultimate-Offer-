package com.shopify.shopifyapp.homesection.viewmodels;

import com.shopify.shopifyapp.homesection.adapters.CollectionGridAdapter;
import com.shopify.shopifyapp.homesection.adapters.CollectionSliderAdapter;
import com.shopify.shopifyapp.homesection.adapters.ProductGridAdapter;
import com.shopify.shopifyapp.homesection.adapters.ProductListAdapter;
import com.shopify.shopifyapp.homesection.adapters.ProductSliderAdapter;
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
public final class HomePageViewModel_MembersInjector implements MembersInjector<HomePageViewModel> {
  private final Provider<ProductSliderAdapter> homeadapterProvider;

  private final Provider<ProductListAdapter> productListAdapterProvider;

  private final Provider<CollectionGridAdapter> adapterProvider;

  private final Provider<CollectionSliderAdapter> slideradapterProvider;

  private final Provider<ProductGridAdapter> gridAdapterProvider;

  public HomePageViewModel_MembersInjector(Provider<ProductSliderAdapter> homeadapterProvider,
      Provider<ProductListAdapter> productListAdapterProvider,
      Provider<CollectionGridAdapter> adapterProvider,
      Provider<CollectionSliderAdapter> slideradapterProvider,
      Provider<ProductGridAdapter> gridAdapterProvider) {
    this.homeadapterProvider = homeadapterProvider;
    this.productListAdapterProvider = productListAdapterProvider;
    this.adapterProvider = adapterProvider;
    this.slideradapterProvider = slideradapterProvider;
    this.gridAdapterProvider = gridAdapterProvider;
  }

  public static MembersInjector<HomePageViewModel> create(
      Provider<ProductSliderAdapter> homeadapterProvider,
      Provider<ProductListAdapter> productListAdapterProvider,
      Provider<CollectionGridAdapter> adapterProvider,
      Provider<CollectionSliderAdapter> slideradapterProvider,
      Provider<ProductGridAdapter> gridAdapterProvider) {
    return new HomePageViewModel_MembersInjector(homeadapterProvider, productListAdapterProvider, adapterProvider, slideradapterProvider, gridAdapterProvider);}

  @Override
  public void injectMembers(HomePageViewModel instance) {
    injectHomeadapter(instance, homeadapterProvider.get());
    injectProductListAdapter(instance, productListAdapterProvider.get());
    injectAdapter(instance, adapterProvider.get());
    injectSlideradapter(instance, slideradapterProvider.get());
    injectGridAdapter(instance, gridAdapterProvider.get());
  }

  public static void injectHomeadapter(HomePageViewModel instance,
      ProductSliderAdapter homeadapter) {
    instance.homeadapter = homeadapter;
  }

  public static void injectProductListAdapter(HomePageViewModel instance,
      ProductListAdapter productListAdapter) {
    instance.productListAdapter = productListAdapter;
  }

  public static void injectAdapter(HomePageViewModel instance, CollectionGridAdapter adapter) {
    instance.adapter = adapter;
  }

  public static void injectSlideradapter(HomePageViewModel instance,
      CollectionSliderAdapter slideradapter) {
    instance.slideradapter = slideradapter;
  }

  public static void injectGridAdapter(HomePageViewModel instance, ProductGridAdapter gridAdapter) {
    instance.gridAdapter = gridAdapter;
  }
}
