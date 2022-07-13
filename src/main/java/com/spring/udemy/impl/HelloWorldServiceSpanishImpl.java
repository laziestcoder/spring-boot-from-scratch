package com.spring.udemy.impl;

import com.spring.udemy.services.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

    @Override
    public String sayHello() {
        return "Hola mundo!!";
    }

    @Override
    public String getGreeting() {
        return "Hola mundo!!";
    }
}