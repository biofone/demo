
package com.chao.scheduledemo.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

//@Configuration
//@EnableScheduling
public class DynamicScheduleTask implements SchedulingConfigurer {
    //获取cron值
    @Mapper
    public interface CronMapper {
        @Select("select cron from cron limit 1")
        public String getCron();
    }
    //自动注入
    @Autowired(required = false)
    CronMapper cronMapper;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addTriggerTask(
                //1.添加任务内容
                () -> System.out.println("执行动态定时任务： " + LocalDateTime.now().toLocalTime()),
                //2.设置执行周期
                triggerContext -> {
                    String cron = cronMapper.getCron();
                    if(StringUtils.isEmpty(cron)) {
                        System.out.println("任务执行周期未设定！");
                    }
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                });

    }
}
