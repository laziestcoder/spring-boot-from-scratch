package com.spring.scratch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.spring.scratch.classfiles.SubmissionFormCustomers;

@SpringBootApplication

public class SpringBootFromScratch extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SubmissionFormCustomers.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFromScratch.class, args);
    }

}
