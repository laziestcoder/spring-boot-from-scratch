package com.spring.scratch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {
//        SpringApplication.run(HelloWorld.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(HelloWorld.class, args);
        Customers cus = context.getBean(Customers.class);
        cus.display();
    }

}
