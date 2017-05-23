package com.huyong.utils;

import android.widget.Toast;

import com.huyong.HuApplication;

/**
 * Toast 相关工具类
 */
public class ToastUtil {
    public static Toast toast;

    public static void setToast(String str) {
        if (toast == null) {
            toast = Toast.makeText(HuApplication.getAppContext(), str, Toast.LENGTH_SHORT);
        } else {
            toast.setText(str);
        }
        toast.show();
    }

    public static void setToast(int contentId) {
        if (toast == null) {
            toast = Toast.makeText(HuApplication.getAppContext(), contentId, Toast.LENGTH_SHORT);
        } else {
            toast.setText(contentId);
        }
        toast.show();
    }
}
