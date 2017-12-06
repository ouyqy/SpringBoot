package com.avalon.ouyqy.websocket.entity;

/**
 * @Author ouyqy
 * 2017/12/6 15:25
 *
 * 服务器向浏览器发送的此类的消息
 *
 */
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
