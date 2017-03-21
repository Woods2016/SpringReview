package com.test05.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/3/7
 */

@Data
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }
}
