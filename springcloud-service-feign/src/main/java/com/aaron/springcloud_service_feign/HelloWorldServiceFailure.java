package com.aaron.springcloud_service_feign;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceFailure implements HelloService {

    @Override
    public String getHelloContent() {
        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }
}
