package com.bootcoding.practice.random;

import java.util.Random;

public class MultipleFactorialParameter {
    public static void main(String[] args) {
        Random random =new Random();
        for (int i=0;i<10;i++){
            findMultipleFactorial(random.nextInt(50), random.nextInt(10), random.nextInt(5) );
        }

    }

    public static void findMultipleFactorial(int x, int y, int z) {
        findMultipleFactorial(x);
        findMultipleFactorial(y);
        findMultipleFactorial(z);
    }

    public static void findMultipleFactorial(int a) {
        long fact = 1;
        int v =a;
        // loop started
        for(int i=0; i<=a;i++){
            // invalid variable
            fact = fact * a;
        }
        System.out.println( "factorial of number "+v+"is =" +fact);
    }
}

