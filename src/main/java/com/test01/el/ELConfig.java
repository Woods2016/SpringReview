package com.test01.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/3/6
 */

@Configuration
@ComponentScan("com.test.el")
@PropertySource("classpath:/el.properties")
public class ELConfig {

    @Value("123")
    private String id;

    //系统级参数
    @Value("#{systemProperties['os.name']}")
    private String sysName;


    //引用系统函数
    @Value("#{ T(java.lang.Math).random()*100 }")
    private Integer randomNum;


    //引用自定义字段
    @Value("#{demoService.address}")
    private String address;


    @Value("${user1.name}")
    private String name;


    @Value("${user1.gender}")
    private String gender;

    @Autowired
    private Environment environment;

    @Value("http://www.baidu.com")
    private Resource resource;

    @Value("classpath:/el.properties")
    private Resource resource1;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }


    public void outPutSource() throws IOException {
        System.out.println(id);
        System.out.println(sysName);
        System.out.println(randomNum);
        System.out.println(address);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(environment.getProperty("user1.gender"));
        System.out.println(IOUtils.toString(resource.getInputStream(),"UTF-8"));
        System.out.println(IOUtils.toString(resource1.getInputStream(),"UTF-8"));
    }
}
