package com.spring.udemy.impl;

import com.spring.udemy.services.HelloWorldService;
import org.springframework.stereotype.Service;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ৯:৫০ PM
 ***/
@Service
public class HelloWorldServiceGermanImpl implements HelloWorldService {
    @Override
    public String sayHello() {
        return "Hello Welt";
    }

    @Override
    public String getGreeting() {
        return "Hello Welt";
    }
}