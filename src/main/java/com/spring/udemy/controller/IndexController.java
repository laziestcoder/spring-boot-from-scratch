package com.spring.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৭/৪/২০
 Time: ১২:২৭ AM
 ***/
@Controller
public class IndexController {

    @RequestMapping({"/", ""})
    public String index(){
        return "index";
    }
}