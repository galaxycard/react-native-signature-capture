package com.rssignaturecapture;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

public class RSSignatureCaptureModule extends ReactContextBaseJavaModule {

    public RSSignatureCaptureModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RSSignatureContextModule";
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
