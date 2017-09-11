BeanNameAware:
获得容器中Bean的名称

BeanFactoryAware:
获得当前bean factory,这样可以调容器的服务

ApplicationContextAware*:
当前的application context,可以调用容器的服务

MessageSourceAware:
获得message source,这样可以获得文本信息

ApplicationEventPublisherAware:
应用事件发布器,可以发布事件

ResourceLoaderAware:
获得资源加载器,可以获得外部的资源文件