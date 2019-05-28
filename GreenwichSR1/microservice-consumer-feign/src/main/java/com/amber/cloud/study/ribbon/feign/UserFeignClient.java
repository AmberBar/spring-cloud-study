package com.amber.cloud.study.ribbon.feign;

import com.com.amber.cloud.study.cloud.study.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}
