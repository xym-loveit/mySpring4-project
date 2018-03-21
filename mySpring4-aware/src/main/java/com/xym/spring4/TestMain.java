package com.xym.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring提供的Aware接口
 * BeanNameAware	获得到容器中Bean的名称
 * BeanFactoryAware	获得当前bean factory，这样可以调用容器的服务
 * ApplicationContextAware*	获得当前application context，这样可以调用容器的服务
 * MessageSourceAware	获得message source这样可以获得文本信息
 * ApplicationEventPublisherAware	应用事件发布器，可以发布事件
 * ResourceLoaderAware	获得资源加载器，可以获得外部资源文件
 * <p>
 * <p>
 * Spring Aware的目的是为了让Bean获得Spring容器的服务。因为ApplicationContext接口集成了MessageSource接口，ApplicationEventPublisherAware接口和ResourceLoaderAware接口，所以Bean继承ApplicationContextAware可以获得Spring容器的所有服务，但原则上我们还是用到什么接口就实现什么接口。
 *
 * @author xym
 */
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();

        context.close();
    }
}
