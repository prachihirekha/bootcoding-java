package com.bootcoding.practice.array;

public class SecondMax {
    public static void main(String[] args) {
        int[] a = {5,19,10,22,33,555};
        int max = a[0];
        int prevmax = 0;
        for (int i = 0; i < a.length; i++) {
            if (max<a[i]) {
                prevmax =max;
                max = a[i];
            }
        }
        System.out.println(prevmax);
    }
}
