package com.tedxiong.dagger.di.components;

import android.app.Activity;

import com.tedxiong.dagger.di.modules.ActivityModule;
import com.tedxiong.dagger.di.scopes.PerActivity;

import dagger.Component;

/**
 *
 * Created by niuxiaowei on 16/3/20.
 */
@PerActivity
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    Activity getActivity();
}
