package com.bootcoding.practice.scanner;

import java.util.Scanner;

public class ScannerOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of index [" + i + "]=");
            arr[i] = sc.nextInt();

        }
        evenNumberOfArr(arr);
        oddNumberOfArr(arr);
        sumOfOddNumber(arr);
        sumOfEvenNumber(arr);

    }

    public static void evenNumberOfArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("it is a even number = " + arr[i]);
            }
        }
    }

    public static void oddNumberOfArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("it is a odd number = " + arr[i]);
            }
        }

    }

    public static void sumOfOddNumber(int arr[]) {
        int sum = 0;
        //oddNumberOfArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("it is a  sum odd number = " + sum);
    }

    public static void sumOfEvenNumber(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("it is a  sum even number = " + sum);
    }
}
