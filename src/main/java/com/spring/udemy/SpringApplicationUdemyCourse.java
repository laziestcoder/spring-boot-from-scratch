package com.spring.udemy;

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
//@ImportResource("classpath:/spring/spring-config.xml")
public class SpringApplicationUdemyCourse {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringApplicationUdemyCourse.class, args);
//        ApplicationContext ctx = SpringApplication.run(SpringApplicationUdemyCourse.class, args);

//        InjectByConstructorService injectByConstructorService = (InjectByConstructorService) ctx.getBean("injectByConstructorService");
//        injectByConstructorService.getMessage();
//        GreetingController controller = (GreetingController) ctx.getBean("greetingController");

//        controller.sayHello();

//        for (String name : ctx.getBeanDefinitionNames()){
//            System.out.println(name);
//        }
//        System.out.println("******* Bean Count *******");
//        System.out.println(ctx.getBeanDefinitionCount());
    }

}
