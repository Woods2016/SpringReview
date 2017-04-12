package com.test06.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Description: 获取BeanName和资源加载的服务
 * @Author: ZhOu
 * @Date: 2017/4/12
 */
@Service
public class DemoAware implements ResourceLoaderAware, BeanNameAware {
    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outPutString() {
        System.out.println("BeanName=" + this.beanName);
        Resource resource = resourceLoader.getResource("classpath:aware.txt");
        try {
            String result = IOUtils.toString(resource.getInputStream(), "UTF-8");
            System.out.println("获取内容是：\n" + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
