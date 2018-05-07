package com.tedxiong.dagger;

import com.tedxiong.dagger.di.component.BaseActivityComponent;
import com.tedxiong.dagger.di.module.MainActivityModule;
import com.tedxiong.dagger.di.module.SecondActivityModule;
import com.tedxiong.dagger.di.scope.ActivityScope;
import com.tedxiong.dagger.mvp.view.MainActivity;
import com.tedxiong.dagger.mvp.view.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by ted on 2018/5/7.
 * in com.tedxiong.dagger
 */
@Module(subcomponents = {
        BaseActivityComponent.class
})
public abstract class AllActivitysModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivitytInjector();

    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivityInjector();

}
