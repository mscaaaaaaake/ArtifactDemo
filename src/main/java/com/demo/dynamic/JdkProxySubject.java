package com.demo.dynamic;

import com.demo.pattern.RealSubject;

import net.sf.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: aspect动态代理
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 13:11
 * @version: 2.0.0
 */
public class JdkProxySubject implements InvocationHandler{
    private RealSubject realSubject;


    public JdkProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    /*动态反射方法method*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = null;
        try {
            result = method.invoke(realSubject,args);
        }catch (Exception e){
            System.out.println("ex:"+e.getMessage());
        }finally {
            System.out.println("after");
        }
        return result;
    }
}
