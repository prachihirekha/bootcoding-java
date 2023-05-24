package com.bootcoding.practice.scanner;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second: ");
        int sec = sc.nextInt();
        convertIntoHour(sec);
    }
    public static void convertIntoHour(int value){
         int seconds=value%60;
         int hour = value/60;

        int min =hour%60;
        hour=hour/60;

        System.out.println(hour+":"+ min +":"+seconds);
    }
}
