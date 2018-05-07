package com.tedxiong.dagger.di.modules;

import android.content.Context;

import com.tedxiong.dagger.Navigator;
import com.tedxiong.dagger.ToastUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger.di.modules
 */
@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public Navigator provideNavigator() {
        return new Navigator();
    }

    @Provides
    @Singleton
    public ToastUtil provideToastUtil() {
        return new ToastUtil(context);
    }
}
