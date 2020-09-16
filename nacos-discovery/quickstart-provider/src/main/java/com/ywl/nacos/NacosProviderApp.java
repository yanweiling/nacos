package com.ywl.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //开启feign
public class NacosProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApp.class);
    }
}
