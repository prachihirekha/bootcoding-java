package com.bootcoding.practice.array;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr={21,19,45,12};
        int min = arr[0];
        int prevmin =0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                prevmin =min;
                min = arr[i];
            }
        }
        System.out.println(prevmin);
    }
}
