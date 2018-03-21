package com.xym.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xym
 */
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
