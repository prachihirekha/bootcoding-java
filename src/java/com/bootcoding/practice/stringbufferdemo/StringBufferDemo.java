package com.bootcoding.practice.stringbufferdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer();
        System.out.println(sb.capacity());// capacity of sb is always 16
       sb.append("hello");
       System.out.println(sb.capacity());// hello is not bigger than capacity
        sb.append("raju deepkaaaa");
       System.out.println(sb.capacity());// (old capacity *2)+2
    }
}
