package com.fei.zhihudaily.entity;

import java.util.List;

/**
 * Created by Fei on 2016/1/20.
 */
public class LongCommentsEntity {
    /**
     * author : EleganceWorld
     * id : 545442
     * content : 上海到济南，无尽的猪排盖饭… （后略）
     * likes : 0
     * time : 1413589303
     * avatar : http://pic2.zhimg.com/1f76e6a25_im.jpg
     */

    private List<CommentsEntity> comments;

    public void setComments(List<CommentsEntity> comments) {
        this.comments = comments;
    }

    public List<CommentsEntity> getComments() {
        return comments;
    }

}
