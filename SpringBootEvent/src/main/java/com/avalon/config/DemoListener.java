package com.avalon.config;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by ouyqy on 2017/9/11.
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();//获取事件的参数信息
        System.out.println("我{bean-demoListener}接收到了bean-demoPublisher发布的消息:"+msg);
    }
}
