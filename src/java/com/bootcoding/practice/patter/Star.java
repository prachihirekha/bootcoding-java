package com.bootcoding.practice.patter;

public class Star {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.println();
            for (int j =1; j < i; j++) {
                System.out.print("*");
            }
        }
    }
}
