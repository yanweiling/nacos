package com.ywl.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="quickstart-provider")
public interface ProviderClient {

    @GetMapping("/service")
    String service();
}
