package com.tedxiong.dagger.di.modules;

import com.tedxiong.dagger.data.TedPerson;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger.di.modules
 */
@Module
public class TedModule {

    @Provides
    TedPerson provideTedPerson() {
        return new TedPerson();
    }
}
