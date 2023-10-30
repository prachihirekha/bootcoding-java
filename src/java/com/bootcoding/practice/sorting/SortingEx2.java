package com.bootcoding.practice.sorting;

public class SortingEx2 {
    public static void main(String[] args) {
        int  a[] ={5,7,9,3,8,0};
        // bubble sort
        for(int i=0;i<a.length-1; i++){
            for(int k=0;k< a.length-i-1;k++){
                if(a[k]<a[k+1]){
                    int temp = a[k];
                    a[k]=a[k+1];
                    a[k+1] =temp;
                }
            }
        }
        printMethod(a);
    }
    public static void printMethod(int a[]){
        for(int i =0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
