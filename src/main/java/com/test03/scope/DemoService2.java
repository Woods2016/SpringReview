package com.test03.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Description: 测试bean范围，设置为prototype，每次请求都会有新的bean
 * @Author: ZhOu
 * @Date: 2017/3/6
 */

@Service
@Scope(value = "prototype")
public class DemoService2 {

}
