package com.gokul.security.controller;

import com.gokul.security.model.Users;
import com.gokul.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private UserService service;
    private UserController (UserService service){
        this.service=service;
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users users){
       return service.register(users);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users users){
        return service.login(users);
    }
}
