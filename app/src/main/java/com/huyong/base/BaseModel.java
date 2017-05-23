package com.huyong.base;

import com.huyong.http.Http;
import com.huyong.http.HttpService;

/**
 * MVP --> BaseModel
 * Created by Administrator on 2016/12/15.
 */
public class BaseModel {
    protected static HttpService httpService;

    //初始化httpService
    static {
        httpService = Http.getHttpService();
    }
}
