package com.spring.udemy.impl;

import com.spring.udemy.service.HelloWorldService;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ৯:৫০ PM
 ***/
public class HelloWorldServicePolish  implements HelloWorldService {
    @Override
    public String sayHello() {
        return "Witaj świecie";
    }

    @Override
    public String getGreeting() {
        return "Witaj świecie";
    }
}