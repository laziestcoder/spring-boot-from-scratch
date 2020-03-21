package com.spring.scratch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }
}
