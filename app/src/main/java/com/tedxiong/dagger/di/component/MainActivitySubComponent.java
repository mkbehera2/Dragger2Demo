package com.tedxiong.dagger.di.component;

import android.content.Context;
import android.content.SharedPreferences;

import com.tedxiong.dagger.bean.Student;
import com.tedxiong.dagger.mvp.view.MainActivity;
import com.tedxiong.dagger.mvp.model.MainModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by ted on 2018/5/7.
 * in com.tedxiong.dagger.di.components
 */
@Singleton
@Subcomponent(modules = {
        AndroidInjectionModule.class,
        MainActivitySubComponent.SubModule.class
})
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

    @Module
    class SubModule {

        @Provides
        String provideName() {

            return MainActivity.class.getName();
        }

        @Provides
        Student provideStudent() {
            return new Student();
        }

        @Singleton
        @Provides
        SharedPreferences provideSp(MainActivity activity) {
            return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
        }

        @Provides
        MainModel provideModule() {
            return new MainModel();
        }
    }
}
