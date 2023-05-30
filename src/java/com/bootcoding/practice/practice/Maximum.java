package com.bootcoding.practice.practice;

public class Maximum {
    public static void main(String[] args) {
        printMaximum(25,35,15);
    }
    public static void printMaximum(int n,int v,int z){
        if((n>v)&&(n>z)){
            System.out.println("Maximum number :"+n);
        } else if ((v>n)&&(v>z)) {
            System.out.println("Maximum number :"+v);
        }
        else{
            System.out.println("Maximum number :"+z);
            }
    }
}
