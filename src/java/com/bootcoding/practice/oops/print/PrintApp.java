package com.bootcoding.practice.oops.print;

import java.util.Scanner;

public class PrintApp {
    public static void main(String[] args) {
       PrintService printService =new PrintService();
        printService.print( "this is single :"+"Raju");
        String[] res ={"rama","raju","java","python"};
        printService.printArray( res);
        printService.printTable(5);
    }
}

