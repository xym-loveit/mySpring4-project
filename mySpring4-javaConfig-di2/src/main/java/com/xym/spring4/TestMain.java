package com.xym.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xym
 */
public class TestMain {
    public static void main(String[] args) {
//        DefaultListableBeanFactory defaultListableBeanFactory;

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService bean = applicationContext.getBean(UseFunctionService.class);

        System.out.println(bean.SayHello("World"));
        applicationContext.close();
    }
}
