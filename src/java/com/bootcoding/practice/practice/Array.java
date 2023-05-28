package com.bootcoding.practice.practice;

public class Array {
    public static void main(String[] args) {
        int arr[] ={12,34,89,6};
        int arr1[] ={2,3,4,6,8,9};
        print(arr,arr1);

    }

    public static void print(int arr[], int arr1[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("even number :" + arr[i]);
            }
        }
            for (int j = 0; j < arr.length; j++) {
                if (arr1[j] % 2 == 0) {
                    System.out.println(" even number of second :"+ arr1[j]);
                }
            }

    }
}



