package com.gg.android718.main;


import android.widget.TextView;

import com.gg.android718.R;
import com.gg.android718.base.MVPBaseActivity;

import butterknife.BindView;

public class MainActivity extends MVPBaseActivity<MainActivity, MainActivityPresenter>
        implements MainActivityContract.View {
    @BindView(R.id.text)
    TextView text;
    private MainActivityPresenter mPresenter;
    private MainActivityModel mModel;

    @Override
    public void init() {
        mModel = new MainActivityModel();
        mPresenter = new MainActivityPresenter(this, mModel);
        text.setText("呵呵");
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void onSucces() {

    }

    @Override
    public void onFail() {

    }


    @Override
    public MainActivityPresenter getPresenter() {
        return mPresenter;
    }
}
