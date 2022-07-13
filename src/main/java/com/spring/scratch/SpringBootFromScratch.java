package com.spring.scratch;

<<<<<<< HEAD
<<<<<<< HEAD
import com.spring.scratch.classfiles.SubmissionFormCustomers;
=======
import com.spring.scratch.classfiles.Customers;
>>>>>>> 6ae2f49 (WIP 1:47)
=======
import com.spring.scratch.classfiles.SubmissionFormCustomers;
>>>>>>> 7e68c2e (Sprng Security Implemented)
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
<<<<<<< HEAD
<<<<<<< HEAD

@SpringBootApplication
=======
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring.scratch.classfiles.SubmissionFormCustomers;

@ComponentScan
@SpringBootApplication

>>>>>>> 6ae2f49 (WIP 1:47)
=======

@SpringBootApplication
>>>>>>> 7e68c2e (Sprng Security Implemented)
public class SpringBootFromScratch extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SubmissionFormCustomers.class);
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        SpringApplication.run(SpringBootFromScratch.class, args);
=======
//        SpringApplication.run(SpringBootFromScratch.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootFromScratch.class, args);
        Customers cus = context.getBean(Customers.class);
        cus.display();
>>>>>>> 6ae2f49 (WIP 1:47)
    }

}
