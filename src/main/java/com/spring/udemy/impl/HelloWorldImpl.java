package com.spring.udemy.impl;

import com.spring.udemy.service.HelloWorldService;
import org.springframework.stereotype.Component;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ১:৫৩ AM
 ***/
@Component
public class HelloWorldImpl implements HelloWorldService {
    public void sayHello() {
        System.out.println("Hello World");
    }
}
