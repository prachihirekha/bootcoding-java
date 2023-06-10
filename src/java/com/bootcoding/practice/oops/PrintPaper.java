package com.bootcoding.practice.oops;

public class PrintPaper {
    String color;
    double  price;
    String type;
    String brand;

    public static void main(String[] args) {
        PrintPaper p = new PrintPaper();
        p.color = "White";
        p.price =250;
        p.brand ="Historic paper";
        p.type="book paper";
        System.out.println("p.color" + p.color);
        System.out.println("p.price" + p.price);;
        System.out.println("p.brand" +p.brand);
        System.out.println("p.type" +p.type);
    }



}
