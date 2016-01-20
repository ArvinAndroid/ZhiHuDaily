package com.fei.zhihudaily.entity;

import java.util.List;

/**
 * Created by Fei on 2016/1/20.
 */
public class NewsBeforeEntity {
    /**
     * date : 20131118
     * stories : [{"title":"深夜食堂 · 我的张曼妮","ga_prefix":"111822","images":["http://p4.zhimg.com/7b/c8/7bc8ef5947b069513c51e4b9521b5c82.jpg"],"type":0,"id":1747159},"..."]
     */

    /**
     * 2013 年 5 月 19 日，若 before 后数字小于 20130520 ，只会接收到空消息
     */
    private String date;
    /**
     * title : 深夜食堂 · 我的张曼妮
     * ga_prefix : 111822
     * images : ["http://p4.zhimg.com/7b/c8/7bc8ef5947b069513c51e4b9521b5c82.jpg"]
     * type : 0
     * id : 1747159
     */

    private List<StoriesEntity> stories;

    public void setDate(String date) {
        this.date = date;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public String getDate() {
        return date;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

}
