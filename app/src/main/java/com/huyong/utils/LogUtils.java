package com.huyong.utils;

import android.util.Log;


/**
 * LogUtils
 * Created by gaosheng on 2016/7/29.
 */

public class LogUtils {

    public static final boolean isDebug = true;// 打包发布时修改为false

    /**
     * 打印一个debug等级的 log
     */
    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d("jiemo_" + tag, msg);
        }
    }

    /**
     * 打印一个debug等级的 log
     */
    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e("jiemo_" + tag, msg);
        }
    }

    /**
     * 打印一个debug等级的 log
     */
    public static void e(Class cls, String msg) {
        if (isDebug) {
            Log.e("jiemo_" + cls.getSimpleName(), msg);
        }
    }


}
