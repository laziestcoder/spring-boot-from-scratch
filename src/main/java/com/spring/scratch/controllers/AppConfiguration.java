package com.spring.scratch.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
    @RequestMapping("/")
    public String hello() {
        return "Welcome to Spring-Boot from Scratch";
    }
}
