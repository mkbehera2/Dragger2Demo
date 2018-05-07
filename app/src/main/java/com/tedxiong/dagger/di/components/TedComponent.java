package com.tedxiong.dagger.di.components;

import com.tedxiong.dagger.TedActivity;
import com.tedxiong.dagger.di.modules.TedModule;

import dagger.Component;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger.di.components
 */
@Component(modules = TedModule.class)
public interface TedComponent {
    void inject(TedActivity activity);
}
