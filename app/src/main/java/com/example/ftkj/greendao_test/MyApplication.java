package com.example.ftkj.greendao_test;

import android.app.Application;
import android.content.Context;

/**
 * Created by FTKJ on 2017/8/21.
 */

public class MyApplication extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        GreenDaoHelper.initDatabase();

    }


}
