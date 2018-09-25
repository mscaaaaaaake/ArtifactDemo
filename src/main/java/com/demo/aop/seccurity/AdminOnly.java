package com.demo.aop.seccurity;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/25 15:53
 * @version: 2.0.0
 */

/*
Retention注解的含义：
定义被它所注解的注解保留多久，一共有三种策略，定义在RetentionPolicy枚举中
SOURCE
被编译器忽略

CLASS
注解将会被保留在Class文件中，但在运行时并不会被VM保留。这是默认行为，所有没有用Retention注解的注解，都会采用这种策略。

RUNTIME
保留至运行时。所以我们可以通过反射去获取注解信息
*/

/*说明了Annotation所修饰的对象范围
取值(ElementType)有：
1.CONSTRUCTOR:用于描述构造器
    2.FIELD:用于描述域
    3.LOCAL_VARIABLE:用于描述局部变量
    4.METHOD:用于描述方法
    5.PACKAGE:用于描述包
    6.PARAMETER:用于描述参数
    7.TYPE:用于描述类、接口(包括注解类型) 或enum声明

*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AdminOnly {
}
