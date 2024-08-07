package com.test.myapp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.test.myapp5.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

}
