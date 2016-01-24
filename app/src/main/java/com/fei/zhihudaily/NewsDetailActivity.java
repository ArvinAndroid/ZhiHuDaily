package com.fei.zhihudaily;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Xml;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.fei.feilib.util.OkHttpUtil;
import com.fei.zhihudaily.entity.NewsDetailEntity;
import com.fei.zhihudaily.network.ServerSetting;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.spec.EncodedKeySpec;

import okhttp3.Call;

public class NewsDetailActivity extends AppCompatActivity {

    private ImageView iv_news_image;
    private WebView wv_news_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        Intent intent = getIntent();
        int newsId = intent.getIntExtra("newsId", 0);

        if (newsId == 0)
            return;

        iv_news_image = (ImageView) findViewById(R.id.iv_news_image);
        wv_news_content = (WebView) findViewById(R.id.wv_news_content);
        wv_news_content.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);//内容重新排版
//        wv_news_content.getSettings().setLoadWithOverviewMode(true);
        wv_news_content.getSettings().setUseWideViewPort(true);

        loadNewsData(ServerSetting.NEWS_DETAIL + newsId);
    }

    private void loadNewsData(String url) {
        OkHttpUtil.getInstance().runEnqueue(this, url, new OkHttpUtil.ResultCallBack() {

            @Override
            public void onFail(Call call, IOException e) {

            }

            @Override
            public void onSuccess(Call call, String result) {
                Gson gson = new Gson();
                NewsDetailEntity newsDetailEntity = gson.fromJson(result, NewsDetailEntity.class);
                String image = newsDetailEntity.getImage();
                Glide.with(NewsDetailActivity.this).load(image).into(iv_news_image);
                String body = newsDetailEntity.getBody();
                wv_news_content.loadData(body, "text/html;charset=UTF-8", null);
            }
        });
    }
}
