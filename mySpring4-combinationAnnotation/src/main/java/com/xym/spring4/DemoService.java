package com.xym.spring4;

import org.springframework.stereotype.Service;

/**
 * @author xym
 */
@Service
public class DemoService {
    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }
}
