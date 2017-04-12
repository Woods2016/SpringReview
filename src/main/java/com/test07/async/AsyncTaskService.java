package com.test07.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Description: Async在类上，类下面的方法全部是异步；在方法上，只有此方法是异步
 * @Author: ZhOu
 * @Date: 2017/4/12
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeTask1(Integer i) {
        System.out.println("executeTask1====" + i);
    }

    @Async
    public void executeTask2(Integer i) {
        System.out.println("executeTask2>>>" + i);
    }
}
