package com.demo.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 9:38
 * @version: 2.0.0
 */
@Aspect
@Component
public class ObjectAspectConfig {

    /*@Pointcut("this(com.demo.aop.service.ProductService)")
    public void aspectConfig(){

    }*/

    @Pointcut("bean(productService)")
    public void aspectConfig(){

    }

    @Before("aspectConfig()")
    public void doBefore(){
        System.out.println("======before======");
        System.out.println("Object Aspect Config");
        System.out.println("======before======");
    }
}
