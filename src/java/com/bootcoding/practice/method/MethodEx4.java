package com.bootcoding.practice.method;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class MethodEx4 {
    public static void main(String[] args) {
        add(10,15);
        add(10, -5);
        add(-20, 0);
        add(-20, -30);

    }
    public static void add(int x, int y){
        int sum = x+y;
        System.out.println("sum of " + x +  " & " + y + " = " + sum);
    }
}
// wap
