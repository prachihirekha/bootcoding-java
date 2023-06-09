package com.bootcoding.practice.recursion;

public class SquareOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println("print of Ascending order:");
        printSquareOfNumberIntoAscendingOrder(10);
        System.out.println("print of Descending order:");
        printSquareOfNumberIntoDescendingOrder(15);

    }
    public static void printSquareOfNumberIntoAscendingOrder(int k){
        if(k==0){
            return;
        }
        printSquareOfNumberIntoAscendingOrder(k-1);
       if(k>0){
           int n= k*k;
           System.out.println(k +" is a square of(" +n + ")");
        }

    }
    public static void printSquareOfNumberIntoDescendingOrder(int k) {
        if (k == 0) {
            return;
        }
        if (k > 0) {
            int n = k * k;
            System.out.println(k +" is a square of(" +n + ")");
        }
        printSquareOfNumberIntoDescendingOrder(k - 1);
    }
}
