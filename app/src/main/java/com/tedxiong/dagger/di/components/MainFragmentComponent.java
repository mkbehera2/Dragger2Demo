package com.tedxiong.dagger.di.components;

import com.tedxiong.dagger.view.MainFragment;

import dagger.Subcomponent;

/**
 * Created by niuxiaowei on 16/3/20.
 */
@Subcomponent
public interface MainFragmentComponent {
    void inject(MainFragment mainFragment);
}
