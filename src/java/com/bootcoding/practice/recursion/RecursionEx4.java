package com.bootcoding.practice.recursion;

public class RecursionEx4 {
    public static void main(String[] args) {
        System.out.println("Using  Ascending Order :");
        printAscendingOrder(5);
        System.out.println("Using  Descending Order :");
        printDescendingOrder(5);
        System.out.println("Using  ForLoop :");
        for (int i = 1; i <= 5; i++) {
            System.out.println("printing by for loop  : ("+ i+")");
        }
    }
    public static void printAscendingOrder(int n){
        // Must have Base Condition or Termination Condition , to solve stack problem
        if(n==0){
            return; //exit
        }
        //Calling itself..
        printAscendingOrder(n-1);
        //print message
        System.out.println("print Ascending : ("+ n+")");
    }
    public static  void printDescendingOrder(int n){

        // Must have Base Condition or Termination Condition , to solve stack problem
        if(n==0){
            return;// using exist for return;
        }
        //print message
        System.out.println( "print Descending : ("+ n+")");
        //Calling itself..
        printDescendingOrder(n-1);
    }


}
