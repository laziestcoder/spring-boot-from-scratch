/**
 * Created by IntelliJ IDEA.
 * User: towfiq
 * Date: ২৪/৩/২০
 * Time: ১২:৩৫ AM
 **/


package com.spring.scratch.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "customers")
public class Customers {
    @Id
    private int cid;
    private String cname;
    private String cemail;

    public int getCid() {
        return cid;
    }

    public void setCid(int customerID) {
        this.cid = customerID;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String customerName) {
        this.cname = customerName;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String customerEmail) {
        this.cemail = customerEmail;
    }

    @Override
    public String toString() {
        return "customerEntity{" +
                "customerID=" + cid +
                ", customerName='" + cname + '\'' +
                ", customerEmail='" + cemail + '\'' +
                '}';
    }
}
