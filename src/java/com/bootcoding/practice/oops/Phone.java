package com.bootcoding.practice.oops;

public class Phone {
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
        Phone b1 = new Phone();
        b1.dimensions = 9;
        b1.brand = "Vivo";
        b1.colour = "Red";
        b1.type = "Camera";
        b1.print();
    }
}
