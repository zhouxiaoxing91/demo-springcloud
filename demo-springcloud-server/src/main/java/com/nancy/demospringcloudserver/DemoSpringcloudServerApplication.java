package com.nancy.demospringcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoSpringcloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudServerApplication.class, args);
    }
}
