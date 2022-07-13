package com.spring.scratch.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৩/৪/২০
 Time: ১০:১২ PM
 ***/
@Getter
@Setter
@Entity(name = "courses")
public class Courses {
    @Id
    @GeneratedValue
    private int cid;
    private String cname;
    private String courseName;

    @Override
    public String toString() {
        return "Courses{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", coursename='" + courseName + '\'' +
                '}';
    }
}
