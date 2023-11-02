package com.bootcoding.practice.practice;

public class Time {
    public static void main(String[] args) {
        convertTime(25300);
    }
    public static void convertTime(int value){
        int sec =value%60;
        int hr = value/60;
        int min =hr/60;
        hr =hr%60;
        System.out.println(hr +":"+min +":"+sec);
    }
}
