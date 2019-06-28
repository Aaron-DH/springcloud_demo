package com.aaron.springcloud_service_feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-HELLOWORLD", fallback = HelloWorldServiceFailure.class)
public interface HelloService {

        @RequestMapping(value = "/",method = RequestMethod.GET)
        String getHelloContent();
}