package com.demo.aop.service;

import com.demo.aop.seccurity.CurrentUserHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/25 13:33
 * @version: 2.0.0
 */
@Component
@Service
public class AuthService {

    public void checkAccess() {
        String user = CurrentUserHolder.get();
        if(!"admin".equals(user)){
            throw new RuntimeException("非管理员登录");
        }else{
            System.out.println("登录成功；用户："+user);
        }
    }
}
