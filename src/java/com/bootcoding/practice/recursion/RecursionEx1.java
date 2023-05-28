package com.bootcoding.practice.recursion;

public class RecursionEx1 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        System.out.println(n);
        print(n-1);
    }
}
