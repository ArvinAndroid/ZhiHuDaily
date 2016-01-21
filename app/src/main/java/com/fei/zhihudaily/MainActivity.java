package com.fei.zhihudaily;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.fei.feilib.util.OkHttpUtil;
import com.fei.zhihudaily.adapter.RecyclerViewAdapter;
import com.fei.zhihudaily.entity.NewsLatestEntity;
import com.fei.zhihudaily.entity.StoriesEntity;
import com.fei.zhihudaily.network.ServerSetting;
import com.google.gson.Gson;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout srl_refresh_news;
    private RecyclerView rv_news_list;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerViewAdapter adapter;

    private List<StoriesEntity> stories;
    private Map<Integer, StoriesEntity> storiesData;

    private Calendar calendar;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srl_refresh_news = (SwipeRefreshLayout) findViewById(R.id.srl_refresh_news);
        rv_news_list = (RecyclerView) findViewById(R.id.rv_news_list);
//        rv_news_list.setHasFixedSize(true);

        srl_refresh_news.setOnRefreshListener(new RefreshListener());
        srl_refresh_news.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary, R.color.colorPrimaryDark);

        linearLayoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        rv_news_list.setLayoutManager(linearLayoutManager);
        rv_news_list.addOnScrollListener(new ScrollListener());

        initUtil();
        loadData(ServerSetting.NEWS_LATEST);
    }

    private void initUtil() {
        calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DATE);
    }

    class RefreshListener implements SwipeRefreshLayout.OnRefreshListener {

        @Override
        public void onRefresh() {
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    loadData(ServerSetting.NEWS_LATEST);
                    srl_refresh_news.setRefreshing(false);
                }
            }, 3000);
        }
    }

    class ScrollListener extends RecyclerView.OnScrollListener {
        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == stories.size() - 1) {
                Toast.makeText(MainActivity.this, "滑动到底部", Toast.LENGTH_SHORT).show();
                loadData(ServerSetting.NEWS_BEFORE + getDayBefore());
            }
        }
    }

    private void loadData(String url) {
        OkHttpUtil.getInstance().runEnqueue(this, url, new OkHttpUtil.ResultCallBack() {
            @Override
            public void onFail(Call call, IOException e) {

            }

            @Override
            public void onSuccess(Call call, String result) {
                Gson gson = new Gson();
                NewsLatestEntity newsLatestEntity = gson.fromJson(result, NewsLatestEntity.class);
                newsLatestEntity.getDate();

                newsLatestEntity.getTop_stories();

                if (adapter == null) {
                    stories = newsLatestEntity.getStories();
                    adapter = new RecyclerViewAdapter(MainActivity.this, stories);
                    rv_news_list.setAdapter(adapter);
                } else {
                    adapter.add(newsLatestEntity.getStories(), stories.size());
                }
            }
        });
    }

    public String getDayBefore() {
//        Calendar calendar = Calendar.getInstance();
//        int day = calendar.get(Calendar.DATE);
        calendar.set(Calendar.DATE, --day);

        String dayBefore = new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
        return dayBefore;
    }
}
