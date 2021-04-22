package com.skylike.skymall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SkymallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkymallProductApplication.class, args);
    }

}
