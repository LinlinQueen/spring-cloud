package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yanx
 * @Create 2022-07-26-22:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain8000 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain8000.class,args);
    }
}
