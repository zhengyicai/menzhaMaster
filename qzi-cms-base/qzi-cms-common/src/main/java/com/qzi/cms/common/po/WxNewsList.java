package com.qzi.cms.common.po;

import java.util.List;

/**
 * Created by Administrator on 2019/3/28.
 */
public class WxNewsList {
    private List<WxNewsContents> articles;

    public List<WxNewsContents> getArticles() {
        return articles;
    }

    public void setArticles(List<WxNewsContents> articles) {
        this.articles = articles;
    }
}
