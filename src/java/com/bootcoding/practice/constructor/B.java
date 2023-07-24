package com.bootcoding.practice.constructor;

public class B extends A {
    int a;
    public B(int a){
        super (24);
        System.out.println("constructor b is executing");

    }

    public static void main(String[] args) {
        B b= new B(20);


    }
}
