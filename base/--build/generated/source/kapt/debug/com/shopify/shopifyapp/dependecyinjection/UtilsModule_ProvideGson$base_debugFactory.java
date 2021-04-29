package com.shopify.shopifyapp.dependecyinjection;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UtilsModule_ProvideGson$base_debugFactory implements Factory<Gson> {
  private final UtilsModule module;

  public UtilsModule_ProvideGson$base_debugFactory(UtilsModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideGson$base_debug(module);
  }

  public static UtilsModule_ProvideGson$base_debugFactory create(UtilsModule module) {
    return new UtilsModule_ProvideGson$base_debugFactory(module);
  }

  public static Gson provideGson$base_debug(UtilsModule instance) {
    return Preconditions.checkNotNull(instance.provideGson$base_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
