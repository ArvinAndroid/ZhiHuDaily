package com.fei.zhihudaily.entity;

/**
 * Created by Fei on 2016/1/20.
 */
public class TopStoriesEntity {
    /**
     * title : 商场和很多人家里，竹制家具越来越多（多图）
     * image : http://p2.zhimg.com/9a/15/9a1570bb9e5fa53ae9fb9269a56ee019.jpg
     * ga_prefix : 052315
     * type : 0
     * id : 3930883
     */

    private String title;
    private String image;
    private String gaPrefix;//ga_prefix
    private int type;
    private int id;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
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

}
