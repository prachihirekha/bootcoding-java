package com.bootcoding.practice.object;

public class CoolerApp {
    public static void main(String[] args) {
        Cooler c =new Cooler(4.5,"black","Bajaj ","5000");
        System.out.println(c.dimension);
        System.out.println(c.color);
        System.out.println(c.price);
        System.out.println(c.brand);
    }
}
