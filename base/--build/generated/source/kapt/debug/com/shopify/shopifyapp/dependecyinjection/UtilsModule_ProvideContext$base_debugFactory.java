package com.shopify.shopifyapp.dependecyinjection;

import android.content.Context;
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
public final class UtilsModule_ProvideContext$base_debugFactory implements Factory<Context> {
  private final UtilsModule module;

  public UtilsModule_ProvideContext$base_debugFactory(UtilsModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext$base_debug(module);
  }

  public static UtilsModule_ProvideContext$base_debugFactory create(UtilsModule module) {
    return new UtilsModule_ProvideContext$base_debugFactory(module);
  }

  public static Context provideContext$base_debug(UtilsModule instance) {
    return Preconditions.checkNotNull(instance.provideContext$base_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
