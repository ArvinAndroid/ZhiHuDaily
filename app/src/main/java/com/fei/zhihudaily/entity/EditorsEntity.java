package com.fei.zhihudaily.entity;

/**
 * Created by Fei on 2016/1/20.
 */
public class EditorsEntity {
    /**
     * url : http://www.zhihu.com/people/wezeit
     * bio : 微在 Wezeit 主编
     * id : 70
     * avatar : http://pic4.zhimg.com/068311926_m.jpg
     * name : 益康糯米
     */

    private String url;
    private String bio;
    private int id;
    private String avatar;
    private String name;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public String getBio() {
        return bio;
    }

    public int getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }
}
