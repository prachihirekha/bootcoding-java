package com.bootcoding.practice.oops.objectAsObjectParameter.pen;

public class PenApp {
    public static void main(String[] args) {
        Pen pen =new Pen();
        pen.setColor("Blue");
        pen.setPrice(5);
        pen.setType("Dot Pen");
        Pen p1 =new Pen();
        p1.setColor("Black");
        p1.setPrice(1);
        p1.setType("gell pen");
        Pen pen1 =new Pen();
        pen1.setColor("Blue");
        pen1.setPrice(50);
        pen1.setType("gell pen");
        Pen pen2 =new Pen();
        pen2.setPrice(20);
        pen2.setType("teamo");
        pen2.setColor("Red");
        PenService ps =new PenService();
        ps.buyPen(pen);
        ps.buyPen(p1);
        ps.buyPen(pen1);
        ps.buyPen(pen2);


    }
}
