package com.qzi.cms.common.po;

/**
 * 微信发送新闻
 * Created by Administrator on 2019/3/28.
 */
public class WxNews {
    private String touser;
    private String msgtype;
    private WxNewsList news;


    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public WxNewsList getNews() {
        return news;
    }

    public void setNews(WxNewsList news) {
        this.news = news;
    }
}
