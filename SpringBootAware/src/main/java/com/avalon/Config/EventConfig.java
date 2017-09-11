package com.avalon.Config;

import org.springframework.context.ApplicationEvent;

/**
 * Created by ouyqy on 2017/9/11.
 */
public class EventConfig extends ApplicationEvent {

    private String name;

    public EventConfig(Object source,String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
