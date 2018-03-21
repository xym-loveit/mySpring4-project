package com.xym.spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xym
 */
@Configuration
@ComponentScan("com.xym.spring4")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
