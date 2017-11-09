package com.avalon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.HttpEncodingProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Created by ouyqy on 2017/11/9.
 */
@Configuration
@EnableConfigurationProperties(value = {HttpEncodingProperties.class})//开启属性注入，通过@EnableConfigurationProperties声明，使用@Autowired注入
@ConditionalOnClass(value = {CharacterEncodingFilter.class})//当CharacterEncodingFilter在类路径上。
@ConditionalOnProperty(value = "enabled",prefix = "spring.http.encoding",matchIfMissing = true)//当设置spring.http.encoding=enabled的情况下，如果没有设置则默认为true，即条件符合
//满足@Conditional...才创建HttpEncodingAutoConfiguration
public class HttpEncodingAutoConfiguration {

    @Autowired
    private HttpEncodingProperties httpEncodingProperties;

    @Bean
    @ConditionalOnMissingBean(value = CharacterEncodingFilter.class)//如果characterEncodingFilter bean在容器中不存在，则新建一个
    public CharacterEncodingFilter characterEncodingFilter(){
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding(httpEncodingProperties.getCharset().name());//set 参数
        filter.setForceEncoding(httpEncodingProperties.isForce());//set 参数
        return filter;
    }
}
