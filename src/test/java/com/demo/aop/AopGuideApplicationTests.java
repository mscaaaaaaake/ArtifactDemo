package com.demo.aop;

import com.demo.aop.entity.Product;
import com.demo.aop.seccurity.CurrentUserHolder;
import com.demo.aop.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/25 13:39
 * @version: 2.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication
public class AopGuideApplicationTests {

    @Autowired
    ProductService productService;


    @Test
    public void annoInserTest(){
        CurrentUserHolder.set("admin");
        Product product = new Product();
        product.setId(1);
        product.setName("tom");
        productService.Insert(product);
    }
}
