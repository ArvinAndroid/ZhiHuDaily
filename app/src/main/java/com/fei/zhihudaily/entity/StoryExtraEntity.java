package com.fei.zhihudaily.entity;

/**
 * Created by Fei on 2016/1/20.
 */
public class StoryExtraEntity {
    /**
     * long_comments : 0
     * popularity : 161
     * short_comments : 19
     * comments : 19
     */

    private int longComments;//long_comments
    private int popularity;
    private int shortComments;//short_comments
    private int comments;

    public void setLongComments(int longComments) {
        this.longComments = longComments;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setShortComments(int shortComments) {
        this.shortComments = shortComments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getLongComments() {
        return longComments;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getShortComments() {
        return shortComments;
    }

    public int getComments() {
        return comments;
    }

}
