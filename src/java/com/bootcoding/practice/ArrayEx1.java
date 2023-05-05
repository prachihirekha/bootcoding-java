package com.bootcoding.practice;

import java.sql.SQLOutput;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        // array.length
        int n = arr.length;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
