package com.spring.scratch.entity;

public class Courses {
    private int cid;
    private String cname;
    private String coursename;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", coursename='" + coursename + '\'' +
                '}';
    }

}
