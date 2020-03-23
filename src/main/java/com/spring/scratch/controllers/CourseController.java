package com.spring.scratch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView courses(
            @RequestParam("cname") String courseName
//            HttpSession session
    ) {
//        System.out.println("Welcome to my first Spring Interface");
//        HttpSession session = request.getSession();
//        String courseName = request.getParameter("courseName");
//        System.out.println("Course name is: " + courseName);
//        session.setAttribute("courseName", courseName);

        ModelAndView mv = new ModelAndView();
        mv.addObject("courseName", courseName);
//        return "courses";
        mv.setViewName("courses");
        return mv;
    }
}
