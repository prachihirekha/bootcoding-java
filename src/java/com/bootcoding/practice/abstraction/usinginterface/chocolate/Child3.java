package com.bootcoding.practice.abstraction.usinginterface.chocolate;

public class Child3  implements IParent{
    @Override
    public void purchase(double amount) {
        System.out.println("Child3 : buy some cookies ");
    }
}
