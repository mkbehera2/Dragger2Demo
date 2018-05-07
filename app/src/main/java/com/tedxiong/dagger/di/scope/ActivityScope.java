package com.tedxiong.dagger.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ted on 2018/5/7.
 * in com.tedxiong.dagger.di.scope
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}
