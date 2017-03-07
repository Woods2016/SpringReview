package com.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/3/6
 */

@Service
@Scope(value = "prototype")
public class DemoService2 {

}
