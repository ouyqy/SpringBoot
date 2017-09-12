package com.avalon.main;

import com.avalon.config.PrePostConfig;
import com.avalon.service.BeanWayService;
import com.avalon.service.JSR250WayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ouyqy on 2017/9/8.
 */
public class Main {



    public static void main(String args[]){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService
                = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }

}
