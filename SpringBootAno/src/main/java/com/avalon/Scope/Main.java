package com.avalon.Scope;

import com.avalon.Config.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ouyqy on 2017/9/6.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        SingletonService s1 = context.getBean(SingletonService.class);
        SingletonService s2 = context.getBean(SingletonService.class);

        PrototypeService p1 = context.getBean(PrototypeService.class);
        PrototypeService p2 = context.getBean(PrototypeService.class);

        System.out.println("s1与s2是否相等:"+s1.equals(s2));
        System.out.println("p1与p2是否相等:"+p1.equals(p2));

        context.close();
    }
}
