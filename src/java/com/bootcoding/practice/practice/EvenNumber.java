package com.bootcoding.practice.practice;

public class EvenNumber {
    public static void main(String[] args) {
        evenNumber(50);
    }
    public static void evenNumber(int n){
        if(n==0){
            return;
        }
        evenNumber(n-1);
        if(n%2==0){
            System.out.println( "It is even num "+ n);
        }
        else {
            System.out.println("it is not even number :"+n);
        }

    }
}
