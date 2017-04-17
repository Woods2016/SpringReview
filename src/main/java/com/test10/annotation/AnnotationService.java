package com.test10.annotation;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/4/17
 */
@Service
public class AnnotationService {
    public void shows(){
        System.out.println("元注解和组合注解");
    }
}
