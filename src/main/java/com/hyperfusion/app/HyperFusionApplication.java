package com.hyperfusion.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hyperfusion.app.mapper")
public class HyperFusionApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyperFusionApplication.class, args);
    }

}
