package com.fei.feilib.util;

import android.os.Looper;

/**
 * Created by Administrator on 2016/1/19 0019.
 */
public class ThreadUtil {

    public static boolean isMainThreadByLooper() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isMainThreadByThread() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
