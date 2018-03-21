package com.xym.spring4;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ① 通过@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行。
 * ② 使用cron属性可按照指定时间执行;cron是UNIX和类UNIX(Linux)系统下的定时任务。
 *
 * @author xym
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次--reportCurrentTime " + dateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay = 5000)
    public void reportFixedDelayTime() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("每隔五秒执行一次--reportFixedDelayTime " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 50 14 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
    }

}
