// Generated code from Butter Knife. Do not modify!
package com.shopify.shopifyapp.basesection.activities;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.shopify.shopifyapp.R;
import com.shopify.shopifyapp.customviews.MageNativeTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseActivity_ViewBinding implements Unbinder {
  private BaseActivity target;

  @UiThread
  public BaseActivity_ViewBinding(BaseActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BaseActivity_ViewBinding(BaseActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.toolimage = Utils.findRequiredViewAsType(source, R.id.toolimage, "field 'toolimage'", ImageView.class);
    target.tooltext = Utils.findRequiredViewAsType(source, R.id.tooltext, "field 'tooltext'", MageNativeTextView.class);
    target.drawer_layout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawer_layout'", DrawerLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.toolimage = null;
    target.tooltext = null;
    target.drawer_layout = null;
  }
}
