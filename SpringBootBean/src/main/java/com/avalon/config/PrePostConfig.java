package com.avalon.config;

import com.avalon.service.BeanWayService;
import com.avalon.service.JSR250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ouyqy on 2017/9/8.
 */
@Configuration
@ComponentScan("com.avalon")
public class PrePostConfig {

    /**
     *  initMethod 和 destroyMethod 指定BeanWayService类的init和destroy方法
     *  在构造方法之后、Bean销毁之前执行
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
