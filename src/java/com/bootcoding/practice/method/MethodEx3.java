package com.bootcoding.practice.method;

public class MethodEx3 {
    public static void main(String[] args) {
        printDivisibleNumber();
    }

    public static void printDivisibleNumber() {
        int n = 57;
        for (int j = 5; j <= n; j++) {
            if (j % 5 == 0) {
                System.out.println(j + "  is divisible by 5");
            }

        }
    }
}
