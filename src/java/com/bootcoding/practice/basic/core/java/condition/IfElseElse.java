package com.bootcoding.practice.basic.core.java.condition;

import java.util.Scanner;

public class IfElseElse {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.println("Enter the Input, choice 1 for fruit,choice 2 for noodles, choice 3 for coffee,choice 4 for food");
            int num =sc.nextInt();
            if(num==1){
                System.out.println("fruit");
            } else if (num==2) {
                System.out.println("noodles");
            } else if (num==3) {
                System.out.println("coffee");
            } else if (num==4) {
                System.out.println("food");
            }
            else{
                System.out.println("invalid input");
            }
        }
    }
}
