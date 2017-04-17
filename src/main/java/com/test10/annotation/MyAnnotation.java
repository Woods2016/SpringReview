package com.test10.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @Description:
 * Target：
 * ElemenetType.CONSTRUCTOR 构造器声明
 * ElemenetType.FIELD 域声明（包括 enum 实例）
 * ElemenetType.LOCAL_VARIABLE 局部变量声明
 * ElemenetType.METHOD 方法声明
 * ElemenetType.PACKAGE 包声明
 * ElemenetType.PARAMETER 参数声明
 * ElemenetType.TYPE 类，接口（包括注解类型）或enum声明
 *
 * Retention:
 * RetentionPolicy.SOURCE 注解将被编译器丢弃
 * RetentionPolicy.CLASS 注解在class文件中可用，但会被VM丢弃
 * RetentionPolicy.RUNTIME VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息。
 *
 * Documented 将此注解包含在 javadoc中
 *
 * Inherited 允许子类继承父类中的注解
 *
 * @Author: ZhOu
 * @Date: 2017/4/17
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Configuration
@ComponentScan
public @interface MyAnnotation {
    String[] value() default {};
}
