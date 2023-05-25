package com.bootcoding.practice.scanner;

import java.util.Scanner;

public class TemperatureOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any number(To exist, enter -1)");
            double x = sc.nextDouble();
            if (x < 0) {
                break;
            }
            highTemperature(x);
        }
    }
    public  static  void highTemperature(double value ){

       double temp = value*9/5+32;
        System.out.println(temp +"C"+temp +"F");
    }
}
