package com.spring.udemy.impl;

import com.spring.udemy.service.HelloWorldService;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ৯:৪৯ PM
 ***/
public class HelloWorldServiceFrenchImpl implements HelloWorldService {
    @Override
    public String sayHello() {
        return "Bonjour le monde";
    }

    @Override
    public String getGreeting() {
        return "Bonjour le monde";
    }
}