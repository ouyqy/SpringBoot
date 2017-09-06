package com.avalon;

import com.avalon.Service.DemoAnnotationService;
import com.avalon.Service.DemoMethodService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

/**
 * Created by ouyqy on 2017/9/6.
 */
@SpringBootApplication
@ComponentScan("com.avalon.*")
public class Application implements CommandLineRunner {

    @Resource
    private DemoMethodService demoMethodService;

    @Resource
    private DemoAnnotationService demoAnnotationService;


    public void run(String... strings) throws Exception {
        demoMethodService.add();
        demoMethodService.login("ouyqy","ouyqy");
        System.out.println("-----------");
        demoAnnotationService.add();
        demoAnnotationService.login();
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
