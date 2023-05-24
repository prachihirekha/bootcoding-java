package com.bootcoding.practice.scanner;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random =new Random();
        int num =random.nextInt(100)+1;
        System.out.println("random :" + num);
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int mynum =scanner.nextInt();
        System.out.println("mynum" + num);
        int offBy;
        offBy =num-mynum;
        System.out.println("you were OffBy:"+ Math.abs(offBy));
    }
}
