package com.bootcoding.practice.bit;

public class SetBit {
    public static void main(String[] args) {
        int n=4;
        int pos =1;
        int bitwise =1<<pos;
        int newNumber=bitwise|n;
        System.out.println(newNumber);
    }
}
