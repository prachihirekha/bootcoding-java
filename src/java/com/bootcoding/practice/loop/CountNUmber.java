package com.bootcoding.practice.loop;

public class CountNUmber {
    public static void main(String[] args) {
        int count =0;
        int num =12344234;
        while (num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
