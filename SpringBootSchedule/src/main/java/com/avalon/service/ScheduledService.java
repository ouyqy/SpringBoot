package com.avalon.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ouyqy on 2017/9/12.
 */
@Service //自定义一个bean,自动根据bean的类名实例化一个首字母为小写的bean
public class ScheduledService {

    private static final SimpleDateFormat dateFormate = new SimpleDateFormat("HH:mm:ss");

    //fixedRate 每隔固定时间执行(以毫秒为单位)
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次 "+dateFormate.format(new Date()));
    }

    //cron 指定时间执行,这里是每天11点15分执行;cron是UNIX和类UNIX（linux）系统下的定时任务
    @Scheduled(cron = "0 15 11 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 "+dateFormate.format(new Date())+" 执行");
    }

    //fixedDelay 延迟固定时间执行(以毫秒为单位)
    @Scheduled(fixedDelay = 5000)
    public void fixedDelay(){
        System.out.println("延迟5s执行一次 "+dateFormate.format(new Date()));
    }

    //initialDelay项目启动后第一次执行前延迟固定时间(以毫秒为单位)
    @Scheduled(initialDelay = 10000,fixedRate = 5000)
    public void initialDelay(){
        System.out.println("第一次执行之前延迟10s "+dateFormate.format(new Date()));
    }

    @Scheduled(fixedRateString = "5000")
    public void fixedRateString(){
        System.out.println("fixedRateString : "+dateFormate.format(new Date()));
    }

//    @Scheduled(fixedRate = 5000)
//    public void whenTimeout(){
//        long time = System.currentTimeMillis();
//        System.out.println(time);
//        while(true){
//            long endTime = System.currentTimeMillis();
//            if((time+10000)<endTime){
//                System.out.println(endTime);
//                System.out.println("when executor time out 5s..."+dateFormate.format(new Date()));
//                break;
//            }
//        }
//    }

}
