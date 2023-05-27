package com.bootcoding.practice.practice;

public class CubeUsingOfRecursion {
    public static void main(String[] args) {
        printCube (5);
    }
    public static void printCube(int n){
        if(n==0){
            return;
        }
        printCube(n-1);
        if(n>=1){
            int cube =n*n*n;
            System.out.println("Number is :" +n +"and cube of the"+n+"is : "+ cube);
        }
    }
}
