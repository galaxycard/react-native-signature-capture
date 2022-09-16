package com.rssignaturecapture;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.List;

public class RSSignatureCapturePackage implements ReactPackage {

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    return Arrays.asList(new RSSignatureCaptureModule(reactContext));
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Arrays.asList(new RSSignatureCaptureViewManager(reactContext));
  }

  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Arrays.asList();
  }
}
