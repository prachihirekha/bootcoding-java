package com.bootcoding.practice.method;

public class Employee {
    public static void main(String[] args) {
        double tax =500000;
        if (tax<=500000){
            tax =0;
        }
        else if(tax<=1000000){
            tax=1000000/10;

        }
        else if(tax<=2000000){
            tax =2000000/20;
        }
        else if (tax>2000000){
            tax =2000000/30;
        }
        System.out.println(tax);
    }
}



