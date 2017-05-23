package com.huyong.base;

import com.huyong.exception.ApiException;

import rx.Subscriber;

/**
 * BaseSubscriber
 * Created by Administrator on 2016/12/14.
 */
public abstract class BaseSubscriber<T> extends Subscriber<T> {

    @Override
    public void onError(Throwable e) {
        ApiException apiException = (ApiException) e;
        onError(apiException);
    }


    /**
     * @param e 错误的一个回调
     */
    protected abstract void onError(ApiException e);

}
