package com.tedxiong.dagger;

import android.app.Application;

import com.tedxiong.dagger.di.components.AppComponent;
import com.tedxiong.dagger.di.components.DaggerAppComponent;
import com.tedxiong.dagger.di.modules.AppModule;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger
 */
public class BaseApp extends Application {
    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
