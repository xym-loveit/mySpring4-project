package com.xym.spring4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xym
 */
@Configuration
@ComponentScan("com.xym.spring4")
@EnableScheduling
public class TaskSchedulerConfig {
}
