package com.spring.scratch.classfiles;

public class SubmissionFormCustomers {
    private String cname;
    private String cemail;
    private int cid;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "SubmissionFormCustomers{" +
                "cname='" + cname + '\'' +
                ", cemail='" + cemail + '\'' +
                ", cid=" + cid +
                '}';
    }
}
