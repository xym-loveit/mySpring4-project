package com.xym.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1. 通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。在开发中使用@Profile注解类或者方法，达到在不同情况下选择实例化不同的Bean。
 * 2. 通过设定jvm的spring.profiles.active参数来设置配置环境。
 * 3. Web项目设置在Servlet的context parameter中。
 * <p>
 * <p>
 * ① 先将活动的Profile设置为prod
 * ② 后置注册Bean配置类，不然会报Bean未定义的错误。
 * ③ 刷新容器
 *
 * @author xym
 */
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
