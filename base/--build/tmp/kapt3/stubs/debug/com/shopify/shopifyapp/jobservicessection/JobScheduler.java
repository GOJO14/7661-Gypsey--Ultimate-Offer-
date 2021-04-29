package com.shopify.shopifyapp.jobservicessection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/shopify/shopifyapp/jobservicessection/JobScheduler;", "Landroid/app/job/JobService;", "()V", "repository", "Lcom/shopify/shopifyapp/repositories/Repository;", "getRepository", "()Lcom/shopify/shopifyapp/repositories/Repository;", "setRepository", "(Lcom/shopify/shopifyapp/repositories/Repository;)V", "onStartJob", "", "jobParameters", "Landroid/app/job/JobParameters;", "onStopJob", "showCartNotification", "", "Companion", "base_debug"})
public final class JobScheduler extends android.app.job.JobService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.shopify.shopifyapp.repositories.Repository repository;
    public static final com.shopify.shopifyapp.jobservicessection.JobScheduler.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopify.shopifyapp.repositories.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.repositories.Repository p0) {
    }
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.NotNull()
    android.app.job.JobParameters jobParameters) {
        return false;
    }
    
    private final void showCartNotification() {
    }
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.NotNull()
    android.app.job.JobParameters jobParameters) {
        return false;
    }
    
    public JobScheduler() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/shopify/shopifyapp/jobservicessection/JobScheduler$Companion;", "", "()V", "isAppIsInBackground", "", "context", "Landroid/content/Context;", "base_debug"})
    public static final class Companion {
        
        public final boolean isAppIsInBackground(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}