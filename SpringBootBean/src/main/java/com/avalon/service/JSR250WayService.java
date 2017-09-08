package com.avalon.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ouyqy on 2017/9/8.
 */
public class JSR250WayService {

    public JSR250WayService() {
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PostConstruct  //在构造函数执行完之后执行
    public void initMethod(){
        System.out.println("@PostConstruct");
    }

    @PreDestroy //在Bean销毁之前执行
    public void destroyMethod(){
        System.out.println("@PreDestory");
    }
}
