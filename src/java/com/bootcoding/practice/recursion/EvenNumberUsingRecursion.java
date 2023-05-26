package com.bootcoding.practice.recursion;

import java.sql.SQLOutput;

public class EvenNumberUsingRecursion {
    public static void main(String[] args) {
        System.out.println("print for ascending order :" );
        printEvenAscendingOrder(10);
        System.out.println("print for descending order :");
        printEvenNumberDescendingOrder(20);
        System.out.println("Using for Loop :");
        for(int i=1;i<=10; i++){
            System.out.println(i);
        }
        for(int j=1;j<=20;j++) {
            System.out.println(j);
        }

    }
    public static void printEvenAscendingOrder(int n){ //10
        if(n==0){
            return;
        }
        printEvenAscendingOrder(n-1);
        if(n%2==0)
        {
            System.out.println(n);
        }


    }
public static void printEvenNumberDescendingOrder(int n){
        if(n==0){
            return;
        }
        if(n%2==0){
            System.out.println(n);
        }
        printEvenNumberDescendingOrder(n-1);

    }


}
