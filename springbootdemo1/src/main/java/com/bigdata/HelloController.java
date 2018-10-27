package com.bigdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caowei
 * @date 2018/10/23 20:10
 * @description
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private Seller seller;

    @RequestMapping("test")
    public String test(){
        System.out.println(seller);
        return "hello haha";
    }

    //今天写了xxxx行代码啦啦啦啦啦啦啦啦啦
}