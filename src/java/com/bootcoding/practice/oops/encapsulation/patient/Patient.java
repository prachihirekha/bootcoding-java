package com.bootcoding.practice.oops.encapsulation.patient;



import java.util.Date;


public class Patient {
    public String name;
    private String disease;
    public int age;
    public Date admitDate;
    public Date dischargeDate;
    public void print(){
        System.out.println("Name" + name);
        System.out.println(dischargeDate);
        System.out.println(disease);
        System.out.println(age);
    }
}
