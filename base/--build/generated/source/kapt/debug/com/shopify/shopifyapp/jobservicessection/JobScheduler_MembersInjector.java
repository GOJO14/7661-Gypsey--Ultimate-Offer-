package com.shopify.shopifyapp.jobservicessection;

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
public final class JobScheduler_MembersInjector implements MembersInjector<JobScheduler> {
  private final Provider<Repository> repositoryProvider;

  public JobScheduler_MembersInjector(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<JobScheduler> create(Provider<Repository> repositoryProvider) {
    return new JobScheduler_MembersInjector(repositoryProvider);}

  @Override
  public void injectMembers(JobScheduler instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  public static void injectRepository(JobScheduler instance, Repository repository) {
    instance.repository = repository;
  }
}
