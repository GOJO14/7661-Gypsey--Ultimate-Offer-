package com.shopify.shopifyapp.notificationsection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J0\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/shopify/shopifyapp/notificationsection/FirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "notificationUtils", "Lcom/shopify/shopifyapp/notificationsection/NotificationUtils;", "getBase64Encode", "", "id", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "showNotificationMessage", "context", "Landroid/content/Context;", "title", "message", "intent", "Landroid/content/Intent;", "showNotificationMessageWithBigImage", "imageUrl", "Companion", "base_debug"})
public final class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private com.shopify.shopifyapp.notificationsection.NotificationUtils notificationUtils;
    private static final java.lang.String TAG = "FirebaseMessageService";
    public static final com.shopify.shopifyapp.notificationsection.FirebaseMessagingService.Companion Companion = null;
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void showNotificationMessage(android.content.Context context, java.lang.String title, java.lang.String message, android.content.Intent intent) {
    }
    
    private final void showNotificationMessageWithBigImage(android.content.Context context, java.lang.String title, java.lang.String message, android.content.Intent intent, java.lang.String imageUrl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase64Encode(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public FirebaseMessagingService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/shopify/shopifyapp/notificationsection/FirebaseMessagingService$Companion;", "", "()V", "TAG", "", "base_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}