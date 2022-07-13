package com.spring.udemy.impl;

import com.spring.udemy.services.HelloWorldService;
import org.springframework.stereotype.Service;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ৯:৪৮ PM
 ***/
@Service
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String sayHello() {
        return "Hello World!!!";
    }

    @Override
    public String getGreeting() {
        return "Hello World!!!";
    }
}