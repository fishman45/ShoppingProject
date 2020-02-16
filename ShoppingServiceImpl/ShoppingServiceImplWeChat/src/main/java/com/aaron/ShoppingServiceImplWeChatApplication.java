package com.aaron;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: lfl
 * @description: 微信启动
 * @date: Create in 2020/2/12 下午 11:35
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class ShoppingServiceImplWeChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingServiceImplWeChatApplication.class, args);
    }

}
