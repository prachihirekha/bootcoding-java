package com.bootcoding.practice.oops.objectAsObjectParameter.number;

public class NumberApp {
    public static void main(String[] args) {
      Number n1 =new Number();
      n1.setA(200);
      n1.setB(5);
      NumberService num =new NumberService();
       num.add(n1);
       num.subtract(n1);
       num.multiplication(n1);
       num.div(n1);
    }
}
