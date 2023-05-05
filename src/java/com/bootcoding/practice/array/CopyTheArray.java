package com.bootcoding.practice.array;
//WAP to copy the elements of one array into another array and print the array
public class CopyTheArray {
    public static void main(String[] args) {
        int[] arr ={10,70,80,95};
        int[] a= new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
          a[i] =arr[i];
        }
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
