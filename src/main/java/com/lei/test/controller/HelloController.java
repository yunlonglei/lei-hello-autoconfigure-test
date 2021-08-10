package com.lei.test.controller;

import com.lei.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyunlong
 * @version 1.0
 * @since 2021/8/10 3:31 下午
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("hello")
    public String hello(){
        return helloService.sayHelloToo();
    }
}
