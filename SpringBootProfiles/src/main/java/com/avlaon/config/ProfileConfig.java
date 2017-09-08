package com.avlaon.config;

import com.avlaon.bean.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by ouyqy on 2017/9/8.
 */
public class ProfileConfig {

    @Bean
    @Profile("dev") //1
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")//2
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
