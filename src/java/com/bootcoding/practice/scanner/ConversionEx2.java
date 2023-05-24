package com.bootcoding.practice.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConversionEx2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

            while(true){
                     System.out.println("Enter Second : (to exist, enter 0");
            int x = sc.nextInt();
                if (x <= 0) {

                    break;
                }
                ConversionEx2 c = new ConversionEx2();
                c.timeConversion(x);
            }

    }
    public void timeConversion(int value){
        int sec =value % 60;
        int hr =value/60;
        int min =hr%60;
        hr =hr/60;
        System.out.println(hr +":" + min + ":" +sec);

    }

}
