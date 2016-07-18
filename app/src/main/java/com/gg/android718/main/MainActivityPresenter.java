package com.gg.android718.main;

import com.gg.android718.base.BasePresenter;

/**
 * Created by Administrator on 2016/7/18.
 */
public class MainActivityPresenter extends BasePresenter<MainActivity> implements
        MainActivityContract.Presenter {
    private MainActivity view;
    private MainActivityModel model;

    public MainActivityPresenter(MainActivity view, MainActivityModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void init() {

    }
}
