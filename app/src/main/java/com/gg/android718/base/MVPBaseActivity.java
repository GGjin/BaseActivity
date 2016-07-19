package com.gg.android718.base;

import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by Administrator on 2016/7/19.
 */
public abstract class MVPBaseActivity<V, P extends BasePresenter<V>> extends
        BaseActivity {
    public P presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = getPresenter();//获取presenter对象
        presenter.attch((V) this);//将presenter与view 绑定上

     }

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
