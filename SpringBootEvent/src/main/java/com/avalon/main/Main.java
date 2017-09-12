package com.avalon.main;

import com.avalon.config.DemoPublisher;
import com.avalon.config.EventConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ouyqy on 2017/9/8.
 */
public class Main {

    public  static void main(String[] args){
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(EventConfig.class);
//        context.register(DemoPublisher.class);
//        context.refresh();
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
