package com.tedxiong.dagger.di.module;

import android.app.Activity;

import com.tedxiong.dagger.di.component.MainActivitySubComponent;
import com.tedxiong.dagger.di.component.SecondActivitySubComponent;
import com.tedxiong.dagger.mvp.view.SecondActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by ted on 2018/5/7.
 * in com.tedxiong.dagger.di.module
 */
@Module(subcomponents = SecondActivitySubComponent.class)
public abstract class SecondActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindSecondActivityInjectorFactory(SecondActivitySubComponent.Builder builder);
}
