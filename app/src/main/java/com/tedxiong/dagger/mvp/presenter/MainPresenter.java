package com.tedxiong.dagger.mvp.presenter;


import com.tedxiong.dagger.mvp.contract.MainContract;
import com.tedxiong.dagger.mvp.view.MainActivity;
import com.tedxiong.dagger.mvp.model.MainModel;

import javax.inject.Inject;

/**
 * Created by niuxiaowei on 16/3/20.
 */
public class MainPresenter implements MainContract.Presenter {

    private final MainActivity view;
    private final MainModel model;

    @Inject
    public MainPresenter(MainActivity view, MainModel model) {
        this.view = view;
        this.model = model;
    }

    public void requestHttp() {
        view.onGetMessage(model.returnMessage());
    }
}
