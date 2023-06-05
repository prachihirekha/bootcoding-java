package com.bootcoding.practice;

public class Ex3 {
    static int a;
    static{
        System.out.println("I am in the static block");
        show();
    }
    public static void main (String args[])
    {
        System.out.println("I am in a main");
    }
    public static void show()
    {
        System.out.println("This is a show");
    }
}
