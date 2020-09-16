package com.ywl.nacos.microservice.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service1Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service1Bootstrap.class);
    }
}
