package com.bootcoding.practice.oops.objectAsObjectParameter.pen;

public class PenService {
    public void buyPen(Pen p){
        System.out.println(p.getColor());
        System.out.println(p.getPrice());
        System.out.println(p.getType());

    }
}
