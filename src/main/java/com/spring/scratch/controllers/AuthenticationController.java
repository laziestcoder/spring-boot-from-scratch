/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৪/৪/২০
 Time: ১২:১৯ AM
 ***/

package com.spring.scratch.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthenticationController implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry){
        viewControllerRegistry.addViewController("/home").setViewName("welcome");
        viewControllerRegistry.addViewController("/profile").setViewName("profile");
        viewControllerRegistry.addViewController("/login").setViewName("login");
    }
}
