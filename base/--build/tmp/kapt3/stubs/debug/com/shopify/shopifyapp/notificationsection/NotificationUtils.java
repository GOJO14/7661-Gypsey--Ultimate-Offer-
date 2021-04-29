package com.shopify.shopifyapp.notificationsection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ@\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J,\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0007J8\u0010\u001a\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/shopify/shopifyapp/notificationsection/NotificationUtils;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getBitmapFromURL", "Landroid/graphics/Bitmap;", "strURL", "", "showBigNotification", "", "bitmap", "mBuilder", "Landroid/app/Notification$Builder;", "icon", "", "title", "message", "resultPendingIntent", "Landroid/app/PendingIntent;", "alarmSound", "Landroid/net/Uri;", "showNotificationMessage", "intent", "Landroid/content/Intent;", "imageUrl", "showSmallNotification", "Companion", "base_debug"})
public final class NotificationUtils {
    private final android.content.Context mContext = null;
    private static final java.lang.String TAG = null;
    public static final com.shopify.shopifyapp.notificationsection.NotificationUtils.Companion Companion = null;
    
    public final void showNotificationMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    public final void showNotificationMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void showSmallNotification(android.app.Notification.Builder mBuilder, int icon, java.lang.String title, java.lang.String message, android.app.PendingIntent resultPendingIntent, android.net.Uri alarmSound) {
    }
    
    private final void showBigNotification(android.graphics.Bitmap bitmap, android.app.Notification.Builder mBuilder, int icon, java.lang.String title, java.lang.String message, android.app.PendingIntent resultPendingIntent, android.net.Uri alarmSound) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getBitmapFromURL(@org.jetbrains.annotations.NotNull()
    java.lang.String strURL) {
        return null;
    }
    
    public NotificationUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/shopify/shopifyapp/notificationsection/NotificationUtils$Companion;", "", "()V", "TAG", "", "getTimeMilliSec", "", "timeStamp", "isAppIsInBackground", "", "context", "Landroid/content/Context;", "base_debug"})
    public static final class Companion {
        
        /**
         * Method checks if the app is in background or not
         */
        public final boolean isAppIsInBackground(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        public final long getTimeMilliSec(@org.jetbrains.annotations.NotNull()
        java.lang.String timeStamp) {
            return 0L;
        }
        
        private Companion() {
            super();
        }
    }
}