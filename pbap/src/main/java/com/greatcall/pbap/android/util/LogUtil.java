package com.greatcall.pbap.android.util;

/**
 * Created by leon on 16/2/1.
 */
public class LogUtil {

    public static final String TAG = "debug_ang";
    public static final boolean DEBUG = true;

    public static void d(String msg) {
        if (DEBUG == false) return;
    }

    public static void d(Object msg) {
        if (DEBUG == false) return;
    }


    public static void i(String msg) {
        if (DEBUG == false) return;
    }

}