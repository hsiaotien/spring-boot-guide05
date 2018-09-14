package com.dev.guide05;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dev.guide05.mapper")
public class Guide05Application {
    public static void main(String[] args) {
        SpringApplication.run(Guide05Application.class,args);
    }
}
