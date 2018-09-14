package com.dev.guide05.controller;

import com.dev.guide05.pojo.User;
import com.dev.guide05.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable Long id){

        return userService.getUserById(id);
    }
}
