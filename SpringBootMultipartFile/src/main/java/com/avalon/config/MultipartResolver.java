package com.avalon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * Created by ouyqy on 2017/9/18.
 */
@Configuration
public class MultipartResolver {

    @Bean
    public org.springframework.web.multipart.MultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver =
                new CommonsMultipartResolver();
//        multipartResolver.setMaxUploadSize(22485761L);
        return multipartResolver;
    }


}
