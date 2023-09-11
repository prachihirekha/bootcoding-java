package com.bootcoding.practice.bit;

public class LeftBit {
    public static void main(String[] args) {
        int n =5;
        int pos =2;
        int bitwisw =1<<pos;
        if((bitwisw & n)==0){
            System.out.println("bit is zero");
        }
        else {
            System.out.println("bit is one");
        }
    }
}
