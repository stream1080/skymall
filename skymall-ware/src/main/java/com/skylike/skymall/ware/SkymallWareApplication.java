package com.skylike.skymall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SkymallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkymallWareApplication.class, args);
    }

}
