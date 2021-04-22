package com.skylike.skymall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients(basePackages = "com.skylike.skymall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class SkymallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkymallMemberApplication.class, args);
    }

}
