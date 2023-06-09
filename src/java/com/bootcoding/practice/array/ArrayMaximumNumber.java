package com.bootcoding.practice.array;
//WAP to find max element of an array
public class ArrayMaximumNumber {
    public static void main(String[] args) {
        int [] arr ={10,30,40,20};
        int max=arr[0];
      // int prevmax=0;
        for(int i=0;i<arr.length;i++){
            if (max < arr[i]) {
                //prevmax=max;
                max=arr[i];

            }
        }

        System.out.println(max);
    }
}
