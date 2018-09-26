package com.demo.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 10:07
 * @version: 2.0.0
 */
@Aspect
@Component
public class ArgsAspectConfig {

    /*注意：args方法匹配时，参数性质位置必须对应，否则无法拦截*/
    @Pointcut("args(..,Integer) && within(com.demo.aop.service.ProductService)")
    public void argsMatch(){

    }

    @Before("argsMatch()")
    public void before(){
        System.out.println("=======before======");
        System.out.println("ArgsAspectConfig");
        System.out.println("=======before======");
    }
}
