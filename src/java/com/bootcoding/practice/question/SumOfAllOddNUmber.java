package com.bootcoding.practice.question;

import java.util.Scanner;

public class SumOfAllOddNUmber {
    //2.	Write a function to print the sum of all odd numbers from 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2!=0) {
                sum = sum +i;
            }
        }
        System.out.println(sum+"=");
    }
}
