package com.bootcoding.practice.object;

public class Cooler {
    double dimension;
    String color;
    String brand;
    String price;

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cooler{" +
                "dimension=" + dimension +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
    public Cooler(double dimension,String color,String brand, String price){
        this.dimension =dimension;
        this.color =color;
        this.brand =brand;
        this.price =price;
    }

}
