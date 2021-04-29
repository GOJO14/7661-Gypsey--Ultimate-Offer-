package com.shopify.shopifyapp.searchsection.adapters;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchRecylerAdapter_Factory implements Factory<SearchRecylerAdapter> {
  private static final SearchRecylerAdapter_Factory INSTANCE = new SearchRecylerAdapter_Factory();

  @Override
  public SearchRecylerAdapter get() {
    return new SearchRecylerAdapter();
  }

  public static SearchRecylerAdapter_Factory create() {
    return INSTANCE;
  }

  public static SearchRecylerAdapter newInstance() {
    return new SearchRecylerAdapter();
  }
}
