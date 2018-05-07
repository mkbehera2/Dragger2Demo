package com.tedxiong.dagger.di;

import com.tedxiong.dagger.base.BaseApplication;
import com.tedxiong.dagger.di.module.MainActivityModule;
import com.tedxiong.dagger.di.module.SecondActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger.di.components
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class, SecondActivityModule.class
})
public interface BaseApplicationComponent {
    void inject(BaseApplication baseApp);
}
