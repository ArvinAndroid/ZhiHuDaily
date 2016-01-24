package com.fei.zhihudaily;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.fei.feilib.util.CalendarUtil;
import com.fei.feilib.util.OkHttpUtil;
import com.fei.zhihudaily.adapter.RecyclerViewAdapter;
import com.fei.zhihudaily.entity.NewsDetailEntity;
import com.fei.zhihudaily.entity.NewsLatestEntity;
import com.fei.zhihudaily.entity.StoriesEntity;
import com.fei.zhihudaily.network.ServerSetting;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout srl_refresh_news;
    private RecyclerView rv_news_list;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerViewAdapter adapter;

    CalendarUtil calendarUtil;
    private List<StoriesEntity> stories;
//    private Map<Integer, StoriesEntity> storiesData;

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

        calendarUtil = new CalendarUtil();
        loadData(ServerSetting.NEWS_LATEST);

    }


    class RefreshListener implements SwipeRefreshLayout.OnRefreshListener {

        @Override
        public void onRefresh() {
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    if (stories != null && stories.size() > 0) {
                        stories.removeAll(stories);
//                        adapter.removeAll(stories);
                        calendarUtil.initDay();
                    }
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
                loadData(ServerSetting.NEWS_BEFORE + calendarUtil.getDayBefore());
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
                if (stories != null && stories.size() > 0)
                    calendarUtil.day--;
                Gson gson = new Gson();
                NewsLatestEntity newsLatestEntity = gson.fromJson(result, NewsLatestEntity.class);
//                newsLatestEntity.getDate();
//                newsLatestEntity.getTopStories();

                if (adapter == null) {
                    stories = newsLatestEntity.getStories();
                    adapter = new RecyclerViewAdapter(MainActivity.this, newsLatestEntity.getDate(), stories);
                    rv_news_list.setAdapter(adapter);

                } else {
                    adapter.add(newsLatestEntity.getStories(), stories.size());
                }
                adapter.setOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, Object object, int position) {
                        Intent intent = new Intent(MainActivity.this, NewsDetailActivity.class);
                        intent.putExtra("newsId", ((StoriesEntity) object).getId());
                        startActivity(intent);
                    }
                });
            }
        });
    }

}
