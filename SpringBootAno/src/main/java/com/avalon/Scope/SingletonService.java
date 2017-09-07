package com.avalon.Scope;

import org.springframework.stereotype.Service;

/**
 * Created by ouyqy on 2017/9/6.
 * scope : Singleton -->一个Spring容器只有一个Bean实例,此为Spring的默认配置，全容器共享一个实例
 */
@Service  //默认是singleton
public class SingletonService {

    public void Singleton(){
        System.out.println("Singleton");
    }
}
