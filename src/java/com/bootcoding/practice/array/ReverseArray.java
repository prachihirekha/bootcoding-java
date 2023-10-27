package com.bootcoding.practice.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int m = arr.length;
        //for(int i =0; i<m;i++) {
        // System.out.println(arr[i]);
        for (int j = m - 1; j >= 0; j--){
            System.out.println(arr[j]);
        }

    }
}


