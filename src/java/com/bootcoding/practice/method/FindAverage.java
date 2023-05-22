package com.bootcoding.practice.method;

public class FindAverage {
    public static void main(String[] args) {
        FindAverage num=new FindAverage();
        num.findAverage(25,45,65);

    }
    public  void findAverage(int a,int b,int c){
        int avg =(a+b+c)/3;
        System.out.println("Print average =" + avg);
    }
}
