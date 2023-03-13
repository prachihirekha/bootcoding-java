package com.bootcoding.practice.oops;

public class Spectacles {
    double dimensions;
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
        Spectacles b1 = new Spectacles();
        b1.dimensions = 52;
        b1.brand = "full frame";
        b1.colour = "Red";
        b1.type = "lens";
        b1.print();
    }
}
