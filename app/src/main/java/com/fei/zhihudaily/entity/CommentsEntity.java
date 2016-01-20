package com.fei.zhihudaily.entity;

/**
 * Created by Fei on 2016/1/20.
 */
public class CommentsEntity {
    /**
     * author : EleganceWorld
     * id : 545442
     * content : 上海到济南，无尽的猪排盖饭… （后略）
     * likes : 0
     * time : 1413589303
     * avatar : http://pic2.zhimg.com/1f76e6a25_im.jpg
     */

    private String author;
    private int id;
    private String content;
    private int likes;
    private int time;
    private String avatar;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public int getTime() {
        return time;
    }

    public String getAvatar() {
        return avatar;
    }
}
