package com.spring.udemy.constructor;

import com.spring.udemy.impl.HelloWorldImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ২:১০ AM
 ***/

@Component
public class InjectByConstructorService {
    private HelloWorldImpl helloWorld;

    @Autowired
    public InjectByConstructorService(HelloWorldImpl helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void getMessage(){
        helloWorld.sayHello();
    }

}
