package com.example.ftkj.greendao_test;

import android.util.Log;

import org.greenrobot.greendao.query.LazyList;

import java.util.List;

/**
 * Created by FTKJ on 2017/8/21.
 */

public class GreenDaoManager {
    private static final String TAG = "AAA";
    private SonDao mSonDao;
    private FatherDao mFatherDao;
    private static GreenDaoManager sGreenDaoManager = new GreenDaoManager();
    private GreenDaoManager(){
        mSonDao = GreenDaoHelper.getDaoSession().getSonDao();
        mFatherDao = GreenDaoHelper.getDaoSession().getFatherDao();
    }

    public static GreenDaoManager getInstance(){
        return sGreenDaoManager;
    }

    /**
     * 一对多
     */
    public void querySonofFather(){
        LazyList<Father> fathers = mFatherDao.queryBuilder().listLazy();
        for (Father father : fathers) {
            String name = father.getName();
            List<Son> sons = father.getSons();
            for (Son son : sons) {
                Log.d(TAG, "Son{" +
                        "id=" + son.getId() +
                        ", name='" + son.getName() + '\'' +
                        ", age=" + son.getAge() +
                        ", address='" + son.getAddress() + '\'' +
                        ", fatherName=" + name +
                        '}');
            }
        }
    }
}
