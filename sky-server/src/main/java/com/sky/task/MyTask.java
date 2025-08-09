package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 自定义定时任务类
 */
@Component
@Slf4j
public class MyTask {

    /**
     * 定时任务 每到5秒触发一次
     */

//    @Scheduled(cron = "0/5 * * * * ?")
    public void task1() {
        log.info("定时任务启动了");
    }
}
