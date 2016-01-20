package com.fei.zhihudaily.entity;

import java.util.List;

/**
 * Created by Fei on 2016/1/20.
 */
public class NewsDetailOtherEntity {
    /**
     * theme_name : 电影日报
     * title : 五分钟读懂明星的花样昵称：一美、法鲨……
     * share_url : http://daily.zhihu.com/story/3942319
     * js : []
     * ga_prefix : 052921
     * editor_name : 邹波
     * theme_id : 3
     * type : 1
     * id : 3942319
     * css : ["http://news.at.zhihu.com/css/news_qa.6.css?v=b390f"]
     */

    private String themeName;//theme_name
    private String title;
    private String shareUrl;//share_url
    private String gaPrefix;//ga_prefix
    private String editorName;//editor_name
    private int themeId;//theme_id
    private int type;
    private int id;
    private List<?> js;
    private List<String> css;

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public void setGaPrefix(String gaPrefix) {
        this.gaPrefix = gaPrefix;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
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

    public String getThemeName() {
        return themeName;
    }

    public String getTitle() {
        return title;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public String getGaPrefix() {
        return gaPrefix;
    }

    public String getEditorName() {
        return editorName;
    }

    public int getThemeId() {
        return themeId;
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
