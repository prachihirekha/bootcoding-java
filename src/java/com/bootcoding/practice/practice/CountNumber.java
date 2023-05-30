package com.bootcoding.practice.practice;

public class CountNumber {
    public static void main(String[] args) {
        int arr[] = {12, 23, -4, 2, -3, 6};
        countPositiveNumber(arr);
        countNegative(arr);
    }

    public static void countPositiveNumber(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("Count of Positive number :"+count);
    }

    public static void countNegative(int arr[]) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<0){
                count++;
            }
        }
        System.out.println("Count of   Negative number : "+count);
    }
}
