package com.bootcoding.practice.loop;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the table number");
        int n =sc.nextInt();
        for(int i=1;i<=10;i++){
            int k=n*i;
            System.out.println(n+"*"+i+"="+k);
        }

    }
}
