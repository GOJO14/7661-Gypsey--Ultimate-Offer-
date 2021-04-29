package com.shopify.shopifyapp.dependecyinjection;

import android.content.Context;
import com.shopify.shopifyapp.dbconnection.database.AppDatabase;
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
public final class UtilsModule_GetAppDatabase$base_debugFactory implements Factory<AppDatabase> {
  private final UtilsModule module;

  private final Provider<Context> contextProvider;

  public UtilsModule_GetAppDatabase$base_debugFactory(UtilsModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return getAppDatabase$base_debug(module, contextProvider.get());
  }

  public static UtilsModule_GetAppDatabase$base_debugFactory create(UtilsModule module,
      Provider<Context> contextProvider) {
    return new UtilsModule_GetAppDatabase$base_debugFactory(module, contextProvider);
  }

  public static AppDatabase getAppDatabase$base_debug(UtilsModule instance, Context context) {
    return Preconditions.checkNotNull(instance.getAppDatabase$base_debug(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
