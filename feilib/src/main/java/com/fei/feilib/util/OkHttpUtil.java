package com.fei.feilib.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/1/19 0019.
 */
public class OkHttpUtil {

    private static OkHttpUtil instance;
    private final OkHttpClient okHttpClient;
    private Handler handler;
    public static final MediaType MEDIA_TYPE = MediaType.parse("text/x-markdown; charset=utf-8");

    public OkHttpUtil() {
        okHttpClient = new OkHttpClient();
        handler = new Handler(Looper.getMainLooper());
    }

//    class A extends AsyncTask {
//
//        @Override
//        protected Object doInBackground(Object[] params) {
//            return null;
//        }
//    }

    public static OkHttpUtil getInstance() {
        synchronized (OkHttpUtil.class) {
            if (instance == null) {
                instance = new OkHttpUtil();
            }
            return instance;
        }
    }

    public String runExecute(Context context, String requestUrl) {
        Request request = new Request.Builder().url(requestUrl).build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful())
                return response.body().toString();
            else
                throw new IOException("Unexpected code " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void runEnqueue(Context context, String requestUrl, ResultCallBack callBack) {
        Request request = new Request.Builder().url(requestUrl).build();
        deliveryResult(request, callBack);
    }

    public void runPost(Context context, String postUrl, String postBody, ResultCallBack callBack) {
        Request request = new Request.Builder().tag(context).url(postUrl).post(RequestBody.create(MEDIA_TYPE, postBody)).build();
        deliveryResult(request, callBack);
    }

    private void deliveryResult(Request request, final ResultCallBack callBack) {
        okHttpClient.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(final Call call, final IOException e) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Log.e("xxx", "onFail:\n" + e.toString());
                        callBack.onFail(call, e);
                    }
                });
            }

            @Override
            public void onResponse(final Call call, final Response response) throws IOException {
                final String body = response.body().string();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Log.e("xxx", "onSuccess:\n" + body);
                        callBack.onSuccess(call, body);
                    }
                });
            }
        });
    }

    public void cancelCall(Object tag) {
        List<Call> queuedCalls = okHttpClient.dispatcher().queuedCalls();
        for (Call call : queuedCalls) {
            if (tag.equals(call.request().tag()))
                Log.e("xxx", "cancel");
        }
    }

    public interface ResultCallBack {
        void onFail(Call call, IOException e);

        void onSuccess(Call call, String result);
    }

}
