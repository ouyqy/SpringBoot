package com.avalon.config;

import com.avalon.condition.LinuxCondition;
import com.avalon.condition.WindowsCondition;
import com.avalon.service.ListService;
import com.avalon.service.impl.LinuxListService;
import com.avalon.service.impl.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ouyqy on 2017/9/12.
 */
@Configuration
public class ConditionConfig {

    //通过@Conditional注解,符合Windows条件则实例化windowsListService
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }

    //通过@Conditional注解,符合linux条件则实例化linuxListService
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
