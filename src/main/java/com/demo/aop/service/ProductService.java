package com.demo.aop.service;

import com.demo.aop.entity.Product;
import com.demo.aop.seccurity.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/25 13:10
 * @version: 2.0.0
 */
@Service("productService")
@Component
public class ProductService {

    @Autowired
    private AuthService authService;

    @AdminOnly
    public void Insert(Product product){
        System.out.println("Insert");
    }

    public void delete(Product product){
        System.out.println("Delete");
    }
}
