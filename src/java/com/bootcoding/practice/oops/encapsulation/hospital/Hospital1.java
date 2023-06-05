package com.bootcoding.practice.oops.encapsulation.hospital;



import com.bootcoding.practice.oops.encapsulation.patient.Patient1;

import java.util.Date;

public class Hospital1 {
    public static void main(String[] args) {
        Patient1 patient1 =Patient1.get();
        patient1.name= "RAMESH";
        patient1.admitDate =new Date();


    }
}
