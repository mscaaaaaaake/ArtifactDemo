package com.demo.aop.seccurity;

import com.demo.aop.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/25 15:52
 * @version: 2.0.0
 */
@Aspect
@Component
@SpringBootApplication
public class SecurrityAspect {

    @Autowired
    private AuthService authService;


    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly(){

    }

    @Before("adminOnly()")
    public void check(){
        authService.checkAccess();
    }
}
