package com.fei.zhihudaily.entity;

import java.util.List;

/**
 * Created by Fei on 2016/1/20.
 */
public class NewsLatestEntity {
    /**
     * date : 20140523
     * stories : [{"title":"中国古代家具发展到今天有两个高峰，一个两宋一个明末（多图）","ga_prefix":"052321","images":["http://p1.zhimg.com/45/b9/45b9f057fc1957ed2c946814342c0f02.jpg"],"type":0,"id":3930445},"..."]
     * top_stories : [{"title":"商场和很多人家里，竹制家具越来越多（多图）","image":"http://p2.zhimg.com/9a/15/9a1570bb9e5fa53ae9fb9269a56ee019.jpg","ga_prefix":"052315","type":0,"id":3930883},"..."]
     */

    private String date;
    /**
     * title : 中国古代家具发展到今天有两个高峰，一个两宋一个明末（多图）
     * ga_prefix : 052321
     * images : ["http://p1.zhimg.com/45/b9/45b9f057fc1957ed2c946814342c0f02.jpg"]
     * type : 0
     * id : 3930445
     */

    private List<StoriesEntity> stories;
    /**
     * title : 商场和很多人家里，竹制家具越来越多（多图）
     * image : http://p2.zhimg.com/9a/15/9a1570bb9e5fa53ae9fb9269a56ee019.jpg
     * ga_prefix : 052315
     * type : 0
     * id : 3930883
     */

    private List<TopStoriesEntity> topStories;//top_stories

    public void setDate(String date) {
        this.date = date;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public void setTopStories(List<TopStoriesEntity> topStories) {
        this.topStories = topStories;
    }

    public String getDate() {
        return date;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public List<TopStoriesEntity> getTop_stories() {
        return topStories;
    }

}
