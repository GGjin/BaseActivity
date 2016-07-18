package com.gg.android718.base;

/**
 * Created by Administrator on 2016/7/18.
 */
public class BasePresenter<V> {
    private V view;

    public void attch(V view) {
        this.view = view;
    }

    //不需要的时候 将presenter销毁  这样就会防止内存泄漏
    public void dettch() {
        if (view != null) {
            view = null;
        }
    }

}
