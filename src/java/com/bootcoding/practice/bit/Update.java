package com.bootcoding.practice.bit;

import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int oper = sc.nextInt();
        // opr=1, set =0; clear
        int n=5;
        int pos=1;
        int bitWise = 1<<pos;
        if(oper == 1){
            //set
            int newNumber = bitWise | n;
            System.out.println(newNumber);
        }else {
            // clear
            int newBit = ~(bitWise);
            int newNumber =newBit & n;
            System.out.println(newNumber);

        }
    }
}
