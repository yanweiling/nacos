package com.ywl.nacos.microservice.application1.controller;

import com.ywl.nacos.microservice.server1.api.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application1Controller {
    @Reference
    private ConsumerService consumerService;
    @GetMapping("/service")
    public String service(){

        return consumerService.service();
    }
}
