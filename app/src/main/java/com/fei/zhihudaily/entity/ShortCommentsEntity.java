package com.fei.zhihudaily.entity;

import java.util.List;

/**
 * Created by Fei on 2016/1/20.
 */
public class ShortCommentsEntity {
    /**
     * author : Xiaole说
     * id : 545721
     * content : 就吃了个花生米，呵呵
     * likes : 0
     * time : 1413600071
     * avatar : http://pic1.zhimg.com/c41f035ab_im.jpg
     */

    private List<CommentsEntity> comments;

    public void setComments(List<CommentsEntity> comments) {
        this.comments = comments;
    }

    public List<CommentsEntity> getComments() {
        return comments;
    }

}
