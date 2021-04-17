package com.skylike.skymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/skylike/skymall/product/dao")
@SpringBootApplication
public class SkymallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkymallProductApplication.class, args);
    }

}
