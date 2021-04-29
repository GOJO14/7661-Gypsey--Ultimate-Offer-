package com.shopify.shopifyapp.dependecyinjection;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UtilsModule_ProvideRetrofit$base_debugFactory implements Factory<Retrofit> {
  private final UtilsModule module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public UtilsModule_ProvideRetrofit$base_debugFactory(UtilsModule module,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit$base_debug(module, gsonProvider.get(), okHttpClientProvider.get());
  }

  public static UtilsModule_ProvideRetrofit$base_debugFactory create(UtilsModule module,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> okHttpClientProvider) {
    return new UtilsModule_ProvideRetrofit$base_debugFactory(module, gsonProvider, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit$base_debug(UtilsModule instance, Gson gson,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.provideRetrofit$base_debug(gson, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
