package com.bootcoding.practice.Dsa;

public class FindIndex {
    public static void main(String[] args) {
        String str ="Programming";
        int len = str.length();
        char ch = str.charAt(len/2);
        System.out.println(ch);
        int r1 =str.indexOf('r');
        System.out.println(r1);
        int r2 =str.lastIndexOf('r');
        System.out.println(r2);

    }
}
