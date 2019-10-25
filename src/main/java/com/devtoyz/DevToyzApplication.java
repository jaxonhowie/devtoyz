package com.devtoyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Hongyi Zheng
 * @date 2019/10/25
 */
@SpringBootApplication
public class DevToyzApplication {


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DevToyzApplication.class);
        app.run(args);
    }
}
