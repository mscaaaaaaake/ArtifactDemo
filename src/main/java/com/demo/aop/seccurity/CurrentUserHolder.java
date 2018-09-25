package com.demo.aop.seccurity;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/25 13:25
 * @version: 2.0.0
 */
public class CurrentUserHolder {

    private  static  final  ThreadLocal<String> holder = new ThreadLocal<>();

    public static  String get(){
        return holder.get() == null?"unknown":holder.get();
    }

    public static void set(String user){
        holder.set(user);
    }
}
