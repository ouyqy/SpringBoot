package com.avalon.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by ouyqy on 2017/11/8.
 */
@Component
@ConfigurationProperties(prefix = "other")
@PropertySource(value = "classpath:/user.properties")
public class TestValueLocalBean {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
