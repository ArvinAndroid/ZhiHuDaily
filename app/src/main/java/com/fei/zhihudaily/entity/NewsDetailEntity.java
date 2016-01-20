package com.fei.zhihudaily.entity;

import java.util.List;

/**
 * Created by Fei on 2016/1/20.
 */
public class NewsDetailEntity {
    /**
     * body :
     * image_source : Angel Abril Ruiz / CC BY
     * title : 卖衣服的新手段：把耐用品变成「不停买新的」
     * image : http://p4.zhimg.com/30/59/30594279d368534c6c2f91b2c00c7806.jpg
     * share_url : http://daily.zhihu.com/story/3892357
     * js : []
     * ga_prefix : 050615
     * type : 0
     * id : 3892357
     * css : ["http://news-at.zhihu.com/css/news_qa.auto.css?v=77778"]
     */

    private String body;
    private String imageSource;//image_source
    private String title;
    private String image;
    private String shareUrl;//share_url
    private String gaPrefix;//ga_prefix
    /**
     * 0:站内
     * 1:站外
     */
    private int type;
    private int id;
    private List<?> js;
    private List<String> css;

    public void setBody(String body) {
        this.body = body;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
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

    public void setJs(List<?> js) {
        this.js = js;
    }

    public void setCss(List<String> css) {
        this.css = css;
    }

    public String getBody() {
        return body;
    }

    public String getImageSource() {
        return imageSource;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getShareUrl() {
        return shareUrl;
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

    public List<?> getJs() {
        return js;
    }

    public List<String> getCss() {
        return css;
    }

}
