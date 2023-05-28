package com.bootcoding.practice.practice;

public class EvenPositiveAndNegative {
    public static void main(String[] args) {
        int arr[] ={13,2,67,89,80,-23,-45,54,-12,-4,-6};
        evenPositive(arr);
        evenNegative(arr);
        oddPositive(arr);
        oddNegative(arr);
    }
    public static void evenPositive(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(" positive even :" + arr[i]);
                }
            }
        }
    }

    public static void evenNegative(int arr[]){
        for(int j=0;j< arr.length;j++){
            if(arr[j]<0){
                if (arr[j] %2==0) {
                    System.out.println("negative even :" + arr[j]);
                }
            }
        }
    }
    public static void oddPositive(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 != 0) {
                    System.out.println(" positive odd :" + arr[i]);
                }
            }
        }
    }
    public static void oddNegative(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <0) {
                if (arr[i] % 2 != 0) {
                    System.out.println(" Negative odd :" + arr[i]);
                }
            }
        }
    }
}

