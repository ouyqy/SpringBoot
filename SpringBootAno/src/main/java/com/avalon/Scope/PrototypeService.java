package com.avalon.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ouyqy on 2017/9/6.
 * Scope : Prorotype --> 每次调用新建一个Bean
 */
@Service
@Scope(value = "prototype")
public class PrototypeService {

    public void prototype(){
        System.out.println("prototype");
    }
}
