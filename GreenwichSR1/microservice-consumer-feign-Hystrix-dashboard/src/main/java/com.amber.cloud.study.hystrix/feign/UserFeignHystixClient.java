package com.amber.cloud.study.hystrix.feign;

import com.com.amber.cloud.study.cloud.study.bean.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignHystixClient implements UserFeignClient {

    @Override
    public User findById(Long id) {
        return new User(4L, "nick", "nick", 18);
    }
}
