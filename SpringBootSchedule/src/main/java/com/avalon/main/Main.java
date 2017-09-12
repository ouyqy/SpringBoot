package com.avalon.main;

import com.avalon.config.TaskScheduledConfig;
import com.avalon.service.ScheduledService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ouyqy on 2017/9/12.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(TaskScheduledConfig.class);

        ScheduledService scheduledService = context.getBean(ScheduledService.class);
    }
}
