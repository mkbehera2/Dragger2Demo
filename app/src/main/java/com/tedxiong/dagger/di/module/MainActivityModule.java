package com.tedxiong.dagger.di.module;

import android.app.Activity;

import com.tedxiong.dagger.mvp.view.MainActivity;
import com.tedxiong.dagger.di.component.MainActivitySubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by ted on 2018/5/7.
 * in com.tedxiong.dagger.di.modules
 */
@Module(subcomponents = MainActivitySubComponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActivitySubComponent.Builder builder);
}
