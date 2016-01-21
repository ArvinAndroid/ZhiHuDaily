package com.fei.feilib.util;

import android.util.Base64;
import android.util.Log;

/**
 * Created by Administrator on 2016/1/19 0019.
 */
public class Base64Util {

    public static String encode(String code) {
        //方法一
        // 在这里使用的是encode方式，返回的是byte类型加密数据，可使用new String转为String类型
        String encode = new String(Base64.encode(code.getBytes(), Base64.DEFAULT));
        Log.d("encode:", encode);

        //方法二
        // 这里 encodeToString 则直接将返回String类型的加密数据
        String encodeToString = Base64.encodeToString(code.getBytes(), Base64.DEFAULT);
        Log.d("encodeToString:", encode);
        return encodeToString;
    }

    public static String decode(String code) {
        // 对base64加密后的数据进行解密
        String decode = new String(Base64.decode(code.getBytes(), Base64.DEFAULT));
        Log.d("decode:", decode);
        return decode;
    }
}
