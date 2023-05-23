package com.bootcoding.practice.scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerSubstractionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st num");
        int a = sc.nextInt();
        System.out.println("Enter a  2nd num ");
        int b = sc.nextInt();
        int x= a-b;
        System.out.println(x);

    }
}
