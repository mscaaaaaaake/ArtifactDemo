package com.demo.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 10:32
 * @version: 2.0.0
 */
@Aspect
@Component /*让该类被spring托管*/
public class ExecutionAspectConfig {

    /*execution(方法修饰符 返回值 包名（什么包下面的什么方法，以及方法里的参数）)*/
    @Pointcut("execution(public void com.demo.aop.service.*Service.*(..,Integer))")
    public void matchMethod(){}

    @Before("matchMethod()")
    public void doBefore(){
        System.out.println("");
        System.out.println("================");
        System.out.println("ExecutionAspectConfig");
        System.out.println("================");
    }

}
