package com.spring.udemy;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৭/৪/২০
 Time: ১:৫১ AM
 ***/
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringmvcApplication.class)
@WebAppConfiguration
public class SpringmvcApplicationTests {

    @Test
    public void contextLoads() {
    }

}
