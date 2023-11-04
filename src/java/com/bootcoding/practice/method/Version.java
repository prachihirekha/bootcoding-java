package com.bootcoding.practice.method;

public class Version {
    public static void main(String[] args) {
        System.out.println("\njava version :"+System.getProperty("java.version"));
        System.out.println("java Runtime version :"+System.getProperty("java.runtime.version"));
        System.out.println("java home :"+ System.getProperty("java.home"));
        System.out.println("java vendor :" + System.getProperty("java.vendor"));
        System.out.println("java vendor URl :" + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
    }
}
