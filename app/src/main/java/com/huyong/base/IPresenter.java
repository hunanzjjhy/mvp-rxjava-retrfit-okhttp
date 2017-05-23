package com.huyong.base;

/**
 * MVP --> BasePresenter --> IPresenter
 * Created by Administrator on 2016/12/15.
 */
public interface IPresenter<V extends BaseView> {
    /**
     * @param view 绑定
     */
    void attachView(V view);

    /**
     * 防止内存的泄漏,清楚presenter与activity之间的绑定
     */
    void detachView();

    /**
     * @return 获取View
     */
    BaseView getView();
}
