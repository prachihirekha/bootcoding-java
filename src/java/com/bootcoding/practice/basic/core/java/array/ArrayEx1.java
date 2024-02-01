package com.bootcoding.practice.basic.core.java.array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int arr[];
        arr = new int[5];
        arr[0]=23;
        arr[1]= 34;
        arr[2]=45;
        arr[3]=56;
        arr[4]=67;
//        arr[5] = 588;
        for(int i=0;i<= arr.length;i++){
            System.out.println("the index of "+i+" is "+arr[i]);
        }

    }
}
