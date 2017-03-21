package com.test05.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Description: 事件发布类
 * @Author: ZhOu
 * @Date: 2017/3/7
 */
@Component
public class DemoPublish {

    //注入，用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
