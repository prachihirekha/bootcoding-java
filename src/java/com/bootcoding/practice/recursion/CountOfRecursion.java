package com.bootcoding.practice.recursion;

public class CountOfRecursion {
    public static void main(String[] args) {
       int count = print(67523445);
        System.out.println(" Number of count :" + count);
    }
    public static int print(int n){
        if(n==0){
            return 0;
        }
        else {
            return 1+ print(n/10);
        }
    }
}
