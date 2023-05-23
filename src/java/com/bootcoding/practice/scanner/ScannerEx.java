package com.bootcoding.practice.scanner;
import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number..");
        int num =sc.nextInt();
        int res = num*num;
        System.out.println(res);

    }
}
