package com.bootcoding.practice.oops;

public class Mug {
    double  dimensions;
    String colour;
    String type;
    String brand;

    public void print() {
        System.out.println(dimensions);
        System.out.println(colour);
        System.out.println(type);
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Mug m1 = new Mug();
        m1.dimensions = 2;
        m1.brand = "Melton";
        m1.colour = "Blue";
        m1.type = "Glass";
        m1.print();
    }
}
