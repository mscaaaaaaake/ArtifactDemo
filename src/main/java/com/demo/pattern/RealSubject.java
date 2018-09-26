package com.demo.pattern;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 11:59
 * @version: 2.0.0
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real subject excute");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
