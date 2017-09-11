package com.avalon.config;

import org.springframework.context.ApplicationEvent;

/**
 * Created by ouyqy on 2017/9/11.
 * 自定义事件
 */
public class DemoEvent  extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
