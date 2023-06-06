package com.bootcoding.practice.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
      long res=  sumOfNUmber(232345634);
        System.out.println(res);
    }
    public static long sumOfNUmber(long n){
        if(n==0){
            return 0;
        }
        else {
            return ((n%10)+sumOfNUmber(n/10));
        }
    }
}
