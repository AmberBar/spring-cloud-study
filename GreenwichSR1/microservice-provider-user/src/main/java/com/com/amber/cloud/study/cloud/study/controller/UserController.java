package com.com.amber.cloud.study.cloud.study.controller;


import com.com.amber.cloud.study.cloud.study.bean.User;
import com.com.amber.cloud.study.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("{id}")
    public User findUserById(@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }
}
