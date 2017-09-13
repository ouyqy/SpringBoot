package com.avalon.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by ouyqy on 2017/9/12.
 *
 * 自定义组合注解
 * 1-- 使用@WiselyConfiguration的类要和启动类在同一级目录下（不建议）,
 * 不然会提示 No qualifying bean of type 'com.avalon.service.DemoService' available
 *
 * 2--在启动类添加@SpringBootApplication
 *
 * 3--在启动类添加@RestController、@EnableAutoConfiguration、@ComponentScan
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface WiselyConfiguration {

    String[] value() default {};

}
