package com.spring.udemy.config;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৮/৪/২০
 Time: ৩:১৫ AM
 ***/
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by jt on 12/14/15.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.spring.udemy")
//@ActiveProfiles("jpadao")
public class JpaIntegrationConfig {
}
