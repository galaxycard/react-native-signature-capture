package com.rssignaturecapture;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

public class RSSignatureCaptureContextModule extends ReactContextBaseJavaModule {

    public RSSignatureCaptureContextModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RSSignatureContextModule";
    }

    public Activity getActivity() {
        return this.getCurrentActivity();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap saveImageAndReturn(int viewId) {
        RSSignatureCaptureMainView view = (RSSignatureCaptureMainView) this.getCurrentActivity().findViewById(viewId);
        if (view != null) {
            return view.saveImageAndReturn();
        }
        return null;
    }
}
