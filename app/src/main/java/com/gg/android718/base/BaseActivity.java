package com.gg.android718.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/7/18.
 */
public abstract class BaseActivity<V, P extends BasePresenter<V>> extends
        AppCompatActivity {
    public P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);//通过ButterKnife初始化控件的对象
        presenter = getPresenter();//获取presenter对象
        presenter.attch((V) this);//将presenter与view 绑定上
        init();//初始化数据
    }

    public abstract void init();

    public abstract int getLayoutId();

    public abstract P getPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.dettch();//取消presenter与view 的绑定
            presenter = null;
        }
    }
}
