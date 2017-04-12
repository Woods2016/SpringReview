package com.test06.aware;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: ApplicationContext接口继承了MessageSource、ApplicationEventPublish、ResourceLoader接口
 * @Author: ZhOu
 * @Date: 2017/4/12
 */
@Configuration
@ComponentScan("com.test06.aware")
public class AwareConfig {

}
