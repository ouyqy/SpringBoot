package com.avalon.main;

import com.avalon.DemoConfig;
import com.avalon.service.DemoService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ouyqy on 2017/9/12.
 */
//@RestController
//@EnableAutoConfiguration
//@ComponentScan("com.avalon")
@SpringBootApplication
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }
}
