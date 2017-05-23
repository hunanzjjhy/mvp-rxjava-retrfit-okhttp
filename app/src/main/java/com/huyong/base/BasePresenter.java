package com.huyong.base;

import java.lang.ref.WeakReference;

/**
 * MVP --> BasePresenter
 * Created by Administrator on 2016/12/15.
 */
public abstract class BasePresenter<M extends BaseModel, V extends BaseView> implements IPresenter {
    private WeakReference actReference;
    protected V iView;
    protected M iModel;

    public M getModel() {
        iModel = loadModel(); //使用前先进行初始化
        return iModel;
    }

    @Override
    public void attachView(BaseView iView) {
        actReference = new WeakReference(iView);
    }

    @Override
    public void detachView() {
        if (actReference != null) {
            actReference.clear();
            actReference = null;
        }
    }

    @Override
    public V getView() {
        return (V) actReference.get();
    }

    public abstract M loadModel();
}
