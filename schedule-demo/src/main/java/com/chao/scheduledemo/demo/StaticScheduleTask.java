package com.chao.scheduledemo.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

//@Configuration//配置类
//@EnableScheduling//开启定时任务
public class StaticScheduleTask {
    @Scheduled(cron = "0/5 * * * * ?")
    //直接指定间隔时间
    //@Scheduled(fixedRate = 5000)
    private void configureTasks() {
        System.out.println("执行静态定时任务时间：" + LocalDateTime.now());
    }
}
