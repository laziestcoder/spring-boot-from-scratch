package com.spring.scratch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: towfiq106
 * Date: ২২/৩/২০
 * Time: ১:৩৫ AM
 **/

@Controller
public class CourseController {
    @RequestMapping("courses")
//    @ResponseBody // it will return only courses.jsp
    public String courses() {
//        System.out.println("Welcome to my first Spring Interface");
        return "courses";
    }
}
