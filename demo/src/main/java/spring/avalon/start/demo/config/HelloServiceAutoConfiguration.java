package spring.avalon.start.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.avalon.start.demo.service.HelloService;

/**
 * @Author ouyqy
 * @Created 2017/11/9.
 */
@Configuration
//开启属性注入，通过@EnableConfigurationProperties，使用@Autowired注入HelloServiceProperties
@EnableConfigurationProperties(HelloServiceProperties.class)
//判断HelloService类是否存该类路径上，不存在则创建HelloServiceAutoConfiguration的实例
@ConditionalOnClass(HelloService.class)
//判断application.properties是否存在hello这个配置项，matchIfMissing=true指不存在默认为true，@ConditionalOnProperty为true才创建所标记类的实例
@ConditionalOnProperty(value = "enabled",prefix = "hello",matchIfMissing = true)
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(value = HelloService.class)//当容器不存在HelloService这个Bean，才创建HelloService这个Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}
