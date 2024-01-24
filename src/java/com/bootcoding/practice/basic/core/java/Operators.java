package com.bootcoding.practice.basic.core.java;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter the number to perform a arthmatic opretor");
                System.out.println("enter the first operator :  ");
                int x = sc.nextInt();
                System.out.println("enter the second operator :  ");
                int y = sc.nextInt();
                System.out.println("choose the option" );
                System.out.println(" choose 1 for Addition");
                System.out.println(" choose 2 for Subtraction");
                System.out.println(" choose 3 for multiply");
                System.out.println(" choose 4 for division");
                System.out.println(" choose 5 for mode");
                System.out.println(" choose 6 for exist");

                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        int add;
                        add = x + y;
                        System.out.println(" addition result : " + add);
                        break;
                    case 2:
                        int sub;
                        sub = x - y;
                        System.out.println("subtraction result :" +  sub);
                        break;
                    case 3:
                       double mul;
                        mul = x * y;
                        System.out.println("Multiplication result :" + mul);
                        break;
                    case 4:
                        float div;
                        div = x / y;
                        System.out.println(" division result :" + div);
                        break;
                    case 5:
                        int mod;
                        mod =x%y;
                        System.out.println("mode result :"+ mod);
                        break;
                    case 6:
                        System.exit(0);

                }
            }
        }
    }
}
