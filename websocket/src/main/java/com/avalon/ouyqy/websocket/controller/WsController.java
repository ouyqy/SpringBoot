package com.avalon.ouyqy.websocket.controller;

import com.avalon.ouyqy.websocket.entity.WiselyMessage;
import com.avalon.ouyqy.websocket.entity.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @Author ouyqy
 * 2017/12/6 15:27
 *
 * description:
 * 1):当浏览器向服务器发送请求时。通过@MessageMapping映射 /welcome 这个地址，类似@RequestMapping
 *
 * 2):当服务器有消息时，会对订阅了@SendTo中的路径的浏览器发送消息
 *
 *
 */
@Controller
public class WsController {

    @MessageMapping("/welcome")//1
    @SendTo("/topic/getResponse")//2
    public WiselyResponse say(WiselyMessage wiselyMessage) throws InterruptedException {
        Thread.sleep(3000);
        return new WiselyResponse("welcome :"+wiselyMessage.getName()+"!");
    }
}
