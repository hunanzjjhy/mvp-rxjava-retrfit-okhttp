package com.huyong.view;

import com.huyong.base.BaseView;
import com.huyong.entity.GetCodeBean;

/**
 * 获取IP信息
 * Created by Administrator on 2016/12/16.
 */
public interface GetCodeView extends BaseView{
    void getCodeSuccess(GetCodeBean bean);

    void getCodeFail(String failMsg);
}
