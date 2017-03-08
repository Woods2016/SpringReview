package com.test04.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Description: 配置类
 * @Author: ZhOu
 * @Date: 2017/3/7
 */

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from dev");
    }


    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from prod");
    }
}
