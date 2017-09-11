package com.avalon.Listen;

import com.avalon.Config.EventConfig;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by ouyqy on 2017/9/11.
 */
@Component
public class EventListener implements ApplicationListener<EventConfig> {
    @Override
    public void onApplicationEvent(EventConfig eventConfig) {
        String name = eventConfig.getName();
        System.out.println("event name : "+name);
    }
}
