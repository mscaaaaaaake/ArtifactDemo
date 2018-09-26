package com.demo.dynamic;

import com.demo.pattern.Client;
import com.demo.pattern.RealSubject;
import com.demo.pattern.Subject;
import net.sf.cglib.proxy.Proxy;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 13:17
 * @version: 2.0.0
 */
public class Cilent {

    /*动态代理*/
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{Subject.class},
                new JdkProxySubject(new RealSubject()));
//        subject.request();
        subject.hello();
    }
}
