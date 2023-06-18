package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUser(){
        final String bobGreetings = "Hi, I'm Bob!";
        return bobGreetings;
    }
}
