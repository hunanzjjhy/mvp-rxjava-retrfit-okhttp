package com.huyong;

import android.app.Application;
import android.content.Context;

/**
 * Application
 * Created by Administrator on 2016/12/14.
 */
public class HuApplication extends Application {
    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }

    /**
     * @return 全局的上下文
     */
    public static Context getAppContext() {
        return appContext;
    }
}
