package com.amber.cloud.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Value("${hello}")
    String helloValue;

    @GetMapping
    public String sayHello() {
        return helloValue;
    }
}
