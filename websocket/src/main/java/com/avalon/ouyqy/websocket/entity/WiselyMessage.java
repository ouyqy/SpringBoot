package com.avalon.ouyqy.websocket.entity;

/**
 * @Author ouyqy
 * 2017/12/6 15:23
 *
 * 浏览器向服务端发送的消息用此类接收
 */
public class WiselyMessage {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
