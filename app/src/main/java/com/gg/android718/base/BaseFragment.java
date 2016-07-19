package com.gg.android718.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gg.android718.impl.IBasePresenter;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/7/18.
 */
public abstract class BaseFragment<V, P extends BasePresenter<V>> extends Fragment {
    private View view;
    public P presenter;
    public static final String FRAGMENT_OUT_STATE = "outState";


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = getPresenter();
        presenter.attch((V) this);
        if (savedInstanceState != null) {
            if (savedInstanceState.getBoolean(FRAGMENT_OUT_STATE)) {
                getFragmentManager().beginTransaction().show(this).commit();
            } else {
                getFragmentManager().beginTransaction().hide(this).commit();
            }
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(FRAGMENT_OUT_STATE, isVisible());
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = view == null ? inflater.inflate(getLayoutId(), container,false) : view;
        ButterKnife.bind(getActivity(),view);
        init();
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (view != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (presenter != null) {
            presenter.dettch();
            presenter = null;
        }
    }

    public abstract void init();

    public abstract int getLayoutId();

    public abstract P getPresenter();
}
