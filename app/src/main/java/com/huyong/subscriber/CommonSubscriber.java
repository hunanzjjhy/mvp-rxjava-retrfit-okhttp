package com.huyong.subscriber;

import android.content.Context;

import com.huyong.base.BaseSubscriber;
import com.huyong.exception.ApiException;
import com.huyong.utils.LogUtils;
import com.huyong.utils.NetworkUtil;

/**
 * CommonSubscriber
 * <p/>
 * Created by Administrator on 2016/12/15.
 */
public abstract class CommonSubscriber<T> extends BaseSubscriber<T> {

    private Context context;

    public CommonSubscriber(Context context) {
        this.context = context;
    }

    private static final String TAG = "CommonSubscriber";

    @Override
    public void onStart() {
        if (!NetworkUtil.isNetworkAvailable(context)) {
            LogUtils.e(TAG, "网络不可用");
        } else {
            LogUtils.e(TAG, "网络可用");
        }
    }

    @Override
    protected void onError(ApiException e) {
        LogUtils.e(TAG, "错误信息为 " + "code:" + e.code + "   message:" + e.message);
    }

    @Override
    public void onCompleted() {
        LogUtils.e(TAG, "成功了");
    }
}
