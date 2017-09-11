package com.avalon.Bean;

import com.avalon.Config.EventConfig;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * Created by ouyqy on 2017/9/11.
 */
@Component
//实现BeanNameAware,ResourceLoaderAware接口,获得Bean名称和资源加载服务
public class AwareService implements BeanNameAware,ResourceLoaderAware,
        BeanFactoryAware,MessageSourceAware,ApplicationEventPublisherAware,ApplicationContextAware {

    private String beanName;
    private ResourceLoader loader;
    private BeanFactory beanFactory;
    private MessageSource messageSource;
    private ApplicationEventPublisher applicationEventPublisher;
    private ApplicationContext applicationContext;

    @Override //重写setBeanName方法
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override//重写serResourceLoader方法
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        /*--BeanNameAware--*/
        System.out.println("Bean的名称"+beanName);

        try {
            /*--ResourceLoaderAware--*/
            Resource resource = loader.getResource("classpath:test.txt");
            System.out.println("ResourceLoader加载的文件内容为："+IOUtils.toString(resource.getInputStream()));

            /*--BeanFactoryAware--*/
            System.out.println("beanFactory里的beanName:"+beanFactory.getBean(AwareService.class).beanName);

            /*--MessageSourceAware--*/
            ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
            //set 文件名
            messageSource.setBasename("test");
            //get 属性
            System.out.println("messageSource : " + messageSource.getMessage("test.cn",null, LocaleContextHolder.getLocale()));

            /*--ApplicationEventPublisherAware---*/
            applicationEventPublisher.publishEvent(new EventConfig(this,"ouyqy"));

            /*--ApplicationContextAware--*/
            AwareService awareService = applicationContext.getBean(AwareService.class);
            System.out.println("ApplicationContextAware : "+awareService.getBeanName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
