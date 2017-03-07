package com.test02.init;

import org.springframework.stereotype.Service;

/**
 * @Description: 测试bean的init和destroy
 * @Author: ZhOu
 * @Date: 2017/3/6
 */

@Service
public class BeanWayService {

    public void init(){
        System.out.println("BeanWayService初始化执行");
    }

    public BeanWayService(){
        super();
        System.out.println("BeanWayService构造函数");
    }

    public void destroy(){
        System.out.println("BeanWayService销毁");
    }
}
