package com.huyong.presenter;

import com.huyong.base.BasePresenter;
import com.huyong.activity.GetIpInfoActivity;
import com.huyong.model.modelImpl.IpInfoModelImpl;
import com.huyong.utils.LogUtils;

/**
 * 获取IP信息
 * Created by Administrator on 2016/12/15.
 */
public class IpInfoPresenter extends BasePresenter<IpInfoModelImpl, GetIpInfoActivity> {

    public void getIpInfo(String ip) {
        getModel().getIpInfo(ip, new IpInfoModelImpl.InfoHint() {
            @Override
            public void successInfo(String str) {
                if (getView() != null)
                    getView().getIpInfoSuccess(str);  //成功
            }

            @Override
            public void failInfo(String str) {
                LogUtils.e("IpInfoPresenter.failInfo", str);

                if (getView() != null)
                    getView().getIpInfoFail(str);  //失败
            }
        });
    }

    @Override
    public IpInfoModelImpl loadModel() {
        return new IpInfoModelImpl();
    }
}
