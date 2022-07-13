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
public class HelloWorldServiceRussianImpl implements HelloWorldService {
    @Override
    public String sayHello() {
        return "Привет мир";
    }

    @Override
    public String getGreeting() {
        return "Привет мир";
    }
}