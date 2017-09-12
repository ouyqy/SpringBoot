package com.avalon.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by ouyqy on 2017/9/12.
 * 实现AsyncConfigurer接口并重写getAsyncExecutor方法,并返回一个ThreadPoolTaskExecutor,
 * 获得一个基于线程池的taskExecutor
 */
@Configuration //配置bean 相当于xml的配置
@EnableAsync //注解开启异步任务支持
@ComponentScan("com.avalon") //扫描注解并装入bean容器
public class TaskExcutorConfig implements AsyncConfigurer{
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);//最大核心池数
        taskExecutor.setMaxPoolSize(10);//最大连接池数
        taskExecutor.setQueueCapacity(25);//队列容量
        taskExecutor.initialize();//初始化
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
