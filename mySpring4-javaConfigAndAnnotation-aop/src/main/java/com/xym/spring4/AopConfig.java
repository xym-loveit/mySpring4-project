package com.xym.spring4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持
 *
 * @author xym
 */
@Configuration
@ComponentScan("com.xym.spring4")
@EnableAspectJAutoProxy
public class AopConfig {
}
