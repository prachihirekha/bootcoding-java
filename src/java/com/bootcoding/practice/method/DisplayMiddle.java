package com.bootcoding.practice.method;

public class DisplayMiddle {
    public static void main(String[] args) {
        DisplayMiddle num= new DisplayMiddle();
        num.middleNumber("455221");

    }
    public  void middleNumber(String i){
        int size = i.length()/2;
        System.out.println(i.charAt(size));


    }
}
