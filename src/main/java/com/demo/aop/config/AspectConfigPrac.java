package com.demo.aop.config;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/25 17:34
 * @version: 2.0.0
 */
@Aspect
@Component
public class AspectConfigPrac {

    /*within:
    拦截对应的类（com.demo.aop.service.ProductService）；
    拦截一个包下面的所有类（com.demo.aop.service.*）
    * */
    @Pointcut("within(com.demo.aop.service.ProductService)")
    public void matchType(){

    }

    /*@AfterThrowing，异常通知，代码抛出异常之后执行
    * 其他advice详见笔记
    * 另around较为齐全强大，可单独多了解了解
    * */
    @AfterThrowing("matchType()")
    public void before(){
        System.out.println("======before======");
        System.out.println("AspectConfigPrac");
        System.out.println("该用户为不被允许登入用户");
        System.out.println("======before======");
    }
}
