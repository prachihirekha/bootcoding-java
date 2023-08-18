package com.bootcoding.practice.abstraction.usinginterface.chocolate;

public class IParent1App {
    public static void main(String[] args) {
        Child1 child1 =new Child1();
        Child2 child2 =new Child2();
        Child3 child3 =new Child3();
        child1.purchase(150);
        child2.purchase(25);
        child3.purchase(50);
    }

}
