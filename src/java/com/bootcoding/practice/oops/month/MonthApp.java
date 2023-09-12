package com.bootcoding.practice.oops.month;

public class MonthApp {
    public static void main(String[] args) {
        MonthService monthService =new MonthService();
        System.out.println(monthService.getMonth(12));
        int  [] r ={7,3,9};
        monthService.printMonth(r);


    }
}
