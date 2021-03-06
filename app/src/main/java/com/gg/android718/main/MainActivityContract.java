package com.gg.android718.main;

import com.gg.android718.impl.IBaseModel;
import com.gg.android718.impl.IBasePresenter;
import com.gg.android718.impl.IBaseView;

/**
 * Created by Administrator on 2016/7/18.
 */
public class MainActivityContract {
    interface View extends IBaseView {
        void onSucces();

        void onFail();
    }

    interface Model extends IBaseModel {
        void getResult();
    }

    interface Presenter extends IBasePresenter {
        void init();
    }
}
