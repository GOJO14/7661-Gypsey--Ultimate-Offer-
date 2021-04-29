// Generated code from Butter Knife. Do not modify!
package com.shopify.shopifyapp.basesection.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.customviews.MageNativeTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewBaseActivity_ViewBinding implements Unbinder {
  private NewBaseActivity target;

  @UiThread
  public NewBaseActivity_ViewBinding(NewBaseActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewBaseActivity_ViewBinding(NewBaseActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.fab = Utils.findRequiredViewAsType(source, R.id.fab, "field 'fab'", FloatingActionButton.class);
    target.toolimage = Utils.findRequiredViewAsType(source, R.id.toolimage, "field 'toolimage'", ImageView.class);
    target.tooltext = Utils.findRequiredViewAsType(source, R.id.tooltext, "field 'tooltext'", MageNativeTextView.class);
    target.searchsection = Utils.findRequiredViewAsType(source, R.id.searchsection, "field 'searchsection'", RelativeLayout.class);
    target.drawer_layout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawer_layout'", DrawerLayout.class);
    target.search = Utils.findRequiredViewAsType(source, R.id.search, "field 'search'", MageNativeTextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewBaseActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.fab = null;
    target.toolimage = null;
    target.tooltext = null;
    target.searchsection = null;
    target.drawer_layout = null;
    target.search = null;
  }
}
