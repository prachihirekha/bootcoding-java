package com.bootcoding.practice.constructor;

public class A {
    int b;
    public A(){
        System.out.println("Constuctor of A");

    }
    public A(int a){
        System.out.println(" Parametrized Constructor of A");

        this.b =a;
        System.out.println(a);
    }
}
