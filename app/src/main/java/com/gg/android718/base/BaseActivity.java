package com.gg.android718.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/7/18.
 */
public abstract class BaseActivity extends
        AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setContentView(getLayoutId());
            ButterKnife.bind(this);//通过ButterKnife初始化控件的对象
            init();//初始化数据
        }
    }

    public abstract void init();

    public abstract int getLayoutId();




}
