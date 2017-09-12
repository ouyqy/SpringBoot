package com.avalon.main;

import com.avalon.config.ConditionConfig;
import com.avalon.service.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ouyqy on 2017/9/12.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令是:"+
                listService.showListCmd());
    }
}
