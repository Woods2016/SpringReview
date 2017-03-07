package com.test02.initanddestory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/3/6
 */

@Configuration
@ComponentScan("com.test02.initanddestory")
public class InitConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    public JsrWayService jsrWayService(){
        return new JsrWayService();
    }
}
