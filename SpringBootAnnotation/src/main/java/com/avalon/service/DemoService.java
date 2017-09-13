package com.avalon.service;

import org.springframework.stereotype.Service;

/**
 * Created by ouyqy on 2017/9/12.
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置获得的bean'");
    }

}
