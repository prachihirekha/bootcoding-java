package com.bootcoding.practice.scanner;

import java.util.Scanner;

public class FactorialScanner {
    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
    public static void main(String[] args) {
        while (true) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter number ");
            int num =sc.nextInt();
            if(num<0)
            {
                break;
            }
            int result = findFactorial(num);
            System.out.println(result);
        }
    }
}

