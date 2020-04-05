package com.spring.udemy.impl;

import com.spring.udemy.service.HelloWorldService;

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