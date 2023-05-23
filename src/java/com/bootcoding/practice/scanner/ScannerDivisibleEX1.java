package com.bootcoding.practice.scanner;

import java.util.Scanner;

public class ScannerDivisibleEX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int a= sc.nextInt();
        System.out.println("Enter 2nd Num");
        int b = sc.nextInt();
        sum(a,b);

    }

    private static void sum( int a, int b) {

        int sum = a+b;
        System.out.println(sum);
    }

}
