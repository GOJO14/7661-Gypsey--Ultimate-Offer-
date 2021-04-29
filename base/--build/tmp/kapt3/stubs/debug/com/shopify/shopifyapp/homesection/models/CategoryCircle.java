package com.shopify.shopifyapp.homesection.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bA\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0000J\u0010\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0002J$\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u00042\b\u0010K\u001a\u0004\u0018\u00010\u0004H\u0002R*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR*\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR*\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR*\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR*\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR*\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR*\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR*\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR*\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR*\u0010\'\u001a\u0004\u0018\u00010\u00042\b\u0010\'\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR*\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR*\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR*\u00100\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR*\u00103\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR*\u00106\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR*\u00109\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR*\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010<\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR*\u0010?\u001a\u0004\u0018\u00010\u00042\b\u0010?\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR*\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010B\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\b\u00a8\u0006P"}, d2 = {"Lcom/shopify/shopifyapp/homesection/models/CategoryCircle;", "Landroidx/databinding/BaseObservable;", "()V", "cat_image_five", "", "getCat_image_five", "()Ljava/lang/String;", "setCat_image_five", "(Ljava/lang/String;)V", "cat_image_four", "getCat_image_four", "setCat_image_four", "cat_image_one", "getCat_image_one", "setCat_image_one", "cat_image_three", "getCat_image_three", "setCat_image_three", "cat_image_two", "getCat_image_two", "setCat_image_two", "cat_link_five", "getCat_link_five", "setCat_link_five", "cat_link_four", "getCat_link_four", "setCat_link_four", "cat_link_one", "getCat_link_one", "setCat_link_one", "cat_link_three", "getCat_link_three", "setCat_link_three", "cat_link_two", "getCat_link_two", "setCat_link_two", "cat_text_five", "getCat_text_five", "setCat_text_five", "cat_text_four", "getCat_text_four", "setCat_text_four", "cat_text_one", "getCat_text_one", "setCat_text_one", "cat_text_three", "getCat_text_three", "setCat_text_three", "cat_text_two", "getCat_text_two", "setCat_text_two", "cat_value_five", "getCat_value_five", "setCat_value_five", "cat_value_four", "getCat_value_four", "setCat_value_four", "cat_value_one", "getCat_value_one", "setCat_value_one", "cat_value_three", "getCat_value_three", "setCat_value_three", "cat_value_two", "getCat_value_two", "setCat_value_two", "radius", "getRadius", "setRadius", "catClick", "", "view", "Landroid/view/View;", "category", "getBase64Encode", "id", "navigateToPage", "context", "Landroid/content/Context;", "type", "base_debug"})
public final class CategoryCircle extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_image_one;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_text_one;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_value_one;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_link_one;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_image_two;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_text_two;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_value_two;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_link_two;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_image_three;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_text_three;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_value_three;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_link_three;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_image_four;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_text_four;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_value_four;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_link_four;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_image_five;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_text_five;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_value_five;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cat_link_five;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String radius;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_image_one() {
        return null;
    }
    
    public final void setCat_image_one(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_image_one) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_text_one() {
        return null;
    }
    
    public final void setCat_text_one(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_text_one) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_value_one() {
        return null;
    }
    
    public final void setCat_value_one(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_value_one) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_link_one() {
        return null;
    }
    
    public final void setCat_link_one(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_link_one) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_image_two() {
        return null;
    }
    
    public final void setCat_image_two(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_image_two) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_text_two() {
        return null;
    }
    
    public final void setCat_text_two(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_text_two) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_value_two() {
        return null;
    }
    
    public final void setCat_value_two(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_value_two) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_link_two() {
        return null;
    }
    
    public final void setCat_link_two(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_link_two) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_image_three() {
        return null;
    }
    
    public final void setCat_image_three(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_image_three) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_text_three() {
        return null;
    }
    
    public final void setCat_text_three(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_text_three) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_value_three() {
        return null;
    }
    
    public final void setCat_value_three(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_value_three) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_link_three() {
        return null;
    }
    
    public final void setCat_link_three(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_link_three) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_image_four() {
        return null;
    }
    
    public final void setCat_image_four(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_image_four) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_text_four() {
        return null;
    }
    
    public final void setCat_text_four(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_text_four) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_value_four() {
        return null;
    }
    
    public final void setCat_value_four(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_value_four) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_link_four() {
        return null;
    }
    
    public final void setCat_link_four(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_link_four) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_image_five() {
        return null;
    }
    
    public final void setCat_image_five(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_image_five) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_text_five() {
        return null;
    }
    
    public final void setCat_text_five(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_text_five) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_value_five() {
        return null;
    }
    
    public final void setCat_value_five(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_value_five) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCat_link_five() {
        return null;
    }
    
    public final void setCat_link_five(@org.jetbrains.annotations.Nullable()
    java.lang.String cat_link_five) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getRadius() {
        return null;
    }
    
    public final void setRadius(@org.jetbrains.annotations.Nullable()
    java.lang.String radius) {
    }
    
    public final void catClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.models.CategoryCircle category) {
    }
    
    private final void navigateToPage(android.content.Context context, java.lang.String type, java.lang.String id) {
    }
    
    private final java.lang.String getBase64Encode(java.lang.String id) {
        return null;
    }
    
    public CategoryCircle() {
        super();
    }
}