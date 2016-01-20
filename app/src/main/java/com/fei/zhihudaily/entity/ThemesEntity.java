package com.fei.zhihudaily.entity;

import java.util.List;

/**
 * Created by Fei on 2016/1/20.
 */
public class ThemesEntity {
    /**
     * limit : 1000
     * subscribed : []
     * others : [{"color":8307764,"thumbnail":"http://pic4.zhimg.com/2c38a96e84b5cc8331a901920a87ea71.jpg","description":"内容由知乎用户推荐，海纳主题百万，趣味上天入地","id":12,"name":"用户推荐日报"},"..."]
     */

    private int limit;
    private List<?> subscribed;
    /**
     * color : 8307764
     * thumbnail : http://pic4.zhimg.com/2c38a96e84b5cc8331a901920a87ea71.jpg
     * description : 内容由知乎用户推荐，海纳主题百万，趣味上天入地
     * id : 12
     * name : 用户推荐日报
     */

    private List<OthersEntity> others;

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setSubscribed(List<?> subscribed) {
        this.subscribed = subscribed;
    }

    public void setOthers(List<OthersEntity> others) {
        this.others = others;
    }

    public int getLimit() {
        return limit;
    }

    public List<?> getSubscribed() {
        return subscribed;
    }

    public List<OthersEntity> getOthers() {
        return others;
    }

}
