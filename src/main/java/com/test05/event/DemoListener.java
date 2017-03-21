package com.test05.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description: 实现ApplicationListener接口，指定监听事件类型
 * @Author: ZhOu
 * @Date: 2017/3/7
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("DemoListener获取到的信息是：" + msg);
    }
}
