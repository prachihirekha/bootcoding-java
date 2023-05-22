package com.bootcoding.practice.method;

public class FindSmallestNumber {
    public static void main(String[] args) {
        findSmallest(25,37,29);

    }

    public static void findSmallest(int a,int b,int c) {
        if(a<b) {
            int num =a;

            if (num < c) {
                System.out.println("Print the First Smallest number =" + num);
            }
        }
    }
}
