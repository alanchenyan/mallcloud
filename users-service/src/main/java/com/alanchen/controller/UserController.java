package com.alanchen.controller;

import com.alanchen.pojo.User;
import com.alanchen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userServiceImpl;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId){
        return userServiceImpl.getUser(userId);
    }
}
