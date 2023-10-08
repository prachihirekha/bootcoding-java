package com.bootcoding.practice.oops.encapsulation.patient;

import java.util.Date;

public class Patient1 {
    public String name;
    private String disease;
    public int age;
    public Date admitDate;
    public Date dischargeDate;
private Patient1(){

}



public static Patient1 get(){
        return new Patient1();

    }

    public static void main(String[] args) {
        Patient1 P=Patient1.get();
    }

}

