package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yanx
 * @Create 2022-07-07-23:53
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80{
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
