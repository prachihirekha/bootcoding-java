package com.bootcoding.practice.practice;

public class Example {
    public static void main(String[] args) {
        personName("Alexandra Abramov","July",14,1975,"99-9999999999");

    }
    public static void personName(String name, String month,int date,long year,String mobile){

        System.out.println("Name :" +name);
        System.out.println("DOB :" +month+" "+date+","+year);
        System.out.println("Mobile Number :" +mobile);

    }
}
