package com.ywl.nacos.service1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@RefreshScope//开启动态刷新  方式1，在类上增加注解 @RefreshScope
public class Service1Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service1Bootstrap.class);
    }

    /*注入配置文件上下文*/
    @Autowired
    ConfigurableApplicationContext applicationContext;

    @Value("${common.name}")
    private String config1;

    /*这种方式无法动态刷新*/
    @GetMapping(value = "/configs")
    public String getConfigs(){
      return config1;
    }

    @GetMapping(value = "/configs2")
    public String getConfigs2(){
        return applicationContext.getEnvironment().getProperty("common.name");
    }
}
