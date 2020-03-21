package com.spring.scratch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String courses(HttpServletRequest request) {
//        System.out.println("Welcome to my first Spring Interface");
        HttpSession session = request.getSession();
        String courseName = request.getParameter("coursename");
//        System.out.println("Course name is: " + courseName);
        session.setAttribute("coursename", courseName);
        return "courses";
    }
}
