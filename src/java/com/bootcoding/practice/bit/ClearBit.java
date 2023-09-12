package com.bootcoding.practice.bit;

public class ClearBit {
    public static void main(String[] args) {
        int n =5;
        int  position =2;
        int bitwise =1<<position;
        int notBitWise =~(bitwise);
        int newBitwise =notBitWise & n;
        System.out.println(newBitwise);
    }
}
