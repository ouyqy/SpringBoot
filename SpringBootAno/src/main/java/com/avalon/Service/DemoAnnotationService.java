package com.avalon.Service;

import com.avalon.Annotation.Action;
import com.avalon.Annotation.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ouyqy on 2017/9/6.
 * 使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {

    @Value("${loginName}")
    private String loginName = "1000";

    @Value("${password}")
    private String password = "2000";

    @Action(name="注解式拦截的add操作")
    public void add(){}

    @Message(getLoginName = "ouyqy2017",getPassword = "ouyqy2017")
    public void login(){
        System.out.println(loginName);
        System.out.println(password);
    }


}
