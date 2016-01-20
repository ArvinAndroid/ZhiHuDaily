package com.fei.zhihudaily.entity;

/**
 * Created by Fei on 2016/1/20.
 */
public class VersionEntity {

    /**
     * status : 1
     * msg : 【更新内容】
     * <p/>
     * 已优化：加快打开「我的收藏」的速度。
     * <p/>
     * 每次看到你收藏好文章，我们都非常兴奋。
     * 所以当你打开「我的收藏」时，我们希望一次全拿出来，导致打开速度变慢。
     * 现在我们已经修复了这个问题。
     * url : http://zhstatic.zhihu.com/pkg/store/daily/zhihu-daily-zhihu-2.5.2(382).apk
     * latest : 2.5.1
     */

    /**
     * 0:最新版本
     * 1:需要更新
     */
    private int status;
    private String msg;
    private String url;
    private String latest;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public String getUrl() {
        return url;
    }

    public String getLatest() {
        return latest;
    }

}
