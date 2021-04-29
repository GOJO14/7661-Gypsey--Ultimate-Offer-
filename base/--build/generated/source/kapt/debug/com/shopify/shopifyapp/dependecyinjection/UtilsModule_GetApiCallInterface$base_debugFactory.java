package com.shopify.shopifyapp.dependecyinjection;

import com.shopify.shopifyapp.utils.ApiCallInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UtilsModule_GetApiCallInterface$base_debugFactory implements Factory<ApiCallInterface> {
  private final UtilsModule module;

  private final Provider<Retrofit> retrofitProvider;

  public UtilsModule_GetApiCallInterface$base_debugFactory(UtilsModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiCallInterface get() {
    return getApiCallInterface$base_debug(module, retrofitProvider.get());
  }

  public static UtilsModule_GetApiCallInterface$base_debugFactory create(UtilsModule module,
      Provider<Retrofit> retrofitProvider) {
    return new UtilsModule_GetApiCallInterface$base_debugFactory(module, retrofitProvider);
  }

  public static ApiCallInterface getApiCallInterface$base_debug(UtilsModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.getApiCallInterface$base_debug(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
