package com.spring.securityapp.cookie.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("cookie/index");
        registry.addViewController("/other").setViewName("cookie/other");
        registry.addViewController("/login").setViewName("cookie/login");
    }
}
