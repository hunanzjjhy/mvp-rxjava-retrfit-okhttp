package com.huyong.http;

import com.huyong.entity.GetCodeBean;
import com.huyong.entity.IpInfoBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 网络请求的接口
 * Created by Administrator on 2016/11/9.
 */
public interface HttpService {

//    @FormUrlEncoded
//    @POST("getIpInfo.php")
//    Observable<BaseHttpResult<IpInfoBean>> getIpInfo(@Field("ip") String ip);

    @GET("getIpInfo.php")
    Observable<IpInfoBean> getIpInfo(@Query("ip") String ip);

    @GET("GetMobileCode.ashx")
    Observable<GetCodeBean> getMobileCode(@Query("mobile") String mobile);
}
