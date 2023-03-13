package com.bootcoding.practice.oops;

public class Bus {
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
        Bus b1 = new Bus();
        b1.dimensions = 27;
        b1.brand = "Volvo";
        b1.colour = "Red";
        b1.type = "Battery";
        b1.print();
    }
}




