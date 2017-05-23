package com.huyong.model;

import com.huyong.entity.IpInfoBean;

/**
 * 获取IP信息
 * （个人喜好，一般我会在model接口中定义数据库操作接口，当然最好放上网络操作和逻辑操作）
 * Created by Administrator on 2016/12/15.
 */
public interface IpInfoModel {
    void insertDB(IpInfoBean ipInfoBean);
}
