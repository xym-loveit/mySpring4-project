package com.xym.spring4;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author xym
 */
public class LoginResource {

    private LoginService loginService;

    public void login() {
        loginService.login();
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}
