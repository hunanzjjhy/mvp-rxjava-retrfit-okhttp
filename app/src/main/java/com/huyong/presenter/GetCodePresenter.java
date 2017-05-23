package com.huyong.presenter;

import com.huyong.activity.LoginActivity;
import com.huyong.base.BasePresenter;
import com.huyong.entity.GetCodeBean;
import com.huyong.model.modelImpl.GetMobileModelImpl;
import com.huyong.utils.LogUtils;

/**
 * Created by lu2017 on 2017/4/5.
 */

public class GetCodePresenter extends BasePresenter<GetMobileModelImpl, LoginActivity> {

    public void getCodeInfo(String mobile) {
        getModel().getCodeInfo(mobile, new GetMobileModelImpl.InfoHint() {
            @Override
            public void successInfo(GetCodeBean bean) {
                LogUtils.e("IpInfoPresenter.successInfo", bean.toString());
                if (getView() != null)
                    getView().getCodeSuccess(bean);  //成功
            }

            @Override
            public void failInfo(String str) {
                LogUtils.e("IpInfoPresenter.failInfo", str);

                if (getView() != null)
                    getView().getCodeFail(str);  //失败
            }
        });
    }

    @Override
    public GetMobileModelImpl loadModel() {
        return new GetMobileModelImpl();
    }
}
