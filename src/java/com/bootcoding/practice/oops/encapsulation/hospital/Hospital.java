package com.bootcoding.practice.oops.encapsulation.hospital;



import com.bootcoding.practice.oops.encapsulation.patient.Patient;

import java.util.Date;
import java.util.UUID;

public class Hospital {
    public String name;
    private UUID id;
   private String address;
   private String services;
   public String getName(){
       return name;
   }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public void setName(String name){
       this.name=name;
   }



}
//    public static void main(String[] args) {
//        Patient p = new Patient();
//        p.name ="Ramesh";
//        p.age = 28;
//       // p.disease="cold";
//        p.admitDate =new Date();
//    }
//}
