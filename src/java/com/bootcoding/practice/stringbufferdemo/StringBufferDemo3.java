package com.bootcoding.practice.stringbufferdemo;

public class StringBufferDemo3 {
    public static void main(String[] args) {
        StringBuffer sb1 =new StringBuffer("hello");
       // StringBuffer sb2 =new StringBuffer("hello");
        StringBuffer sb2 =sb1.append("hi");
        System.out.println(sb1.equals(sb2));
    }
}
