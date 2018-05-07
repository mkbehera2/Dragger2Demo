package com.tedxiong.dagger.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.tedxiong.dagger.R;
import com.tedxiong.dagger.base.BaseActivity;

import javax.inject.Inject;

/**
 * Created by ted on 2018/5/7.
 * in com.tedxiong.dagger.mvp.view
 */
public class SecondActivity  extends BaseActivity {

    @Inject
    String className;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView) findViewById(R.id.tv_content);
        tv.setText(className);
    }
}