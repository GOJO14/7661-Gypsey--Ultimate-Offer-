package com.shopify.shopifyapp.dependecyinjection;

import com.shopify.buy3.GraphClient;
import com.shopify.shopifyapp.dbconnection.database.AppDatabase;
import com.shopify.shopifyapp.repositories.Repository;
import com.shopify.shopifyapp.utils.ApiCallInterface;
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
public final class UtilsModule_GetRepository$base_debugFactory implements Factory<Repository> {
  private final UtilsModule module;

  private final Provider<ApiCallInterface> apiCallInterfaceProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  private final Provider<GraphClient> clientProvider;

  public UtilsModule_GetRepository$base_debugFactory(UtilsModule module,
      Provider<ApiCallInterface> apiCallInterfaceProvider,
      Provider<AppDatabase> appDatabaseProvider, Provider<GraphClient> clientProvider) {
    this.module = module;
    this.apiCallInterfaceProvider = apiCallInterfaceProvider;
    this.appDatabaseProvider = appDatabaseProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public Repository get() {
    return getRepository$base_debug(module, apiCallInterfaceProvider.get(), appDatabaseProvider.get(), clientProvider.get());
  }

  public static UtilsModule_GetRepository$base_debugFactory create(UtilsModule module,
      Provider<ApiCallInterface> apiCallInterfaceProvider,
      Provider<AppDatabase> appDatabaseProvider, Provider<GraphClient> clientProvider) {
    return new UtilsModule_GetRepository$base_debugFactory(module, apiCallInterfaceProvider, appDatabaseProvider, clientProvider);
  }

  public static Repository getRepository$base_debug(UtilsModule instance,
      ApiCallInterface apiCallInterface, AppDatabase appDatabase, GraphClient client) {
    return Preconditions.checkNotNull(instance.getRepository$base_debug(apiCallInterface, appDatabase, client), "Cannot return null from a non-@Nullable @Provides method");
  }
}
