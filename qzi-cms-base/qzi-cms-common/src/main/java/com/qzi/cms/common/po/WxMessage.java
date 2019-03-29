package com.qzi.cms.common.po;

/**
 * 微信发送消息
 * Created by Administrator on 2019/3/28.
 */
public class WxMessage {
    private String touser;
    private String msgtype;
    private WxContent text;


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

    public WxContent getText() {
        return text;
    }

    public void setText(WxContent text) {
        this.text = text;
    }
}
