package com.bootcoding.practice.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] ={9,7,3,5,8};
        // selection sort
        for(int i =0; i<arr.length-1; i++){
            int smallest =i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
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
