package com.aaron.springcloud_service_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/getcontent")
    public String hello() {
        System.out.println("Enter hello world service!");
        return helloService.getHelloContent();
    }
}
