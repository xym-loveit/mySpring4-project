package com.xym.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布器
 * <p>
 * ① 注入ApplicationContext 用来发布事件。
 * ② 使用ApplicationContext 的publishEvent方法来进行发布。
 *
 * @author xym
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
