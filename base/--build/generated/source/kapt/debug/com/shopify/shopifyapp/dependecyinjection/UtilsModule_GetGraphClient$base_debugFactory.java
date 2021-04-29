package com.shopify.shopifyapp.dependecyinjection;

import android.content.Context;
import com.shopify.buy3.GraphClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UtilsModule_GetGraphClient$base_debugFactory implements Factory<GraphClient> {
  private final UtilsModule module;

  private final Provider<Context> contextProvider;

  private final Provider<OkHttpClient> clientProvider;

  public UtilsModule_GetGraphClient$base_debugFactory(UtilsModule module,
      Provider<Context> contextProvider, Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public GraphClient get() {
    return getGraphClient$base_debug(module, contextProvider.get(), clientProvider.get());
  }

  public static UtilsModule_GetGraphClient$base_debugFactory create(UtilsModule module,
      Provider<Context> contextProvider, Provider<OkHttpClient> clientProvider) {
    return new UtilsModule_GetGraphClient$base_debugFactory(module, contextProvider, clientProvider);
  }

  public static GraphClient getGraphClient$base_debug(UtilsModule instance, Context context,
      OkHttpClient client) {
    return Preconditions.checkNotNull(instance.getGraphClient$base_debug(context, client), "Cannot return null from a non-@Nullable @Provides method");
  }
}
