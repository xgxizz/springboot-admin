package com.xgx.springbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class SpringBootAdminServer9999 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServer9999.class, args);
    }
}
