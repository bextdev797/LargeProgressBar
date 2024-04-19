package com.brandonang.largeprogressbar;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.R.attr;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuff;

public class LargeProgressBar extends AndroidNonvisibleComponent {
  private Context context;
  private ProgressBar progressBar;
  private FrameLayout frameLayout;
  private View view;

  public LargeProgressBar(ComponentContainer container) {
    super(container.$form());
    this.context = container.$context();
  }

  @SimpleFunction(description = "Create a large progress bar")
  public void CreateLargeProgressBar(AndroidViewComponent layout, int id) {
    view = layout.getView();
    progressBar = new ProgressBar(this.context, null, android.R.attr.progressBarStyleLarge);
    progressBar.setId(id);
    frameLayout = (FrameLayout) view;
    frameLayout.addView(progressBar);
  }

  @SimpleFunction
  public void SetColor(int color, int id){
    progressBar = view.findViewById(id);
    progressBar.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);
  }
}
