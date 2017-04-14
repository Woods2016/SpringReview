package com.test08.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Description: 定时器的任务方法不能有返回值
 * @Author: ZhOu
 * @Date: 2017/4/14
 */
@Service
public class SchedulerService {

    @Scheduled(cron = "0 10 * * * *")
    public void testScheduled1() {
        System.out.println("testScheduled1:" + LocalDateTime.now());
    }

    @Scheduled(fixedRate = 5000) //每5秒执行一次
    public void testScheduled2() {
        System.out.println("testScheduled2:" + LocalDateTime.now());
    }

    @Scheduled(fixedDelay = 5000)
    public void testScheduled3() {
        System.out.println("testScheduled3:" + LocalDateTime.now());
    }

}
