package com.avlaon.Main;

import com.avlaon.bean.DemoBean;
import com.avlaon.config.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ouyqy on 2017/9/8.
 */
public class Main {

    public static void main(String[] argss){
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();

        //先将活动的profile设置为prod
        context.getEnvironment().setActiveProfiles("prod");
        //注册Bean配置类
        context.register(ProfileConfig.class);
        //刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();

    }
}
