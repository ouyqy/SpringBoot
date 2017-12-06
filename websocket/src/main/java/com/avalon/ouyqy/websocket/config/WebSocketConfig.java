package com.avalon.ouyqy.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @Author ouyqy
 * 2017/12/6 15:10
 *
 * description:
 *  1):通过@EnableWebSocketMessageBroker注解开启使用STOMP协议来传输基于代理（message broker）的信息，这是控制器支持使用@MessageMapping，
 *  就像使用@RequestMapping一样。
 *
 *  2):注册STOMP协议的节点（endPoint），并映射指定的URL
 *
 *  3):注册一个STOMP的endpoing，并指定使用SockJs协议
 *
 *  4):配置消息代理（Message Broker）
 *
 *  5):广播式应用，配置一个 /topic 消息代理
 */
@Configuration
@EnableWebSocketMessageBroker//1
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {//2
        stompEndpointRegistry.addEndpoint("/endPointWisely").withSockJS();//3
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {//4
        super.configureMessageBroker(registry);
        registry.enableSimpleBroker("/topic");//5
    }
}
