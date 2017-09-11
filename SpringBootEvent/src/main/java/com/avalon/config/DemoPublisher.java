package com.avalon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by ouyqy on 2017/9/11.
 * 事件发布
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;//注入ApplicationContext用来发布事件

    public void publish(String msg){
        //通过ApplicationContext的publishEvent方法来发布
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
