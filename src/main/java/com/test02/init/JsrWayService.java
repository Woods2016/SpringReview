package com.test02.init;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description: 注解配置bean的init和destroy
 * @Author: ZhOu
 * @Date: 2017/3/6
 */
@Service
public class JsrWayService {

    @PostConstruct
    public void init(){
        System.out.println("JSRWayService初始化方法");
    }

    public JsrWayService(){
        super();
        System.out.println("JSRWayService构造函数");
    }

    @PreDestroy
    public void destory(){
        System.out.println("JSRWayService销毁");
    }
}
