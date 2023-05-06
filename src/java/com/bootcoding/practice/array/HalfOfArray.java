package com.bootcoding.practice.array;

public class HalfOfArray {
    public static void main(String[] args) {
        int[] s ={13,45,23,45,76,56};
        int[] arr =new int[s.length/2];
        for(int i=0;i<s.length/2;i++){
            arr[i] = s[i];
        }
        for (int j= 0; j < arr.length; j++) {
            System.out.println(arr[j]);

        }

    }
}
