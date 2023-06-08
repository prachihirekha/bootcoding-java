package com.bootcoding.practice.oops.objectAsObjectParameter.number;


public class NumberService {
    public void  add(Number n1){
        n1.c= n1.getA()+ n1.getB();
        System.out.println(n1.c);

    }
    public void  subtract(Number n1){
        n1.c= n1.a- n1.b;
        System.out.println("Substraction of " +n1.a + " And " + n1.b + " is " +n1.c);
    }
    public void  multiplication(Number n1){
        n1.c= n1.a* n1.b;
        System.out.println(n1.c);
    }
    public void  div(Number n1) {
        n1.c = n1.a / n1.b;
        System.out.println(n1.c);
    }
}
