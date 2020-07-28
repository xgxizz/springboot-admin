package com.xgx.springbootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootAdminClient8888 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminClient8888.class, args);
    }
}
