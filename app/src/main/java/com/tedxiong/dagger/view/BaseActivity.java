package com.tedxiong.dagger.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tedxiong.dagger.BaseApp;
import com.tedxiong.dagger.di.components.AppComponent;

/**
 * Created by niuxiaowei on 16/3/20.
 */
@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {

    public AppComponent getAppComponent(){
        return ((BaseApp)getApplication()).getAppComponent();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
