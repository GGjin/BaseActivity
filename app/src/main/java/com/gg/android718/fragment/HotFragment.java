package com.gg.android718.fragment;

import android.os.Bundle;

import com.gg.android718.base.BaseFragment;

/**
 * Created by Administrator on 2016/7/18.
 */
public class HotFragment extends BaseFragment<HotFragment, HotFragmentPresenter>
        implements HotFragmentContract.View {
    private HotFragmentModel mModel;
    private HotFragmentPresenter mPresenter;

    public static HotFragment newInstance() {
        
        Bundle args = new Bundle();
        
        HotFragment fragment = new HotFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void init() {
        mModel = new HotFragmentModel();
        mPresenter = new HotFragmentPresenter(this, mModel);
    }

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public HotFragmentPresenter getPresenter() {
        return mPresenter;
    }


    @Override
    public void onSucces() {

    }

    @Override
    public void onFail() {

    }
}
