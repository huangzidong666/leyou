package com.hjd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistrgApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrgApplication.class,args);
    }
}
