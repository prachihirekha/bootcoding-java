package com.bootcoding.practice.recursion;

import java.util.Scanner;

public class FactorialNumberOfUsingRecursion {
    public static void main(String[] args) {

        System.out.println("print a factorial number in" + " Ascending Order");
        int r = factorialNumberOfUsingRecursion(5);
        System.out.println(r);
    }

    public static int factorialNumberOfUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialNumberOfUsingRecursion(n - 1);
        }
    }
}




