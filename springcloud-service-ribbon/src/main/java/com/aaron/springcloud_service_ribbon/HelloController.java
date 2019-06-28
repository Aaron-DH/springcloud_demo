package com.aaron.springcloud_service_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.getHelloContent();
    }
}
