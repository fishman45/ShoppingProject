package com.aaron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: lfl
 * @description: eureka注册中心
 * @date: Create in 2020/2/12 下午 11:35
 */
@SpringBootApplication
@EnableEurekaServer
public class ShoppingEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingEurekaApplication.class, args);
    }
}
