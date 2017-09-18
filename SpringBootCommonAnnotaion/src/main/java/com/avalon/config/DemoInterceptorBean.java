package com.avalon.config;

import com.avalon.filter.DemoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ouyqy on 2017/9/18.
 */
@Configuration
@EnableWebMvc
public class DemoInterceptorBean extends WebMvcConfigurerAdapter{

    @Bean //配置拦截器的bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //获取路径后缀pathVar/xxx.xx ; default 获取为xxx,加上setUseSuffixPatternMatch(false) 获取为xxx.xx
        configurer.setUseSuffixPatternMatch(false);
    }

    //重写addInterceptor方法,注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }
}
