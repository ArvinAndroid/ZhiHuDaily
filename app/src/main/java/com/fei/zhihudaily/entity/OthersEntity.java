package com.fei.zhihudaily.entity;

/**
 * Created by Fei on 2016/1/20.
 */
public class OthersEntity {
    /**
     * color : 8307764
     * thumbnail : http://pic4.zhimg.com/2c38a96e84b5cc8331a901920a87ea71.jpg
     * description : 内容由知乎用户推荐，海纳主题百万，趣味上天入地
     * id : 12
     * name : 用户推荐日报
     */

    private int color;
    private String thumbnail;
    private String description;
    private int id;
    private String name;

    public void setColor(int color) {
        this.color = color;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
