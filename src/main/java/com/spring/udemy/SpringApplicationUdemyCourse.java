package com.spring.udemy;

import com.spring.udemy.constructor.InjectByConstructorService;
import com.spring.udemy.impl.HelloWorldImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ১:৩৪ AM
 ***/
@SpringBootApplication
public class SpringApplicationUdemyCourse {
    public static void main(String[] args) {
        ApplicationContext cntx = SpringApplication.run(SpringApplicationUdemyCourse.class, args);

        InjectByConstructorService injectByConstructorService = (InjectByConstructorService) cntx.getBean("injectByConstructorService");

        injectByConstructorService.getMessage();
    }

}
