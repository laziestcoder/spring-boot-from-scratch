package com.spring.scratch;

import com.spring.scratch.classfiles.Customers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring.scratch.classfiles.SubmissionFormCustomers;

@ComponentScan
@SpringBootApplication

public class SpringBootFromScratch extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SubmissionFormCustomers.class);
    }

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootFromScratch.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootFromScratch.class, args);
        Customers cus = context.getBean(Customers.class);
        cus.display();
    }

}
