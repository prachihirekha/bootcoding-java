package com.bootcoding.practice.sorting;

public class InsertionSort {
        public static void main(String[] args) {
            int arr [] ={234,76,468,47,2,2,1};
            // insertion sort
            for(int i =1; i<arr.length; i++){
                int current =arr[i];
                int j =i-1;
                while (j>=0 && current<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
               arr[j+1] =current;
            }
            printAscending(arr);
        }
        public static void printAscending(int arr[]){
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }


