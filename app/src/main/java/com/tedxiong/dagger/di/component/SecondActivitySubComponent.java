package com.tedxiong.dagger.di.component;

import com.tedxiong.dagger.mvp.view.SecondActivity;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by ted on 2018/5/7.
 * in com.tedxiong.dagger.di.component
 */
@Subcomponent(modules = {
        SecondActivitySubComponent.SubModule.class,
        AndroidInjectionModule.class,
})
public interface SecondActivitySubComponent extends AndroidInjector<SecondActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity> {
    }

    @Module
    class SubModule {

        @Provides
        String provideName() {
            return SecondActivity.class.getName();
        }
    }
}
