package com.sysu.pro.fade.utils;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by road on 2017/7/18.
 */
public class MyLeanCloudApp extends Application {
    @Override
    public void onCreate() {
        AVOSCloud.initialize(this,Const.APP_ID,Const.APP_ID);
        super.onCreate();
    }
}
