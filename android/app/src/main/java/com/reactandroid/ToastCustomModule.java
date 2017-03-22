package com.reactandroid;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by LiuXiaocong on 3/21/2017 5:58 PM.
 */

public class ToastCustomModule extends ReactContextBaseJavaModule {

    private static final String DURATION_SHORT = "SHORT";
    private static final String DURATION_LONG = "LONG";

    public ToastCustomModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ToastCustomAndroid";
    }

    @ReactMethod
    public void show(String message) {
        Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
