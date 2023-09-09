package com.bootcoding.practice.question;

import java.util.Scanner;

public class Average {
   // Enter 3 numbers from the user & make a function to print their average.
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the numbers");
       int a =sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int avg =(a+b+c)/3;
       System.out.println(avg);
   }
}
