package com.xym.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1. Java配置方式：使用@Bean的initMethod和destroyMethod(相当于xml配置的init-method和destory-method)。
 * 2. 注解方式：利用JSR-250的@PostConstruct和@PreDestroy
 *
 * @author xym
 */
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
