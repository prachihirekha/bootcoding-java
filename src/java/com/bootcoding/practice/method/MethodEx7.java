package com.bootcoding.practice.method;

public class MethodEx7 {
    public static void main(String[] args){
    String str1= new String("Hello").intern();
    String str2=new String("Same").intern();
    if (str1==str2){
        System.out.println("Reference are same");
    }
    else{
        System.out.println("Reference are different");
    }
}
}

