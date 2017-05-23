package com.huyong.model.modelImpl;

import android.support.annotation.NonNull;

import com.huyong.HuApplication;
import com.huyong.base.BaseModel;
import com.huyong.entity.GetCodeBean;
import com.huyong.exception.ApiException;
import com.huyong.subscriber.CommonSubscriber;
import com.huyong.transformer.CommonTransformer;

/**
 * Created by huyong on 2017/4/5.
 */

public class GetMobileModelImpl extends BaseModel {


    public void getCodeInfo(@NonNull String mobile, @NonNull final GetMobileModelImpl.InfoHint infoHint) {
        httpService.getMobileCode(mobile)
                .compose(new CommonTransformer<GetCodeBean>())
                .subscribe(new CommonSubscriber<GetCodeBean>(HuApplication.getAppContext()) {
                    @Override
                    public void onNext(GetCodeBean bean) {
                        infoHint.successInfo(bean);
                    }

                    @Override
                    protected void onError(ApiException e) {
                        super.onError(e);
                        infoHint.failInfo(e.message);
                    }
                });
    }


    //通过接口产生信息回调
    public interface InfoHint {
        void successInfo(GetCodeBean bean);

        void failInfo(String str);
    }
}
