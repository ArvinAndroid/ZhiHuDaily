package com.fei.zhihudaily.entity;

import java.util.List;

/**
 * Created by Fei on 2016/1/20.
 */
public class StoriesEntity {
    /**
     * title : 中国古代家具发展到今天有两个高峰，一个两宋一个明末（多图）
     * ga_prefix : 052321
     * images : ["http://p1.zhimg.com/45/b9/45b9f057fc1957ed2c946814342c0f02.jpg"]
     * type : 0
     * id : 3930445
     */

    private String title;
    private String gaPrefix;//ga_prefix
    private int type;
    private int id;
    private List<String> images;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGaPrefix(String gaPrefix) {
        this.gaPrefix = gaPrefix;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public String getGaPrefix() {
        return gaPrefix;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public List<String> getImages() {
        return images;
    }

}
