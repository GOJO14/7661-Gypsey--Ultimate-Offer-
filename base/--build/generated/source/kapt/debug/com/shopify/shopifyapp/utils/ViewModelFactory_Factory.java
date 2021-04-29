package com.shopify.shopifyapp.utils;

import com.shopify.shopifyapp.repositories.Repository;
import dagger.internal.Factory;
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
public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<Repository> repositoryProvider;

  public ViewModelFactory_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ViewModelFactory get() {
    return new ViewModelFactory(repositoryProvider.get());
  }

  public static ViewModelFactory_Factory create(Provider<Repository> repositoryProvider) {
    return new ViewModelFactory_Factory(repositoryProvider);
  }

  public static ViewModelFactory newInstance(Repository repository) {
    return new ViewModelFactory(repository);
  }
}
