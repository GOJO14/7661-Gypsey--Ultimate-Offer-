package com.shopify.shopifyapp.homesection.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bF\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0004H\u0002J\u0016\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0000J\"\u0010X\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\b\u0010Y\u001a\u0004\u0018\u00010\u00042\b\u0010R\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR,\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8G@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR,\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\r8G@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R*\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR*\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR*\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR*\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR*\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR*\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR*\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR*\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR*\u00101\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR*\u00104\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR*\u00107\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR*\u0010:\u001a\u0004\u0018\u00010\u00042\b\u0010:\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR*\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010=\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR,\u0010@\u001a\u0004\u0018\u00010\r2\b\u0010@\u001a\u0004\u0018\u00010\r8G@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bA\u0010\u000f\"\u0004\bB\u0010\u0011R&\u0010C\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR,\u0010H\u001a\u0004\u0018\u00010\r2\b\u0010H\u001a\u0004\u0018\u00010\r8G@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011R*\u0010K\u001a\u0004\u0018\u00010\u00042\b\u0010K\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR*\u0010N\u001a\u0004\u0018\u00010\u00042\b\u0010N\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\b\u00a8\u0006Z"}, d2 = {"Lcom/shopify/shopifyapp/homesection/models/ProductSlider;", "Landroidx/databinding/BaseObservable;", "()V", "action_id", "", "getAction_id", "()Ljava/lang/String;", "setAction_id", "(Ljava/lang/String;)V", "actiontext", "getActiontext", "setActiontext", "actiontextvisibity", "", "getActiontextvisibity", "()Ljava/lang/Integer;", "setActiontextvisibity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "headertext", "getHeadertext", "setHeadertext", "headertextvisibility", "getHeadertextvisibility", "setHeadertextvisibility", "hvimageone", "getHvimageone", "setHvimageone", "hvimagethree", "getHvimagethree", "setHvimagethree", "hvimagetwo", "getHvimagetwo", "setHvimagetwo", "hvnameone", "getHvnameone", "setHvnameone", "hvnamethree", "getHvnamethree", "setHvnamethree", "hvnametwo", "getHvnametwo", "setHvnametwo", "hvtypeone", "getHvtypeone", "setHvtypeone", "hvtypethree", "getHvtypethree", "setHvtypethree", "hvtypetwo", "getHvtypetwo", "setHvtypetwo", "hvvalueone", "getHvvalueone", "setHvvalueone", "hvvaluethree", "getHvvaluethree", "setHvvaluethree", "hvvaluetwo", "getHvvaluetwo", "setHvvaluetwo", "subheadertext", "getSubheadertext", "setSubheadertext", "subheadertextvisibity", "getSubheadertextvisibity", "setSubheadertextvisibity", "textaligment", "getTextaligment", "()I", "setTextaligment", "(I)V", "timericon", "getTimericon", "setTimericon", "timertext", "getTimertext", "setTimertext", "timertextmessage", "getTimertextmessage", "setTimertextmessage", "getBase64Encode", "id", "moreAction", "", "view", "Landroid/view/View;", "category", "navigateToPage", "type", "base_debug"})
public final class ProductSlider extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String action_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String headertext;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer headertextvisibility;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String actiontext;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer actiontextvisibity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subheadertext;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer subheadertextvisibity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer timericon;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String timertext;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String timertextmessage;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvimageone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvnameone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvtypeone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvvalueone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvimagetwo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvnametwo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvtypetwo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvvaluetwo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvimagethree;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvnamethree;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvtypethree;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hvvaluethree;
    private int textaligment;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAction_id() {
        return null;
    }
    
    public final void setAction_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHeadertext() {
        return null;
    }
    
    public final void setHeadertext(@org.jetbrains.annotations.Nullable()
    java.lang.String headertext) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.Integer getHeadertextvisibility() {
        return null;
    }
    
    public final void setHeadertextvisibility(@org.jetbrains.annotations.Nullable()
    java.lang.Integer headertextvisibility) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getActiontext() {
        return null;
    }
    
    public final void setActiontext(@org.jetbrains.annotations.Nullable()
    java.lang.String actiontext) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.Integer getActiontextvisibity() {
        return null;
    }
    
    public final void setActiontextvisibity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer actiontextvisibity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getSubheadertext() {
        return null;
    }
    
    public final void setSubheadertext(@org.jetbrains.annotations.Nullable()
    java.lang.String subheadertext) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.Integer getSubheadertextvisibity() {
        return null;
    }
    
    public final void setSubheadertextvisibity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer subheadertextvisibity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.Integer getTimericon() {
        return null;
    }
    
    public final void setTimericon(@org.jetbrains.annotations.Nullable()
    java.lang.Integer timericon) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getTimertext() {
        return null;
    }
    
    public final void setTimertext(@org.jetbrains.annotations.Nullable()
    java.lang.String timertext) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getTimertextmessage() {
        return null;
    }
    
    public final void setTimertextmessage(@org.jetbrains.annotations.Nullable()
    java.lang.String timertextmessage) {
    }
    
    public final void moreAction(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.shopify.shopifyapp.homesection.models.ProductSlider category) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvimageone() {
        return null;
    }
    
    public final void setHvimageone(@org.jetbrains.annotations.Nullable()
    java.lang.String hvimageone) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvnameone() {
        return null;
    }
    
    public final void setHvnameone(@org.jetbrains.annotations.Nullable()
    java.lang.String hvnameone) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvtypeone() {
        return null;
    }
    
    public final void setHvtypeone(@org.jetbrains.annotations.Nullable()
    java.lang.String hvtypeone) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvvalueone() {
        return null;
    }
    
    public final void setHvvalueone(@org.jetbrains.annotations.Nullable()
    java.lang.String hvvalueone) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvimagetwo() {
        return null;
    }
    
    public final void setHvimagetwo(@org.jetbrains.annotations.Nullable()
    java.lang.String hvimagetwo) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvnametwo() {
        return null;
    }
    
    public final void setHvnametwo(@org.jetbrains.annotations.Nullable()
    java.lang.String hvnametwo) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvtypetwo() {
        return null;
    }
    
    public final void setHvtypetwo(@org.jetbrains.annotations.Nullable()
    java.lang.String hvtypetwo) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvvaluetwo() {
        return null;
    }
    
    public final void setHvvaluetwo(@org.jetbrains.annotations.Nullable()
    java.lang.String hvvaluetwo) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvimagethree() {
        return null;
    }
    
    public final void setHvimagethree(@org.jetbrains.annotations.Nullable()
    java.lang.String hvimagethree) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvnamethree() {
        return null;
    }
    
    public final void setHvnamethree(@org.jetbrains.annotations.Nullable()
    java.lang.String hvnamethree) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvtypethree() {
        return null;
    }
    
    public final void setHvtypethree(@org.jetbrains.annotations.Nullable()
    java.lang.String hvtypethree) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getHvvaluethree() {
        return null;
    }
    
    public final void setHvvaluethree(@org.jetbrains.annotations.Nullable()
    java.lang.String hvvaluethree) {
    }
    
    @androidx.databinding.Bindable()
    public final int getTextaligment() {
        return 0;
    }
    
    public final void setTextaligment(int textaligment) {
    }
    
    public final void navigateToPage(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    private final java.lang.String getBase64Encode(java.lang.String id) {
        return null;
    }
    
    public ProductSlider() {
        super();
    }
}