package com.shopify.shopifyapp.dependecyinjection;

import androidx.lifecycle.ViewModelProvider;
import com.shopify.shopifyapp.repositories.Repository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class UtilsModule_GetViewModelFactory$base_debugFactory implements Factory<ViewModelProvider.Factory> {
  private final UtilsModule module;

  private final Provider<Repository> myRepositoryProvider;

  public UtilsModule_GetViewModelFactory$base_debugFactory(UtilsModule module,
      Provider<Repository> myRepositoryProvider) {
    this.module = module;
    this.myRepositoryProvider = myRepositoryProvider;
  }

  @Override
  public ViewModelProvider.Factory get() {
    return getViewModelFactory$base_debug(module, myRepositoryProvider.get());
  }

  public static UtilsModule_GetViewModelFactory$base_debugFactory create(UtilsModule module,
      Provider<Repository> myRepositoryProvider) {
    return new UtilsModule_GetViewModelFactory$base_debugFactory(module, myRepositoryProvider);
  }

  public static ViewModelProvider.Factory getViewModelFactory$base_debug(UtilsModule instance,
      Repository myRepository) {
    return Preconditions.checkNotNull(instance.getViewModelFactory$base_debug(myRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
