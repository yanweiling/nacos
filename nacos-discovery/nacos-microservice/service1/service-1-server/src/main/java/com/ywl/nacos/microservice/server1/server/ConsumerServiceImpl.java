package com.ywl.nacos.microservice.server1.server;


import com.ywl.nacos.microservice.server1.api.ConsumerService;
import com.ywl.nacos.microservice.server2.api.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    ProviderService providerService;
    public String service() {
        return "consumer invoke "+providerService.service();
    }
}
