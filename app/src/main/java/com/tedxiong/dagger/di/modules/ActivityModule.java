package com.tedxiong.dagger.di.modules;

import android.app.Activity;


import com.tedxiong.dagger.di.scopes.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * 提供baseactivity的module
 * Created by niuxiaowei on 16/3/20.
 */
@Module
public class ActivityModule {

    private final Activity activity;
    public ActivityModule(Activity activity){
        this.activity = activity;
    }

    @Provides @PerActivity
    public Activity provideActivity(){
        return activity;
    }



}
