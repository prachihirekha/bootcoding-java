package com.bootcoding.practice.practice;

public class ConvertDays {
    public static void main(String[] args) {
        convertDay(1329);
    }
    public static void convertDay(int day){
        int year =day/365;
        int week = (day%365)/7;
        int days =day-((year*365)+(week*7));
        System.out.println("Year :" +year);
        System.out.println("Week :" +week);
        System.out.println("Days :" +days);
    }
}
