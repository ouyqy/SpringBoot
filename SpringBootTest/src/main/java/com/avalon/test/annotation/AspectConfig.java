package com.avalon.test.annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author ouyqy
 * 2017/12/15 11:11
 */
@Aspect
@Component
public class AspectConfig {


    @Pointcut(value = "@annotation(com.avalon.test.annotation.Message)")
    public void pointcut(){

    }

    @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        Method method = methodSignature.getMethod();

        Message message = method.getAnnotation(Message.class);

        System.out.println("annotation \n name:"+message.name()+"\n value:"+message.value());
    }

}
