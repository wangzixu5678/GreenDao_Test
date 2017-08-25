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
            Log.d("AAA", "querySonofFather: "+father.toString());
        }
    }

    public void insertAllData(){
        mFatherDao.insert(new Father(1L,"望京",44,"全羊","meiguo","xinjiapo","malai"));
        mFatherDao.insert(new Father(2L,"梨花",45,"全羊","meiguo","xinjiapo","malai"));
        mSonDao.insert(new Son(1L,"自诩",22,"全羊",1));
        mSonDao.insert(new Son(2L,"思雨",22,"全羊",1L));
        mSonDao.insert(new Son(3L,"低音",22,"全羊",2L));
    }

    public void updataAll(){
        LazyList<Father> fathers = mFatherDao.queryBuilder().listLazy();
        for (Father father : fathers) {
            if (stringIsEmpty(father.getNew2address())){
                father.setNew2address("xinjiapo");
                mFatherDao.update(father);
            }
            if (stringIsEmpty(father.getNew3address())){
                father.setNew3address("malai");
                mFatherDao.update(father);
            }
        }
    }

    public boolean stringIsEmpty(String string){
        return "".equals(string)||string==null;
    }
}
