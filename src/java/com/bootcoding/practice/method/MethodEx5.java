package com.bootcoding.practice.method;

public class MethodEx5 {
    public static void main(String[] args) {

        printMultiplication(23,20);
        printMultiplication(9,-4);
        printMultiplication(56,5);
    }
    public static void  printMultiplication(int x, int y){
        int z= x*y;
        System.out.println("multiply  of " + x +  " & " + y + " = " + z);

    }
}
