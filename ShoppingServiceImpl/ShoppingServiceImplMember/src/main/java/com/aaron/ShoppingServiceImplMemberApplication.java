package com.aaron;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: lfl
 * @description:
 * @date: Create in 2020/2/13 下午 03:37
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2Doc
@EnableApolloConfig
public class ShoppingServiceImplMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingServiceImplMemberApplication.class, args);
    }

}
