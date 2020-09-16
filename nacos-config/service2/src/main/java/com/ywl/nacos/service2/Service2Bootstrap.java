package com.ywl.nacos.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class Service2Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service2Bootstrap.class);
    }

    @Value("${common.name:yanweiling}")
    String name;

    @Value("${common.age:33}")
    String age;

    @Value("${common.address:张家口}")
    String address;

    @Value("${common.birthday:1987-02-24}")
    String birthday;

    @Value("${common.fullname:阎维玲}")
    String fullName;


    @GetMapping("/configs")
    public String getConfig(){

        return name+" "+age+" "+address+" "+birthday+" "+fullName;
    }

}
