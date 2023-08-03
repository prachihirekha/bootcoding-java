package com.bootcoding.practice.constructor;

//constr overloading
public class Data {

    private int a;
    private int b;

    private int c;


    //parameterize constr
    public Data(int n1, int n2){
        a=n1;
        b=n2;
    }


    void show(){
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.println("C="+c);
    }
}
class Demo1{
    public static void main(String[] args) {
        Data d2= new Data(10,20);
        d2.show();
    }
}