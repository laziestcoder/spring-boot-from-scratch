package com.spring.udemy;

import com.spring.udemy.constructor.InjectByConstructorService;
import com.spring.udemy.controller.GreetingController;
import com.spring.udemy.impl.HelloWorldImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ১:৩৪ AM
 ***/
@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringApplicationUdemyCourse {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringApplicationUdemyCourse.class, args);

        InjectByConstructorService injectByConstructorService = (InjectByConstructorService) ctx.getBean("injectByConstructorService");

        injectByConstructorService.getMessage();
        GreetingController controller = (GreetingController) ctx.getBean("greetingController");

        controller.sayHello();
    }

}
