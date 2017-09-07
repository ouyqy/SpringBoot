package com.avalon.ouyqy.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ouyqy on 2017/9/7.
 */
@Configuration
//@Service
@ComponentScan("com.avalon.ouyqy")
@PropertySource("classpath:/application.properties")
public class ElConfig {

    @Value("I love you!")  //1 注入普通字符串串
    private String normal;

    @Value("#{systemProperties['os.name']}")//2 注入操作系统属性
    private String osName;

    @Value("#{systemProperties['sun.os.patch.level']}")
    private String osMes;

    @Value("#{ T(java.lang.Math).random() *100.0}")//3 注入表达式结果
    private double randomNumber;

    @Value("#{demoService.another}") //4 注入其他bean属性
    private String fromAnother;

    @Value("classpath:/test.txt") //5 注入文件资源
    private Resource testFile;

    @Value("http://www.baidu.com") //6 注入网址资源
    private Resource testUrl;

    @Value("${book.name}")  //7 注入配置文件
    private String bookName;

    @Autowired
    private Environment environment;  //7

    @Bean  //7
    public static PropertySourcesPlaceholderConfigurer propertyConfiger() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(osMes);
        System.out.println(randomNumber);
        System.out.println(fromAnother);
        try {
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println("-----------------------分割线--------------------");
            BufferedReader out = new BufferedReader(new InputStreamReader(testFile.getInputStream()));
            String len = "";
            while ((len = out.readLine()) != null) {
                System.out.println(len);
            }
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(testUrl);
        System.out.println(bookName);
        System.out.println(environment.getProperty("book.author"));
    }
}
