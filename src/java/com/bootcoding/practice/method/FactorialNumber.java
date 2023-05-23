package com.bootcoding.practice.method;

public class FactorialNumber {
    public static void main(String[] args) {
        getFactorialNumber(3);
    }

    public static void getFactorialNumber(int n) {
        int fac = 1;
        while (n > 0) {
            fac = fac * n;
            n--;
        }
        System.out.println(fac);
    }
}