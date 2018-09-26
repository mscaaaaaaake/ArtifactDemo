package com.demo.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 10:21
 * @version: 2.0.0
 */
@Aspect
@Component
public class AnnoAspectConfig {

    /*标有该方法注解的方法则会被拦截*
        详见ProductService中insert方法上标注有AdminOnly的则被拦截，去掉标注则不拦截
     */
    @Pointcut("@annotation(com.demo.aop.seccurity.AdminOnly)")
    public void matchMethod(){

    }

    @Before("matchMethod()")
    public void dobefore(){
        System.out.println("==========before========");
        System.out.println("AnnoAspectConfig");
        System.out.println("==========before========");
    }
}
