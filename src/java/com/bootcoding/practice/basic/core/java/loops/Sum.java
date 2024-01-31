package com.bootcoding.practice.basic.core.java.loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int even = 0;
        int odd =0;
        for(int i =1;i<=num;i++){
            if(i%2==0){
                even = even+i;
            }
            else {
                odd= odd+i;
            }
        }
        System.out.println("Even :"+ even);
        System.out.println("Odd :"+ odd);
    }
}
