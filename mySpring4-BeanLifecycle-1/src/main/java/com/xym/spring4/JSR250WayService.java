package com.xym.spring4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author xym
 */
public class JSR250WayService {

    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destory-method");
    }

}
