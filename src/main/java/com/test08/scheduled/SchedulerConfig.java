package com.test08.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/4/14
 */
@Component
@ComponentScan("com.test08.scheduled")
@EnableScheduling
public class SchedulerConfig {

}
