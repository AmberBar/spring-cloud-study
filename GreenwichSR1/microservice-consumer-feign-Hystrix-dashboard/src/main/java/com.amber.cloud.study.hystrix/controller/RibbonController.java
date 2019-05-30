package com.amber.cloud.study.hystrix.controller;

import com.amber.cloud.study.hystrix.feign.UserFeignClient;
import com.com.amber.cloud.study.cloud.study.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    UserFeignClient feignClient;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        User user = feignClient.findById(id);
        return user;
    }
}
