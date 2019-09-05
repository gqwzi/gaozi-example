package com.gao.gaozi.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync//开启异步
public class GaoziExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GaoziExampleApplication.class, args);
    }

}
