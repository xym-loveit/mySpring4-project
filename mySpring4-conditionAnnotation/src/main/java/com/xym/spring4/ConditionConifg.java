package com.xym.spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * ① 通过@Conditional注解，符合Windows条件则实例化windowsListService。
 * ② 通过@Conditional注解，符合Linux条件则实例化linuxListService。
 *
 * @author xym
 */
@Configuration
public class ConditionConifg {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }


}
