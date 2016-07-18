package com.gg.android718.main;


import com.gg.android718.R;
import com.gg.android718.base.BaseActivity;

public class MainActivity extends BaseActivity<MainActivity, MainActivityPresenter>
        implements MainActivityContract.View {
    private MainActivityPresenter mPresenter;
    private MainActivityModel mModel;

    @Override
    public void init() {
        mModel = new MainActivityModel();
        mPresenter = new MainActivityPresenter(this, mModel);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainActivityPresenter getPresenter() {
        return mPresenter;
    }

    @Override
    public void onSucces() {

    }

    @Override
    public void onFail() {

    }
}
