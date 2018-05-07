package com.tedxiong.dagger.presenter;


import com.tedxiong.dagger.data.GetUserData;
import com.tedxiong.dagger.data.UserData;

import javax.inject.Inject;

/**
 * Created by niuxiaowei on 16/3/20.
 */
public class MainPresenter {

    private GetUserData mUserData;
    private IUserView mUserView;



    @Inject
    public MainPresenter(GetUserData userData){
        this.mUserData = userData;
    }

    public void getUser(){
        UserData userData = this.mUserData.getUser();
        this.mUserView.setUserName(userData.mUserName);
    }
    public void setUserView(IUserView userView){
        this.mUserView = userView;
    }

    public interface IUserView{
        void setUserName(String name);
    }
}
