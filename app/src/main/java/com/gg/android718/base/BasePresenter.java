package com.gg.android718.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2016/7/18.
 */
public class BasePresenter<V> {
    private Reference<V> reference;

    public void attch(V view) {
        reference = new WeakReference<>(view);
    }

    public V getV() {
        return reference.get();
    }

    public boolean isAdd() {
        return reference != null && reference.get() != null;
    }

    //不需要的时候 将presenter销毁  这样就会防止内存泄漏
    public void dettch() {
        if (reference != null) {
            reference.clear();
            reference = null;
        }
    }

}
