package com.shopify.shopifyapp.utils;

import com.shopify.shopifyapp.repositories.Repository;
import dagger.MembersInjector;
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
public final class Urls_MembersInjector implements MembersInjector<Urls> {
  private final Provider<Repository> repositoryProvider;

  public Urls_MembersInjector(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<Urls> create(Provider<Repository> repositoryProvider) {
    return new Urls_MembersInjector(repositoryProvider);}

  @Override
  public void injectMembers(Urls instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  public static void injectRepository(Urls instance, Repository repository) {
    instance.repository = repository;
  }
}
