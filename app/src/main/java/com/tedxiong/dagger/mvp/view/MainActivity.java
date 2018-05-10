package com.tedxiong.dagger.mvp.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tedxiong.dagger.base.BaseActivity;
import com.tedxiong.dagger.R;
import com.tedxiong.dagger.bean.Student;
import com.tedxiong.dagger.mvp.contract.MainContract;
import com.tedxiong.dagger.mvp.presenter.MainPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger
 */
public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    String className;
    @Inject
    SharedPreferences sp;
    @Inject
    MainPresenter presenter;
    @Inject
    Student s1;
    @Inject
    Student s2;

    @BindView(R.id.tv_content)
    TextView tvContent;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvContent.setText(className + "\n" +
                s2.toString() + "\n" +
                s1.toString());

    }

    public void gotoSecond(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void requestHttp(View view) {
        presenter.requestHttp();
    }

    public void onGetMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}