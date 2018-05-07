package com.tedxiong.dagger.mvp.model;


import com.tedxiong.dagger.mvp.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger.di.modules
 */
public class MainModel implements MainContract.Model{

    @Inject
    public MainModel() {
    }

    public String returnMessage() {
        return "qingmei2";
    }


}
