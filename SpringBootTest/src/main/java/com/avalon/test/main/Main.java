package com.avalon.test.main;

import org.springframework.context.ApplicationListener;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * Created by ouyqy on 2017/11/8.
 */
public class Main {
    public static void main(String[] args) {
        //获取加载类列表
        List<ApplicationListener> loadFactories = SpringFactoriesLoader.loadFactories(ApplicationListener.class, null);

        System.out.println(loadFactories.size());//长度
        for(ApplicationListener app : loadFactories){
            System.out.println(app.getClass().getName());//加载类名称
        }
    }
}
