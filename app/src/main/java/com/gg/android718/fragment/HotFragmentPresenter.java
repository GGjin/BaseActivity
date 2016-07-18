package com.gg.android718.fragment;

import com.gg.android718.base.BasePresenter;

/**
 * Created by Administrator on 2016/7/18.
 */
public class HotFragmentPresenter extends BasePresenter<HotFragment> implements
        HotFragmentContract.Presenter {
    private HotFragment view;
    private HotFragmentModel model;

    public HotFragmentPresenter(HotFragment view, HotFragmentModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void init() {

    }
}
