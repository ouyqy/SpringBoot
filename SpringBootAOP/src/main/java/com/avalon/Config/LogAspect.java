package com.avalon.Config;

import com.avalon.Annotation.Action;
import com.avalon.Annotation.Message;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by ouyqy on 2017/9/6.
 */
@Aspect //1
@Component //2
public class LogAspect {

    @Pointcut("@annotation(com.avalon.Annotation.Action)") //3
    public void annotationPointCut(){
        System.out.println("拦截器 : 切点"); //5
    }

    @After("annotationPointCut()") //4
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截器 : "+action.name()); //5
    }

    @After("@annotation(com.avalon.Annotation.Message)")
    public void after001(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Message message = method.getAnnotation(Message.class);
        System.out.println("注解式拦截器 : "+message.getLoginName()+"  "+message.getPassword());
    }

    @Before("execution(* com.avalon.Service.DemoMethodService.*(..))") //6
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截器 : "+method.getName());
    }
}
