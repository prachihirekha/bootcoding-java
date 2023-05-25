package com.bootcoding.practice.scanner;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
       double temp = sc.nextDouble();
       temp = temp*9/5+32;
        System.out.println(temp +"C"+temp +"F");
    }

}
