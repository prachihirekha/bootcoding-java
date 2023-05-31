package com.bootcoding.practice.recursion;

public class OddNumberUsingOfRecursion {
    public static void main(String[] args) {
        System.out.println("Print for Ascending NUmber :");
        printAscendingOrder(10);
        System.out.println("Print for Descending Number :");
        printDescendingOrder(20);

    }
    public static void printAscendingOrder(int j){
        if(j==0){
            return;
        }
        printAscendingOrder(j-1);
        if(j%2!=0){
            System.out.println("Print Ascending Number  :("+ j +")");
        }
    }
    public static void printDescendingOrder(int j){
        if(j==0){
            return;
        }
        if(j%2!=0){
            System.out.println("Print Descending Number  :("+ j +")");
        }
        printDescendingOrder(j-1);

    }
}
