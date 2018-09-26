package com.demo.pattern;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/26 13:05
 * @version: 2.0.0
 */
public class Client {

    /*静态代理
    * 缺点：每个方法的代理方法都要有单独的方法，代码冗余
    * */
    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
