package com.github.captain_miao.databinding.tutorial.app;

import android.app.Application;
import android.content.Context;
import android.databinding.DataBindingUtil;

import com.github.captain_miao.databinding.tutorial.helper.MyDataBindingComponent;

/**
 * @author YanLu
 * @since 16/9/19
 */
public class TutorialApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        DataBindingUtil.setDefaultComponent(new MyDataBindingComponent());
    }

    @Override
    public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.registerActivityLifecycleCallbacks(callback);
    }

    @Override
    public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.unregisterActivityLifecycleCallbacks(callback);
    }
}
