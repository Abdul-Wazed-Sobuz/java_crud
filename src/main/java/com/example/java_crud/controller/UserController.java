package com.example.java_crud.controller;

import com.example.java_crud.entity.User;
import com.example.java_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
