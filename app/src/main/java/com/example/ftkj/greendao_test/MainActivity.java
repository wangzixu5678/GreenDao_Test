package com.example.ftkj.greendao_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.greenrobot.greendao.query.LazyList;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private GreenDaoManager mGM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGM = GreenDaoManager.getInstance();
        QueryBuilder.LOG_SQL = true;
        QueryBuilder.LOG_VALUES = true;
        findViewById(R.id.btn_add).setOnClickListener(this);
        findViewById(R.id.btn_del).setOnClickListener(this);
        findViewById(R.id.btn_update).setOnClickListener(this);
        findViewById(R.id.btn_query).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add:
                break;
            case R.id.btn_del:
                break;
            case R.id.btn_update:
                break;
            case R.id.btn_query:
                mGM.querySonofFather();
                break;

        }
    }
}
