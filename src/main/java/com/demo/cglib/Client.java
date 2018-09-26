package com.demo.cglib;

import com.demo.pattern.RealSubject;
import com.demo.pattern.Subject;
import net.sf.cglib.proxy.Enhancer;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 13:42
 * @version: 2.0.0
 */
public class Client {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //实际业务对象
        enhancer.setSuperclass(RealSubject.class);
        //要织入的代码
        enhancer.setCallback(new DemoMethodIntercept());
        //创建后用subject接收
        Subject subject = (Subject) enhancer.create();
        //调用方法
        subject.hello();
    }
}
