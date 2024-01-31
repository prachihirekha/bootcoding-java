package com.bootcoding.practice.basic.core.java.condition;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter the days number");
            int week = s.nextInt();
            String name;
            switch (week){
                case 1:
                    name= "monday";
                    break;
                case 2:
                    name="tuesday";
                    break;
                case 3:
                    name ="wednesday";
                    break;
                case 4:
                    name ="thusday";
                    break;
                case 5:
                    name="friday";
                    break;
                case 6:
                    name= "sataruday";
                    break;
                case 7:
                    name="sunday";
                    break;
                default:
                    name="invalid input";
                    break;
            }
            System.out.println(name);
        }
    }
}
