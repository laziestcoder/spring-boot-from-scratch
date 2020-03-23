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
@Entity(name = "customers")
public class customerEntity {
    @Id
    private int customerID;
    private String customerName;
    private String courseName;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "customerEntity{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
