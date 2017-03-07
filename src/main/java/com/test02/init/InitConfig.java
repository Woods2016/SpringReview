package com.test02.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 配置加载类，测试方法test.java.TestInit
 * @Author: ZhOu
 * @Date: 2017/3/6
 */

@Configuration
@ComponentScan("com.test02.init")
public class InitConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    public JsrWayService jsrWayService(){
        return new JsrWayService();
    }
}
