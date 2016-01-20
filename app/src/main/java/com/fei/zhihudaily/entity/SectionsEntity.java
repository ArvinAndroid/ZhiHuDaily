package com.fei.zhihudaily.entity;

/**
 * Created by Fei on 2016/1/20.
 */
public class SectionsEntity {
    /**
     * id : 1
     * thumbnail : http://p2.zhimg.com/10/b8/10b8193dd6a3404d31b2c50e1e232c87.jpg
     * name : 深夜食堂
     * description : 睡前宵夜，用别人的故事下酒
     */

    private int id;
    private String thumbnail;
    private String name;
    private String description;

    public void setId(int id) {
        this.id = id;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
