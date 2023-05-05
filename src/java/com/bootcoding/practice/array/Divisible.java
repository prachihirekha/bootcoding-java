package com.bootcoding.practice.array;
// WAP to print element of an array which are divisible by 3 & 5
public class Divisible {
    public static void main(String[] args) {
        int[] j = {30, 55, 60, 12};

        for (int i = 0; i < j.length; i++) {
            if (j[i] % 3 == 0 && j[i] % 5 == 0) {
                System.out.println(j[i]);

            }
        }

    }
}
