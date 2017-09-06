package com.avalon.Service;

import org.springframework.stereotype.Service;

/**
 * Created by ouyqy on 2017/9/6.
 * 使用方法的被拦截类
 */
@Service
public class DemoMethodService {
    public void add(){}

    public void login(String loginName,String password){
        System.out.println(loginName);
        System.out.println(password);
    }
}
