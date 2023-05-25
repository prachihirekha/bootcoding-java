package com.bootcoding.practice.object;

public class Lock {
double dimensions;
String color;

    public double getDimensions() {
        return dimensions;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Lock{" +
                "dimensions=" + dimensions +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    String price;
String brand;
    public void lockQuality(double dimensions,String  color, String price,String brand) {
        this.dimensions= dimensions;
        this.color =color;
        this.price =price;
        this.brand =brand;
    }
}
