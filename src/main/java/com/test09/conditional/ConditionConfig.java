package com.test09.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/4/17
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ConditionService getWindows() {
        return new WindowsConditionService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ConditionService getLinux() {
        return new LinuxConditionService();
    }
}
