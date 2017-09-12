package com.avalon.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by ouyqy on 2017/9/12.
 * 任务执行类
 */
@Service
public class AsyncTaskService {

    @Async //通过@Async注解表明该方法是一个异步方法,如果注解在类级别,则表明所有的方法都是异步方法
    public void executorAsyncTask(Integer i){
        System.out.println("执行异步任务: "+i);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1："+(i+1));
    }
}
