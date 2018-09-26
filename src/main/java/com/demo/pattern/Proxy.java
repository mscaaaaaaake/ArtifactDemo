package com.demo.pattern;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 12:00
 * @version: 2.0.0
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("before");
        try {
            realSubject.request();
        }catch (Exception e){
            System.out.println("ex:"+e.getMessage());
            throw e;
        }finally {
            System.out.println("after");
        }


    }

    @Override
    public void hello() {
        realSubject.hello();
    }
}
