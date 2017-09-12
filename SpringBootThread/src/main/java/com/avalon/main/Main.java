package com.avalon.main;

import com.avalon.config.TaskExcutorConfig;
import com.avalon.service.AsyncTaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ouyqy on 2017/9/12.
 */
public class Main {

    public static void main(String[] args){
        //基于注解的应用实现
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExcutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        //结果示并发执行而不是顺序执行
        for(int i =0;i<10;i++){
            asyncTaskService.executorAsyncTask(i);
            asyncTaskService.executorAsyncTaskPlus(i);
        }
        context.close();
    }
}
