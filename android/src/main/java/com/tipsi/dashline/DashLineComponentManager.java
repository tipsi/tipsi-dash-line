package com.tipsi.dashline;

import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class DashLineComponentManager extends SimpleViewManager<DashLineComponent> {

  public static final String REACT_CLASS = "DashLineComponent";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public DashLineComponent createViewInstance(ThemedReactContext context)
  {
    return new DashLineComponent(context);
  }

  @ReactProp(name = "dashColor")
  public void setDashColor(DashLineComponent view, String newValue) {
    view.setDashColor(newValue);
  }

  @ReactProp(name = "dashLineWidth")
  public void setDashLineWidth(DashLineComponent view, float newValue) {
    view.setDashLineWidth(newValue);
  }

  @ReactProp(name = "dashLineSpace")
  public void setDashLineSpace(DashLineComponent view, float newValue) {
    view.setDashLineSpace(newValue);
  }

}
