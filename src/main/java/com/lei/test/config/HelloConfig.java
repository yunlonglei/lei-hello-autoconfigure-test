package com.lei.test.config;

import com.lei.hello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leiyunlong
 * @version 1.0
 * @since 2021/8/10 3:45 下午
 */
@Configuration
public class HelloConfig {

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setName("erlei");
        helloService.setAge(18);
        return  helloService;
    }
}
