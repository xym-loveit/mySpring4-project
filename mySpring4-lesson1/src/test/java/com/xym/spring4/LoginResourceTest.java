package com.xym.spring4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginResourceTest {

    @Test
    public void testLogin() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationgContext.xml");
        LoginResource loginResource = (LoginResource) applicationContext.getBean("loginResource");
        loginResource.login();
    }

}