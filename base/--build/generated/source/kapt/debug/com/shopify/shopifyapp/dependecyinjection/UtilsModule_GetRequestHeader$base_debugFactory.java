package com.shopify.shopifyapp.dependecyinjection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UtilsModule_GetRequestHeader$base_debugFactory implements Factory<OkHttpClient> {
  private final UtilsModule module;

  public UtilsModule_GetRequestHeader$base_debugFactory(UtilsModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return getRequestHeader$base_debug(module);
  }

  public static UtilsModule_GetRequestHeader$base_debugFactory create(UtilsModule module) {
    return new UtilsModule_GetRequestHeader$base_debugFactory(module);
  }

  public static OkHttpClient getRequestHeader$base_debug(UtilsModule instance) {
    return Preconditions.checkNotNull(instance.getRequestHeader$base_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
