package com.fei.zhihudaily.entity;

/**
 * Created by Fei on 2016/1/20.
 */
public class NewsHotEntity {
    /**
     * news_id : 3748552
     * url : http://daily.zhihu.com/api/2/news/3748552
     * thumbnail : http://p3.zhimg.com/67/6a/676a8337efec71a100eea6130482091b.jpg
     * title : 长得漂亮能力出众性格单纯的姑娘为什么会没有男朋友？
     */

    private int newsId;//news_id
    private String url;
    private String thumbnail;
    private String title;

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNewsId() {
        return newsId;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }
}
