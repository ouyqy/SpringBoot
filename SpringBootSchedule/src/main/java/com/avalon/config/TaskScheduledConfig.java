package com.avalon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by ouyqy on 2017/9/12.
 */
@Configuration
@ComponentScan("com.avalon")
@EnableScheduling //开启对计划任务的支持
public class TaskScheduledConfig {
}
