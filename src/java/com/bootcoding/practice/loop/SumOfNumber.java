package com.bootcoding.practice.loop;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        // print the sum of n number of natural number
//        int n = 5;
//        int sum =0;
//        for (int i=1;i<=n;i++){
//            sum =sum+i;
//        }
//        System.out.println("Natural Number Of Sum :" +sum);
        // by using scanner class
        int sum =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n  = sc.nextInt();
        for(int i =1;i<=n;i++){
           sum =sum+i;
        }
        System.out.println(sum);
    }
}
