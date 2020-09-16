package com.ywl.nacos.microservice.server2.server;

import com.ywl.nacos.microservice.server2.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    public String service() {
        return "provider invoke";
    }
}
