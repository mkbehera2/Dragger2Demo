package com.tedxiong.dagger.di.components;

import android.content.Context;

import com.tedxiong.dagger.Navigator;
import com.tedxiong.dagger.ToastUtil;
import com.tedxiong.dagger.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger.di.components
 */
@Singleton
@Component(modules={AppModule.class})
public interface AppComponent {
    Context getXontext();
    Navigator getNavigator();
    ToastUtil getToast();
}
