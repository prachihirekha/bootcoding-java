package com.bootcoding.practice.practice;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] ={2,3,5,6};
        int arr1 []={2,4,6,18};
        printSumOfArray(arr,arr1);
    }
    public static void printSumOfArray(int arr[],int arr1[]){
        int sum =0;
        for(int i =0;i< arr.length;i++){
            sum =sum+arr[i];
        }
        int sum1 =0;
        for(int j =0; j<arr1.length;j++){
            sum1 =sum1 +arr1[j];

        }
        System.out.println( "sum of arr :" +sum);
        System.out.println("sum of arr1 :" +sum1);

    }
}
