package com.skylike.skymall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SkymallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkymallOrderApplication.class, args);
    }

}
