package com.tedxiong.dagger.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ted on 2018/5/4.
 * in com.tedxiong.dagger
 */
public class ToastUtil {
    private Context mContext;

    public ToastUtil(Context context){
        this.mContext = context;
    }

    public void showToast(String message){
        Toast.makeText(mContext,message,Toast.LENGTH_LONG).show();
    }
}
